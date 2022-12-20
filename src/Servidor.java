import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class Servidor {
        
    private static Partida partida;
    private static Jogador jogador;
    private static String vencedor;
    private static int pontuacao_X;
    private static int pontuacao_O;
    private static boolean xInUse = false;


    public static void criaPartida(){
        partida = new Partida();
        pontuacao_X = 0;
        pontuacao_O = 0;
    }

    public static String atualizarJogo(Jogada jogada){

        vencedor = "";

        jogador.setNickname(jogada.getJogador().getNickname());

        if (jogada.getX() == -1 && jogada.getY() == -1) {
            return "";
        }

        partida.getTabuleiro().adicionarJogadaNoTabuleiro(jogada);

        vencedor = partida.getTabuleiro().verificaVencedor();

        return vencedor;
    }

    public static String montarMensagem(String nickname, String tipoDeJogada, Integer x, Integer y, String vencedor){
        return nickname + "," + tipoDeJogada + "," + x + "," + y + "," + vencedor + "\n";
    }

    public static String[] desmontarMensagem(String mensagem){
        String[] msg = mensagem.split(",");
        return msg;
    }

    public static void main(String[] args) throws Exception {
        // Create a ServerSocket to listen for TCP connections
        ServerSocket tcpSocket = new ServerSocket(9999);

        // Create a DatagramSocket to listen for UDP connections
        DatagramSocket udpSocket = new DatagramSocket(9988);

        criaPartida();

        // Start a thread to handle TCP connections
        new Thread(new Runnable() {
            public void run() {
                try {
                    // Accept incoming TCP connections in an infinite loop
                    while (true) {
                        // Accept a new connection (blocking call)
                        boolean xInUse = false;
                        Jogada ultimaJogada = null;
                        Socket clientSocket = tcpSocket.accept();

                        // Handle the connection in a separate thread
                        new Thread(new Runnable() {
                            public void run() {
                                while(true) {
                                    try {
                                        //Efetua a primitiva receive
                                        System.out.println("Aguardando datagrama do cliente...");
                                        BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                                        System.out.println("Datagrama recebido...");

                                        //Operacao com os dados recebidos e preparacao dos a serem enviados
                                        String[] msgRecebida = desmontarMensagem(entrada.readLine());

                                        String nickname = msgRecebida[0].trim();
                                        String tipoDeJogada = msgRecebida[1].trim();
                                        int x = Integer.valueOf(msgRecebida[2].trim());
                                        int y = Integer.valueOf(msgRecebida[3].trim());
                                        String vencedor = msgRecebida.length == 5 ? msgRecebida[4].trim() : "";

                                        if (tipoDeJogada.equals("")) {
                                            if (Servidor.xInUse) {
                                                tipoDeJogada = "O";
                                                Servidor.xInUse = false;
                                            } else {
                                                tipoDeJogada = "X";
                                                Servidor.xInUse = true;
                                            }
                                        }

                                        jogador = new Jogador(nickname, tipoDeJogada);
                                        Jogada jogada = new Jogada(jogador, tipoDeJogada, x, y);

                                        vencedor = atualizarJogo(jogada);

                                        if (vencedor.equals("O"))
                                            pontuacao_O++;

                                        if (vencedor.equals("X"))
                                            pontuacao_X++;

                                        if (ultimaJogada == null) {
                                            ultimaJogada = jogada;
                                        }

                                        String msgParaEnviar = montarMensagem(nickname, tipoDeJogada, ultimaJogada.getX(), ultimaJogada.getY(), vencedor);

                                        //Efetua a primitiva send
                                        DataOutputStream saida = new DataOutputStream(clientSocket.getOutputStream());
                                        System.out.println(msgParaEnviar);
                                        saida.writeBytes(msgParaEnviar);

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }).start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                        }
        }).start();

        // Start a thread to handle UDP connections
        new Thread(new Runnable() {
            public void run() {
                try {
                    // Create a buffer to receive incoming packets
                    byte[] buffer = new byte[1024];

                    // Create a packet to receive the data
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                    // Receiving packets in an infinite loop
                    while (true) {
                        // Receive a packet (blocking call)
                        udpSocket.receive(packet);

                        // Handle the packet in a separate thread
                        new Thread(new Runnable() {
                            public void run() {
                                byte[] sendData = new byte[1024];

                                try {
                                    System.out.println("RECEIVED: " + new String(packet.getData()));

                                    InetAddress ipCliente = packet.getAddress();
                                    int portaCliente = packet.getPort();
                                    sendData = (new String(packet.getData())).toUpperCase().getBytes();
                           
                                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipCliente, portaCliente);
                                    udpSocket.send(sendPacket);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
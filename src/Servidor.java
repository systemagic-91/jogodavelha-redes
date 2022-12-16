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

    private static ServerSocket servidor;
    private Partida partida;
    private Jogador jogador1;
    private Jogador jogador2;
    private String vencedor;


    public void criaPartida(){

        this.jogador1 = new Jogador("jogador1", "X");
        this.jogador2 = new Jogador("jogador2", "O");

        this.partida = new Partida(jogador1, jogador2);
    }

    public void iniciarJogo(){

        vencedor = "";

        while (vencedor.equals("")){

            Jogada jogada = new Jogada(jogador1, "X", 1, 1);

            if(vencedor.equals("")){
                partida.getTabuleiro().adicionarJogadaNoTabuleiro(jogada);
                vencedor = partida.getTabuleiro().verificaVencedor();
                jogador1.setPontuacao(jogador1.getPontuacao() + 1);
            }

            if (vencedor.equals("")){
                jogada = new Jogada(jogador2, "O", 2, 2);
                partida.getTabuleiro().adicionarJogadaNoTabuleiro(jogada);
                vencedor = partida.getTabuleiro().verificaVencedor();
                jogador2.setPontuacao(jogador2.getPontuacao() + 1);
            }
        }
    }

    public static String montarMensagem(String nickname, Integer x, Integer y){
        return nickname + "," + x + "," + y;
    }

    public static String [] desmontarMensagem(String mensagem){

        var msg = mensagem.split(",");

        return msg;
    }

    public static void main(String[] args) throws Exception {
        // Create a ServerSocket to listen for TCP connections
        ServerSocket tcpSocket = new ServerSocket(9999);

        // Create a DatagramSocket to listen for UDP connections
        DatagramSocket udpSocket = new DatagramSocket(9988);

        // Start a thread to handle TCP connections
        new Thread(new Runnable() {
            public void run() {
                try {
                    // Accept incoming TCP connections in an infinite loop
                    while (true) {
                        // Accept a new connection (blocking call)
                        Socket clientSocket = tcpSocket.accept();

                        // Handle the connection in a separate thread
                        new Thread(new Runnable() {
                            public void run() {
                                try {
                                    //Efetua a primitiva receive
                                    System.out.println("Aguardando datagrama do cliente...");
                                    BufferedReader entrada =  new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                                    //Operacao com os dados recebidos e preparacao dos a serem enviados
                                    String str = entrada.readLine();
                                    System.out.println("Received: " + str);

                                    str = str.toUpperCase() + '\n';

                                    //Efetua a primitiva send
                                    DataOutputStream saida = new DataOutputStream(clientSocket.getOutputStream());
                                    saida.writeBytes(str);
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
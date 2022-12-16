import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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

    public static void main(String[] args) {

        try {
            // servidor escutando na porta 7001
            servidor = new ServerSocket(7001);

            // esperando clientes
            while (true){

                // quando vir uma solicitacao de novo jogo para porta 7001
                Socket cliente = servidor.accept();

                // pega o que esta na entrada de fluxo de dados do cliente
                InputStreamReader fluxoDadosCliente = new InputStreamReader(cliente.getInputStream());
                BufferedReader dados = new BufferedReader(fluxoDadosCliente);

                System.out.println("cliente conectado: " + cliente.getInetAddress());
                System.out.println(dados.readLine());

                cliente.close();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private static ServerSocket servidor;

    public static void main(String[] args) {

        try {
            // servidor escutando na porta 7001
            servidor = new ServerSocket(7001);

            // esperando clientes
            while (true){

                // quando vir uma solicitacao para porta 7001
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
        }
    }
}

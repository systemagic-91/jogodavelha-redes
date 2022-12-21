//package Cliente.src;

import java.io.*;
import java.net.*;

class TCPConnection {
   private static final int portaServidor = 9999;
   // private static String ipServidor = "2804:14c:5b71:589e:d923:3ee8:ada8:
   // private static String ipServidor = "::1";
   private static String ipServidor = "127.0.0.1";
   // private static final String ipServidor = "192.168.0.100";
   private static Socket conexao;
   
   public static void closeConnection() throws IOException {
      System.out.println("Fechando conexão com Servidor (IP " + conexao.getInetAddress().getHostAddress() + " e porta " + conexao.getPort() + ")");
      conexao.close();
   }
   
   public static String receiveData() throws Exception {
      System.out.println("Aguardando dado");
      BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
      System.out.println("Dado recebido");
      return entrada.readLine();
   }
   
   public static void sendData(String data) throws Exception{
      DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
      saida.writeBytes(data + '\n');
   }

   public static void createConnection() throws Exception {
      //Efetua a primitiva conexao
      conexao = new Socket(ipServidor, portaServidor);

      System.out.println("Conexão efetuada com Servidor (IP " + conexao.getInetAddress().getHostAddress() + " e porta " + conexao.getPort() + ")");
      System.out.println("Conexão meu IP (" + conexao.getLocalAddress().getHostAddress() + ") e porta (" + conexao.getLocalPort() + ")");
   }
}

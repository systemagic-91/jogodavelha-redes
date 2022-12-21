//package Cliente.src;

import java.io.*;
import java.net.*;

class UDPConnection
{
   private static int portaServidor = 9988;
   private static byte[] sendData = new byte[1024];
   private static byte[] receiveData = new byte[1024];

   public static byte[] lerString () throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      return in.readLine().getBytes();
   }
   
   public String receivePackge;

   public static String getConnection() throws Exception
   {
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress ipServidor = InetAddress.getByName("::1");
      sendData = lerString();

      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipServidor, portaServidor);
      clientSocket.send(sendPacket);

      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);
      clientSocket.close();

      return new String(receivePacket.getData());
   }
}

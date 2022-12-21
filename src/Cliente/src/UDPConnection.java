//package Cliente.src;

import java.io.*;
import java.net.*;

class UDPConnection
{
   private static int portaServidor = 9988;
   private static byte[] sendData = new byte[1024];
   private static byte[] receiveData = new byte[1024];
   
   public String receivePackge;

   public static String getConnection() throws Exception
   {
      System.out.println("get");
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress ipServidor = InetAddress.getByName("127.0.0.1");
      System.out.println("IP:"+ipServidor.toString());
      sendData = "board".getBytes();

      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipServidor, portaServidor);
      clientSocket.send(sendPacket);
      System.out.println("send ok");

      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);
      System.out.println("recive ok");
      clientSocket.close();

      return new String(receivePacket.getData());
   }
}

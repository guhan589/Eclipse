package embeddedsystem;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpNetWork {
   
   public static void main(String[] args) throws IOException {
      ServerSocket server1=new ServerSocket(1515);
      //DatagramSocket server2=new DatagramSocket(1616);
      
      Socket socket;
      
      socket=server1.accept();
      BufferedReader bin1=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      BufferedWriter bout1=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      System.out.println(socket.getPort() +"로 부터 접속 되었습니다. ");
      byte[] buffer=new byte[500];
      DatagramPacket din=new DatagramPacket(buffer, buffer.length);
      DatagramSocket receiver=new DatagramSocket(5000);
      //receiver.receive(din);
      //String data=new String(din.getData(),0,din.getLength());
      //socket=server2.accept();
   //   BufferedReader bin2=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      //BufferedWriter bout2=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      //String s;
      while(true) {
         receiver.receive(din);
         String data=new String(din.getData(),0,din.getLength());
         System.out.println(data);
         bout1.write(data+"\n");
         bout1.flush();   
      }
      
   }

}
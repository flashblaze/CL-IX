import java.io.*;
import java.net.*;

class UDPserver {
    public static void main(String argv[]) throws Exception {
        String clientSentence;
        String capitalizedSentence;
        DatagramSocket serverSocket = new DatagramSocket(9876);
        
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        
        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            clientSentence = new String(receivePacket.getData());
            
            System.out.println("RECEIVED: " + clientSentence);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            sendData = capitalizedSentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}

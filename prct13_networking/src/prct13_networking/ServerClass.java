package prct13_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputstream = null;
		DataInputStream din = null;
		
		OutputStream outputstream = null;
		DataOutputStream dout = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("Server ready!");
			
			// If client code writeUTF is executed, server start
			socket = serverSocket.accept(); // accept function make server
			System.out.println("Client connected~");
			System.out.println("socket: " + socket);
			
			inputstream = socket.getInputStream();
			din = new DataInputStream(inputstream);
			
			outputstream = socket.getOutputStream();
			dout = new DataOutputStream(outputstream);
			
			while(true) {
				String clientMessage = din.readUTF();
				System.out.println("client message : " + clientMessage);
				
				dout.writeUTF("Message sending completeed~");
				dout.flush();
				
				if(clientMessage.equals("STOP")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputstream != null) inputstream.close();
				if(outputstream != null) outputstream.close();
				if(din != null) din.close();
				if(dout != null) dout.close();
				
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

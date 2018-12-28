package prct13_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
	public static void main(String[] args) {
		Socket socket = null;
		
		OutputStream outputstream = null;
		DataOutputStream dout = null;
		
		InputStream inputstream = null;
		DataInputStream din = null;
		
		Scanner scanner = null;
		try {
			socket = new Socket("localhost", 9000);
			System.out.println("Server connection completed!");
			
			outputstream = socket.getOutputStream();
			dout = new DataOutputStream(outputstream);
			
			inputstream = socket.getInputStream();
			din = new DataInputStream(inputstream);
			
			scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("Insert the message!");
				String outMessage = scanner.nextLine();
				dout.writeUTF(outMessage);
				dout.flush();
				
				String inMessage = din.readUTF();
				System.out.println("InMessage : " + inMessage);
				
				if(outMessage.equals("STOP")) break;
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

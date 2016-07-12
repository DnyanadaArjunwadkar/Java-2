import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Client side....");
    try {
		Socket client=new Socket("localhost",10000);
		System.out.println("waiting for Server");

		DataOutputStream op= new DataOutputStream(client.getOutputStream());
		System.out.println("Enter your msg for Server");
            Scanner uip1 = new Scanner(System.in);
            String up1=uip1.nextLine();

		op.writeUTF(up1);

		DataInputStream ip= new DataInputStream(client.getInputStream());
		String str=ip.readUTF();
		 
           
		System.out.println("Server:"+str);
		ip.close();
		uip1.close();
		op.flush();
		op.close();
		client.close();
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

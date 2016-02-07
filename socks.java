import java.io.*;
import java.net.*;
import java.util.Scanner;
public class socks {

	public static void main(String[] args)
	{
		System.out.println("Server side....");
		try {
			ServerSocket ss=new ServerSocket(10000);
			Socket serv=ss.accept();
			System.out.println("waiting for client");

			DataInputStream ip=new DataInputStream(serv.getInputStream());
			String str=(String)ip.readUTF();
			
			System.out.println("Client:"+str);
			
			DataOutputStream op=new DataOutputStream(serv.getOutputStream());
            System.out.println("Enter your msg for client");
            Scanner uip1 = new Scanner(System.in);
            String uip = uip1.nextLine();
            op.writeUTF(uip);
            

			//op.writeUTF("Hello from Server");
			
            op.flush();
        uip1.close();
            op.close();
			
			ss.close();
			ip.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}

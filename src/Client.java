import java.io.*;
import java.net.*;

public class Client{

	Socket s;
	Connection conn;

	public Client(){
		try{
			this.s = new Socket("127.0.0.1", 8888);
			this.conn = new Connection(s);
		}catch(Exception e){
			System.out.println("Client: An error occurred");
			e.printStackTrace();
		}
	}

	public static void main(String args[]){
		new Client();
	}

}
import java.io.*;
import java.net.*;

public class Client extends Thread{

	Socket s;
	Connection conn;
  Receiver cReceiver;
  boolean connected;

	public Client(){
		try{
			this.s = new Socket("127.0.0.1", 8888);
			this.conn = new Connection(s);
      this.connected = true;
      this.cReceiver = new ClientReceiver (this);
      this.cReceiver.start();
      this.conn.sendMessage("Hello Server!");
		}catch(Exception e){
			System.out.println("Client: An error occurred");
			e.printStackTrace();
		}
	}

  public void run(){
    while(connected){

    }
  }

	public static void main(String args[]){
		Thread client = new Client();
    client.start();
	}

}
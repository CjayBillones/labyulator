package app.src.server;

import app.src.calculator.*;
import app.src.network.*;
import java.io.*;
import java.net.*;

public class ClientThread extends Thread{

	private Socket s;
  private Receiver receiver;
  public Connection conn;
  public Context context;

	public ClientThread(ServerSocket ssocket){
		try{
			this.s = ssocket.accept();
			this.conn = new Connection(s);
			System.out.println("Server: " + s.getInetAddress() + " connected.");
			this.conn.sendMessage("Server: Successfully connected to server.");
		  this.receiver = new ServerReceiver(this);
      this.receiver.start();
    }catch(Exception e){
			System.out.println("Server: An error occurred.");
			e.printStackTrace();
		}
	}

	public void run(){
		try{
			while(true){
			}
		}catch(Exception e){
			System.out.println("Server: An error occurred");
			e.printStackTrace();
		}
	}

}
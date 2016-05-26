package app.src.network;

import java.io.*;
import java.net.*;

public class SocketThread extends Thread{

	Socket s;
	Connection conn;
  Receiver receiver;

	public SocketThread(ServerSocket ssocket){
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
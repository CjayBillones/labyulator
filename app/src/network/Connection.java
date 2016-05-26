package app.src.network;

import java.io.*;
import java.net.*;

public class Connection{

	private Socket s;
	private PrintWriter out;
	private BufferedReader in;

	public Connection(Socket s){
		try{
			this.s = s;
			this.out = new PrintWriter(new OutputStreamWriter(this.s.getOutputStream()), true);
			this.in = new BufferedReader(new InputStreamReader(this.s.getInputStream()));
		}catch(Exception e){
			System.out.println("System: An error occurred.");
			e.printStackTrace();
		}
	}

	public String getMessage(){
		try{
			return this.in.readLine();
		}catch(Exception e){
			e.printStackTrace();
			return "System: An error occurred.";
		}
	}

	public void sendMessage(String msg){
		try{
			this.out.println(msg);
		}catch(Exception e){
			System.out.println("System: An error occurred.");
			e.printStackTrace();
		}
	}

}
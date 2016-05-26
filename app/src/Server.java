package app.src;

import app.src.network.*;
import java.io.*;
import java.net.*;

public class Server{

		ServerSocket ssocket;

		public Server(){
			try{
				
				System.out.println("Server: Starting server. . .");
				this.ssocket = new ServerSocket(8888);
				System.out.println("Server: Waiting for connections. . .");

				while(true){
					SocketThread sg = new SocketThread(ssocket);
					sg.start();
				}

			}catch(Exception e){
				System.out.println("Server: An error occurred.");
				e.printStackTrace();
			}
		}

		public static void main(String args[]){
			new Server();
		}
}
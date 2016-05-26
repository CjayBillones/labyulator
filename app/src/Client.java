package app.src;

import app.src.network.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client extends Thread{

	public Socket s;
	public Connection conn;
  public boolean connected;
  public Scanner sc;
  public Receiver cReceiver;

	public Client(){
		try{
			this.s = new Socket("127.0.0.1", 8888);
			this.conn = new Connection(s);
      this.connected = true;
      sc = new Scanner(System.in);
      this.cReceiver = new ClientReceiver (this);
      this.cReceiver.start();
		}catch(Exception e){
			System.out.println("Client: An error occurred");
			e.printStackTrace();
		}
	}

  public void run(){

    int choice;
    String name1, name2;

    while(connected){
      displayMenu();

      System.out.print("Enter Option: ");
      choice = sc.nextInt();
      sc.nextLine();

      if(choice == 3){
        connected = false;
        cReceiver.changeConnectionStatus();
        continue;
      }
      
      System.out.print("Enter your name: ");
      name1 = sc.nextLine();
      
      System.out.print("Enter your beloved's name: ");
      name2 = sc.nextLine();

      // Validate Input Here

      this.conn.sendMessage(choice + ";" + name1 + ";" + name2 + ";");
    }
    System.exit(1);
  }

  public void displayMenu(){
    System.out.println("***********************************************************************************");
    System.out.println("\t\t\t\t\tLabyuLator");
    System.out.println("***********************************************************************************");
    System.out.println("\t\t 1 - FLAMES \t\t 2 - TRUE LOVE \t\t 3 - QUIT");
    System.out.println("***********************************************************************************");    
  }

	public static void main(String args[]){
		Thread client = new Client();
    client.start();
	}

}
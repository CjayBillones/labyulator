package app.src.client;

import app.src.network.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client{

	private Socket s;
  private Scanner sc;
  private boolean connected;
  private Receiver cReceiver;
  public Connection conn;

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

  public void load(){
    try{
      Thread.sleep(1000);
    }catch(Exception e){
      System.out.println("Client: An error occurred");
      e.printStackTrace();
    }
  }

  public void run(){

    int choice;
    String name1, name2;

    while(connected){
      load();
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
		Client client = new Client();
    client.run();
	}

}
package app.src.client;

import app.src.network.*;
import app.src.util.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client{

	private Socket s;
  private Scanner sc;
  private boolean connected;
  private Receiver cReceiver;
  private InputValidator validator;
  public Connection conn;

	public Client(String args[]){
		try{
      if(args.length == 0)
        this.s = new Socket("127.0.0.1", 8888);
			else
        this.s = new Socket(args[0], 8888);
      this.conn = new Connection(s);
      this.connected = true;
      this.sc = new Scanner(System.in);
      this.validator = InputValidator.getInstance();
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

  public void displayMenu(){
    System.out.println("***********************************************************************************");
    System.out.println("\t\t\t\t\tLabyuLator");
    System.out.println("***********************************************************************************");
    System.out.println("\t\t 1 - FLAMES \t\t 2 - TRUE LOVE \t\t 3 - QUIT");
    System.out.println("***********************************************************************************");    
  }

  public int inputChoice(){
  
    int choice;
  
    do{
      System.out.print("Enter Option: ");
      choice = sc.nextInt();
      sc.nextLine();
    }while(!validator.validateOption(choice));   
  
    return choice;
  }

  public String inputNames(){
    
    String inputNames[] = new String[2];

    for(int i = 0; i < inputNames.length; i++){
      System.out.print("Enter name of person " + i + ": ");
      inputNames[i] = sc.nextLine();
    }

    if(!validator.validateNames(inputNames[0], inputNames[1])){
      System.out.println("ERROR: One or both of the input names is/are invalid.");
      return null;
    }
  
    return (inputNames[0] + ";" + inputNames[1] + ";");
  }

  public void run(){

    int choice;
    String inputNames;

    while(connected){
      load();
      displayMenu();
      choice = inputChoice();
        if(choice == 3){
          connected = false;
          cReceiver.changeConnectionStatus();
          continue;
        }
      inputNames = inputNames();
        if(inputNames == null)
          continue;
      this.conn.sendMessage(choice + ";" + inputNames);
    }
    System.exit(1);
  }

	public static void main(String args[]){
		Client client = new Client(args);
    client.run();
	}

}
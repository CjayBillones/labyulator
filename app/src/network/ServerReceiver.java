package app.src.network;

import app.src.server.*;
import java.io.*;
import java.net.*;

public class ServerReceiver extends Receiver{

  private ClientThread client;

  public ServerReceiver(ClientThread client){
    this.client = client;
  }

  public void run(){
    while(connected){
      String message = client.conn.getMessage();

      if(message == null || message.length() == 0) continue;

      System.out.println(message);

      if(message.equals("/quit")){
        changeConnectionStatus();
      }

      client.conn.sendMessage("Message Received");
    }
  }

}
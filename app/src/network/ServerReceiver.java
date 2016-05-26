package app.src.network;

import app.src.calculator.*;
import app.src.server.*;
import java.io.*;
import java.net.*;

public class ServerReceiver extends Receiver{

  private ClientThread client;

  public ServerReceiver(ClientThread client){
    this.client = client;
  }

  public void run(){

    String message;
    String parsedMessage[];

    while(connected){
      message = client.conn.getMessage();

      if(message == null || message.length() == 0) continue;
      else if(message.equals("/quit")){
        changeConnectionStatus();
      }

      parsedMessage = parseMessage(message);
      client.conn.sendMessage(calculateCompatibility(parsedMessage));
    }
  }

  private String calculateCompatibility(String[] parsedMessage){
    if(parsedMessage[0].equals("1"))
      this.client.context = new Context(new FLAMESCalculator());
    else
      this.client.context = new Context(new TRUELOVECalculator());
    return this.client.context.executeLoveCalculator(parsedMessage[1], parsedMessage[2]);
  }

  private String[] parseMessage(String message){
    return message.split(";");
  }

}
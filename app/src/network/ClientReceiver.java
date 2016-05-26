package app.src.network;

import app.src.*;
import java.io.*;
import java.net.*;

public class ClientReceiver extends Receiver{

  Client c;

  public ClientReceiver(Client c){
    this.c = c;
  }

  public void run(){
    while(connected){
      String message = c.conn.getMessage();

      if(message == null || message.length() == 0) continue;

      System.out.println(message);
    }
  }

}
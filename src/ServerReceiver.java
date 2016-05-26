import java.io.*;
import java.net.*;

public class ServerReceiver extends Receiver{

  SocketThread sg;

  public ServerReceiver(SocketThread sg){
    this.sg = sg;
  }

  public void run(){
    while(connected){
      String message = sg.conn.getMessage();

      if(message == null || message.length() == 0) continue;

      System.out.println(message);

      if(message.equals("/quit")){
        changeConnectionStatus();
      }
    }
    System.out.println("Killing Thread");
  }

}
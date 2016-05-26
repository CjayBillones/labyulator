package app.src.network;

public abstract class Receiver extends Thread{

  protected boolean connected = true;

  public abstract void run();

  public void changeConnectionStatus(){
    this.connected = (this.connected) ? false : true;
  }
}
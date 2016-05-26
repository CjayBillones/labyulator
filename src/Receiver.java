public abstract class Receiver extends Thread{

  public boolean connected = true;

  public abstract void run();

  public void changeConnectionStatus(){
    this.connected = (this.connected) ? false : true;
  }

  public boolean getConnectionStatus(){
    return this.connected;
  }

}
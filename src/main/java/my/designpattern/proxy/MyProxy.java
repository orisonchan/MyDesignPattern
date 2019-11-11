package my.designpattern.proxy;

/**
 * @author Orison Chan
 */
public class MyProxy implements My {

  private MyReal real;

  private int total;

  public MyProxy() {
    this.real = new MyReal();
    this.total = 0;
  }

  @Override
  public void buy() {
    this.real.buy();
    total++;
    System.out.println("So far, buy " + total + " item(s).");
  }

  public int getTotal() {
    return total;
  }

}
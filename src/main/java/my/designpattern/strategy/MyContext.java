package my.designpattern.strategy;

public class MyContext {

  private MyStrategy strategy;

  private MyContext(MyStrategy strategy) {
    this.strategy = strategy;
  }

  public static MyContext getNewInstance(MyStrategy strategy) {
    return new MyContext(strategy);
  }

  public int processInt(int a, int b) {
    return strategy.op(a, b);
  }

  public float processFloat(float a, float b) {
    return strategy.op(a, b);
  }

  public double processDouble(double a, double b) {
    return strategy.op(a, b);
  }

}
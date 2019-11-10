package my.designpattern.strategy;

/**
* @author Orison Chan
*/
public interface Strategy {
	
	public int op(int a, int b);

  public float op(float a, float b);
	
	public double op(double a, double b);
}
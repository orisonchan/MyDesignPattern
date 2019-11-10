package my.designpattern.strategy;

public class Add implements Strategy {
	
	@Override
	public int op(int a, int b) {
		return a + b;
	}
	
	@Override
	public float op(float a, float b) {
		return a + b;
	}
	
	@Override
	public double op(double a, double b) {
		return a + b;
	}
	
}
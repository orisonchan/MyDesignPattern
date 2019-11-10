package my.designpattern.strategy;

public class Context {
	
	private Strategy strategy;
	
	private Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public static Context getNewInstance(Strategy strategy) {
		return new Context(strategy);
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
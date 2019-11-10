package my.designpattern.proxy;

import org.junit.Test;

public class TestMyProxy {
	
	@Test
	public void testProxy() {
		MyProxy proxy = new MyProxy();
		for (int i = 0; i < 10; i++) {
			proxy.buy();
		}
		assert (proxy.getTotal() == 10);
		System.out.println(":: Test Proxy successful!");
	}
}
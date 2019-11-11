package my.designpattern.strategy;

import org.junit.Test;

public class TestStrategy {

  @Test
  public void testStrategy() {
    MyContext context = MyContext.getNewInstance(new Add());
    assert (context.processInt(1, 2) == 3);

    System.out.println(":: Test Strategy successful");
  }
}
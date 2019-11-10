package my.designpattern.singleton;

import my.designpattern.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Orison Chan
 */
public class TestMySingleTon {

  @Test
  public void testMultiGetInstance() throws ExecutionException, InterruptedException {
    ExecutorService pool = Executors.newFixedThreadPool(20);
    List<Future<Person>> list = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      Future<Person> future = pool.submit(new Run());
      list.add(future);
    }
    pool.shutdown();
    for (int i = 0; i < 19; i++) {
      assert (list.get(i).get().equals(list.get(i + 1).get()));
    }
    System.out.println(":: Test 20 times MySingleton.getInstance() successful");
  }

  @Test
  public void testSeveralTimes() throws ExecutionException, InterruptedException {
    for (int i = 0; i < 10; i++) {
      testMultiGetInstance();
    }
  }

  private class Run implements Callable<Person> {
    @Override
    public Person call() {
      return MySingleton.getInstance();
    }
  }

}

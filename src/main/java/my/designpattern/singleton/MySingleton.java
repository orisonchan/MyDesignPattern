package my.designpattern.singleton;

import my.designpattern.model.Person;

/**
 * @author Orison Chan
 */
public class MySingleton {

  private static volatile Person instance;
  
  private static final Boolean LOCK = true;

  private MySingleton() {
  }

  public static Person getInstance() {
    if (instance == null) {
      synchronized (LOCK) {
        if (instance == null) {
          instance = new Person();
        }
      }
    }
    return instance;
  }
}

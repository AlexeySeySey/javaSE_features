import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import Service.*;

class Main {
  public static void main(String[] args) throws Exception {

    var counter = new CounterService();

    Callable task = () -> {
      for (int i = 0; i < 1000; i++) {
        counter.inc();
      }
      return true;
    };

    FutureTask futureOne = new FutureTask(task);
    FutureTask futureTwo = new FutureTask(task);

    new Thread(futureOne).start();
    new Thread(futureTwo).start();

    while(true) {
      if (futureOne.isDone() && futureTwo.isDone()) {
        System.out.println("Count: " + counter.get());
        break;
      }
    }

    System.out.println("Finish");
  }
}
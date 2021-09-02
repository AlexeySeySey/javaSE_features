import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.FutureTask;

class Main {
  public static void main(String[] args) throws Exception {

    long startTime = System.nanoTime();
    int stringsLen = 5;

    String[] strings = new String[stringsLen];

    FutureTask[] futures = new FutureTask[stringsLen];

    for (int i = 0; i < stringsLen; i++) {
      final int iteration = i;
      futures[i] = new FutureTask(() -> {
        TimeUnit.SECONDS.sleep(iteration);
        strings[iteration] = "_" + iteration;
        return true;
      });
      new Thread(futures[i]).start();
    }

    while(true) {
      long readyOnesCount = Arrays.stream(futures)
          .filter(future -> future.isDone())
          .count();
      if (readyOnesCount == (long) stringsLen) {
        break;
      }
    }

    Arrays.stream(strings).forEach(System.out::println);

    long elapsedTime = System.nanoTime() - startTime;
    System.out.println("Execution time: " + elapsedTime/1_000_000_000);
  }
}
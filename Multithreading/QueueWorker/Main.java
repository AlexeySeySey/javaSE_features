import Service.WorkerService;
import java.util.concurrent.TimeUnit;

class Main {
  public static void main(String[] args) throws Exception {

    WorkerService workerService = new WorkerService();

    workerService.start();

    System.out.println("Worker is started");

    workerService.add(() -> {
      TimeUnit.SECONDS.sleep(2);
      System.out.println("First job is running");
    });

    System.out.println("I am doing something");

    workerService.add(() -> {
      System.out.println("Second job us running");
    });

    TimeUnit.SECONDS.sleep(3);

    System.out.println("I am doing something else");

    workerService.stopWorker();
  }
}
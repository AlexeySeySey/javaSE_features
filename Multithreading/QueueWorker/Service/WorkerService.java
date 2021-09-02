package Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import Contract.Closure;
import java.util.concurrent.atomic.AtomicBoolean;

public final class WorkerService extends Thread {

  private AtomicBoolean stopped = new AtomicBoolean(true);

  private BlockingQueue<Closure> jobs;

  public WorkerService(int maxJobs) {
    this.jobs = new ArrayBlockingQueue<Closure>(maxJobs);
  }

  public WorkerService() {
    this.jobs = new ArrayBlockingQueue<Closure>(100);
  }

  public WorkerService add(Closure closure) throws Exception {
    this.jobs.put(closure);
    return this;
  }

  @Override
  public void run() {
    try {

      stopped.set(false);

      while (!stopped.get())
        if (!this.jobs.isEmpty())
          this.jobs.take().run();

      System.out.println("Worker stopped");
      return;

    } catch (Exception e) {
      stopped.set(true);
      e.printStackTrace();
      return;
    }
  }

  public void stopWorker() {
    stopped.set(true);
  }
}
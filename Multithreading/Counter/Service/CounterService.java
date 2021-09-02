package Service;

public final class CounterService {

  private volatile int count = 0;

  public synchronized void inc() {
    this.count += 1;
  }

  public int get() {
    return this.count;
  }
}
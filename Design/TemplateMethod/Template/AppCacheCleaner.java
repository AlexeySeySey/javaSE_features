package Template;

public abstract class AppCacheCleaner {

    public void clearStuff() {
        this.clearViewCache();
        this.clearRouteCache();
        this.clearCustomCache();
    }

    protected abstract void clearCustomCache();

    protected void clearViewCache() {
        System.out.println("Clearing views cache...");
    }

    protected void clearRouteCache() {
        System.out.println("Clearing routing cache...");
    }
}
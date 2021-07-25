package Template;

public final class CustomCacheCleaner extends AppCacheCleaner {

    protected void clearCustomCache() {
        System.out.println("Clearing custom cache...");
    }
}
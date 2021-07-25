package Entity;

public final class Product {

    private String title;

    private int rating;

    public Product setTitle(String title) {
        this.title = title;

        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Product setRating(int rating) {
        this.rating = rating;

        return this;
    }

    public int getRating() {
        return this.rating;
    }

    public String toString() {
        return String.format("Product title: %s, Product rating: %s", this.title, this.rating);
    }
}
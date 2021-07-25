import Factory.FactoryMaker;
import java.lang.Exception;

class Main {

    public static void run() throws Exception {
        var maker = new FactoryMaker();

        var user = maker
                .get("User")
                .make();

        System.out.println("User data:\n" + user);

        var product = maker
                .get("Product")
                .make();

        System.out.println("Product data:\n" + product);
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
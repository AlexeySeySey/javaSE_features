import Entity.User;

class Main {
    public static void main(String[] args) {

        var user = new User();
        user.setName("Foo");
        System.out.println(user.getName());
    }
}
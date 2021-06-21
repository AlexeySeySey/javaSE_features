import FunctionalInterfaces.Maker;

class Main {
    public static void main(String[] args) {
        Maker<Integer> maker = (number) -> "BAR: " + number;
        System.out.println(maker.make(100));

        Maker<String> makerString = (someString) -> "FOF: " + someString;
        System.out.println(makerString.make("FOF"));
    }
}

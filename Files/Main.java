import Service.FileManager;

class Main {

    public static void run() throws Exception {

        var fileManager = new FileManager();

        fileManager.setFilePath("resources/test.txt")
                .setFile()
                .write("Foo")
                .append("\nBar")
                .lineByLine((line) -> {
                    System.out.println(line);
                })
                .copy("storage/test1.txt")
                .delete();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
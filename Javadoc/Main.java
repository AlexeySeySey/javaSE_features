import Service.StringBuilderService;

class Main {
    public static void main(String[] args) {
        var str = "Foo Bar Baz";
        var stringBuilderService = new StringBuilderService(str);

        var stringLengthBefore = stringBuilderService.getLength();
        System.out.println(
                String.format("Old string: %s\nOld length: %s\n", str, stringLengthBefore)
        );

        stringBuilderService.replace("", new String[]{"Foo", "Bar"});

        var stringLengthAfter = stringBuilderService.getLength();
        System.out.println(
                String.format("New string: %s\nNew length: %s\n", stringBuilderService.get(), stringLengthAfter)
        );
    }
}
import DTO.RequestDTO;
import Context.RequestHandler;
import Strategy.XmlHandlingStrategy;

class Main {
    public static void main(String[] args) {

        var request = new RequestDTO("json", "test");

        var handler = new RequestHandler();

        handler.handle(request);

        request = new RequestDTO("xml", "test");

        handler.setStrategy(new XmlHandlingStrategy())
                .handle(request);
    }
}
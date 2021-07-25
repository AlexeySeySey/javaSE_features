import DTO.RequestDTO;
import Adapter.HandlerAdapter;

class Main {
    public static void main(String[] args) {

        var request = new RequestDTO("John", "Doe");

        var handlerAdapter = new HandlerAdapter();

        handlerAdapter.handle(request);
    }
}
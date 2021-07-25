import DTO.RequestDTO;
import Proxy.RequestHandlerProxy;

class Main {

    public static void run() throws Exception {

        var request = new RequestDTO("123456", "{1,2,3}");

        var handlerProxy = new RequestHandlerProxy(request);

        handlerProxy.handle();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
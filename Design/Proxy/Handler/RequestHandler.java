package Handler;

import DTO.RequestDTO;
import Proxy.RequestHandlerProxy;
import Constant.ErrorMessage;

public final class RequestHandler {

    public RequestHandler(RequestHandlerProxy proxy) throws Exception {
        if (!proxy.getHandle()) {
            throw new Exception(ErrorMessage.UNHANDLEABLE_REUQEST.get());
        }
    }

    public void handle(RequestDTO request) {
        System.out.println("Handling request:\n" + request);
    }
}
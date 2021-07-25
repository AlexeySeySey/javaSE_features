package Proxy;

import DTO.RequestDTO;
import Handler.RequestHandler;
import Validator.KeyValidator;
import Validator.BodyValidator;
import Contract.IValidator;

public final class RequestHandlerProxy {

    private boolean handle = false;

    private RequestDTO request;

    private IValidator[] validators = new IValidator[]{
            new KeyValidator(),
            new BodyValidator(),
    };

    public RequestHandlerProxy(RequestDTO request) {
        this.request = request;
    }

    public boolean getHandle() {
        return this.handle;
    }

    private void validateRequest() throws Exception {
        for (IValidator validator : this.validators) {
            validator.validate(this.request);
        }
        this.handle = true;
    }

    public void handle() throws Exception {
        this.validateRequest();
        var handler = new RequestHandler(this);
        handler.handle(this.request);
    }
}
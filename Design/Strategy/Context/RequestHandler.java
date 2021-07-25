package Context;

import Contract.IStrategy;
import Strategy.JsonHandlingStrategy;
import DTO.RequestDTO;

public final class RequestHandler {

    private IStrategy strategy = new JsonHandlingStrategy();

    public RequestHandler setStrategy(IStrategy strategy) {
        this.strategy = strategy;

        return this;
    }

    public void handle(RequestDTO requestDTO) {
        this.strategy.handle(requestDTO);
    }
}
package Strategy;

import Contract.IStrategy;
import DTO.RequestDTO;

public final class JsonHandlingStrategy implements IStrategy {
    public void handle(RequestDTO requestDTO) {
        System.out.println("Json Handler: " + requestDTO);
    }
}
package Strategy;

import Contract.IStrategy;
import DTO.RequestDTO;

public final class XmlHandlingStrategy implements IStrategy {
    public void handle(RequestDTO requestDTO) {
        System.out.println("Xml handler: " + requestDTO);
    }
}
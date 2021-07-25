package Contract;

import DTO.RequestDTO;

public interface IStrategy {
    public void handle(RequestDTO requestDTO);
}
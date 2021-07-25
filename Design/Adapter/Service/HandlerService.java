package Service;

import DTO.DataDTO;

public final class HandlerService {

    private DataDTO dataDTO;

    public HandlerService(DataDTO dataDTO) {
        this.dataDTO = dataDTO;
    }

    public void handle() {
        System.out.println(dataDTO);
    }
}
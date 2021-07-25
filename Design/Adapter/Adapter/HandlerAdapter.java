package Adapter;

import DTO.*;
import Service.HandlerService;

public final class HandlerAdapter {

    private DataDTO adapt(RequestDTO requestDTO) {
        var data = String.format(
                "{\"foo\":\"%s\",\"bar\":\"%s\"}",
                requestDTO.getFoo(),
                requestDTO.getBar()
        );
        return new DataDTO(data);
    }

    public void handle(RequestDTO requestDTO) {
        var handler = new HandlerService(this.adapt(requestDTO));
        handler.handle();
    }
}
package Validator;

import DTO.RequestDTO;
import Constant.ErrorMessage;
import Contract.IValidator;

public final class KeyValidator implements IValidator<RequestDTO> {

    public void validate(RequestDTO request) throws Exception {
        if (request.getKey().length() < 6) {
            throw new Exception(ErrorMessage.INVALID_REQUEST.get());
        }
    }
}
package Validator;

import DTO.RequestDTO;
import Constant.ErrorMessage;
import Contract.IValidator;

public final class BodyValidator implements IValidator<RequestDTO> {

    public void validate(RequestDTO request) throws Exception {
        var body = request.getBody();
        if (!body.contains("{") || !body.contains("}")) {
            throw new Exception(ErrorMessage.INVALID_REQUEST.get());
        }
    }
}
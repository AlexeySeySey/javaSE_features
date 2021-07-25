 package Contract;

import Contract.IDTO;

public interface IValidator<T extends IDTO> {
    public void validate(T obj) throws Exception;
}
package Services;

import Contracts.IMaker;

public class Handler {
    public static String makeFrom(IMaker maker) {
        return maker.make();
    }
}

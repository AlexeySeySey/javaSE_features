package Lambda;

import Item.BaseItem;

@FunctionalInterface
public interface IServiceMapClosure {
    public void handle(BaseItem item);
}
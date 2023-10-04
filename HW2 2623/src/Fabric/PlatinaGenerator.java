package Fabric;

import Interface.iGameItem;
import Product.PlatinaReward;

public class PlatinaGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new PlatinaReward();
    }
}

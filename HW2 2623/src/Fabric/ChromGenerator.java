package Fabric;

import Interface.iGameItem;
import Product.ChromReward;

public class ChromGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new ChromReward();
    }
}

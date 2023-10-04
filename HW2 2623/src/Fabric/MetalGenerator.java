package Fabric;

import Interface.iGameItem;
import Product.MetalReward;

public class MetalGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new MetalReward();
    }
}

import Fabric.*;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        ItemGenerator f1 = new GemGenerator();
        f1.openReward();

        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();

        ItemGenerator f3 = new SilverGenerator();
        f3.openReward();

        ItemGenerator f4 = new ChromGenerator();
        f4.openReward();

        ItemGenerator f5 = new IronGenerator();
        f5.openReward();

        ItemGenerator f6 = new MetalGenerator();
        f6.openReward();

        ItemGenerator f7 = new PlatinaGenerator();
        f7.openReward();

        ItemGenerator f8 = new SteelGenerator();
        f8.openReward();

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();

        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);
        System.out.println();



        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 100; i++) {
            int rnd = random.nextInt(64);
            if (rnd < 60) itemGeneratorList.get(random.nextInt(2,8)).openReward();
            else if (rnd > 59 && rnd < 63) {
                itemGeneratorList.get(1).openReward();
            }
            else itemGeneratorList.get(0).openReward();

        }
    }
}

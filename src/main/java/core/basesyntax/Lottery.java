package core.basesyntax;

import java.util.Random;

public class Lottery {
    ;

    public String getRandomBall() {
        Random rand = new Random();
        int randomBall = rand.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String ballColor = colorSupplier.getRandomColor();
        return "The ball is... " + randomBall + " " + ballColor;
    }
}


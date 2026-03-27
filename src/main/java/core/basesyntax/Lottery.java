package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();
    private int maxNumber = 100;

    public Ball getRandomBall() {
        int randomBall = rand.nextInt(maxNumber) + 1;
        String ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, randomBall);
    }
}


package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();
    private final int outOfPossibleNumber = 101;

    public Ball getRandomBall() {
        int randomBall = rand.nextInt(outOfPossibleNumber);
        String ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, randomBall);
    }
}


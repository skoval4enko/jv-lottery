package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int randomNumber = rand.nextInt(MAX_NUMBER) + 1;
        String ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, randomNumber);
    }
}


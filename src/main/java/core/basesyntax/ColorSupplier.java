package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Ball.Colors.values().length);
        Ball.Colors color = Ball.Colors.values()[index];
        return color.toString();
    }
}

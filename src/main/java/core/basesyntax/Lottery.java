package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color ballColor = supplier.getRandomColor();

        Random number = new Random();
        int ballNumber = number.nextInt(100) + 1;

        return new Ball(ballColor, ballNumber);
    }
}

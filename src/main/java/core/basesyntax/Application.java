package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        String ballOne = lottery.getRandomBall();
        String ballTwo = lottery.getRandomBall();
        String ballThree = lottery.getRandomBall();
        System.out.println(ballOne
                + " "
                + ballTwo
                + " "
                + ballThree);
    }
}

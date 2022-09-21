import controller.ScoreBoard;
import model.Circle;
import model.Square;
import model.Triangle;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Circle Tap!");
        scoreBoard.algorithmBase = new Circle();
        scoreBoard.showScore(10,5);

        System.out.println("Triangle Tap!");
        scoreBoard.algorithmBase = new Triangle();
        scoreBoard.showScore(5,3);

        System.out.println("Square Tap!");
        scoreBoard.algorithmBase = new Square();
        scoreBoard.showScore(11,13);

    }
}
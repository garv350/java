import java.util.Random;
import java.util.Scanner;

class Game {
    private int no;
    private int rnd;
    private int noGuess = 0;

    public Game() {
        Random r = new Random();
        this.rnd = r.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a guess between 0 to 100");
        no = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noGuess++;
        if (no > rnd) {
            System.out.println("Too High...");
        } else if (no < rnd) {
            System.out.println("Too Low...");
        } else {
            System.out.println("You enter correct number");
            System.out.println("You win!");
            return true;
        }
        return false
    }

    public void setNoOfGuess() {
        this.noGuess = noGuess;
    }

    public int getNoOfGuess() {
        return noGuess;
    }
}

public class Guessgame {
    public static void main(String[] args) {
        System.out.println("Guess the number game");
        Game guess = new Game();
        boolean b = false;
        while (!b) {
            guess.takeUserInput();
            b = guess.isCorrectNumber();
        }
        guess.setNoOfGuess();
        System.out.println("You take " + guess.getNoOfGuess() + " guesses");
    }
}

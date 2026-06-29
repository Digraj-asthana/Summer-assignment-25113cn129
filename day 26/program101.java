import java.util.*;
class NumberGuessingGame {
    private int ranNum;
    private int userNum;
    private int noOfGuesses;

    public NumberGuessingGame() {
        Random ran = new Random();
        ranNum = ran.nextInt(101);
    }

    public void takeUserInput(int userInput) {
        userNum = userInput;
    }

    public boolean isCorrectNumber() {
        return userNum == ranNum;
    }

    public void incrementNoOfGuesses() {
        noOfGuesses++;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void checkGuess() {
        if (userNum > ranNum) {
            System.out.println("Entered number is greater");
        } else if (userNum < ranNum) {
            System.out.println("Entered number is smaller");
        } else {
            System.out.println("Entered number is correct");
        }
    }
}
class program101 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGuessingGame game = new NumberGuessingGame();

        do {
            System.out.println("Guess the number between 0 to 100");
            game.takeUserInput(sc.nextInt());
            game.incrementNoOfGuesses();
            game.checkGuess();
        } while (!game.isCorrectNumber());

        System.out.println("The number of guesses is " + game.getNoOfGuesses());

        sc.close();
    }
}
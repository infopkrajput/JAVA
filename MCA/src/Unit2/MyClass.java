package Unit2;

public class MyClass {
  public static void main(String[] args) {
    System.out.println(calculateScore(500));
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("player name is " + playerName + " and score is " + score);
    return score * 1000;
  }

  // public static int calculateScore(int score) {
  // System.out.println("Unknown player and score is " + score);
  // return score * 1000;
  // }

  public static int calculateScore(int score) {
    return calculateScore("Anonymous", score);
  }

  public static int calculateScore() {
    System.out.println("No player and no score");
    return 0;
  }

}

public class MyClass {
  public static void main(String[] args) {
    // calculateScore("mike", 500);
    // calculateScore(500);
    // calculateScore();
    int c[][] = new int[2][2];
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

  // only changing from int to void is invalid Method Overloading
  // public static void calculateScore() {
  // System.out.println("No player and no score");
  // }

}


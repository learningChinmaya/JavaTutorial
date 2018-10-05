public class MethodEx {
    public static void main(String[] args) {
        CalculateScore(5, 10000, 8, 200);

    }

    public static int CalculateScore(int gameOver, int Score, int levelcompleted, int bonus) {
        if (gameOver == 7) {
            int finalscore = Score + (levelcompleted * bonus);
            System.out.println("Final score is " + finalscore);
            return finalscore;
        } else {
            System.out.println("not calculated");
        }
        return -1;

    }
}
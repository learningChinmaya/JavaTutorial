public class ifelseifEx {
    public static void main(String[] args){
        boolean Gameover=true;
        int score=800;
        int levelcompleted=5;
        int bonus= 100;

        if(Gameover){
            int finalscore= score+(levelcompleted*bonus);
            System.out.println("the final score is " + finalscore );
        }
        score=10000;
        levelcompleted=8;
        bonus= 200;
        if(Gameover){
            int finalscore= score+(levelcompleted*bonus);
            System.out.println("the final score is " + finalscore );
        }


    }
}

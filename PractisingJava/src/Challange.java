public class Challange {
    public static void main(String[] args) {
        calculatescore(true,800,5,100);
        calculatescore(true,10000,8,200);
    }

    public static void calculatescore(boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore=score;

        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("bro ur final score is "+finalScore);
        }

    }
}

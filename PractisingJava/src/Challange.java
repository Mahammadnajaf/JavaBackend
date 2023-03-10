public class Challange {
    public static void main(String[] args) {

        int highschore=calculatescore(false,2000,4,500);
        System.out.println("highest score "+ highschore  );


        System.out.println( "another hiigh score "+calculatescore(true,10000,8,200));
    }

    public static int calculatescore(boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore=score;

        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;

        }
        return finalScore;
    }
}

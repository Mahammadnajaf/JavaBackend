public class Challange {
    public static void main(String[] args) {

    int pos=calculateHighScorePosition(1500);
    displayHighScorePosition("Tim",pos);


    }

    public static void displayHighScorePosition(String playerName,int playerPosition) {
        System.out.println(playerName+" managed to get into position "+playerPosition+"  on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore>=1000){return 1;}
        else if(playerScore>=500 ){return 2;}
        else if(playerScore>=100 ){return 3;}
        return 4;
    }


}


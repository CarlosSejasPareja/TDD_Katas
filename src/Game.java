
public class Game {
    private int rolls[]=new int[21];
    private int curretRoll=0;
    public void roll(int pins){
        rolls[curretRoll++]=pins;
    }

    public int score(){
        int score=0;
        for(int i=0;i<rolls.length;i++){
            score+=rolls[i];
        }
        return score;
    }

}

package Constracror;

import java.util.Random;

public class Dice {
    int sides;
    int value;

    public Dice(int numSides){
        sides = numSides;
        ron();
    }
    public void ron(){
        Random r = new Random();
        value = r.nextInt(sides)+1;
    }
    public int getSides(){
        return sides;
    }
    public int getValue(){
        return value;
    }
}

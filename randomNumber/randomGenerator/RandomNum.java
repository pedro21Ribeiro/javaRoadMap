package randomNumber.randomGenerator;

import java.util.Random;

public class RandomNum {
    public static int generate(int dificulty){
        Random rand = new Random();
        int number = rand.nextInt(dificulty);
        return number + 1;
    }    
}

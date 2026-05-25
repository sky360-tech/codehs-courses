public class Randomizer {


    public static int nextInt() {


    //get random number from 1-10


    int randInteger = (int) (Math.random() * (11) + 1);


    //if number is greater than 10 or less than 1


    while (randInteger > 10 || randInteger < 1) {


    randInteger = (int) (Math.random() * (11) + 1);


    }


    return randInteger;


    }


    public static int nextInt(int min, int max) {


    //formula to get random number from min-max


    int randInteger = (int) (Math.random() * (max + 1) + min);


    while (randInteger > max || randInteger < min) {
    

    randInteger = (int) (Math.random() * (max + 1) + min);


    }

    return randInteger;

    }
}
public class experiment {
    public static void main(String[] args) {
        // these variables are used to kill the loop(when all 3 have been "switched on", the game ends
        String first = "a";
        String second = "b";
        String third = "c";
        // these are used to alert the user of double guesses
        int firstNumCheck = 0;
        int secondNumCheck = 0;
        int thirdNumCheck = 0;
        // this records the number of attempts
        int numGuesses = 0;
        //creates a new object of the class which is responsible for generating the random cells of the startup
        MyRandomNumbers ranum = new MyRandomNumbers();
                //creates a new object of the class which is responsible for asking for user input
        GameHelper helper2 = new GameHelper();
        boolean stat = false;
        while (stat == false) {
            String result = "miss";
            int guess = helper2.getUserInput("enter a number");

            if (guess == ranum.a) {
                result = "hit";
                //System.out.println(result);
                first = "k";
                firstNumCheck++;
                if (firstNumCheck > 1) {
                    result = "You can't pick the same number!!!";
                }
            }
            if (guess == ranum.b) {
                //System.out.println(result);
                result = "hit";
                second="i";
                secondNumCheck++;
                if(secondNumCheck>1){
                    result = "You can't pick the same number!!";
                }
            }
            if (guess == ranum.c) {
                //System.out.println(result);
                result = "hit";
                third = "l";
                thirdNumCheck++;
                if (thirdNumCheck > 1) {
                    result = "You can't pick the same number!!!";
                }
            }
            String decision = first + second + third;
            //System.out.println(decision);
            String equalizer = "kil";
            if(decision.equals(equalizer)){
                stat=true;
                            }
            numGuesses++;
            System.out.println(result);
        }
        System.out.println("You won!!!");
        System.out.println("You took" + " " + numGuesses + " " + "tries");
    }
}

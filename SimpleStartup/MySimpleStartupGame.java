public class MySimpleStartupGame {
    //1.First, I would build something to hold 3 consecutive values, like an array, which I will name startuplocs
    //2.I need a way to generate a random number, my space is between 0-6(7 numbers), so a random number
    // between 0-4 == n1, n2==++n1; n3==++n2
    // 3.I need something that asks for user Input which will be an Integer, which will be named "uinp"
    // 4. The user input needs to be compared to the 3 values of the startup. I don't know how to do this efficiently,
    // however, maybe I could use 3 ifs. in which if uinp==n1;n2;3 then System.out.println(message), message is a
    // string which by default is equal to "try again", but if any of those guesses is correct, it will print "Hit"
    // Hmm, I can see a problem with the one above, actually, I can sort of see a problem with everything, what I am
    // doing at the moment is something that runs once, I need something that runs until I get a "Kill", if I can do
    // that, then I can define at the beginning of the loop that "message = Try again"
    // 5. I need a variable for the status of the game...How do I know when all the elements where hit?
    // How about a boolean? -- this has been successfully tested in the class "experiment"
}

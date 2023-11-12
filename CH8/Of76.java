public class Of76 extends Clowns{
    //Niice, it worked, but I have 2 questions left:
    // 1.How come I can create a new Nose object? I mean, c'mon, it's an interface!
    // It's an ABSTRACT Thing! It does not have a body!!!
    // 2. How come the i.Method, when printed, is followed up by the word "class"
    // I don't remember telling it that it can do that... ANSWER: it's not the iMethod, it's getClass(), which tells you
    // that it's actually a class LoL.
    public static void main(String[] args){
        Nose[] i= new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for(int x=0; x<3; x++){
            System.out.println( i[x].iMethod()+ " " + i[x].getClass());
        }
    }
}

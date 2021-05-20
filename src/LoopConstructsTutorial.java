public class LoopConstructsTutorial {


    /**
     * Resources/Reading Material
     * https://ocaprep.wordpress.com/java-basics/chap-05-using-loop-constructs/
     * https://livebook.manning.com/book/java-se-11-programmer-i-certification-guide/chapter-6/v-1/
     * https://www.w3schools.com/java/java_while_loop.asp
     * https://www.w3schools.com/java/java_for_loop.asp
     * https://www.w3schools.com/java/java_break.asp
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
     * https://www.javatpoint.com/java-for-loop
     * https://www.cs.cornell.edu/courses/JavaAndDS/loops/01aloop1.html
     */

    private static String [] countries;

    public static void main(String[] args){
        countries = new String[]{"Ireland", "England", "France", "Spain", "Germany", "USA"};
        forLoop();
        //doWhileLoop();

    }

    private static void forLoop(){

    }

    private static void enhancedForLoop(){


    }

    private static void doWhileLoop(){
        boolean continueLooping = true;
        int counter = 0;

        do{
            System.out.println(countries[counter]);

            counter++;
            if(counter == countries.length)
                continueLooping = false;
        }while(continueLooping);
    }
}

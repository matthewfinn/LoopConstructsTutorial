public class LoopConstructsTutorial {


    /**
     * Resources
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

    public static void main(String[] args){

        whileLoop();

    }

    private static void whileLoop(){
        boolean continueLooping = true;
        int counter = 1;

        do{
            System.out.println(counter);

//            https://www.cs.cornell.edu/courses/JavaAndDS/explainJava/explainJava.html

            //https://www.youtube.com/watch?v=OIP2ZaweCNE

            counter++;
            if(counter == 10)
                continueLooping = false;
        }while(continueLooping);
    }
}

public class LoopConstructsTutorial {


    /**
     * Resources/Reading Material
     *
     * Article used for tutorial:  https://livebook.manning.com/book/java-se-11-programmer-i-certification-guide/chapter-6/v-1/
     *
     * https://ocaprep.wordpress.com/java-basics/chap-05-using-loop-constructs/
     * https://www.w3schools.com/java/java_while_loop.asp
     * https://www.w3schools.com/java/java_for_loop.asp
     * https://www.w3schools.com/java/java_break.asp
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
     * https://www.javatpoint.com/java-for-loop
     * https://www.cs.cornell.edu/courses/JavaAndDS/loops/01aloop1.html
     *
     */

    private static String [] countries, seasons;
    public static void main(String[] args){
        // String array
        countries = new String[]{"Ireland", "England", "France", "Spain"};
        seasons = new String[]{"Spring", "Summer", "Autumn", "Winter"};

        //execute loop
        forLoop();
        //forLoopIndexOutOfBoundsExample();
        //nestedForLoop();
        //enhancedForLoop();
        //nestedEnhancedForLoop();
        //whileLoop();
        //doWhileLoopOne();
        //doWhileLoopTwo();
        //example1();
        //example2();
        //example3();

    }

    private static void forLoop(){

        for(int i =0; i<countries.length; i++){
            System.out.println(countries[i]);
        }

    }
    private static void forLoopIndexOutOfBoundsExample(){
        // the String array countris has a length of 4
        for(int i =0; i<10; i++){
            System.out.println(countries[i]);
        }

    }
    private static void nestedForLoop(){
        for(int i =0 ; i< countries.length; i++){
            for(int j =0 ; j< seasons.length; j++){
                System.out.println(countries[i] + "|" + seasons[j]);
            }
        }
    }

    private static void enhancedForLoop(){
        for(String country: countries){
                System.out.println(country);
        }
    }

    private static void nestedEnhancedForLoop(){
        for(String country : countries){
            for (String season: seasons){
                System.out.println(country + "|" + season);
            }
        }
    }

    /*
    * A while loop is used to repeatedly execute a set of statements as long as its condition evaluates to true. This loop checks the condition before it starts the execution of the statement.
    */
    private static void whileLoop(){
        boolean continueLooping = true;
        int i = 0;
        while(continueLooping){
            System.out.println("Hello World");
            i++;
            if(i==10){
                continueLooping=false;
            }
        }
    }

    /*
    * A do-while loop is used to repeatedly execute a set of statements until the condition that it uses evaluates to false. This loop checks the condition after it completes the execution of all the statements in its loop body.
    */
    private static void doWhileLoopOne(){
        int num=10;
        do {
            num++;
            System.out.println (num);

        } while (++num < 20);
    }

    /*
     * A do-while loop is used to repeatedly execute a set of statements until the condition that it uses evaluates to false. This loop checks the condition after it completes the execution of all the statements in its loop body.
     */
    private static void doWhileLoopTwo(){
        int num=10;

        do {
            num++;
            System.out.println (num);

        } while (++num > 20);
    }


    //Q6-6
    private static void example1(){
        int i = 10;
        do
            while (i < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }

    //Q6-7
    private static void example2(){
        int i = 10;
        do
            while (i++ < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }

    //Q6-14
    private static void example3(){
        boolean myVal = false;
        if (myVal=true) // this is assigning the value true to the boolean variable myVal, also try it by changing this line to myVal==true
            for (int i = 0; i < 2; i++) System.out.println(i);
        else System.out.println("else");
    }
}

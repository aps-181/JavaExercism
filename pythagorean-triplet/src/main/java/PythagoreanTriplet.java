/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet{

    private int a;
    private int b;
    private int c;

    private static int sum;


    public PythagoreanTriplet(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   public static PythagoreanTripletBuilder makeTripletsList(){
       return new PythagoreanTripletBuilder();
   }


}

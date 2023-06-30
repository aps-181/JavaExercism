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



    public PythagoreanTriplet(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//equals method added
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(o instanceof PythagoreanTriplet){
            PythagoreanTriplet pt = (PythagoreanTriplet)o;
            return a == pt.a && b == pt.b && c == pt.c;
        }else {
            return  false;
        }
    }

   public static PythagoreanTripletBuilder makeTripletsList(){
       return new PythagoreanTripletBuilder();
   }


}

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class PythagoreanTripletBuilder {

    private int sum;
    private int maxFactor;
    public PythagoreanTripletBuilder thatSumTo(int sum){
        this.sum = sum;
        return this;
    }

    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int maxFactor){

        return this;
    }
    public List<PythagoreanTriplet> build(){
     List<PythagoreanTriplet> result = new ArrayList<>();
        for (int a = 1; a < Integer.MAX_VALUE && a<sum; a++) {
            for (int b = a+1; b < Integer.MAX_VALUE && b<sum; b++) {
                int c = sum - a - b;
                if(c>b){
                    if(pow(c,2) == (pow(b,2)+ pow(a,2))){
                        result.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
        }

        return result;
    }
}

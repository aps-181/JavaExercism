import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class PythagoreanTripletBuilder {

    private int sum;
    private int maxFactor = Integer.MAX_VALUE;
    public PythagoreanTripletBuilder thatSumTo(int sum){
        this.sum = sum;
        return this;
    }

    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int maxFactor){
        this.maxFactor = maxFactor;
        return this;
    }

    public List<PythagoreanTriplet> build(){
     List<PythagoreanTriplet> result = new ArrayList<>();
        for (int a = 1; a <= maxFactor && a<sum; a++) {
            for (int b = a+1; b <= maxFactor && b<sum; b++) {
                int c = sum - a - b;
                if(c>b && c<=maxFactor){
                    if(pow(c,2) == (pow(b,2)+ pow(a,2))){
                        result.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
        }

        return result;
    }
}

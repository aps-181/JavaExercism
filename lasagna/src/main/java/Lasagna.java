public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

       private int EXPECTED_MINUTES_IN_OVEN = 40;
       public int expectedMinutesInOven(){
           return EXPECTED_MINUTES_IN_OVEN;
       }
    // TODO: define the 'remainingMinutesInOven()' method
       public int remainingMinutesInOven(int timeInOven){
           int timeRemainingInOven = expectedMinutesInOven() - timeInOven;
           return timeRemainingInOven;
       }
    // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int numberOfLayers){
            int timePerLayer = 2;
            return timePerLayer * numberOfLayers;
        }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers,int timeInOven){
        return preparationTimeInMinutes(numberOfLayers) + timeInOven;
    }
}

class Leap {

    boolean isLeapYear(int year) {
       if(year%400 == 0) return true;

        if(year%4 == 0){
            if(year %100 == 0) return false;
            else return true;
        }

        return false;
    }

}

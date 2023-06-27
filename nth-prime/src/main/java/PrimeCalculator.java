class PrimeCalculator {


    private boolean isPrime(int n){
        for (int i = 2; i <= n/2 ; i++) {
            if(n%i == 0) return false;
        }
        return  true;
    }
    int nth(int nth) throws IllegalArgumentException {
        if(nth == 0) throw new IllegalArgumentException();
        int count = 0;
        int num = 1;
        while(count <nth){
            ++num;
            if(isPrime(num)) count++;
        }
        return num;
    }

}

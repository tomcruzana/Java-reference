    public boolean isPrime(int n){
        /*
        A prime number is an integer, or whole number, that has only two factors — 1 and itself.
        Put another way, a prime number can be divided evenly only by 1 and by itself.
        Prime numbers also must be greater than 1. For example, 3 is a prime number,
        because 3 cannot be divided evenly by any number except for 1 and 3
        */
        
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
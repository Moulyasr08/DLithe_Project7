public class reverseofprimenum {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static boolean reversePrime(int n) {
            int reversed = 0;
            int temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
            return isPrime(reversed);
        }
    
        public static void main(String[] args) {
            System.out.println(reversePrime(13));    
            System.out.println(reversePrime(23));   
            System.out.println(reversePrime(16));    
            System.out.println(reversePrime(79));   
        }
    }
    


public class Armstrongnum {
        public static boolean isArmstrong(int n) {
            int sum = 0;
            int temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            return sum == n;
        }
    
        public static void main(String[] args) {
            System.out.println(isArmstrong(2));      
            System.out.println(isArmstrong(221));    
            System.out.println(isArmstrong(370));    
            System.out.println(isArmstrong(93084)); 
        }
    }
    


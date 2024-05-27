public class poweroftwo {
    public static boolean powerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(2));    
        System.out.println(powerOfTwo(20));   
        System.out.println(powerOfTwo(32));   
        System.out.println(powerOfTwo(84));  
    }
}



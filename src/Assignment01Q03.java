public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int prev = 1;
        int curr = 1;
        for (int i = 0; i < x; i++) {
            int val;
            if (i == 0 || i == 1) {
                val = 1;
            } else {
                val = prev + curr;
                prev = curr;
                curr = val;
            }
            if (val % 2 != 0) {
                numOdd++;
            }
            System.out.print(val);
            if (i < x - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

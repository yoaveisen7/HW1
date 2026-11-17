public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg : args) {
            if (!arg.isEmpty()) {
                char first = arg.charAt(0);
                if (first % 5 == 0) {
                    System.out.println(first);
                }
            }
        }
    }
}

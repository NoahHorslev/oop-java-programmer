public class primes_a {
    
    public static void main(String[] args) {
        numbers : for (int i = 2; i < 100; i++){
            for (int y = 2; y < i; y++){
                if (i % y == 0){
                    continue numbers;
                }
            }
            System.out.println(i);
        }
    }
}

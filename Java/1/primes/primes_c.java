import java.util.Scanner;

public class primes_c {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Write number to start from; ");
        int startNumber = s.nextInt();
        System.out.println("Write number to end on; ");
        int endNumber = s.nextInt();



        numbers : for (int start = startNumber; start < endNumber; start++){
            for (int y = 2; y < start; y++){
                if (start % y == 0){
                    continue numbers;
                }
            }
            System.out.println(start);
        }
    }
}

public class card {
    String suit;
    int value;

    enum suits {
        ACE,
        SPADES,
        HEARTS,
        DIAMONDS
    };
    int[] values = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
    };
    



    public String toString(String suit, int value){
        String output = suit + " ${value}";
        return output;
    }
}

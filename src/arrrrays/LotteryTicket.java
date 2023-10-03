package Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MaxTicketNumber = 69;
    public static void main(String[] args) {
        int[] ticket = genrateNumbers();
        printTicket(ticket);
    }
    public static int[] genrateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i< LENGTH; i++) {
            int randomNumber;

            /* Genrate a unique random number to avoid duplicacy
            Re-genrate if there is duplicacy
             */
            do  {
               randomNumber= random.nextInt(MaxTicketNumber);
            }
            while (search(ticket,randomNumber));
            // if we are hear that means the number is unique add it to the array
            ticket[i] =randomNumber;
        }
        return ticket;
    }

    /**
     * Sequential search on array to find a value
     *
     * @param array             array to be searched thru
     * @param NumberToSearchFor value to search
     * @return retrun true if found, flase if not
     */
    public static boolean search(int[] array, int NumberToSearchFor)
    {
// Enhanced Loop
        for(int value: array) {
            if (value == NumberToSearchFor) {
                    return true;
            }
        }
        //Reached to state wehre enitre array was searched and the value was not found
        return false;
    }
    public static boolean binarrySearch(int[] array, int NumberToSearchFor) {
        // Array must be sorted first
        Arrays.
    }

    public static void printTicket(int ticket[]) {
        for(int i=0; i<LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}

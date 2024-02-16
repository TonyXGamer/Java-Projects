import java.util.Scanner; //The Scanner class is used to get user input

public class ReverseString{
    public static void main(String[] args){
        Scanner stringInput = new Scanner(System.in);

        //Asking the user to enter a string
        System.out.print("Please enter a string to reverse: ");
        String str = stringInput.nextLine();

        /*Reverse the string*/
        StringBuilder reverse = new StringBuilder();
        /*
        StringBuilder(): Constructs a string builder with no characters in it and an initial
        capacity of 16 characters.
         */
        for(int i = str.length() - 1; i >= 0; --i){
            reverse.append(str.toCharArray()[i]);
            /*
            toCharArray(): converts a string into a character array.
             */
        }

        //Print reverse String
        System.out.print("Reverse String: ");
        System.out.println(reverse);
    }
}
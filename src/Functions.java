import java.util.Scanner;

public class Functions {
    static Scanner input = new Scanner(System.in);

    // Q1: Reverse a string
    public static String Reverse_String(String user_String) {
        // Convert the string into an array to simplify looping, create empty placeholder
        char[] new_Ary = user_String.toCharArray();
        String reversed = "";
        // for loop to loop through array and add the letters to the new string in reverse order
        for (char c : new_Ary) {reversed = c + reversed;} // <- ignoring string builder here
        return reversed; // return reversed string

    }

    // Q2: Check if a word is a palindrome
    public static boolean Check_Palindrome() {
        // Take in user input
        System.out.println("Palindrome selected, please enter word to check: ");
        String user_Word = input.nextLine();
        // return the boolean result of the user string compared to the reversed string
        // uses the same logic as the first problem so the function can be re-used
        return user_Word.equals(Reverse_String(user_Word));
    }

    public static void Count_Letters() {
        System.out.println("Count letters selected, please enter what you'd like to check: ");
        String user_Count_String = input.nextLine();
    }
}

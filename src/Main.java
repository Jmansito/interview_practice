import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finished = false;
        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Welcome message and menu
        while(!finished){
            System.out.println("""
                Start of Program:\s
                1: - Reverse a String\s
                2: - Check if word is a palindrome\s
                3: - Count the letters in a word\s
                0: - Terminate the program/ sentence""");
            // User selection for menu
            System.out.print("Select option: ");
            int user_Choice = input.nextInt();
            // Switch control for directing the program to the proper functions
            switch (user_Choice) {
                case 1 -> {
                    // Take in user input for desired string to reverse
                    System.out.println("Reverse a String selected, please enter what you would like to reverse: ");
                    String user_String = input.nextLine();
                    System.out.println(Functions.Reverse_String(user_String));
                }
                case 2 -> System.out.println(Functions.Check_Palindrome());
                case 3 -> Functions.Count_Letters();
                case 0 -> finished = true;
                default -> System.out.println("Not a valid option, please choose a number representing your choice...");
            }
        }

    }
}
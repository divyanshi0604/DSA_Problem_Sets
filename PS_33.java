/*33. Find the First Non-Repeated Character in a String:
Problem: Given a string, find the first character that does not repeat.
Input: String: "swiss"
Output: w
Explanation: 'w' is the first character that does not repeat in the string */

import java.util.Scanner;

public class PS_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();

        // Create a frequency array for ASCII characters
        int[] frequency = new int[256];

        // Count frequency of each character 
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }

        char result = '\0'; 
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i)] == 1) {
                result = s.charAt(i);
                break;
            }
        }

        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}

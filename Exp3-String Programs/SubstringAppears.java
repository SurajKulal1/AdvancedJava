// Java Program for counting how many times a substring appears in a main string
// using user-defined function countOccurrences()

package string_operations;
import java.util.Scanner;
public class SubstringAppears {
    // User-defined function to count occurrences of a substring in a main string
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move index forward to avoid overlapping
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();
        // Call user-defined function
        int result = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + result + " time(s) in the main string.");
        scanner.close();
    }
}

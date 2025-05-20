package list_Operation;
import java.util.*;
public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Original List: " + colors);

        if (colors.size() > 1) {
            colors.remove(1); // Remove 2nd element (index 1)
        }
        colors.remove("Blue");
        System.out.println("Updated List: " + colors);
    }
}

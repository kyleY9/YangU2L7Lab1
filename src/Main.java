import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // first string
        System.out.print("Please enter a string: ");
        String str1 = scan.nextLine();
        int len1 = str1.length();
        System.out.println("String Length: " + len1);
        System.out.println("First Half of String: " + str1.substring(0, len1/2));
        System.out.println("Second Half of String: " + str1.substring(len1/2));

        // second string
        System.out.print("Please enter a second string: ");
        String str2 = scan.nextLine();

        // comparison
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer!");
        }  else if (str1.length() < str2.length()) {
            System.out.println(str2 + " is longer!");
        } else {
            System.out.println("Both strings are equal in length!");
        }

        if (str1.equals(str2)) {
            System.out.println("These two strings consist of the same sequence of characters!");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes first alphabetically!");
        } else {
            System.out.println(str2 + " comes first alphabetically!");
        }

        // indexOf
        if (str1.indexOf(str2) > -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is not found in " + str1);
        }
    }
}
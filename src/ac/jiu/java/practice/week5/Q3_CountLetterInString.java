package ac.jiu.java.practice.week5;
import java.util.Scanner;
public class Q3_CountLetterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println(countLetters(input));

    }
    public static int countLetters(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }




}

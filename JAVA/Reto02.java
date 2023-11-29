import java.util.*;
import java.util.Arrays;

public class Reto02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word, anagram;

        System.out.print("Introduce una palabra: ");
        word = sc.nextLine();
        System.out.print("Introduce un anagrama: ");
        anagram = sc.nextLine();
        
        System.out.println(isAnagram(word, anagram));

        sc.close();
    }   

    public static boolean isAnagram(String word, String anagram) {
        if (word.equals(anagram)) {
            return false;
        } else {
            char[] wordArray = word.toLowerCase().toCharArray();
            char[] anagramArray = anagram.toLowerCase().toCharArray();
            Arrays.sort(wordArray);
            Arrays.sort(anagramArray);
            return Arrays.equals(wordArray, anagramArray);
        }
        }

    }

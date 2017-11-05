package ThinkingInJava4thEd.j_Collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class T_19 {
    public static void main(String[] args) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y');
        String s = "BlAblablA";
        System.out.println(vowelsAmount(vowels, s));
        System.out.println(vowelsAmount(vowels, fileProc("D:\\test.txt")));
    }

    static String fileProc(String filename) {
        StringBuffer buff = new StringBuffer();
        String result = "";
        int c = 0;
        try (FileReader reader = new FileReader(filename)) {
            while ((c = reader.read()) != -1) {
                buff.append((char) c);
            }
            result = buff.toString();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    static int vowelsAmount(Collection<Character> c, String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            for (Character character : c) {
                if (character == s.charAt(i)) {
                    total++;
                }
            }
        }
        return total;
    }
}

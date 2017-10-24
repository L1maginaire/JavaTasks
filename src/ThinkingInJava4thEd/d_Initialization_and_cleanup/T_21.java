package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p184
// Create an emun of the least-valuable six types of paper currency. Loop through the values() and print each value and its ordinal().

public class T_21 {
    public static void main(String[] args) {
        for (Currency cur : Currency.values()) {
            System.out.println(cur + ", ordinal " + cur.ordinal());
        }
    }
}

enum Currency {
    EUR, RUR, SEK, UAH, SWF, MXP
}
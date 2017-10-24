package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Write a switch statement for the enum in the previous example. For each case, output a description of that particular currency.

public class T_22 {

    static void discription(Currency currency) {
        switch (currency) {
            case EUR:
                System.out.println("Euro");
                break;
            case MXP:
                System.out.println("Mexican pound");
                break;
            case RUR:
                System.out.println("Russian rouble");
                break;
            case SEK:
                System.out.println("Swedish krona");
                break;
            case UAH:
                System.out.println("Ukraine hrivna");
                break;
            case SWF:
                System.out.println("Swiss frank");
                break;
        }
    }

    public static void main(String[] args) {
        discription(Currency.EUR);
        discription(Currency.RUR);
        discription(Currency.UAH);
        discription(Currency.SEK);
        discription(Currency.SWF);
        discription(Currency.MXP);
    }
}

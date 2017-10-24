package ThinkingInJava4thEd.h_Interfaces;

//p274
// Create a class with a method that takes a String argument and produces a result that swaps each pair of characters in that argument.
// Adapt the class so that it works with interfaceprocessor.Apply.process().

public class T_11 {
    public static void main(String[] args) {
        String s = new String(args[0]);
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}

class StringMixer {
    static String process(String s) {
        char[] chararr = new char[s.length()];
        if ((s.length()) % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                chararr[i] = s.charAt(i + 1);
                chararr[i + 1] = s.charAt(i);
            }
            return new String(chararr);
        } else {
            for (int i = 0; i < s.length() - 1; i += 2) {
                chararr[i] = s.charAt(i + 1);
                chararr[i + 1] = s.charAt(i);
            }
            chararr[s.length() - 1] = s.charAt(s.length() - 1);
            return new String(chararr);
        }
    }
}

class StringMixerAdapter implements Processor {
    public String name() {
        return "StringMixerAdapter";
    }

    StringMixer stringMixer;

    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    public String process(Object input) {
        return stringMixer.process((String) input);
    }
}

interface Processor {
    String name();

    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object obj) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(obj));
    }
}
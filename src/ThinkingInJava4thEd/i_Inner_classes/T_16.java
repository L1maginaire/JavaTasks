package ThinkingInJava4thEd.i_Inner_classes;

//p303
// Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes. (Exercise 18, Interface: Create a Cycle interface, with implementations
// Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.

public class T_16 {
    public static void main(String[] args) {
        String s = new String(args[0]);
        Apply.process(new StringMixerAdapter(new StringMixer()).f(), s);
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

class StringMixerAdapter {

    StringMixer stringMixer;

    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    public Processor f() {
        return new Processor() {
            @Override
            public String name() {
                return "StringMixerAdapter";
            }

            @Override
            public Object process(Object input) {
                return stringMixer.process((String) input);
            }
        };
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
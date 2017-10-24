package ThinkingInJava4thEd.a_Everything_is_an_object;

// Turn the AllColorsOfTheRainbow into a program that compiles and runs.

public class T_11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        atc.changeColor(1);
        atc.changeTheHueOfTheColor(11);
        System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        System.out.println("atc.hue = " + atc.hue);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;

    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }

    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}

public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("1");
        printWithSmileys("0123456789");
        printWithSmileys("12345678");
    }

    private static void printWithSmileys(String characterString) {
        if (isOdd(characterString)) {
            characterString += " ";
        }
        
        characterString = " " + characterString + " ";
        
        int numOfSmileys = (characterString.length() / 2) + 2;

        System.out.println(createSmileyString(numOfSmileys));
        System.out.println(createSmileyString(1) + characterString + createSmileyString(1));
        System.out.println(createSmileyString(numOfSmileys));
    }

    public static String createSmileyString(int howMany) {
        String smileyString = "";

        for (int i = 0; i < howMany; i++) {
            smileyString += ":)";
        }
        return smileyString;
    }

    public static boolean isOdd(String characterString) {
        return characterString.length() % 2 == 1;
    }

}

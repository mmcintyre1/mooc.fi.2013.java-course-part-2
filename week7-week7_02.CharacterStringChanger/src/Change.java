
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        // other way to do this:
        // replacedString.replace(toCharacter, toCharacter)
        
        String replacedString = "";

        for ( int i = 0; i < characterString.length(); i++  ) {
            char c = characterString.charAt(i);
            if ( c == fromCharacter ) {
                replacedString += toCharacter;
            } else {
                replacedString += c;
            }
        }
        return replacedString;

    }

}

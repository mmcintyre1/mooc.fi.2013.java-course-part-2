
import java.util.Scanner;


public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.reader = reader;
        this.dict = dict;
    }
    
    public void start() {
        System.out.println("Statements");
        System.out.println("  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface");
        
        while (true) {
            System.out.println("Statement");
            String command = this.reader.nextLine();
            
            if ( command.equals("quit") ) {
                System.out.println("Cheers!");
                break;
            } else if ( command.equals("add")) {
                add();
            } else if ( command.equals("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown statement");
            }   
        }
   
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String finnishWord = this.reader.nextLine();
        System.out.print("Translation: ");
        String englishWord = this.reader.nextLine();
        
        this.dict.add(finnishWord, englishWord);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        System.out.println("Translation: " + this.dict.translate(this.reader.nextLine())); 
    }
    
    
    
    
}

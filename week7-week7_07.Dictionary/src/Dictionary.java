
import java.util.HashMap;
import java.util.ArrayList;


public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary() {
        this.words = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        return this.words.get(word);
    }
    
    public void add(String word, String translation) {
        this.words.put(word, translation);    
    }
    
    public int amountOfWords() {
        return this.words.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();
        
        for ( String key: this.words.keySet() ) {
            String wordPairs = key + " = " + this.words.get(key);
            translations.add(wordPairs);
        }
        
        return translations;
    }    
}

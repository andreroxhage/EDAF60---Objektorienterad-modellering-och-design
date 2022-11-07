package Hardware;

public class LongWord implements Word {

    private Long word;

    LongWord(Long word) {
        this.word = word;
    }

    public void add(Word addWord1, Word addWord2) {
        this.word = (Long) (((LongWord) addWord1).word + ((LongWord) addWord2).word); //cast type
    }

    public void mul(Word mulWord1, Word mulWord2) {
        this.word = (Long) (((LongWord) mulWord1).word * ((LongWord) mulWord2).word);
    }

    public void set(Word setWord) {
        this.word = ((LongWord) setWord).word;        
    }
    
    public boolean equals(Object other) {
        if ((other instanceof Word)) return word == ((LongWord) other).word;
        return false;
    }

    public String toString() {
        return word.toString();
    }
}

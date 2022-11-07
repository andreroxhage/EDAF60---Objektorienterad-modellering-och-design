package Hardware;

public class ByteWord implements Word {
    
    private Byte word;

    ByteWord(Byte word) {
        this.word = word;
    }

    public void add(Word addWord1, Word addWord2) {
        this.word = (byte) (((ByteWord) addWord1).word + ((ByteWord) addWord2).word); //cast type
    }

    public void mul(Word mulWord1, Word mulWord2) {
        this.word = (byte) (((ByteWord) mulWord1).word * ((ByteWord) mulWord2).word);
    }

    public void set(Word setWord) {
        this.word = ((ByteWord) setWord).word;        
    }
   
    public boolean equals(Object other) {
        if ((other instanceof Word)) return word == ((ByteWord) other).word;
        return false;
    }

    public String toString() {
        return word.toString();
    }
}

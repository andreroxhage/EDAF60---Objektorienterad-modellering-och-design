package Hardware;

public class LongWordFactory implements WordFactory {

    public Word word(String s) {
        return new LongWord(Long.parseLong(s));
    }
}

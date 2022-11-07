package Hardware;
public class ByteWordFactory implements WordFactory {

    public Word word(String s) {
        return new ByteWord(Byte.parseByte(s));
    }
}

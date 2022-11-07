package Hardware;

public interface Word extends Operand {

    public default Word getWord(Memory memory) {
        return this;
    }

    void add(Word mulWord1, Word addWord2);

    void mul(Word mulWord1, Word mulWord2);

    void set(Word seWord);

    boolean equals(Object obj);

    String toString();
}

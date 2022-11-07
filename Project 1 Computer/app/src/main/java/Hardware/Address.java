package Hardware;

public class Address implements Operand {

    public int index;

    public Address(int index) {
        this.index = index;
    }

    public Word getWord(Memory memory) {
        return memory.getWord(index);
    }

    public String toString() {
        return "["+index+"]";
    }
}
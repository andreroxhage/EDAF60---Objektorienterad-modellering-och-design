package Software;

import Hardware.Address;
import Hardware.Memory;
import Hardware.Operand;
import Hardware.ProgramCounter;

public class Add implements Instruction {

    private Operand operand1, operand2;
    private Address address;

    public Add(Operand operand1, Operand operand2, Address address) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.address = address;
    }

    public void execute(Memory memory, ProgramCounter programCounter) {
        memory.getWord(address.index).add(operand1.getWord(memory), operand2.getWord(memory));
        programCounter.increase();
    }

    public String toString() {
        return "Add ";
    }
}

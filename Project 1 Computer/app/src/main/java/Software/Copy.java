package Software;

import Hardware.Address;
import Hardware.Memory;
import Hardware.Operand;
import Hardware.ProgramCounter;

public class Copy implements Instruction {

    private Operand operand;
    private Address address;

    public Copy(Operand operand, Address address){
        this.operand = operand;
        this.address = address;
    }

    public void execute(Memory memory, ProgramCounter programcounter){
        address.getWord(memory).set(operand.getWord(memory));
        programcounter.increase();
    }
    public String toString(){
        return "Copy "+operand+ " to "+address.toString();
    }
}

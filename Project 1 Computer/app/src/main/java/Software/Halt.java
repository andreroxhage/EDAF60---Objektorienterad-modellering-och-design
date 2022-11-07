package Software;

import Hardware.Memory;
import Hardware.ProgramCounter;

public class Halt implements Instruction {

    public Halt(){}

    public void execute(Memory memory, ProgramCounter programCounter) {
         programCounter.set(-1);
    }

    public String toString() {
        return "Halt";
    }
}
package Software;

import Hardware.Memory;
import Hardware.ProgramCounter;

public interface Instruction {
    void execute(Memory memory, ProgramCounter programCounter);
    String toString();
}
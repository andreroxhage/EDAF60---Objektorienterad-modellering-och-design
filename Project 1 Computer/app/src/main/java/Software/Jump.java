package Software;

import Hardware.Memory;
import Hardware.ProgramCounter;

public class Jump implements Instruction {

    private int index;

    public Jump(int index){
        this.index = index;
    }

    public void execute(Memory memory, ProgramCounter programCounter) {
         programCounter.set(index);
    }

    public String toString() {
        return "Jump to "+index;
    }
}

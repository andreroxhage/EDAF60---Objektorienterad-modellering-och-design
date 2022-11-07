package Software;

import Hardware.Memory;
import Hardware.Operand;
import Hardware.ProgramCounter;


public class JumpEq implements Instruction {

    private int index;
    private Operand operand1, operand2;

    public JumpEq(int index, Operand operand1, Operand operand2) {
        this.index = index;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void execute(Memory memory, ProgramCounter programcounter) {
        if (operand1.getWord(memory).equals(operand2.getWord(memory))) {
            programcounter.set(index);
        } else {
            programcounter.increase();
        }
    }

    public String toString(){
        return "Jump to " + index + " if" + operand1 + " == " + operand2;
    } 
}               
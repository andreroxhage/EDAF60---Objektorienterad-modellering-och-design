package Software;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<Instruction> instructions;

    public Program() {
        instructions = new ArrayList<Instruction>();
    }

    public void add(Instruction instruction) {
        instructions.add(instruction);
    }

    public Instruction getInstruction(int index) {
        Instruction temp = instructions.get(index); // samma anledning som i ProgramCounter
        return temp;
    }    

    public String toString() {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (Instruction inst : instructions) {
            sb.append(i++ + ": ");
            sb.append(inst.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
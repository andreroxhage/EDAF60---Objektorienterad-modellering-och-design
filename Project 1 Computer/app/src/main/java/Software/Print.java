package Software;
import Hardware.Memory;
import Hardware.Operand;
import Hardware.ProgramCounter;

public class Print implements Instruction {

    private Operand operand;

    public Print(Operand operand){
        this.operand = operand;
    }

    public String toString(){
        return "Print "+operand.toString();
    }
    
    @Override
    public void execute(Memory memory, ProgramCounter programCounter) {
        System.out.println(operand.getWord(memory));
        programCounter.increase();
    }
}

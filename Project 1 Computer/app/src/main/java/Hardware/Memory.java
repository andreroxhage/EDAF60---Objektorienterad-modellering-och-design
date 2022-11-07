package Hardware;

public class Memory {

    private Word[] memory;
    private WordFactory wf;
    
    public Memory(int size, WordFactory wf) {
        memory = new Word[size];

        /*
         * Put all indexes in memory to defualt value "0"
         * In purpose to not return null when 
         */
        for(int i = 0; i < size ; i++) {          
            memory[i] = wf.word("0");
        }   
    }

    public Word getWord(int memoryIndex) {
        return memory[memoryIndex];
    }
}
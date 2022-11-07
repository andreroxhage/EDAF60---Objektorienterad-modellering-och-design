package Hardware;

public class ProgramCounter { //Finns för att veta vilken program som körs nu och ilket som ska köras?
    private int index;

    public ProgramCounter() {
        this.index = 0;
    }

    public int get(){
        int temp = index; // spara undan index värde för att behålla index immutable.
        return temp;      // Exempelvis nu kan ingen ändra vårat index genom att skriva computer.get() = 4.
    }                     // Då ändrar man bara vår temp variabel och inte själva indexet.
    public void set(int i){
        this.index = i;
    }
    public void increase(){
        index++;
    }
}


package xl.expr;

public class CmntCell implements Cell{

    private String cmnt;

    CmntCell(String cnmt){
        this.cmnt = cnmt;
    }

    public double value(Environment env){
        return 0;
    }

    public String toString(){
        return cmnt;
    }
}
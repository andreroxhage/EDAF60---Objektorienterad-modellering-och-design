package xl.expr;

public class Status {

    String status;
    
    public Status(){
        this.status = "";
    }

    public void clearStatus(){
        this.status = "";
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
    }
}

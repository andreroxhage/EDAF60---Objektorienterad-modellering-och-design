package xl.expr;

class ExprCell implements Cell{
    
    private Expr expr;
    
    ExprCell(Expr expr){
        this.expr = expr;
    }
    
    public double value(Environment env){
        return expr.value(env);
    }

    public String toString(){
        return expr.toString();
    }
}
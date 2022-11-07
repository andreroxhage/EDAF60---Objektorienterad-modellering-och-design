package xl.expr;

import xl.util.XLException;




public class CellFactory {
    
    public static Cell makeCell(String value){
        if (value.toString().strip().charAt(0) == '#') {
            return new CmntCell(value);
        }
        else if (value.length() == 0){
            return null;
            
        } else {
            try {
                Expr result = new ExprParser().build(value);
                return new ExprCell(result);
            } catch (Exception e) {
                throw XLException.parserError();
            }
            
        }
    }
}

package xl.expr;

import xl.util.XLException;

class BombCell implements Cell{

    public double value(Environment env){
        throw XLException.recursiveError();
    }   
}
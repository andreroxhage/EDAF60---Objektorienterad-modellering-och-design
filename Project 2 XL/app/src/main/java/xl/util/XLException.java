package xl.util;

public class XLException extends RuntimeException {

        public static XLException parserError() {
        return new XLException("Error. Check that the syntax is correct.");
    }

    public static XLException emptyCellError() {
        return new XLException("Error. Check that the addresses used are assigned a value.");
    }

    public static XLException recursiveError() {
        return new XLException("Error. A slot cannot perform actions affecting itself");
    }

    public static XLException divByZeroError() {
        return new XLException("Error. Division by zero");
    }

    public XLException(String message) {
        super(message);
    }
}

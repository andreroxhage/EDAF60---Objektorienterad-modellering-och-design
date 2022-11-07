package xl.gui.menu;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Map.Entry;
import xl.expr.Cell;

import java.util.Set;
//e to another package
public class XLPrintStream extends PrintStream {

    public XLPrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public void save(Set<Entry<String, Cell>> set) {   //Changed from <String, Object> to <String, Cell>
        for (Entry<String, Cell> entry : set) {
            print(entry.getKey());
            print('=');
            println(entry.getValue());
        }
        flush();
        close();
    }
}

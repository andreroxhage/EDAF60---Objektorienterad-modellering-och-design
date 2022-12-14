package xl.gui.menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import xl.util.XLException;

public class XLBufferedReader extends BufferedReader {

    public XLBufferedReader(String name) throws FileNotFoundException {
        super(new FileReader(name));
    }

    public void load(Map<String, String> map) {  //Changed from <String, Object> to <String, String>
        try {
            while (ready()) {
                String string = readLine();
                int i = string.indexOf('=');
                String address  = string.substring(0, i);
                String value = string.substring(i + 1);
                map.put(address, value);
            }
        } catch (Exception e) {
            throw new XLException(e.getMessage());
        }
    }
}

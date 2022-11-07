package xl.gui.menu;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;


import javax.swing.JFileChooser;

import xl.util.XLException;
import xl.gui.StatusLabel;
import xl.gui.XL;

class LoadMenuItem extends OpenMenuItem {
    private XLBufferedReader reader;


    public LoadMenuItem(XL xl, StatusLabel statusLabel) {
        super(xl, statusLabel, "Load");
    }

    //@Override
    protected void action(String path) throws FileNotFoundException {
        try {
            reader = new XLBufferedReader(path);
            Map<String, String> map = new HashMap<String, String>();
            reader.load(map);
            xl.getSheet().load(map);
        } catch (XLException e) {
            xl.getSheet().getStatus().setStatus("Error loading file");
            xl.getSheet().clearAll();
        }
    }

    protected int openDialog(JFileChooser fileChooser) {
        return fileChooser.showOpenDialog(xl);
    }
}

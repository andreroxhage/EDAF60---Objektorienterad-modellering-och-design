package xl.gui.menu;

import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import java.util.Map;

import xl.gui.StatusLabel;
import xl.gui.XL;
import xl.expr.Cell;

class SaveMenuItem extends OpenMenuItem {
    private XLPrintStream writer;  
    //private Sheet sheet; 

    public SaveMenuItem(XL xl, StatusLabel statusLabel) {
        super(xl, statusLabel, "Save");
    }

    protected void action(String path) throws FileNotFoundException {
        Map<String, Cell> map = xl.getSheet().getCells();
        writer = new XLPrintStream(path);
        writer.save(map.entrySet());
    }

    protected int openDialog(JFileChooser fileChooser) {
        return fileChooser.showSaveDialog(xl);
    }
}

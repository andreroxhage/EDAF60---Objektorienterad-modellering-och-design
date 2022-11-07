package xl.gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import xl.expr.Sheet;


class ClearAllMenuItem extends JMenuItem implements ActionListener {
    private Sheet sheet;
    


    public ClearAllMenuItem(Sheet sheet) {
        super("Clear all");
        addActionListener(this);
        this.sheet = sheet;
        //if we make a private sheet, then: this.sheet = sheet
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        sheet.clearAll();
    }
}

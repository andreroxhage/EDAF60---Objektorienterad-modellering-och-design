package xl.gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

import xl.gui.CurrentCell;
import xl.expr.Sheet;

class ClearMenuItem extends JMenuItem implements ActionListener {
    private CurrentCell currentCell;
    private Sheet sheet;


    public ClearMenuItem(Sheet sheet, CurrentCell currentCell) {
        super("Clear");
        addActionListener(this);
        this.currentCell = currentCell;
        this.sheet = sheet;
    }

    public void actionPerformed(ActionEvent e) {
        sheet.clearCell(currentCell.getAddress());

        //currentCell needs a getAddres method

        //clear en viss plats i mapen, med addressen
        // if we import sheet, then : sheet.clearCell(currentCell.getAddress());

    }
}

package xl.gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xl.gui.menu.XLMenuBar;
import xl.expr.Sheet;
import xl.expr.Status;

public class XL extends JFrame {

    private static final int ROWS = 10, COLUMNS = 8;


    private XLCounter counter;
    private CurrentCell currentCell;
    private Sheet sheet;
    private XLList xlList;

    public XL(XL oldXL) {
        this(oldXL.xlList, oldXL.counter);
    }

    public XL(XLList xlList, XLCounter counter) {
        super("Untitled-" + counter);


        this.xlList = xlList;
        this.counter = counter;
        this.sheet = new Sheet();
        Status status = sheet.getStatus();
        this.currentCell = new CurrentCell();

        xlList.add(this);
        counter.increment();
        JPanel sheetPanel = new SheetPanel(ROWS, COLUMNS, sheet, currentCell);
        Editor editor = new Editor(sheet, currentCell);
        StatusLabel statusLabel = new StatusLabel(sheet);
        JPanel statusPanel = new StatusPanel(statusLabel, currentCell);
        add(NORTH, statusPanel);
        add(CENTER, editor);
        add(SOUTH, sheetPanel);
        setJMenuBar(new XLMenuBar(this, xlList, statusLabel));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public CurrentCell getCurrentCell(){
        return currentCell;
    }

    public void rename(String title) {
        setTitle(title);
        xlList.setChanged();
    }

    public static void main(String[] args) {
        new XL(new XLList(), new XLCounter());
    }

    public Sheet getSheet() {
        return sheet;
    }
}


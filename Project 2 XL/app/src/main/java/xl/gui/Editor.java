package xl.gui;

import java.awt.Color;
import javax.swing.JTextField;
import java.util.Observable;
import java.util.Observer;

import xl.expr.Sheet;
import xl.expr.Cell;

@SuppressWarnings("deprecation")
public class Editor extends JTextField implements Observer {

    private CurrentCell current;
    private Sheet sheet;

    public Editor(Sheet sheet, CurrentCell current) {
        setBackground(Color.WHITE);
        this.sheet = sheet;
        this.current = current;
        current.addObserver(this);

        addActionListener(
        e -> {
          if (getText().length() > 0) {
            sheet.addCell(current.getAddress(), getText());
            sheet.getStatus().clearStatus();
          }
        });
    }


    @Override
  public void update(Observable o, Object arg) {
    Cell cell = sheet.getCell(current.getAddress());
    if (cell != null) {
      setText(cell.toString());
    } else {
      setText("");
    }
  }
}


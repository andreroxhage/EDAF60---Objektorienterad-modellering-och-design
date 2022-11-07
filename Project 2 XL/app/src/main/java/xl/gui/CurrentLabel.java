package xl.gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CurrentLabel extends ColoredLabel implements Observer {

    private CurrentCell currentCell;

    public CurrentLabel(CurrentCell currentCell) {
        super("A1", Color.WHITE);
        this.currentCell = currentCell;
        currentCell.addObserver(this);
    }

    @Override
    public void update(Observable arg0, Object arg1) {
    setText(currentCell.getAddress());
  }
}

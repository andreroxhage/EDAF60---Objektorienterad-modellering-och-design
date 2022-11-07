package xl.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import xl.expr.Sheet;
import xl.expr.Cell;
import xl.expr.CmntCell;


@SuppressWarnings("deprecation")
public class SlotLabels extends GridPanel implements Observer {

  private List<SlotLabel> labelList;
  private Sheet sheet;

    public SlotLabels(int rows, int cols, Sheet sheet, CurrentCell current) {
        super(rows + 1, cols);
        this.sheet = sheet;
        sheet.addObserver(this);

        labelList = new ArrayList<SlotLabel>(rows * cols);


        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY, SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                SlotLabel label = new SlotLabel(ch + String.valueOf(row), current);
                label.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        current.colorHandler();
                        current.setCurrent(label);
                        current.colorHandler();
                        }
                    });
                add(label);
                labelList.add(label);
            }
        }
        SlotLabel firstLabel = labelList.get(0);
        firstLabel.setBackground(Color.YELLOW);
        current.setCurrent(firstLabel);
    }

    @Override
    public void update(Observable o, Object arg) {
        Map<String, Cell> tempMap = sheet.getCells();
        for (SlotLabel label : labelList) {
          if (!tempMap.containsKey(label.getAddress())) {
            label.setText("");
          } else {
            Cell tempCell = tempMap.get(label.getAddress());
            if (tempCell instanceof CmntCell) {
              String text = tempCell.toString();
              label.setText(text.substring(1));
            } else {
              label.setText(Double.toString(sheet.value(label.getAddress())));
            }
          }
        }
      }
}

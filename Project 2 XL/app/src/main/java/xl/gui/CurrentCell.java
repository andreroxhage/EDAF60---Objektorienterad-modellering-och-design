package xl.gui;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class CurrentCell extends Observable {
    
    private SlotLabel slotlabel;

    public CurrentCell(){}

    public void colorHandler() {
        if (slotlabel.getBackground() == Color.WHITE) {
          slotlabel.setBackground(Color.YELLOW);
        } else {
          slotlabel.setBackground(Color.WHITE);
        }
      }

    public String getAddress(){
        return slotlabel.getAddress();
    }

    public void setCurrent(SlotLabel newSlotLabel) {
        this.slotlabel = newSlotLabel;
        setChanged();
        notifyObservers();
      }
}

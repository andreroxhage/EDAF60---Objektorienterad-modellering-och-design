package xl.gui;

import java.awt.Color;

public class SlotLabel extends ColoredLabel {

    String adress;

    public SlotLabel(String adress, CurrentCell current) {
        super("                    ", Color.WHITE, RIGHT);
        this.adress = adress;
    }

    public String getAddress(){
        return adress;
    }
}

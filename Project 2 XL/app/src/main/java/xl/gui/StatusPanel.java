package xl.gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

public class StatusPanel extends BorderPanel {

    protected StatusPanel(StatusLabel statusLabel, CurrentCell current) {
        add(WEST, new CurrentLabel(current));
        add(CENTER, statusLabel);
    }
}

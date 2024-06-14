package dulich.Swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new CustomScrollBar());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(200, 200, 200));
        setBackground(new Color(255, 255, 255));
    }
}

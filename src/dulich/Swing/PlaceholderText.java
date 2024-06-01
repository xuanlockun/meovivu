package dulich.Swing;


import java.awt.*;

import javax.swing.*;
import javax.swing.text.Document;


public class PlaceholderText extends JTextField {

    private String placeholder;

    public PlaceholderText() {
        setOpaque(false);
        setFont(new java.awt.Font("Segoe UI", 0, 14));
        setForeground(new java.awt.Color(5, 69, 89, 68));
        setBorder(null);
    }

    public PlaceholderText(
        final Document pDoc,
        final String pText,
        final int pColumns)
    {
        super(pDoc, pText, pColumns);
    }

    public PlaceholderText(final int pColumns) {
        super(pColumns);
    }

    public PlaceholderText(final String pText) {
        super(pText);
    }

    public PlaceholderText(final String pText, final int pColumns) {
        super(pText, pColumns);
    }

    public String getPlaceholder() {
        return placeholder;
    }

    @Override
    protected void paintComponent(final Graphics pG) {
        super.paintComponent(pG);

        if (placeholder == null || placeholder.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(5, 69, 89, 68));
        g.drawString(placeholder, getInsets().left, pG.getFontMetrics()
            .getMaxAscent() + getInsets().bottom);
    }

    public void setPlaceholder(final String s) {
        placeholder = s;
    }


}

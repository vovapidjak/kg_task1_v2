package com.company.kg2022.kononov;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public DrawPanel() {

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);

        Graphics2D g = (Graphics2D) gr;
        Human h = new Human(800,800,Color.BLACK);

        h.drawHuman(g);


    }


}

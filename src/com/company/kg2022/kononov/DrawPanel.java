package com.company.kg2022.kononov;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Timer;

public class DrawPanel extends JPanel {

    public DrawPanel() {

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(10, 20, 37));
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(new Color(0x0C2101));
        g.fillRect(0,getHeight()/2,getWidth(),getHeight()/2);

        drawStars(gr);
        drawPupils(gr);

        Human man = new Human(getWidth()/2 - 150, getHeight()-600,300,500, Color.BLACK);
        man.drawHuman((Graphics2D) gr);

    }


        public static void drawPupils(Graphics gr) {

            Human h;

            for (int i = 0; i < 30; i++) {
                int x = (int) (Math.random() * (1920));
                int y = 400;
                int type = (int) (Math.random() * 3);
                    switch (type) {
                        case 0 -> h = new Human(x, y, 120, 250, Color.YELLOW);
                        case 1 -> h = new Human(x, y, 120, 250, Color.GRAY);
                        case 2 -> h = new Human(x, y, 120, 250, Color.WHITE);
                        default -> throw new IllegalStateException("Unexpected value: " + type);
                    }
                    h.drawHuman((Graphics2D) gr);
                }

            }

        public static void drawStars(Graphics gr) {
            for (int i = 0; i < 100; i++) {
                int x = (int) (Math.random() * (2000 - 150));
                int y = (int) (Math.random() * 500);
                gr.setColor(Color.WHITE);
                gr.fillRect(x, y, 2, 2);
            }
        }
}

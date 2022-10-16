package com.company.kg2022.kononov;

import javax.swing.*;
import java.awt.*;

public class Human extends JPanel{

    private int width, height;
    private Color color;

    public Human(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void drawHuman(Graphics2D g2d){

        // хитбокс
        g2d.setStroke(new BasicStroke(10));
        g2d.drawLine(0,0,width,0);
        g2d.drawLine(0,0,0,height);
        g2d.drawLine(width,0,width,height);
        g2d.drawLine(width,height,0,height);


        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(color);

        //башка (без ржавого)

        g2d.fillOval(width/2 - width/12,0,width/5, height/5);


        //полигон

        g2d.fillPolygon(new int[] {width/6, width*2/6,width*4/6, width*5/6}, new int[] {height/5,height*3/5, height*3/5, height/5 }, 4);

        //туловище

        g2d.drawLine(width/6, height/5, width*5/6,height/5); // верхнее туловище
        g2d.drawLine(width*2/6, height*3/5,width*4/6,height*3/5 ); // нижнее туловище

        g2d.drawLine(width/6, height/5,width*2/6, height*3/5); //левая палка туловища
        g2d.drawLine(width*5/6, height/5,width*4/6, height*3/5); //нижняя палка туловища

        //руки

        g2d.drawLine(width/6, height/5, width/6, height*3/5);
        g2d.drawLine(width*5/6, height/5, width*5/6, height*3/5);

        // ноги

        g2d.drawLine(width*2/6, height*3/5, (int)(width*1.5/6), height*4/5); // от туловища до колена слева
        g2d.drawLine(width*4/6, height*3/5, (int)(width*3*1.5/6), height*4/5); // от туловища до колена справа

        g2d.drawLine((int)(width*1.5/6),height*4/5, (int)(width*1.5/6),height); // от колена справа до пола
        g2d.drawLine((int)(width*3*1.5/6),height*4/5, (int)(width*3*1.5/6),height); // от колена слева до пола


    }
}

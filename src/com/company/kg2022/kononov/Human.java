package com.company.kg2022.kononov;

import javax.swing.*;
import java.awt.*;

public class Human extends JPanel{

    private int x,y;
    private int width, height;
    private Color color;

    public Human(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
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
//        g2d.setStroke(new BasicStroke(10));
//        g2d.drawLine(0,0,width,0);
//        g2d.drawLine(0,0,0,height);
//        g2d.drawLine(width,0,width,height);
//        g2d.drawLine(width,height,0,height);



        g2d.setColor(color);

        //башка (без ржавого)

        g2d.fillOval(x + (width/2 - width/12), y, width/5,  height/5);


        //полигон

        g2d.fillPolygon(new int[] {x + width/6,x + width*2/6,x + width*4/6, x + width*5/6}, new int[] {y + height/5,y + height*3/5,y + height*3/5, y + height/5 }, 4);

        // границы чубрика

        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x + width/2 - width/12,y,width/5, height/5);


        //туловище

        g2d.drawLine(x +width/6, y + height/5, x + width*5/6,y + height/5); // верхнее туловище
        g2d.drawLine(x + width*2/6, y + height*3/5,x + width*4/6,y + height*3/5 ); // нижнее туловище

        g2d.drawLine(x + width/6, y + height/5,x + width*2/6, y + height*3/5); //левая палка туловища
        g2d.drawLine(x + width*5/6, y + height/5,x + width*4/6, y + height*3/5); //нижняя палка туловища

        //руки

        g2d.drawLine(x + width/6, y + height/5, x + width/6, y + height*3/5);
        g2d.drawLine(x + width*5/6, y + height/5, x + width*5/6, y + height*3/5);

        // ноги

        g2d.drawLine(x + width*2/6, y + height*3/5, x + (int)(width*1.5/6), y + height*4/5); // от туловища до колена слева
        g2d.drawLine(x + width*4/6, y  +height*3/5,x + (int)(width*3*1.5/6), y + height*4/5); // от туловища до колена справа

        g2d.drawLine(x + (int)(width*1.5/6),y + height*4/5,x + (int)(width*1.5/6),y + height); // от колена справа до пола
        g2d.drawLine(x + (int)(width*3*1.5/6),y + height*4/5, x + (int)(width*3*1.5/6),y + height); // от колена слева до пола


    }
}

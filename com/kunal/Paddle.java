package com.kunal;

import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{
    int id;
    int yVelocity;

    Paddle(int x , int y , int PADDLE_WIDTH , int PADDLE_HEIGHT , int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e){

    }
    public void keyReleased (KeyEvent e){

    }
    public void setYdirection (int yDirection){

    }
    public void move(){

    }
    public void draw (Graphics g){
        if (id==1){
            g.setColor(Color.BLUE);
        }
        else{
            g.setColor(Color.RED);
        }
        g.fillRect(x,y,width,height);
    }
}

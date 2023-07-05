package com.kunal;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    Ball(int x , int y , int WIDTH , int HEIGHT){
        super(x,y,WIDTH,HEIGHT);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection==0){
            randomXDirection--;
        }
        setXdirection(randomXDirection*initialSpeed);
        int randomYDirection = random.nextInt(2);
        if (randomYDirection==0){
            randomYDirection--;
        }
        setYdirection(randomYDirection*initialSpeed);
    }

    public void setXdirection(int randomXdirection){
        xVelocity = randomXdirection;
    }
    public void setYdirection(int randomYdirection){
        yVelocity = randomYdirection;
    }
    public void move(){
        x+= xVelocity;
        y+=yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,height,width);
    }
}

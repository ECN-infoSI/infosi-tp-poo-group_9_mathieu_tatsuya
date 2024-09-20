
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;
/**
 *
 * @author woota
 */

public class Point2D {

 
    private int X;
    private int Y;

    public Point2D() {
        this.X = 0;
        this.Y = 0;
    }

    public Point2D(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public Point2D(Point2D point) {
        this.X = point.X;
        this.Y = point.Y;
    }

    public void setX(int coordX) {
        this.X = coordX;
    }
    
    public int getX() {
        return X;
    }

    public void setY(int coordY) {
        this.Y = coordY;
    }
     
    public int getY() {
        return Y;
    }
  
    public void setPosition(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    
    public void translate(int dx, int dy) {
        this.X += dx;
        this.Y += dy;
    }

    public boolean equals(Point2D pt) {
        return ((this.getX() == pt.getX()) && (this.getY() == pt.getY()));
    }
    
    public void affiche() {
        System.out.println("[" + X + " ; " + Y + "]");
    }
    
    public float distance(Point2D point) {
        
        float distance = point.X - point.Y;
        if (distance >=0){
            return distance;
        }
        else{
            return distance * -1;
        }
    }
}
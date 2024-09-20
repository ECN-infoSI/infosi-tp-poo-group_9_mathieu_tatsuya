package org.centrale.objet.WoE;

import java.util.Random;
import java.util.ArrayList;

public class World {
    
    private int Num;
    private Archer robin;
    private Paysan peon;
    private Lapin bugs1;
    private Lapin bugs2;
    
    
    public void creerMondeAlea(){
        
        setNum(10);
        
        Random x = new Random();
        Random y = new Random();
        Point2D pt = new Point2D();
        ArrayList<Point2D> position = new ArrayList<>();
        boolean different;
        
        while (position.size() < 4){
            
            do{
                pt.setX(x.nextInt(getNum()));
                pt.setY(y.nextInt(getNum()));
                different = true;
            
                for (Point2D xy : position){
                    if (pt.equals(xy)){
                        different = false;
                        break;
                    }
             }
            }while(!different);
            
            Point2D copie = new Point2D(pt);
            position.add(copie);
        }
        this.robin = new Archer("robin",x.nextInt(100),x.nextInt(100),x.nextInt(100),
                x.nextInt(100),x.nextInt(100),x.nextInt(100),position.get(0),x.nextInt(100));
        this.peon = new Paysan("peon",x.nextInt(100),x.nextInt(100),x.nextInt(100),
                x.nextInt(100),x.nextInt(100),x.nextInt(100),position.get(1));
        this.bugs1 = new Lapin(x.nextInt(100),x.nextInt(100),x.nextInt(100),
                x.nextInt(100),x.nextInt(100),x.nextInt(100),position.get(2));
        this.bugs2 = new Lapin(x.nextInt(100),x.nextInt(100),x.nextInt(100),
                x.nextInt(100),x.nextInt(100),x.nextInt(100),position.get(3));
        
    }
    
    
    public void afficheMonde(){
        
        String[][] carte = new String[getNum()][getNum()];
        
        for (int i =0; i<getNum();i++){
            for (int j = 0; j<getNum();j++){
                carte[i][j] = "-";
            }
        }
        
        int Ax = this.robin.getPos().getX();
        int Ay = this.robin.getPos().getY();
        carte[Ax][Ay] = "A";
        int Px = this.peon.getPos().getX();
        int Py = this.peon.getPos().getY();
        carte[Px][Py] = "P";
        int L1x = this.bugs1.getPos().getX();
        int L1y = this.bugs1.getPos().getY();
        carte[L1x][L1y] = "L1";
        int L2x = this.bugs2.getPos().getX();
        int L2y = this.bugs2.getPos().getY();
        carte[L2x][L2y] = "L2";
        
        for (int i =0; i<getNum();i++){
            for (int j = 0; j<getNum();j++){
                System.out.print(carte[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public Archer getRobin() {
        return robin;
    }

    public void setRobin(Archer robin) {
        this.robin = robin;
    }

    public Paysan getPeon() {
        return peon;
    }

    public void setPeon(Paysan peon) {
        this.peon = peon;
    }

    public Lapin getBugs1() {
        return bugs1;
    }

    public void setBugs1(Lapin bugs1) {
        this.bugs1 = bugs1;
    }

    public Lapin getBugs2() {
        return bugs2;
    }

    public void setBugs2(Lapin bugs2) {
        this.bugs2 = bugs2;
    }
    
}

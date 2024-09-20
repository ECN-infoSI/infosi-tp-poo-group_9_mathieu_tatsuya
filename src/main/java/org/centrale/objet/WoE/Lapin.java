package org.centrale.objet.WoE;

public class Lapin extends Monstre{
    
    public Lapin(int pv, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        super(pv, dA, pPar, paAtt, paPar, dMax, p);
    }
    
    public Lapin(Lapin l){
        super(l);
    }
    
    public Lapin(){
    }

}

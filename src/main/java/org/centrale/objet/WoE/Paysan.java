package org.centrale.objet.WoE;

public class Paysan extends Personnage{
    
    public Paysan(String nom, int pv, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        super(nom, pv, dA, pPar, paAtt, paPar, dMax, p);
    }
    
    public Paysan(Paysan p){
        super(p);
    }
    
    public Paysan(){
        
    }

}

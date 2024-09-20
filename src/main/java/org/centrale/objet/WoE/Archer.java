package org.centrale.objet.WoE;

public class Archer extends Personnage {
    
    private int nbFleches;
    
    public Archer(String n, int pv, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbf){
        super(n,pv,dA,pPar,paAtt,paPar,dMax,p);
        nbFleches = nbf;
    }
    
    public Archer(Archer a){
        super(a);
        nbFleches = a.nbFleches;  
    }
    
    public Archer(){
        
    }
}

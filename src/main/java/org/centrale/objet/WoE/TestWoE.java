package org.centrale.objet.WoE;

public class TestWoE {
    public static void main(String[] args){
        World test = new World();
        test.creerMondeAlea();
        test.afficheMonde();
        test.getRobin().deplace();
        test.getPeon().deplace();
        test.getBugs1().deplace();
        test.getBugs2().deplace();
        test.afficheMonde();
        
    }
}

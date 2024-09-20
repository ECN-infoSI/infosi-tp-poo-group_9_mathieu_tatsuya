package org.centrale.objet.WoE;

import java.util.Random;

public class Monstre {
    
    // Attributs
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    //Méthodes
    public Monstre(int pv, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        ptVie = pv;
        degAtt = dA;
        ptPar = pPar;
        pageAtt = paAtt;
        pagePar = paPar;
        distAttMax = dMax;
        pos = p;
    }
    public Monstre(Monstre m){
        ptVie = m.ptVie;
        degAtt = m.degAtt;
        ptPar = m.ptPar;
        pageAtt = m.pageAtt;
        pagePar = m.pagePar;
        distAttMax = m.distAttMax;
        pos = m.pos;
    }
    public Monstre(){
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    public int getPtVie(){
        return this.ptVie;
    }
    public void setVie(int x){
        this.ptVie = x;
    }
    public void deplace(){
             
        Random x = new Random();
        Random y = new Random();
        
        int dx = x.nextInt(3)-1;
        int dy = y.nextInt(3)-1;
        
        this.pos.translate(dx, dy);
    }
    public void affiche(){
        System.out.println(this.ptVie + ',' + this.degAtt + ','
                + this.ptPar + ',' + this.pageAtt + ',' + this.pagePar + ',' +
                this.distAttMax + ',');
        this.pos.affiche();
    }
}

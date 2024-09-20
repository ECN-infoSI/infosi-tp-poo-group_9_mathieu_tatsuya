package org.centrale.objet.WoE;

public class Personnage {
    
    // Attributs
    private String nom;
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    //Méthodes
    public Personnage(String n, int pv, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        nom = n;
        ptVie = pv;
        degAtt = dA;
        ptPar = pPar;
        pageAtt = paAtt;
        pagePar = paPar;
        distAttMax = dMax;
        pos = p;
    }
    public Personnage(Personnage p){
        nom = p.nom;
        ptVie = p.ptVie;
        degAtt = p.degAtt;
        ptPar = p.ptPar;
        pageAtt = p.pageAtt;
        pagePar = p.pagePar;
        distAttMax = p.distAttMax;
        pos = p.pos;
    }
    public Personnage(){
    }
    public String getNom(){
        return this.nom;
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
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
    public void setNom(String n){
        this.nom = n;
    }
    public void deplace(){
        
    }
    public void affiche(){
        System.out.println(this.nom + ',' + this.ptVie + ',' + this.degAtt + ','
                + this.ptPar + ',' + this.pageAtt + ',' + this.pagePar + ',' +
                this.distAttMax + ',');
        this.pos.affiche();
    }
}

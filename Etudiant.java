/* add github by iontask */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Administrateur
 */
public class Etudiant {
    private int CNE;
    private String nom;
    private int nb;
  
    private String prenom;
    private float[] notes;
    
    public Etudiant(){
    CNE=0;
    nom="";
    prenom="";
    nb=0;
    notes= new float[nb];
    }
    public Etudiant(int c ,String nn,String pr,int nb,float[] nots){
    CNE=c;
    nom=nn;
    prenom=pr;
    this.nb=nb;
    notes= new float[nb];
    for(int i=0;i<nb;i++)
    {
    notes[i]=nots[i];}
    }
     public Etudiant(Etudiant a){
    CNE=a.CNE;
    nom=a.nom;
    prenom=a.prenom;
    notes= new float[a.notes.length];
    for(int i=0;i<a.notes.length;i++)
        notes[i]=a.notes[i];
    }
       public int getCNE() {
        return CNE;
    }

    public void setCNE(int CNE) {
        this.CNE = CNE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float[] getNotes() {
        return notes;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }
    public float moyenne(){
    float som=0,moy=0;
    
    for(int i=0;i<notes.length;i++)
    
    som+=notes[i];
    
    moy=som/(notes.length);
    return moy;
    }
    public void afficher()
    {
    System.out.println("CNE est"+CNE+" le nom est:"+nom+" le prenom est:"+prenom);
    System.out.println("les notes");
    for(int i=0;i<nb;i++)
    System.out.println(notes[i]);
    
    }
/* gittp is online !!! */


/* petite erreur */






    public void mentien(){   
    
    
    float moy=moyenne();
    
    if(moy<12 && moy>=10)
    System.out.println("moyenne est "+moy+" mention passable");
    else if(moy<14 )
    System.out.println("moyenne est "+moy+" mention assez bien");
    else if(moy<16  )
    System.out.println("moyenne est "+moy+" mention  bien");
      else if(moy<18  )
          System.out.println("moyenne est "+moy+" mention  très bien");
    else if(moy  >=18 )
        System.out.println("moyenne est "+moy+" mention  excellent");
    else
       System.out.println("moyenne est "+moy+" invalide"); 
    
    }
    @Override
   public void afficher(){
       super.afficher();
       System.out.println("le CNE d'ETUDIANT est:" +CNE);
   }
    
}



/* ajout de commentaire */
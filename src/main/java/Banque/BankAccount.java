package Banque;

public abstract class BankAccount {
    protected int proprietaire;
    protected double sole;
    protected int numero;
    protected double tauxInteret;
    protected  boolean isBlocked=false;



    //Constructeurs
  /*  public BankAccount ()
    {
        this.proprietaire=0
        this.sole=0;
        this.numero="Non spécifié";
        this.tauxInteret=0;
        this.isBlocked=false;
    }*/

    public BankAccount (int owner,double solde,double interest)
    {
        this.proprietaire=owner;
        this.sole=solde;
        this.tauxInteret=interest;
        this.isBlocked=false;

    }

    //Getters

    public int getProprietaire()
    {
        return this.proprietaire;
    }

    public int getNumero()
    {
        return this.numero;

    }
    public  double getSolde()
    {
        return this.sole;

    }
    public double getTauxInteret()
    {
        return this.tauxInteret;

    }
    
    public boolean getState()
    {
        return this.isBlocked;
    }

    //Setters

    //Setters
    public boolean setProprietaire(int proprietaire)
    {
        if(proprietaire!=0)
        {
            this.proprietaire=proprietaire;
            return true;
        }
        else
            return false;

    }

    
     public boolean setStata(String state)
    {
        if(!state.equals(""))
        {
             if(state.equals("oui"))
        {
            this.isBlocked=true;           
            
        }
            else if(state.equals("non"))
            this.isBlocked=false;
        
             return true;
        }
       
     
            return false;

    }

    public boolean setSolde(double solde)
    {
        if(solde>0)
        {
            this.sole=solde;
            return true;
        }
        else
            return false;
    }

    public  boolean setNumero(int numero)
    {
        if(numero!=0)
        {
            this.numero=numero;
            return true;
        }
        else
            return false;
    }

    public  boolean setTauxInteret(double tauxInteret)
    {
        if(tauxInteret>0)
        {
            this.tauxInteret=tauxInteret;
            return true;
        }
        else
            return false;

    }


    //Methodes Spécifiques
    public abstract boolean depotArgent(double montant);

    public abstract boolean retraitArgent(double montant);

    public String setTauxInteret() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 




}

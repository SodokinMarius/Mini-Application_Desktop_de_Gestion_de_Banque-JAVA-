package Banque;

import java.util.ArrayList;

public class NormalAccount extends BankAccount{

    //private Loan loan;

   
  public static ArrayList<Loan> listOfLoans=new ArrayList();

public static double interetCalculer;
    public NormalAccount (int owner,double solde,double interest)
    {
        super(owner,solde, interest);
        this.listOfLoans=new ArrayList();
    }


    //Methodes Spécifiques

    //Depôt d'Argent
    public  boolean depotArgent(double montant)
    {
        if(montant>0)
        {
            this.sole+=montant;
            return true;
        }

        return false;
    }

    //Retrait d'Argent
    public boolean retraitArgent(double montant)
    {
        if(montant>0 && montant<=this.sole)
        {
            this.sole-=montant;
            return true;
        }

        return false;

    }


    public double calculInterest(Loan loan)
    {
       double interet=loan.getAmount()*this.tauxInteret/100;

       return  interet;
    }


    public void addLoan(Loan l)
    {
        this.listOfLoans.add(l);
        this.sole+=l.getAmount();

    }


    public boolean payYourLoans( Loan l)
    {
        this.listOfLoans.remove(l);
        
        if(this.sole<l.getAmount())
        {
              double rembourse= l.getAmount()+l.getMensuality()*this.tauxInteret/100;
        this.sole-=l.getAmount();
        return true;
        }
        return false;
      
    }

    public String setTauxInteret() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

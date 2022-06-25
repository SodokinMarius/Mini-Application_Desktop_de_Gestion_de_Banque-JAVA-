package Banque;

public class SparingAccount  extends BankAccount{


    //Constructeurs
   /* public SparingAccount()
    {
        super();
    }*/

    public SparingAccount(int owner,double solde,double interest)
    {
        super(owner,solde, interest);
    }


    //Methodes spécifiques
    public  boolean depotArgent(double montant)
    {
        return true;
    }

    public boolean retraitArgent(double montant)
    {
        return true;

    }

    public int calculInterest()
    {
        return 1;
    }

}

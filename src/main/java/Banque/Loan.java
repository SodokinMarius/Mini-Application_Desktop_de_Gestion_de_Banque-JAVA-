//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Banque;

import static Banque.NormalAccount.interetCalculer;

public class Loan {
    private double amount;
    private double mensuality;
    private NormalAccount compte;

    public Loan() {
        this.amount = 0.0;
        this.mensuality = 0.0;
        //this.compte = new NormalAccount();
    }

    public Loan(double amount, double mensuality, NormalAccount compte) {
        this.amount = amount;
        this.mensuality = mensuality;
        this.compte = compte;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getMensuality() {
        return this.mensuality;
    }

    public NormalAccount getCompte() {
        return this.compte;
    }

    public boolean setAmount(double amount) {
        if (amount > 0.0) {
            this.amount = amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMensuality(double mensuality) {
        if (mensuality > 0.0) {
            this.mensuality = mensuality;
        }

        return false;
    }

    public void reimburse() {
        NormalAccount compte = this.compte;
        double rembourse=this.mensuality-this.compte.calculInterest(this);
        compte.sole -=rembourse;
        this.amount-=rembourse;
        interetCalculer+=this.compte.calculInterest(this);
    }
}

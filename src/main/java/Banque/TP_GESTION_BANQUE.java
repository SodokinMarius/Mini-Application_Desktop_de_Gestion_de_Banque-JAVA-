/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Banque;


import static Vue.DashBoard.username;
import Vue.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author sodyam
 */

public class TP_GESTION_BANQUE {
public static ArrayList<BankAccount> listOfBanks=new ArrayList();
public static ArrayList<ArrayList<String>> listOfTransactions=new ArrayList();

    /**
     *
     */

public static ArrayList<OwnerCompte> listOfOwners=new ArrayList();

    static Connection con; 
    PreparedStatement statement;
    ResultSet result;
    //   public Owner (String  name, String surname, String contacts, String adresse, String username,String password)

    
    public static void main(String[] args) {
    
   
        System.out.println("Hello World!");
        
       Login login=new Login();
        login.setVisible(true);
       
    }
}

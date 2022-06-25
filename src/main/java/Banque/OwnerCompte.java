/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banque;

/**
 *
 * @author sodyam
 */
public class OwnerCompte {
    private int ownerId;
     private String  name;
     private String surname;
     private String contacts;
      private String adresse;
       private String username;
    private String password;
    
    
   public OwnerCompte (String  name, String surname, String contacts, String adresse, String username,String password)
   {
  
      this.name=name;
   this.surname=surname;
    this.contacts=contacts;
    this.adresse=adresse;
    this.username=username;
    this.password=password;
    }
   
    public  String  getName()
    
    {
        return this.name;

    }
    
     public  String  getSurname()
    
    {
        return this.surname;

    }
     
       public  String  getUsername()
    
    {
        return this.username;

    }
         public  String  getContacts()
    
    {
        return this.contacts;

    }
           public  String  getAdresse()
    
    {
        return this.adresse;

    }
             public  String  getPassword()
    
    {
        return this.password;

    }
    
}

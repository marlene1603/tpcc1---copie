/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpcc;

import tpcc.model.Etudiant;
import tpcc.service.TpccService;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author flannelle
 */
public class Tpcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
       
        Etudiant et1,et2,et3,et,et10,et4,et5,et6,et9;
         Etudiant e;
        int choix,niv;
        String matricul,fil,name;
        TpccService service;
        service =new TpccService();
        
        do{
            System.out.println("****************************************************");
            System.out.println("**    1: ENREGISTRER UN ETUDIANT                 ***");
            System.out.println("**    2: LISTE DE TOUS LES ETUDIANTS             ***");
            System.out.println("**    3: LISTE DES ETUDIANTS D'UNE FILIERE       ***");
            System.out.println("**    4: INFORMATION D'UN ETUDIANT               ***");
            System.out.println("**    5: SUPPRIMER UN ETUDIANT                   ***");
            System.out.println("**    6: MODIFIER LE NIVEAU D'UN ETUDIANT        ***");
            System.out.println("**    7: QUITTER                                 ***");
            System.out.println("*************************************************** ");
            System.out.println("Faites le choix de la tache a effectuer:");
             choix = sc.nextInt();
             
             switch(choix)
            {
            case 1:
                 System.out.println("    1: ENREGISTRER UN ETUDIANT  ");
                       
                    // methode d'enregistrement d'un etudiant
                 System.out.println("Entrer le matricule: ");
                 sc.nextLine();
                 matricul= sc.nextLine();
                 System.out.println("Entrer le nom: ");
                    name= sc.nextLine();
                 System.out.println("Entrer la filiere: ");
                    fil= sc.nextLine();
                 System.out.println("Entrer le niveau:");
                    niv= sc.nextInt(); 
                    e = new Etudiant(matricul,name,fil,niv);
                    service.nouvelEtudiant(e);
                 System.out.println(" Enregistrement  effectué ");
             break;
                
            case 2:
                System.out.println(" 2: LISTE DE TOUS LES ETUDIANTS ");
                 // methode afficher 
                    service.affichelisteEtudiant();
            break;
            
            case 3:
                System.out.println(" 3: LISTE DES ETUDIANTS D'UNE FILIERE ");
                     // afficher les etudiants d'une filiere donnée
                System.out.println("Entrer la filiere :");
                    fil= sc.nextLine();
                    service.ListeEtudiantFiliere(fil);
            break;
            
            case 4:
                System.out.println(" 4: INFORMATION D'UN ETUDIANT ");
                     // methode de recherche d'un etudiant
                System.out.println("Entrer le matricule de l etudiant à rechercher :");
                    matricul= sc.nextLine();
                System.out.println("l'etudiant rechercher est:");
                    service.RechercheEtudiant(matricul);
            break;
            
            case 5:
                //supprimer
                System.out.println("Entrer le matricule de l etudiant à supprimer :");
                    matricul= sc.nextLine();
                    service.deleteEtudiant(matricul);
                    service.affichelisteEtudiant();
                System.out.println("suppression reussie");
            break;
            
            case 6:
                 // modifier
                System.out.println("Entrer le matricule  de l etudiant à modifier :");
                    matricul= sc.nextLine();
                System.out.println("Modifier le niveau de l etudiant :");
                    niv= sc.nextInt();
                    service.modifierniveauEtudiant(matricul,niv);
                    service.affichelisteEtudiant();
                System.out.println("Mise à jour effectuée!!!");   
                        default:
                System.out.println("merci vous etes    6:QUITTER");
            } 
        }while(choix>0 && choix<=5);               
  }
}
       
        
           /**       
                    // methode d'enregistrement d'un etudiant
        System.out.println("Entrer le matricule ");
            matricul= sc.nextLine();
        System.out.println("Entrer le nom ");
            name= sc.nextLine();
        System.out.println("Entrer la filiere ");
            fil= sc.nextLine();
        System.out.println("Entrer le niveau");
            niv= sc.nextInt(); 
            e = new Etudiant(matricul,name,fil,niv);
            service.nouvelEtudiant(e);
        System.out.println(" Enregistrement  effectué ");
        **/
        
        /**
         methode afficher 
        service.affichelisteEtudiant();
        **/
        
        /**
            // afficher les etudiants d'une filiere donnée
        System.out.println("Entrer la filiere ");
           fil= sc.nextLine();
           service.ListeEtudiantFiliere(fil);
        **/
        
        /**
            // methode de recherche d'un etudiant
        System.out.println("Entrer le matricule de l etudiant à rechercher :");
            matricul= sc.nextLine();
        System.out.println("l'etudiant rechercher est:");
            service.RechercheEtudiant(matricul);
        **/   
        
        /**
           //supprimer
        System.out.println("Entrer le matricule de l etudiant à supprimer :");
            matricul= sc.nextLine();
            service.deleteEtudiant(matricul);
            service.affichelisteEtudiant();
        System.out.println("suppression reussie");
        **/  
        /**    
          // modifier
        System.out.println("Entrer le matricule  de l etudiant à modifier :");
            matricul= sc.nextLine();
        System.out.println("Modifier le niveau de l etudiant :");
            niv= sc.nextInt();
            service.modifierniveauEtudiant(matricul,niv);
            service.affichelisteEtudiant();
        System.out.println("Mise à jour effectuée!!!");   
        **/
    
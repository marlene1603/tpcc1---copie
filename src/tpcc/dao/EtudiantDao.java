/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpcc.dao;
import java.util.*;
import tpcc.model.Etudiant;

/**
 *
 * @author flannelle
 */
public class EtudiantDao {

     // creation d'une variable de type list <etudiant>
    // ce qui est dans les chevrons on ecrit le type
    // stock va nous servir de base de donnée
    // differentes methodes  des liste: (add, remove,size() taille de la liste, on utilise la boucle for pour parcourir une liste
    public static final List<Etudiant> tpcc=new ArrayList<>();
    public EtudiantDao(){
        
    }
    //methode d'ajout d'un etudiant
    public boolean addEtudiant(Etudiant etud) {
        for(Etudiant e:tpcc){
        if(e.getMatricule().equals(etud.getMatricule()));{
          return false;   
        }
       }
        tpcc.add(etud);
         return true;
        }
    //afficher la liste de tous les etudiants
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpcc.service;

/**
 *
 * @author flannelle
 */
import java.sql.*;
import tpcc.model.Etudiant;
public class TpccService {
    //String url="jdbc:mysql://localhost:3306/etudiant";
    String url ="jdbc:mysql://localhost:3306/gestion_etudiant";
    String UserName="root";
    String password="";
    Connection conn=null;
    
    public TpccService(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("chargement du pilote ok");
            conn = DriverManager.getConnection(url,UserName,password);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //enregistrer un nouvelle etudiant
     public boolean nouvelEtudiant(Etudiant etu){
            try{
                Statement req=conn.createStatement();
                String reqSQL="INSERT INTO  etudiant value(null,'" + etu.getMatricule() + "','" 
                        + etu.getNom() + "','" + etu.getFiliere() + "'," + etu.getNiveau()+")";
                int res =req.executeUpdate(reqSQL);
                return true;
            }catch(Exception e){
            e.printStackTrace();    
            return false;
            }
     }
      //afficher les liste de tous les etudiants
    public void affichelisteEtudiant(){
            try{
                Statement req=conn.createStatement();
                String reqSQL="SELECT * FROM etudiant";
                ResultSet res= req.executeQuery(reqSQL);
                while (res.next()){
                    System.out.println(res.getString("matricule")+":"+res.getString("nom")+":"+res.getString("filiere")+":"+res.getInt("niveau"));
                    
                }
            } catch(SQLException e){
            e.printStackTrace();
        }
    }
     // afficher la liste de tous les etudiants d'une filiere donnée
     public void ListeEtudiantFiliere(String filiere){
        try{
             Statement req=conn.createStatement();
             String reqSQL="SELECT * FROM etudiant " + "WHERE filiere='" + filiere + "'";
             ResultSet  res = req.executeQuery(reqSQL);
              while (res.next()){
                   System.out.println(res.getString("matricule")+":"+res.getString("nom")+":"+res.getString("filiere")+":"+res.getInt("niveau"));
                  
              }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
     // Rechercher et afficher les informations d'un etudiant par son matricule
     public void RechercheEtudiant(String matricule){
        try{
             Statement req=conn.createStatement();
             String reqSQL="SELECT * FROM etudiant " + "WHERE matricule='" + matricule + "'";
             ResultSet  res = req.executeQuery(reqSQL);
              while (res.next()){
                   System.out.println(res.getString("matricule")+":"+res.getString("nom")+":"+res.getString("filiere")+":"+res.getInt("niveau"));
                  
              }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    } 
     //supprimer un etudiant à partir de son matricule
     public void deleteEtudiant ( String matricule){
        try{
            Statement req = conn.createStatement();
            String sql = "DELETE FROM etudiant " + "WHERE matricule ='" + matricule +"'";
            int  res = req.executeUpdate(sql);
        }catch(Exception ex){
            ex.printStackTrace();
       }
    }
     // modifier le niveau d'un etudiant donné
    public void modifierniveauEtudiant(String matricule, int niveau){
        try{
                Statement req=conn.createStatement();
                String sql = "UPDATE etudiant SET niveau= " + niveau + " WHERE matricule='" + matricule + "'";
                int res= req.executeUpdate(sql);
                System.out.println("modification effectuée");
        }catch(Exception ex){
          ex.printStackTrace();
        }  
    } 

}


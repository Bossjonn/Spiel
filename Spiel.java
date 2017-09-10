

import java.util.Scanner;

public class Spiel
{   
    Scanner console = new Scanner(System.in);
    public String Klasse;
    public String Input;
    public String Name;
    Magier Magier=new Magier();
    Schütze Schütze=new Schütze();
    Assasine Assasine=new Assasine();
    Kämpfer Kämpfer=new Kämpfer();
    Welt Welt=new Welt();
    int Koordia;
    int Koordib;
    public Spiel()
    {
       

      Spielen();
    }
    public void Spielen(){
    Wählen();
    Name();
    Anfangsstory();
    Part1();
        
        
    
    
    }
    public void Wählen(){
        System.out.println("Hey willkommen bei unserem AdventureGame");
        System.out.println("Welcher Klasse möchtest du beitreten?Magier,Assasine, Kämpfer oder Schütze?");
        Klasse= console.next();
        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
        if(Klasse.equalsIgnoreCase("Magier")){
                 
            
            
              String Ü=Magier.sagItem();
            System.out.println("Am Anfang hast du ein "+ Ü);
            
        }
        if(Klasse.equalsIgnoreCase("Schütze")){
                
                 
            
            
              String Ü=Schütze.sagItem();
            System.out.println("Am Anfang hast du ein "+ Ü);
            
        }
         if(Klasse.equalsIgnoreCase("Assasine")){
               
                 
            
            
              String Ü=Assasine.sagItem();
            System.out.println("Am Anfang hast du ein "+ Ü);
        }
         if(Klasse.equalsIgnoreCase("Kämpfer")){
                 
                 
            
            
              String Ü=Kämpfer.sagItem();
            System.out.println("Am Anfang hast du ein "+ Ü);
        }  
           
        
        
        
        
        
    
    }
    public void Name(){
     
        String Frage;
                System.out.println("Wie heißt du denn?");
        Name= console.next();
        System.out.println("Du bist also "+ Klasse +" "+ Name);
        
   
    }
    public void Pause(){
      
    }
    public void Anfangsstory(){
         Pause();
            
        System.out.println("Du lebst mit deiner Familie im Dorf Lonko und alles ist friedlich.Doch plötzlich greift der gefürchtete Zauberer Glonk an.Deine Famielie und Freunde wissen sich nicht zu verteidigen");
        System.out.println("Sie werden eingefroren.Der einzige Weg sie zu retten ist den Zauberer zu besiegen.");
         System.out.println("Dein Job ist es Richtung Norden zu gehen und ihn zu besiegen.");   
        System.out.println("Doch bevor du los gehst bietet dir ein alter Mann einen Apfel an.Den kannst du später sicher gebrauchen.Willst du ihn mitnehmen?");   
        Input= console.next();
           if(Input.equalsIgnoreCase("Ja")){
                     if(Klasse.equalsIgnoreCase("Magier")){
                 
            
            
                         Magier.nehme(1,"Apfel");
            
            }
            if(Klasse.equalsIgnoreCase("Schütze")){
                
                 
            
            
              Schütze.nehme(1,"Apfel");
            
            }
             if(Klasse.equalsIgnoreCase("Assasine")){
               
                 
            
            Assasine.nehme(1,"Apfel");
           }
            if(Klasse.equalsIgnoreCase("Kämpfer")){
                 
                 
            
            
               Kämpfer.nehme(1,"Apfel");
           }  
           
                     
            
               
               
        }  
        
        
        
    
           
        
    }
    public void Part1(){
        
    System.out.println("Was willst du jetzt machen?");
    Input= console.next();
    if(Input.equalsIgnoreCase("Norden")){
           
            
            
        
            Koordia=Koordia+1;
            
           
            
                 
        } 
             Welt.info(Koordia,Koordib);
          Part1();  
            }
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


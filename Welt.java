
public class Welt{
        String[][] Welt=new String[30][30];
    public Welt(){
       
    
    besetzteWelt();
    
    
    
        
        
    
    
    }
    
    public void besetzteWelt(){
    Welt[0][0]="Dorf";
    for(int j=1;j<10;j++){
        for(int i=1;i<10;i++){
        Welt[j][i]="Wald";       
    }  
    }
    for(int j=10;j<28;j++){
        for(int i=1;i<28;i++){
        Welt[j][i]="Fluss";  
    } 
    }
    Welt[29][29]="Turm";
    
        
        
        
    
        
        
        
        
    }
    public void info(int n,int j){
    String Info="Nirgends";
        int g= j + n ;
        if(g==0){Info="Dorf";}
        else if(j>0 || n>0){Info="Wald";}
        else if(j>10 || n>10){Info="Fluss";}
        else if(j>28 || n>28){Info="Turm";}
   
    System.out.println("Du bist im Moment im "+ Info + " .");
    
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    

    
    
    
    
    

    
    
    
            
}

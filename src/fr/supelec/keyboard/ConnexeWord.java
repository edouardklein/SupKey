//Source file: U:\\PROJET\\ConnexeWord.java
package fr.supelec.keyboard;

public class ConnexeWord 
{
    private String word;
    private WeightFunction theWeightFunction;
    
    
    public ConnexeWord( String _word ) 
    {
       word = _word;
       theWeightFunction = new WeightFunction( word );
    }
    
   public String getWord(){
	   return word;
   }
   
   // public void setWeight() 
   // {
   //     theWeightFunction.weight( word );
   // }
   
    public double getWeight(){
	return theWeightFunction.getWeight();
    }
}

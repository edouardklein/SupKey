//Source file: U:\\PROJET\\ConnexeWord.java
package fr.supelec.keyboard;

public class ConnexeWord 
{
    private String word;

  
    public ConnexeWord( String _word ) 
    {
       word = _word;
       
    }
    
   public String getWord(){
	   return word;
   }
   
   // public void setWeight() 
   // {
   //     theWeightFunction.weight( word );
   // }
   
    public double getWeight(String mWord){
	return mDictionary.get(mWord);
    }
}

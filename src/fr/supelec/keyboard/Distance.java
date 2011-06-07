//Source file: U:\\PROJET\\Distance.java
package fr.supelec.keyboard;

import java.lang.Math;

public class Distance 
{
    private int distance=0;
    private StringBuilder typing=null;
    private double numberOfMistakes;
    private String word = null;

   public Distance( String _word ) 
    {
	word = _word;
	typing = SupKey.getInstance().getComposing();
	setDistance();
	setNumberOfMistakes();
   }
   

   public void setDistance() 
   {
       distance=0;
       for (int i=0;i<typing.length();i++){
	   if(word.charAt(i)!=(typing.charAt(i))){
	       distance++;
	   }
       }
   }
    
    public void setNumberOfMistakes(){
	for (int i=0;i<typing.length();i++){
	    numberOfMistakes=+Stat.getInstance().mistakes((typing.charAt(i)));	    
    	}
    }

   public double getCorrectedDistance() 
   {
       return Math.abs(numberOfMistakes - (double) distance);
   }
}

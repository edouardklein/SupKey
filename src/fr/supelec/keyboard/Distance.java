//Source file: U:\\PROJET\\Distance.java

import java.lang.Math;

public class Distance 
{
   private int distance=0;
   private StringBuilder taping=Supkey.getInstance().getComposite();
   private double numberOfMistakes;
   public Distance() 
   {
    
   }
   

   public void setDistance(ConnexeWord connexeWord) 
   {
	   distance=0;
	   for (int i=0;i<taping.size();i++){
    	if(connexeWord.getWord().charAt(i)==(taping.charAt(i))){
    		distance++;
    	}
    }
   }
   
    public void setNumberOfMistakes(){
	for (int i=0;i<taping.size();i++){
	    numberOfMistakes=+theStat(taping.CharAt(i));	    
    	}

   public double correctedDistance(ConnexeWord connexeWord) 
   {
	setDistance(connexeWord);
    return Math.abs(taping.getNumberOfMistakes()- (double) distance);
   }
}

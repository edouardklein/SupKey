//Source file: U:\\PROJET\\WeightFunction.java
package fr.supelec.keyboard;


import java.lang.Math;

public class WeightFunction 
{
   private double alpha = 1;
   private double beta = 1;
   private double gamma = 1;
    private String word = null;

   public WeightFunction( String word ) 
    {
	word = word;
    }
   

   public double getWeight() 
   {
       Distance dis = new Distance( word );
       double d=dis.getCorrectedDistance();
       double f = DictionaryOfFrequency.getInstance().getFrequency( word );
       return (Math.exp(alpha*Math.log((double)(f))))/(1+Math.exp(gamma*Math.log(beta*((d)))));
   }
}

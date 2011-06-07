//Source file: U:\\PROJET\\WeightFunction.java

import java.lang.Math;

public class WeightFunction 
{
   private double alpha;
   private double beta;
   private double gamma;
   private TypingSequence typingSequence;
   

   public WeightFunction(double anAlpha, double aBeta, double aGamma) 
   {
   alpha=anAlpha;
   beta=aBeta;
   gamma=aGamma;
   
   }
   

   public double weight(ConnexeWord connexeWord) 
   {
       Distance d=connexeWord.getDistance();

       return (Math.exp(alpha*Math.log((double)(dictionaryOfFrequency.getFrequency(connexeWord.getWord())))))/(1+Math.exp(aGamma*Math.log(beta*((d.getCorrectedDistance())))));

     }
}

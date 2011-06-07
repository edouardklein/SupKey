//Source file: U:\\PROJET\\ConnexeWord.java


public class ConnexeWord 
{
   private String word;
   private double distanceFromTypingSequence;
   private int frequency;
   private Double weight;
   public WeightFunction theWeightFunction;
   public Distance theDistance;
   

   public ConnexeWord() 
   {
    setDistanceFromTypingSequence();
    setFrequency();
    setWeight();
    updateQueue();
   }
    
    public Distance getDistance(){
	return theDistance;
    }

   public String getWord(){
	   return word;
   }

   public void setDistanceFromTypingSequence() 
   {
    distanceFromTypingSequence=theDistance.correctedDistance(this);
   }
   
   public double getDistanceFromTypingSequence(){
	   return distanceFromTypingSequence;
   }

   public void setFrequency() 
   {
    
   }
   
   public int getFrequency(){
	   return frequency;
   }

   public void setWeight() 
   {
    theWeightFunction.weight(this);
   }
   
   public Double getWeight(){
	   return weight;
   }
   public void updateQueue() 
   {
    
   }
}

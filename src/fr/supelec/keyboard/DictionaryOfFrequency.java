package fr.supelec.keyboard;

public class Dictionary{

     private static Dictionary instance = null;
 
     /**
      * La présence d'un constructeur privé supprime
      * le constructeur public par défaut.
      */
     private Dictionary(int i) {
	 switch (i) {
	 case 1 : myDictionary="dictionary_stat1.txt"
	 case 2 : myDictionary="dictionary_stat2.txt"	
	 }

	 try {
	     FileInputStream fichier = new FileInputStream(myDictionary);
	     ObjectInputStream ois = new ObjectInputStream(fichier);
	     theDictionary = (HashMap<String,Integer>) ois.readObject();
	     //counter = ??
	 }
	 catch (java.io.IOException e){
	     e.printStackTrace();
	 }
	 catch (ClassNotFoundException e){
	     e.printStackTrace();
	 }
     /**
      * Le mot-clé synchronized sur la méthode de création
      * empêche toute instanciation multiple même par
      * différents threads.
      * Retourne l'instance du singleton.
      */
     public final synchronized static Dictionary getInstance(int i) {
         if (instance == null) 
             instance = new Dictionary(i);
         return instance;
     }


   public void saveDictionnary(){
	  theDictionnaryOfFrequency.remove("*");
	  theDictionnaryOfFrequency.put("*",compter);
	   try {
	        FileOutputStream fichier = new FileOutputStream(dictionnaryChose);
	        ObjectOutputStream oos = new ObjectOutputStream(fichier);
	        oos.writeObject(theDictionnaryOfFrequency);
	        oos.flush();
	        oos.close();
	      }
	      catch (java.io.IOException e) {
	        e.printStackTrace();
	      }
   }
   
   public void updateFrequency(StringBuffer wordStringBuffer,Integer i) 
   {
	try{
		String wordString=new String(wordStringBuffer);   
		Integer oldKey=theDictionnaryOfFrequency.get(wordString);
		theDictionnaryOfFrequency.put(wordString,oldKey+i);
		compter=compter+i;
	}
	catch(java.lang.NullPointerException e){
		//C'est ici que l'on pourra proposé à notre utilisateur d'entrée un nouveau mot dans le dico.
	}
		
	}
	
   
   public void updateFrequency(String word,Integer i) 
   {
    Integer oldKey=theDictionnaryOfFrequency.get(word);
    theDictionnaryOfFrequency.put(word,oldKey+i);
    compter=compter+i;
   }

   
   public double getFrequency(String word){
	   //return (double) theDictionnaryOfFrequency.get(word)/compter;
	   return (double) theDictionnaryOfFrequency.get(word);
   }
   
   public void addWord(String word, Integer i){
	   theDictionnaryOfFrequency.put(word, i);
   }
   
   public void deleteWord( String word){
	   theDictionnaryOfFrequency.remove(word);
   }
   
   public boolean belongTo(String word){
	   return theDictionnaryOfFrequency.containsKey(word);
   }
}


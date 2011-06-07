package fr.supelec.keyboard;

public class DictionaryOfFrequency{

     private static DictionaryOfFrequency instance = null;
 
     /**
      * La présence d'un constructeur privé supprime
      * le constructeur public par défaut.
      */
     private DictionaryOfFrequency() {}
 
     /**
      * Le mot-clé synchronized sur la méthode de création
      * empêche toute instanciation multiple même par
      * différents threads.
      * Retourne l'instance du singleton.
      */
     public final synchronized static DictionaryOfFrequency getInstance() {
         if (instance == null) 
             instance = new DictionaryOfFrequency();
         return instance;
     }

    public double getFrequency(String aWord){
	return 0.0;
    }
}
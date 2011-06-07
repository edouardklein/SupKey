//Source file: U:\\PROJET\\Stat.java
import java.util.HashMap;

public class Stat 
{
   
	private HashMap<Character,Double> theStat;
	
   public Stat() 
   {
    theStat=new HashMap <Character, Double> ();
   
    //minuscules
    theStat.put('a',0.3);
    theStat.put('b',0.3);
    theStat.put('c',0.3);
    theStat.put('d',0.3);
    theStat.put('e',0.3);
    theStat.put('f',0.3);
    theStat.put('g',0.3);
    theStat.put('h',0.3);
    theStat.put('i',0.3);
    theStat.put('j',0.3);
    theStat.put('k',0.3);
    theStat.put('l',0.3);
    theStat.put('m',0.3);
    theStat.put('n',0.3);
    theStat.put('o',0.3);
    theStat.put('p',0.3);
    theStat.put('q',0.3);
    theStat.put('r',0.3);
    theStat.put('s',0.3);
    theStat.put('t',0.3);
    theStat.put('u',0.3);
    theStat.put('v',0.3);
    theStat.put('w',0.3);
    theStat.put('x',0.3);
    theStat.put('y',0.3);
    theStat.put('z',0.3);
    
  //majuscules
    theStat.put('A',0.3);
    theStat.put('B',0.3);
    theStat.put('C',0.3);
    theStat.put('D',0.3);
    theStat.put('E',0.3);
    theStat.put('F',0.3);
    theStat.put('G',0.3);
    theStat.put('H',0.3);
    theStat.put('I',0.3);
    theStat.put('J',0.3);
    theStat.put('K',0.3);
    theStat.put('L',0.3);
    theStat.put('M',0.3);
    //theStat.put('',0.3);
    theStat.put('O',0.3);
    theStat.put('P',0.3);
    theStat.put('Q',0.3);
    theStat.put('R',0.3);
    theStat.put('S',0.3);
    theStat.put('T',0.3);
    theStat.put('U',0.3);
    theStat.put('V',0.3);
    theStat.put('W',0.3);
    theStat.put('X',0.3);
    theStat.put('Y',0.3);
    theStat.put('Z',0.3);
   }
   
   public double mistakes(Character c){
	   return theStat.get(c);
	   }


}

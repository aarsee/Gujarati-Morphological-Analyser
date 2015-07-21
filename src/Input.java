import java.io.*;
import java.util.*;

public class Input 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    int p = 0;
    String tag = new String();
    String word = new String();
    File f = new File("POS Tagged Data for Experiment 2 Input-File.txt");
    Scanner sc = new Scanner(f);
    while(sc.hasNextLine())
    {
        String s = sc.nextLine();
        while(!Character.isWhitespace(s.charAt(p)))
        {
            p++;
        }
        word = s.substring(0,p);
        tag = s.substring(p+1,s.length());
        
        if(p > 5 && word.substring(p-5, p).equals("માંથી"))
        {
        	word = word.substring(0, p-5);
        }
        else if(p > 3 && word.substring(p-3,p).equals("માં"))
        {
        	word = word.substring(0,p-3);
        }
        else if((p > 2) && (word.substring(p-2,p).equals("થી") || word.substring(p-2,p).equals("ની" ) || word.substring(p-2,p).equals("નો" ) || word.substring(p-2,p).equals("ના" ) || word.substring(p-2,p).equals("નું" ) ))
        {
        	word = word.substring(0,p-2);
        }
        p = word.length();
        
       switch(tag)
        {
        case "N_NN" : 
                    if(word.substring(p-1,p).equals("ી"))
                    {
                        System.out.println(word + " " + tag + " Feminine" + " Singular");
                    }    
                    if(word.substring(p-1,p).equals("ા"))
                    {
                        System.out.println(word + " " + tag + " Masculine" + " Plural");
                    } 
                    if(word.substring(p-1,p).equals("ો"))
                    {
                        System.out.println(word + " " + tag + " Masculine" + " Singular");
                    }
                    
                    if(p>2)
                    {
	                    if(word.substring(p-2,p).equals("ાઓ"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Plural");
	                    }
	                    if(word.substring(p-2,p).equals("ીઓ"))
	                    {
	                        System.out.println(word + " " + tag + " Feminine" + " Plural");
	                    }
	                    if(word.substring(p-2,p).equals("ાં"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Plural");
	                    }  
	                    if(word.substring(p-2,p).equals("ું"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Singular");
	                    }
                    }           
                    
                    if(p>3)
                    {
                    	if(word.substring(p-3,p).equals("ાંઓ"))
                    		 System.out.println(word + " " + tag + " Neuter" + " Plural");
                    }
                    
                    else
                    {
                    	System.out.println(word + " " + tag + " M" + " Singular");
                    }
                    break;
  
        case "JJ" : 
                    if(word.substring(p-1,p).equals("ો"))
                    {
                        System.out.println(word + " " + tag + " Masculine" + " Singular");
                    }
                    if(word.substring(p-1,p).equals("ા"))
                    {
                        System.out.println(word + " " + tag + " Masculine" + " Plural");
                    }
                    if(word.substring(p-1,p).equals("ી"))
                    {
                        System.out.println(word + " " + tag + " Feminine" + " Singular/Plural");
                    }
                    
                    if(p>2)
                    {
	                    if(word.substring(p-2,p).equals("ું"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Singular");
	                    }        
	                    if(word.substring(p-2,p).equals("ાં"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Plural");
	                    }
                    }
                    
                    else
                    {
                    	System.out.println(word + " " + tag + " M" + " Singular");
                    }
                    break;
        
        case "V_VM" : //Past Progressive
                    if(p>2)
                    {
	        			if(word.substring(p-2,p).equals("તો") || word.equals("તો"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Singular");        
	                    }
	                    if(word.substring(p-2,p).equals("તી"))
	                    {
	                        System.out.println(word + " " + tag + " Feminine" + " Singular/Plural");
	                    }
	                    if(word.substring(p-2,p).equals("તા"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Plural");
	                    }
                    }
                    
                    if(p>3)
                    {
	                    if(word.substring(p-3,p).equals("તું")|| word.equals("તું"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Singular");
	                    }
	                    if(word.substring(p-3,p).equals("તાં")|| word.equals("તાં"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Plural");
	                    }
                    }
                            
                   
                    
                    //Past Perfect
                    if(p>2)
                    {
	                    if(word.substring(p-2,p).equals("યા"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Plural");        
	                    }
	                    if(word.substring(p-2,p).equals("યો"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Singular");
	                    }
	                    if(word.substring(p-2,p).equals("ચી"))
	                    {    
	                        System.out.println(word + " " + tag + " Feminine" + " Singular/Plural");
	                    }
                    }
                    
                    if(p>3)
                    {
	                    if(word.substring(p-3,p).equals("યું"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Singular");
	                    }        
	                    if(word.substring(p-3,p).equals("યાં"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Plural");
	                    }
                    }
       
                    //past plu-prefective
                    if(p>2)
                    {
	                    if(word.substring(p-2,p).equals("લા"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Plural");        
	                    }
	                    if(word.substring(p-2,p).equals("લો"))
	                    {
	                        System.out.println(word + " " + tag + " Masculine" + " Singular");
	                    }
	                    if(word.substring(p-2,p).equals("લી"))
	                    {    
	                        System.out.println(word + " " + tag + " Feminine" + " Singular/Plural");
	                    }
                    }
                    
                    if(p>3)
                    {
	                    if(word.substring(p-3,p).equals("લું"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Singular");
	                    }
	                    if(word.substring(p-3,p).equals("લાં"))
	                    {
	                        System.out.println(word + " " + tag + " Neuter" + " Plural");
	                    }
	                    if(word.substring(p-3,p).equals("વું"))
	                    {
	                    	System.out.println(word + " " + tag + "Infinitive Verbs");
	                    }
                    }
                    
                    break;
                    
       case "PR_PRP" : //genitive personal pronouns
        			if(p>2)
        			{
			        	if(word.substring(p-2,p).equals("રા"))
			            {
			                System.out.println(word + " " + tag + " Masculine" + " Plural");        
			            }
			            if(word.substring(p-2,p).equals("રો"))
			            {
			                System.out.println(word + " " + tag + " Masculine" + " Singular");
			            }
			            if(word.substring(p-2,p).equals("રી"))
			            {    
			                System.out.println(word + " " + tag + " Feminine" + " Singular/Plural");
			            }
        			}
        			
		            if(p>3)
		            {
		            	if(word.substring(p-3,p).equals("રું"))
		            	{
		                System.out.println(word + " " + tag + " Neuter" + " Singular");
		            	}
		            	if(word.substring(p-3,p).equals("રાં"))
		                {
		                    System.out.println(word + " " + tag + " Neuter" + " Plural");
		                }
		            }
		           break;
            
        default : break;
        }
        p=0;
    }     
    sc.close();
  }
}
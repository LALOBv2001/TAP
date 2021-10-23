package Ejercicio;
import java.util.*;

public class Pila
{
	
	public static void main(String[] args)
	{
		Stack<String> varPila=new Stack<String>();
		String varExpresion="(4+3)*(10/5)";
	    char vector=' ';
	    int FlagError=0;
	    for(int x=0;x<varExpresion.length();x++)
	    {
	    	System.out.print(varExpresion.charAt(x));
	    	vector=varExpresion.charAt(x);
	    	if(vector=='(') {varPila.push("abre");}
	    	if(vector==')')
	    	{
	          if(varPila.size()==0)
	          {
	           FlagError=1;	
	        	break;
	          }
	         else 
	         {
	          varPila.pop();	
	         }
	    	}
	    }
	    if(varPila.isEmpty()&& FlagError==0)
	    {
	    	System.out.print("La expresion es correcta");	
	    }
	    else 
	    {
	    	System.out.print("La expresion es incorrecta");		
	    }
	   
	}
	
	

}

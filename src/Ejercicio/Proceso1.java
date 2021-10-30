package Ejercicio;
import javax.swing.*;

public class Proceso1 extends Thread {
    @Override 
	public void run()
    {
    	 for(int i=0;i<=5;i++)
    	 {
    		 System.out.println("Proceso 1");		
    	 }
	}
    public void Incremento(JProgressBar B)
    {
    	 int i=0;
 	    try 
 	    {
 	    	while(i<=100)
 		    {
 	    		Thread.sleep(1000);
 		    	i+=10;
 		    	B.setValue(i);
 		    }
 	    }
 	    catch(Exception ex)
 	    {
 	    	System.err.println(ex.getMessage());
 	    }
	}
}

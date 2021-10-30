package Ejercicio;
import javax.swing.*;

public class ProgressBar extends JFrame {
	static JFrame Ventana;
	static JPanel Panel;
	static JProgressBar Barra; 
 	
	public static void main(String[] args) {
		Ventana=new JFrame("Ventana Eduardo Perez Escobar 19100236");
	    Panel=new JPanel();
	    Barra=new JProgressBar();
	    
	    Barra.setStringPainted(true);
	    Barra.setValue(0);
	    
	    Panel.add(Barra);
	    
	    Ventana.add(Panel);
	    Ventana.setBounds(500,400, 500, 200);
	    Ventana.setVisible(true);
		Proceso1 mihilo=new Proceso1();

	    mihilo.start();
	    mihilo.Incremento(Barra);
	     
	
	}

}

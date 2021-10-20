package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VentanaCuestionario extends JFrame {

	private JPanel contentPane;
	String[] arregloPreguntas= {"Le indica al sistema operativo dónde están los archivos ejecutables (*.exe):","Significado de las siglas GUI:","Significado de las siglas AWT","sirve oara para crear aplicaciones simples de escritorio que no requieran conexión a servidoro \n a bases de datos, creación de interfaces de usuario y juegos sencillos:","Significado de las siglas JVM:"};
	  int ContadorRespuestasCorrectas=0,ContadorCuestionario=0;
	String[] arregloRespuestas1= {"PATH","Graphical User Interface","Abstract Window Toolkit","Java SE","Java Virtual Machine"};
	String[] arregloRespuestas2= {"JAVA_HOME","Graphical User intermittent","Abstract Window Tree","Java SS","Java Virtual Maricarmen"};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCuestionario frame = new VentanaCuestionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		  
	}

	/**
	 * Create the frame.
	 */
	public VentanaCuestionario() {
		setTitle("19100236 EDUARDO PEREZ ESCOBAR ");
		 
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPregunta = new JLabel("Le indica al sistema operativo d\u00F3nde est\u00E1n los archivos ejecutables (*.exe):");
		lblPregunta.setBounds(10, 3, 543, 60);
		contentPane.add(lblPregunta);
		
		JRadioButton rdbRespuesta1 = new JRadioButton("PATH");
		rdbRespuesta1.setBounds(51, 71, 220, 23);
		contentPane.add(rdbRespuesta1);
		
		JRadioButton rdbRespuesta2 = new JRadioButton("JAVA_HOME");
		rdbRespuesta2.setSelected(true);
		rdbRespuesta2.setBounds(51, 100, 276, 23);
		contentPane.add(rdbRespuesta2);
		
		JButton btnAceptar = new JButton("Siguiente");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbRespuesta1.isSelected())
				{
					ContadorRespuestasCorrectas++;
				}
				ContadorCuestionario++;
				switch(ContadorCuestionario)
				{
				case 0: 
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
				case 1:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());

					;break;
				case 2:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
				case 3:lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
				rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
				rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
				      ;break;
				case 4:lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
				rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
				rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
		 	}
				 
		  }
				});
		btnAceptar.setBounds(202, 147, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnResultados = new JButton("Resultados ");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(contentPane, "Su puntuacion es: "+ContadorRespuestasCorrectas );;

			}
		});
		btnResultados.setBounds(202, 213, 125, 23);
		contentPane.add(btnResultados);
		
		ButtonGroup radRespuestas=new ButtonGroup();
		radRespuestas.add(rdbRespuesta1);
		radRespuestas.add(rdbRespuesta2);
		
		JButton btnRetroceder = new JButton("Retroceder");
		btnRetroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContadorCuestionario--;
				switch(ContadorCuestionario)
				{
				case 0: 
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
				case 1:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());

					;break;
				case 2:
					lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
					rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
				case 3:lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
				rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
				rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
				      ;break;
				case 4:lblPregunta.setText(arregloPreguntas[ContadorCuestionario].toString());
				rdbRespuesta1.setText(arregloRespuestas1[ContadorCuestionario].toString());
				rdbRespuesta2.setText(arregloRespuestas2[ContadorCuestionario].toString());
					;break;
		 	}
			}
		});
		btnRetroceder.setBounds(71, 147, 105, 23);
		contentPane.add(btnRetroceder);
		
		JButton btnSalr = new JButton("Salr");
		btnSalr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalr.setBounds(335, 147, 89, 23);
		contentPane.add(btnSalr);
	}
}

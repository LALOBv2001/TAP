package Ejercicio;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class VentanaPila extends JFrame {
	String AcumuladorPalabra="";

	private JPanel contentPane;
	private JTextField txtExpresion;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPila frame = new VentanaPila();
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
	public VentanaPila() {
		setTitle("EDURDO P\u00C9REZ ESCOBAR 19100236");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtExpresion = new JTextField();
		txtExpresion.setBounds(5, 36, 362, 26);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese la expresion algebraica con parentesis ");
		lblNewLabel.setBounds(5, 11, 270, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcumuladorPalabra=" ";
				Stack<String> varPila=new Stack<String>();
				String varExpresion=txtExpresion.getText();
			    char vector=' ';
			    int FlagError=0;
			    for(int x=0;x<varExpresion.length();x++)
			    {
			    	AcumuladorPalabra+=(varExpresion.charAt(x));
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
			    	 
			    	AcumuladorPalabra+=" La expresion es correcta";
			    	txtResultado.setText(AcumuladorPalabra);	
			    }
			    else 
			    {
			    	AcumuladorPalabra+=" La expresion es incorrecta";
			    	txtResultado.setText(AcumuladorPalabra);
			    }
				
			}
		});
		btnIngresar.setBounds(79, 73, 143, 23);
		contentPane.add(btnIngresar);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(5, 107, 362, 26);
		contentPane.add(txtResultado);
	}
}

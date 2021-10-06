package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaNueva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNueva frame = new VentanaNueva();
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
	public VentanaNueva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Maculino");
		rdbtnMasculino.setBounds(6, 50, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(6, 87, 109, 23);
		contentPane.add(rdbtnFemenino);
		ButtonGroup radSexo=new ButtonGroup();
		radSexo.add(rdbtnFemenino);
		radSexo.add(rdbtnMasculino);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMasculino.isSelected())
				{
					JOptionPane.showMessageDialog(contentPane, "Confirma, el sexo es"+rdbtnMasculino.getText() );;
				}
				if(rdbtnFemenino.isSelected())
				{
					JOptionPane.showMessageDialog(contentPane, "Confirma, el sexo es"+rdbtnMasculino.getText() );;
				}
			}
		});
		btnAceptar.setBounds(78, 214, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(324, 227, 89, 23);
		contentPane.add(btnSalir);
	}
}

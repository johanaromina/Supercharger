package seminarioProgramacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class VentanaTaller extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaTaller(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnCargarFicha = new JButton("Cargar ficha");
		btnCargarFicha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCargarFicha, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCargarFicha, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCargarFicha, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCargarFicha, 180, SpringLayout.WEST, contentPane);
		contentPane.add(btnCargarFicha);
						
		JButton btnImprimirConformidad = new JButton("Imprimir conformidad");
		btnImprimirConformidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnImprimirConformidad, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnImprimirConformidad, 200, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnImprimirConformidad, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnImprimirConformidad, 350, SpringLayout.WEST, contentPane);
		contentPane.add(btnImprimirConformidad);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -22, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -22, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
	}
}

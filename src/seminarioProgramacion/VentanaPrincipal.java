package seminarioProgramacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaPrincipal(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnRecepcion = new JButton("Recepción");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRecepcion, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRecepcion, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRecepcion, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRecepcion, 180, SpringLayout.WEST, contentPane);
		btnRecepcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaRecepcion frame = new VentanaRecepcion("Recepción");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnRecepcion);
		
		JButton btnAdministracion = new JButton("Administración");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAdministracion, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAdministracion, 200, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAdministracion, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAdministracion, 350, SpringLayout.WEST, contentPane);
		btnAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaAdministracion frame = new VentanaAdministracion("Administración");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnAdministracion);
		
		JButton btnTaller = new JButton("Taller");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTaller, 40, SpringLayout.SOUTH, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTaller, 0, SpringLayout.WEST, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTaller, 100, SpringLayout.SOUTH, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTaller, 0, SpringLayout.EAST, btnRecepcion);
		btnTaller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaTaller frame = new VentanaTaller("Taller");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnTaller);
		
		JButton btnRRHH = new JButton("Recursos humanos");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRRHH, 40, SpringLayout.SOUTH, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRRHH, 0, SpringLayout.WEST, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRRHH, 100, SpringLayout.SOUTH, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRRHH, 0, SpringLayout.EAST, btnAdministracion);
		btnRRHH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(btnRRHH);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSalir, -34, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSalir, -35, SpringLayout.EAST, contentPane);
		contentPane.add(btnSalir);
	}
}

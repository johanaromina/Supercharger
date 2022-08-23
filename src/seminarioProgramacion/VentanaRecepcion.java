package seminarioProgramacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRecepcion extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public VentanaRecepcion(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnConsultarAgenda = new JButton("Consultar agenta");
		btnConsultarAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnConsultarAgenda, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnConsultarAgenda, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnConsultarAgenda, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnConsultarAgenda, 180, SpringLayout.WEST, contentPane);
		contentPane.add(btnConsultarAgenda);
				
		JButton btnRegistrarAsistencia = new JButton("Registrar asistencia");
		btnRegistrarAsistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRegistrarAsistencia, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRegistrarAsistencia, 200, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRegistrarAsistencia, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRegistrarAsistencia, 350, SpringLayout.WEST, contentPane);
		contentPane.add(btnRegistrarAsistencia);
		
		JButton btnListarTrabajos = new JButton("Listado trabajos realizados");
		btnListarTrabajos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnListarTrabajos, 40, SpringLayout.SOUTH, btnConsultarAgenda);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnListarTrabajos, 0, SpringLayout.WEST, btnConsultarAgenda);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnListarTrabajos, 100, SpringLayout.SOUTH, btnConsultarAgenda);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnListarTrabajos, 0, SpringLayout.EAST, btnConsultarAgenda);
		contentPane.add(btnListarTrabajos);
		
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

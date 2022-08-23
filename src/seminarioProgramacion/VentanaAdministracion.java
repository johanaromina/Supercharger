package seminarioProgramacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class VentanaAdministracion extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaAdministracion(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnEmitirInforme = new JButton("Emitir informe");
		btnEmitirInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEmitirInforme, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnEmitirInforme, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnEmitirInforme, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEmitirInforme, 180, SpringLayout.WEST, contentPane);
		contentPane.add(btnEmitirInforme);
						
		JButton btnGestionarLiquidaciones = new JButton("Gestionar liquidaciones");
		btnGestionarLiquidaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGestionarLiquidaciones, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnGestionarLiquidaciones, 200, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnGestionarLiquidaciones, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGestionarLiquidaciones, 350, SpringLayout.WEST, contentPane);
		contentPane.add(btnGestionarLiquidaciones);
		
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

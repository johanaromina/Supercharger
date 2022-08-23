package seminarioProgramacion;

import java.awt.EventQueue;

public class Supercharger {

	public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					
					try {
						
						VentanaPrincipal frame = new VentanaPrincipal("Ventana principal");
						frame.setVisible(true);
					} catch (Exception e) {
						
						e.printStackTrace();
						LogErrores.escribirLog("Error al intentar abrir la ventana principal.");
					}
				}
			});
	}
}

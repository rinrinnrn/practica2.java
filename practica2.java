import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class practica2 {
    public static void main(String[] args) {
        
        // Crear ventana
        JFrame ventana = new JFrame("Datos del Alumno");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear panel
        JPanel panel = new JPanel();
        
        // Crear etiquetas con la información
        JLabel nombre = new JLabel("Nombre Alumno: Darina Acosta Sanchez");
        JLabel grupo = new JLabel("Grupo: 25a");
        JLabel turno = new JLabel("Turno: Matutino");
        JLabel anio = new JLabel("Año de ejecución: 2026");

        // Agregar etiquetas al panel
        panel.add(nombre);
        panel.add(grupo);
        panel.add(turno);
        panel.add(anio);

        // Agregar panel a la ventana
        ventana.add(panel);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
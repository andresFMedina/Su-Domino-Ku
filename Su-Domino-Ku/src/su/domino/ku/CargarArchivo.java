//Oscar Alexander Ruiz Palacio 201667600
//Andres Felipe Medina Tascon  201667602
//Andres Felipe Gonzalez Rojas 201759599
package su.domino.ku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

//Metodo para cargar el archivo
public class CargarArchivo {

    public ArrayList CargarArchivo() {
        ArrayList<String> datos = new ArrayList<String>();
        try {
            String carpeta = "" + System.getProperty("user.dir") + "\\Tableros";
            JFileChooser se;
            se = new JFileChooser(carpeta);
            se.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int estado = se.showOpenDialog(null);
            if (estado == JFileChooser.APPROVE_OPTION) {
                String ruta = "" + se.getSelectedFile();
                File f = new File(ruta);
                BufferedReader br = new BufferedReader(new FileReader(f));
                int i = 0;
                while (br.ready()) {
                    datos.add(br.readLine());
                }
            } else if (estado == JFileChooser.CANCEL_OPTION
                    || estado == JFileChooser.ERROR_OPTION) {
            }
        } catch (Exception e) {
        }
        return datos;
    }
}

package Emailapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controlador {
    public void crearVerificarCSV() {
        File inventarioTienda = new File("dispositivos.csv");
        if (!inventarioTienda.exists()) {
            try {
                inventarioTienda.createNewFile();
                System.out.println("Todo listo para empezar...");
                FileWriter fw = new FileWriter(inventarioTienda, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Nombre, Apellido, Departamento, Contraseña, Correo");
                bw.newLine();
                bw.close();

            } catch (IOException e) {
                System.out.println("Error encontrado: " + e.getMessage());
            }
        }
    }

    public void agregarDatosCSV(String firstName, String lastName, String password, String department, String email){
        String archivo = "dispositivos.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))){
            writer.write(firstName + "," + lastName + "," + password + "," + department + "," + email);
            writer.newLine();
            System.out.println("Dato agregado con éxito.");
        } catch(IOException e){
            System.out.println("Error al escribir: "+ e.getMessage());
        }
    }
    
    public void leerDatosCSV(){
    String archivo="";
    }

}

package Emailapp;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

import java.io.FileReader;

import java.io.FileReader;

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
    
    public void leerDatosCSV() {
        String archivo = "dispositivos.csv";
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // Assuming the CSV structure is: "Nombre, Apellido, Departamento, Contraseña, Correo"
                String nombre = nextLine[0];
                String apellido = nextLine[1];
                String departamento = nextLine[2];
                String contraseña = nextLine[3];
                String correo = nextLine[4];

                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Departamento: " + departamento);
                System.out.println("Contraseña: " + contraseña);
                System.out.println("Correo: " + correo);
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

}

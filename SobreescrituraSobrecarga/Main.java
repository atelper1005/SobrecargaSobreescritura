package SobreescrituraSobrecarga;

import SobreescrituraSobrecarga.Abuela;
import SobreescrituraSobrecarga.Hija;
import SobreescrituraSobrecarga.Madre;

public class Main {

    public static void main(String[] args) {
        // Objeto de la clase abuela
        Abuela a1 = new Abuela("Laura", 71, "Fernández");
        //a1.saludar();

        //Objeto de la clase madre
        Madre m1 = new Madre("Carmen", 52, "Gónzalez", "peluquera");
        m1.saludar();
        m1.trabajo();

        //Objeto de la clase hija. Método de clase no sobrecargado
        Hija h1 = new Hija("María", 23, "Alvarez", "dependienta", "moreno");
        h1.saludar();
        h1.colorDePelo();
    }
}

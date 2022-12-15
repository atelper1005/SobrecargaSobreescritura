package SobreescrituraSobrecarga;

import SobreescrituraSobrecarga.Abuela;

public class Madre extends Abuela {
    private String trabajo;

    public Madre() {
    }

    public Madre(String nombre, int edad, String apellido, String trabajo) {
        super(nombre, edad, apellido);
        this.trabajo = trabajo;
    }

    @Override
    void saludar() {
        super.saludar();
        System.out.print(", y trabajo como " + trabajo + "\n");
    }

    void trabajo() {
        System.out.println("Trabajar de " + trabajo + " me gusta mucho");
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
}

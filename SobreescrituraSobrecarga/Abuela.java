package SobreescrituraSobrecarga;

public class Abuela {
    private String nombre;
    private int edad;
    private String apellido;

    public Abuela(String apellido) {
        this.apellido = "González";
    }

    public Abuela() {

    }

    public Abuela(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    void saludar() {
        System.out.print("Hola mi nombre es " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}

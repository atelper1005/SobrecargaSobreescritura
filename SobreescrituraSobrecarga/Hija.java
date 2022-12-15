package SobreescrituraSobrecarga;

public class Hija extends Madre {

    private String color_pelo;

    public Hija(String nombre, int edad, String apellido, String trabajo, String color_pelo) {
        super(nombre, edad, apellido, trabajo);
        this.color_pelo = color_pelo;
    }

    @Override
    void saludar() {
        super.saludar();
        System.out.print(". Tengo el pelo " + color_pelo + "\n");
    }

    void colorDePelo() {
        System.out.println("Quiero ponerme el pelo de otro color");
    }
}

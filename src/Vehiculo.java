import java.util.Scanner;

abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String combustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public abstract void encender ();
    public abstract void apagar();
    public String combustible(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tipo de combustible");
        return combustible;
    }
    public abstract void mostrarInfo(String marca, String modelo, String combustible);
}

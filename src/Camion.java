class Camion extends Vehiculo{

    @Override
    public void encender() {

        System.out.println("Camion Encendido");

    }

    @Override
    public void apagar() {

        System.out.println("Camion Apagado");

    }

    @Override
    public void mostrarInfo(String marca,String modelo,String combustible) {

        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Combustible = " + combustible);
    }
}

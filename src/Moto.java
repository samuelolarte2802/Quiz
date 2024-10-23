class Moto extends Vehiculo {

    @Override
    public void encender() {

        System.out.println("Moto Encendida");

    }

    @Override
    public void apagar() {

        System.out.println("Moto Apagada");

    }

    @Override
    public void mostrarInfo(String marca,String modelo,String combustible) {

        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Combustible = " + combustible);
    }
}

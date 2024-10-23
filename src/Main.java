import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();
        int opc = 0;
        do {

            System.out.println("""
                    Vehiculos
                    1)Carro
                    2)Camion
                    3)Moto
                    4)Carro Electrico
                    A que vehiculo desea ingresar: """);
            opc = scan.nextInt();

            switch (opc){

                case 1:
                    String opc2;
                    System.out.println("""
                            Carro
                            1)Encender
                            2)Apagar
                            3)Combustible
                            4)Mostrar Informacion""");
                    opc2 = scan.next();
                    switch (opc2){

                        case "1":
                            carro.encender();
                            break;

                        case "2":
                            carro.apagar();
                            break;
                        case "3":
                            carro.combustible();
                            break;
                        case "4":
                            System.out.println("Introduzca la marca del carro");
                            String marca = scan.next();
                            System.out.println("Introduzca el modelo del carro");
                            String modelo = scan.next();
                            carro.mostrarInfo(String marca, String modelo);
                            break;

                    }
                break;
            }

        }while(opc != 5);

    }
}
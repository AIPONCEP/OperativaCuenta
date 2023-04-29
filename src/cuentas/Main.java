package cuentas;

/**
 * @author Ana Isabel Ponce Pérez
 * @since 28/04/2023
 */

public class Main {
/**
 * Clase Main.
 * @param args 
 */
    public static void main(String[] args) {
        operativa_cuenta((float) 10.00);
    }

    /**
     * Operativa cuenta, ingresa y retira una cantidad de tu cuenta
     * @param cantidad 
     */
    private static void operativa_cuenta(float cantidad) {

        Cuenta cuenta1 = new Cuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        System.out.println("El saldo actual es "+cuenta1.estado());

        try {
            cuenta1.retirar(230000);
        } catch (Exception e) {
            System.out.print("Fallo al retirar\n");
        }
        try {
            System.out.println("Ingreso en cuenta\n");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar\n");
        }
    }
}

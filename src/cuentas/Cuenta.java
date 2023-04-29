package cuentas;

/**
 * @author Ana Isabel Ponce Pérez
 * @since 28/04/2023
 */
public class Cuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipointeres;

    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre=nom;
        this.cuenta=cue;
        this.saldo=sal;
        this.tipointeres=tipo;
    }
    
    /**
     * Metodo estado()
     * @return devuelve el saldo
     */
    public double estado(){
        return saldo;
    }
    
    /**
     * Metodo ingresar
     * Si entra en los if no permite ingresar, sino a saldo le suma la cantidad.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
            saldo = saldo + cantidad;
    }
    
    /**
     * Metodo retirar
     * Si entra en los if no permite retirar cantidad y sino la resta al saldo.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
            saldo = saldo - cantidad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipointeres() {
        return tipointeres;
    }

    public void setTipointeres(double tipointeres) {
        this.tipointeres = tipointeres;
    }
}

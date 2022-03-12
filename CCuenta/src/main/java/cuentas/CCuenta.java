package cuentas;

/**
 * 
 * @author DAM - I.E.S. Alonso de Avellaneda
 * @version 1.0
 * @since 12/03/2022
 *
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

/**
 * 
 * @param nom Nombre del titular de la cuenta
 * @param cue Número de cuenta
 * @param sal Establece el saldo inicial de la cuenta
 * @param tipo Tipo de cuenta
 * @param cantidad Cantidad de cuentas
 */
    public CCuenta(String nom, String cue, double sal, double tipo, float cantidad)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * Sirve para comprobar el saldo de la cuenta
 * @return Devuelve el saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }

/**
 * 
 * @param cantidad Cantidad de dinero a ingresar en la cuenta
 * @throws Exception Si la cantidad es negativa se disparará una excepción advirtiendo de que no es posible
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

/**
 * 
 * @param cantidad Saldo a retirar
 * @throws Exception Si la cantidad a retirar es mayor que el saldo siponible se disparará la excepción avisando de ello.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

/**
 * Sirve para obtener el nombre del titular de la cuenta
 * @return Devuelve el nombre del titular de la cuenta
 */
	private String getNombre() {
		return nombre;
	}
	
/**
 * Establece el nombre del titular de la cuenta
 * @param nombre Nombre del titular de la cuenta
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 * Recupera el número de cuenta
 * @return Devuelve el número de cuenta
 */
	private String getCuenta() {
		return cuenta;
	}

/**
 * Establece el número de cuenta
 * @param cuenta Número de cuenta del titular
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
 * Obtiene el saldo de la cuenta
 * @return Devuelve el saldo de la cuenta
 */
	private double getSaldo() {
		return saldo;
	}

/**
 * Establece el saldo de la cuenta
 * @param saldo Saldo a establecer en la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
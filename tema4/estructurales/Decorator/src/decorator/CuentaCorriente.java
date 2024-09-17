package decorator;


public class CuentaCorriente implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abrió una cuenta Corriente");
		System.out.println("Cliente: " + c.getCliente());		
	}

}

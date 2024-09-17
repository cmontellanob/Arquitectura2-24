package decorator;


public abstract class CuentaDecorador implements ICuentaBancaria{

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuenta) {
		this.cuentaDecorada = cuenta;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}	
	
}

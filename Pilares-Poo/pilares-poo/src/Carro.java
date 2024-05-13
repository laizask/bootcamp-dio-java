
public class Carro extends Veiculo{
	
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel");
	}
	private void confereCambio() {
		System.out.println("Conferindo Cambio em P");
	}

}

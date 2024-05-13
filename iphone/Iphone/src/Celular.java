
public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
        Celular meuCelular = new Celular();
        
        System.out.println("Reprodutor Musical: ");
        meuCelular.tocar();
        meuCelular.pausar();
        meuCelular.selecionarMusica(null);
        
        System.out.println("Aparelho Telefonico: ");
        meuCelular.ligar();
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();
        
        System.out.println("Navegador de Internet: ");
        meuCelular.exibirPagina(null);
        meuCelular.adicionarNovaAba(null);
        meuCelular.atualizarPagina();
        
	}
	public void exibirPagina(String url) {
		System.out.println("Exibindo Página");
	}

	
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova Aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Página");
	}

	
	public void ligar() {
		System.out.println("Ligando...");
	}

	
	public void atender() {
		System.out.println("Atendendo ligação");	
	}


	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
	}

	
	public void tocar() {
		System.out.println("Tocando música");		
	}

	
	public void pausar() {
		System.out.println("Pausando música");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música");

	}
}

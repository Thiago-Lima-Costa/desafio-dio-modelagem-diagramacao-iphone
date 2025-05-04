
public class Main {

	public static void main(String[] args) {
		
		IPhone IPhone = new IPhone();
		
		IPhone.selecionarMusica("Última Canção");
		IPhone.tocar();
		IPhone.pausar();
		
		IPhone.atender();
		IPhone.iniciarCorreioVoz();
		IPhone.ligar("9999-9999");
		
		IPhone.exibirPagina("www...");
		IPhone.atualizarPagina();
		IPhone.adicionarNovaAba();

	}

}

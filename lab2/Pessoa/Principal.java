
public class Principal {

	public static void main(String[] args) {
		// 4. instanciar 2 objetos pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		// 5. imprimir atributos das pessoas com acesso (USO DO PONTO) a metodos get
		System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade());
		System.out.println(pessoa2.getNome() + " " + pessoa2.getIdade());
		
		// 6. modificar atributos das pessoas com acesso (USO DO PONTO) a metodos set
		pessoa1.setNome("Maria");
		pessoa2.setIdade(21);
		
		// 7. imprimir dados com acesso (USO DO PONTO) ao metodo imprimir dados
		pessoa1.imprimirDados();
		pessoa2.imprimirDados();
	}
}

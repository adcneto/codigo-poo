public class Pessoa {

	// 1. declaracao de atributos
	String nome;
	int idade;
	
	// 2. declaracao do construtor default (sem argumentos)
	public Pessoa() {
		// inicializacao de atributos
		nome = "";
		idade = 0;
	}

	// 3. declaracao de metodos get e set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	// 3. declaracao de metodo imprimir dados
	public void imprimirDados() {
		System.out.println(nome + " " + idade);
	}
	
}

package pt.com.app.agenda;

public class Contato {

	private String nome;
	private String numTelemovel;

	public Contato(String nome, String numTelemovel) {
		super();
		this.nome = nome;
		this.numTelemovel = numTelemovel;

	}

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumTelemovel() {
		return numTelemovel;
	}

	public void setNumTelemovel(String numTelemovel) {
		this.numTelemovel = numTelemovel;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numTelemovel=" + numTelemovel + ", identificador=" + "]";
	}

}

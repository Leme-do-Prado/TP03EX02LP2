public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
	boolean emprestado = false;
	String localizacao;
	
	public LivroDeBiblioteca() {
		super();
		this.localizacao = " ";
	}
	
	public LivroDeBiblioteca(String t, String a, String e, short ae, String l) {
		super(t, a, e, ae);
		this.localizacao = l;
	}
	
	public String getDados() {
		return "Titulo = " + this.titulo + "Autor = " + this.autor + "Editora = "+ this.editora + "Ano = " +this.anoedicao + "Localização: " + this.localizacao;
	}
	
	public void Empresta() {
			this.emprestado = true;
	}
	
	public void Devolve() {
			this.emprestado = false;
	}

	public boolean getEmprestado() {
		return this.emprestado;
	}

	public String getLocalizacao() {
		return this.localizacao;

	}
	
	public void setLocalizacao(String l) {
		this.localizacao = l;
	}
}

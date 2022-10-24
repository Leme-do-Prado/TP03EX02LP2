public class Livro {
	String titulo;
	String autor;
	String editora;
	short anoedicao;
	
	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.editora = "";
		this.anoedicao = 0;
	}
	
	public Livro(String t, String a, String e, short ae) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoedicao = ae;
	}
	
			public void setTitulo(String t) {
				this.titulo = t;
			}
	
			public void setAutor(String a) {
				this.autor = a;
			}
	
			public void setEditora(String e) {
				this.editora = e;
			}
	
			public void setAnoEdicao(short ae) {
				this.anoedicao = ae;
			}
	
			public String getTitulo() {
			return this.titulo;
			}
			
			public String getAutor() {
				return this.autor;
			}
			
			public String getEditora() {
				return this.editora;
			}
			
			public short getAnoEdicao() {
				return this.anoedicao;
			}
	
			public String getDados() {
				return "Titulo = " + this.titulo + "Autor = " + this.autor + "Editora = "+ this.editora + "Ano = " +this.anoedicao;			
			}
}

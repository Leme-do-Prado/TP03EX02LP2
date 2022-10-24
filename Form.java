import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Form extends Frame implements ActionListener {
	Label lbltitulo = new Label("Titulo: "), lblautor = new Label("Autor: "), lbleditora = new Label("Editora: "), lblanoedicao = new Label("Ano edicao: "), lbllocalizacao = new Label("Localização: "), lblstatus = new Label("Status: ");
	TextField tftitulo = new TextField(""), tfautor = new TextField(""), tfeditora = new TextField(" "), tfanoedicao = new TextField(" "), tflocalizacao = new TextField(" "), tfstatus = new TextField(" ");
	Button ok = new Button("OK"), empresta = new Button("Emprestar"), devolve = new Button("Devolve"), mostra = new Button("Mostrar"), sair = new Button("Sair");
	LivroDeBiblioteca x = new LivroDeBiblioteca();
	
	Form(String titulo, int largura, int altura, int colinic, int lininic ){
		super(titulo);
		setSize(largura,altura);
		setLocation(colinic,lininic);
		setLayout(new FlowLayout());
		
		add(lbltitulo);
		add(tftitulo);
		
		add(lblautor);
		add(tfautor);
		
		add(lbleditora);
		add(tfeditora);
		
		add(lblanoedicao);
		add(tfanoedicao);
		
		add(lbllocalizacao);
		add(tflocalizacao);
		
		add(lblstatus);
		add(tfstatus);
		
		add(ok);
		ok.addActionListener(this);
		add(empresta);
		empresta.addActionListener(this);
		add(devolve);
		devolve.addActionListener(this);
		add(mostra);
		mostra.addActionListener(this);
		add(sair);
		sair.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			String titulof = tftitulo.getText();
			String autorf = tfautor.getText();
			String editoraf = tfeditora.getText();
			short anoedicaof = Short.valueOf(tfanoedicao.getText());
			String localizacaof = tflocalizacao.getText();
		 
			x.setTitulo(titulof);
			x.setAutor(autorf);
			x.setEditora(editoraf);
			x.setAnoEdicao(anoedicaof);
			x.setLocalizacao(localizacaof);
			
			tftitulo.setText(" ");
			tfautor.setText(" ");
			tfeditora.setText(" ");
			tfanoedicao.setText(" ");
			tflocalizacao.setText(" ");

		}
		else if(e.getSource()==empresta) {
			x.Empresta();
		}
		else if(e.getSource()==devolve) {
			x.Devolve();
		}
		else if(e.getSource()==mostra) {
			tftitulo.setText(x.getTitulo());
			tfautor.setText(x.getAutor());
			tfeditora.setText(x.getEditora());
			tfanoedicao.setText(String.valueOf(x.getAnoEdicao()));
			tfstatus.setText(String.valueOf(x.getEmprestado()));
			tflocalizacao.setText(x.getLocalizacao());
		}
		else if(e.getSource()==sair) {
			dispose(); 
			System.exit(0);
		}
	}

}

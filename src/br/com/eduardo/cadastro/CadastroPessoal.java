package br.com.eduardo.cadastro;

public class CadastroPessoal extends Cadastro {
	private String cadastroNome;
	private String cadastroCpf;
	Cadastro identification;//teste
	public void setCadastroNome(String cadastroNome) {
		this.cadastroNome = cadastroNome;
		return ;
	}
	
	public String getCadastroNome() {
		return cadastroNome;
	}
	
	public void setCadastroCpf(String cadastroCpf) {
		this.cadastroCpf = cadastroCpf;
		return ;
	}
	
	public String getCadastroCpf() {
		return cadastroCpf;
	}
	
	@Override
	protected String cadastro() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}

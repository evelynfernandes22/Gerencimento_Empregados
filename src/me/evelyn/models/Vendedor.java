package me.evelyn.models;

public class Vendedor extends FuncionariosCLT implements InterfaceCalculaComissao {
	
	private Double valorComissao;
	
	
	public Vendedor() {
		super();
	}


	public Vendedor(String nome, String documento, Double valorSalario, Endereco endereco) {
		super(nome, documento, valorSalario, endereco);
	}


	public Vendedor(Double valorComissao) {
		super();
		this.valorComissao = valorComissao;
	}


	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", documento=" + documento
				+ ", valorSalario=" + valorSalario + "valorComissao=" + valorComissao + ", endereco=" + endereco + "]";
	}

	@Override
	public void calcularComissao(Double porcentagemComissao) {
		this.valorComissao = this.valorSalario * (porcentagemComissao/100);
		
	}

	
}

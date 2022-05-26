package me.evelyn.models;

public class Gerente extends FuncionariosPJ implements InterfaceCalculaComissao{
	
	private Double valorComissao;
	
	@Override
	public String toString() {
		return "FuncionariosPJ [nome=" + super.getNome() + ", documento=" + super.getDocumento() + ", endereco=" 
				+ super.getEndereco().getRua() + ", horasTrabalhadas=" + super.getHorasTrabalhadas()
				+ ", valorHora=" + super.getValorHora() + ", Valor da comissão="+ this.valorComissao +", valorRemuneracao="
				+ super.getValorRemuneracao() + "]";
	}

	@Override
	public void calcularComissao(Double porcentagemComissao) {
		this.valorComissao = super.getValorRemuneracao() * (porcentagemComissao/100) + 100d;
	}

}

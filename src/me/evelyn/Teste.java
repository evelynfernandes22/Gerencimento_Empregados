package me.evelyn;

import me.evelyn.models.Endereco;
import me.evelyn.models.Gerente;
import me.evelyn.models.OperadorDeCaixa;
import me.evelyn.models.Vendedor;

public class Teste {

	public static void main(String[] args) {
		/* Endereco end = new Endereco();
		end.setRua("Avenida dos passarinhos, 190");
		
		System.out.println("Endereço: " + end.getRua()); */
		
		Endereco enderecoGerente = new Endereco("Avenida dos passarinhos, 100,  ","Apto das alturas", " Pombal");
		System.out.println("Endereço: " + enderecoGerente.getRua() + enderecoGerente.getComplemento()
		+ enderecoGerente.getBairro());
	
		Endereco enderecoVendedor = new Endereco("Avenida dos coqueiros, 50,  ","Casa", " Vila dos Coquinhos");
		System.out.println("Endereço: " + enderecoVendedor.getRua() + enderecoVendedor.getComplemento()
		+ enderecoVendedor.getBairro());
		
		Endereco enderecoCaixa = new Endereco("Rua da Trindade, 1000,  ", "Casa da Salvação", " Glória");
		System.out.println("Endereço: " + enderecoCaixa.getRua() + enderecoCaixa.getComplemento()
		+ enderecoCaixa.getBairro());
		System.out.println("-------------------------------------------\n");
		
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Lucas");
		vendedor1.setDocumento("013.213.213-21");
		vendedor1.setValorSalario(5000.00);
		vendedor1.setEndereco(enderecoVendedor);
		
		vendedor1.calcularComissao(2d);
		
		System.out.println(vendedor1);
		System.out.println("\n-------------------------------------------\n");
		
		OperadorDeCaixa caixa = new OperadorDeCaixa("Zilda", "123.456.789-10", 3000d, enderecoCaixa);
		System.out.println(caixa);
		System.out.println("\n-------------------------------------------\n");
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Jessica");
		gerente1.setDocumento("432.321.789-50");
		gerente1.setEndereco(enderecoGerente);
		gerente1.setHorasTrabalhadas(220);
		gerente1.setValorHora(50d);
		
		gerente1.calcularSalario();  //chamada do método para calcular o valorRemuneração
		gerente1.calcularComissao(3d);
		
		System.out.println(gerente1);
		System.out.println("\n-------------------------------------------\n");
		
	}

	
}

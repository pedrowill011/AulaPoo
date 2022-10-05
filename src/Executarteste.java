import java.math.BigDecimal;

public class Executarteste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientaçao objeto");
		produto1.set(197.00);
		
		
		
		produto2.
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("venda curso Formaçao java");
		venda.setEnderecoDaEntrega("Entrega pelo Email");
		venda.setId(10L);
		venda.setNomeCliente("pedro");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
	    venda.getListaProdutos().add(produto1);
		
		System.out.println("descriçao da venda : " + venda.getDescricaoVenda());
		
	}
	
	
	
	
}

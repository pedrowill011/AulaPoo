import java.util.ArrayList;
import java.util.List;

public class Venda {

	
	private long id;
	
	private String descricaoVenda;
	
	private String nomeCliente;
	
	private String enderecoDaEntrega;

	private BigDecimal valorTotal;
		
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;	
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoDaEntrega() {
		return enderecoDaEntrega;
	}

	public void setEnderecoDaEntrega(String enderecoDaEntrega) {
		this.enderecoDaEntrega = enderecoDaEntrega;
	}



	/**
	 * @return the valorTotal
	 */
	public BigDecimal getValorTotal() {
		return valorTotal;
	}



	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
	
	
	
}

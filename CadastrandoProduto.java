
import java.util.ArrayList;
import java.util.List;

public class CadastrandoProduto {
	String NomeProduto;
	private Float valor1;
	private Float valor2;
	private Float resultado;
	private List<String> resultados = new ArrayList<String>();
	
	public Float getValor1() {
		return valor1;
	}
	public void setValor1(Float valor1) {
		this.valor1 = valor1;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String NomeProduto) {
		this.NomeProduto = NomeProduto;
	}
	public Float getValor2() {
		return valor2;
	}
	public void setValor2(Float valor2) {
		this.valor2 = valor2;
	}
	public Float getResultado() {
		return resultado;
	}
	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}
	public List<String> getResultados() {
		return resultados;
	}
	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	public void somar() {
		resultado = valor1 * valor2;
		resultados.add("\n 1-Nome do Produto:"+NomeProduto+" \n "+"2-Preço:"+valor1+" \n "+"3-Estoque:"+valor2+" \n "+"#Valor Total do Estoque:"+resultado+"R$ \n\n");
		
	}
	
		
}

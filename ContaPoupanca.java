package ContaBancaria;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContaPoupanca(int numero, String nome, Double saldo, Double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
		// TODO Auto-generated constructor stub
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	@Override
	public void saque(Double valor)
	{
		saldo = saldo -  valor;
	}

}

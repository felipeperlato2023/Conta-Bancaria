package ContaBancaria;

public class ContaCorrente extends Conta {

	private Double limiteSaque;

	public Double getlimiteSaque() {
		return limiteSaque;
	}

	public void setlimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int numero, String nome, double saldo,Double limiteSaque) {
		super(numero, nome, saldo);
		this.limiteSaque = limiteSaque;
		// TODO Auto-generated constructor stub
	}

	public void emprestimo(double valor) {
		if (valor <= limiteSaque) {
			saldo += valor - 10.0;
		}
		else
		{
			System.out.println("Valor limite insuficiente");
		}
		
	}
	
	@Override
	public void saque (Double valor)
		{
			super.saque(valor);
			saldo = saldo - 2.0;
		}
	}



package ContaBancaria;

public class Conta {
	
	public int numero;
    public String nome;
   protected Double saldo;
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public Conta(int numero, String nome, Double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	public void saque(Double valor)
	{
		saldo = saldo -  (valor + 5.0);
	}
	  
	public void deposito(Double valor)
	{
	    saldo += valor;
	}
	
}



package ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Conta c1 = new Conta(1010, "felipe", 500.0);

		c1.saque(300.0);

		Conta c2 = new ContaPoupanca(1010, "felipe", 500.0, 0.01);

		c2.saque(200.0);

		Conta c3 = new ContaCorrente(1010, "joao", 1000.0, 500.0);

		c3.saque(200.0);

		System.out.println("Conta normal: " + c1.saldo);

		System.out.println("Conta Poupança: " + c2.saldo);

		System.out.println("Conta Corrente: " + c3.saldo);
		
		c1.deposito(100.0);
		
		System.out.println("Conta normal: " + c1.saldo);
		
		

	}

}

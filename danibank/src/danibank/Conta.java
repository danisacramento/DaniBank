package danibank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	/* Criar metodo para depositar dinheiro */
	public void deposita(double valor) {
		this.saldo += valor; // somar o valor depositado ao saldo preexistente
	}

	/* Criar metodo saca */
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor; // subtrair o valor sacado do saldo bancario
			return true;
		} else {
			return false;

		}
	}
	
	/* Criar metodo transfere */
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
		this.saldo -= valor; //subtrair o valor transferido do saldo bancario
		destino.deposita(valor);
		return true;
		} else {
			return false;
		}
	}
}

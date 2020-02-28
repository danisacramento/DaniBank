package danibank;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDaMaria = new Conta ();
		contaDaMaria.saldo = 3000;
		contaDaMaria.deposita(4923);
		System.out.println (contaDaMaria.saldo);
		contaDaMaria.saca(2500);
		System.out.println(contaDaMaria.saldo);
		
		/*mensagem opcional para indicar que o saque foi realizado com sucesso*/
		boolean conseguiuRetirar = contaDaMaria.saca(2500);
		System.out.println(contaDaMaria.saldo);
		System.out.println (conseguiuRetirar);
		
		Conta contaDaBeatriz = new Conta ();
		contaDaBeatriz.deposita(1000);
		contaDaBeatriz.transfere(300, contaDaMaria);
		System.out.println (contaDaBeatriz.saldo);
		
	}

}

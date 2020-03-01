
public class TestaBanco {

	public static void main(String[] args) {
		Cliente maria = new Cliente ();
		maria.nome = "Maria da Silva";
		maria.cpf = "382.800.566-34";
		maria.profissao = "Desenvolvedora Full Stack Java Junior";
		
		Conta contaDaMaria = new Conta ();
		contaDaMaria.deposita(200);
		
		contaDaMaria.titular = maria;
		System.out.println (contaDaMaria.titular.nome);
		
		Conta contaDaBeatriz = new Conta ();
		contaDaBeatriz.titular = new Cliente ();
		contaDaBeatriz.titular.nome = "Beatriz da Silva";
		System.out.println (contaDaBeatriz.titular.nome);
	
	}

}

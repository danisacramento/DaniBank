
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario Dora = new Funcionario();
		
		Dora.setNome ("Dora da Silva");
		Dora.setCpf ("222.222.333-45");
		Dora.setSalario (1300.00);
		
		System.out.println(Dora.getNome());
        System.out.println(Dora.getBonificacao());
		
	}

}

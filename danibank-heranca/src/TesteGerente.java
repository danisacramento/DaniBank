public class TesteGerente {
	
	public static void main(String[] args) {

        Gerente Marcos = new Gerente();
        Marcos.setNome("Marcos da Silva");
        Marcos.setCpf("235568413");
        Marcos.setSalario(5000.0);

        System.out.println(Marcos.getNome());
        System.out.println(Marcos.getCpf());
        System.out.println(Marcos.getSalario());

        Marcos.setSenha(2222);
        boolean autenticou = Marcos.autentica(2222);

        System.out.println(autenticou);
        
	}

}

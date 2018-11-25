public class TestaBanco {
	public static void main(String[] args) {
		Cliente luiz = new Cliente();
		luiz.setNome("Luiz Fernando");
		luiz.setCpf("222.222.222.-22");
		luiz.setProfissao("Analista");

		Conta contaDoLuiz = new Conta(6646,969060);
		contaDoLuiz.deposita(100);

		contaDoLuiz.setTitular(luiz);
		System.out.println(contaDoLuiz.getTitular().getNome());
		System.out.println(contaDoLuiz.getSaldo());
		System.out.println(contaDoLuiz.getTitular());

	}
}
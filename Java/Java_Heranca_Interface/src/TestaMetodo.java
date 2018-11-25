public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLuiz = new Conta(6646,969060);
		contaDoLuiz.deposita(100);
		contaDoLuiz.deposita(50);
		System.out.println(contaDoLuiz.getSaldo());

		boolean conseguiuRetirar = contaDoLuiz.saca(20);
		System.out.println(contaDoLuiz.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoLuiz);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoLuiz.getSaldo());
	}

}
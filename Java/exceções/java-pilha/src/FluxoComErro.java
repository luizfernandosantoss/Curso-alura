public class FluxoComErro {

    public static void main(String[] args) throws Exception {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaException e){
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }


    private static void metodo1() throws Exception {
        System.out.println("Ini do metodo1");
        metodo2();

        System.out.println("Fim do metodo1");

    }

    private static void metodo2() throws Exception {
        System.out.println("Ini do metodo2");
        metodo1();
       throw  new MinhaException("algo deu Errado");
//        System.out.println("Fim do metodo2");
    }
}

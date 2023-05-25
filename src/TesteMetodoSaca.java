public class TesteMetodoSaca {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123,321);
        
        conta.deposita(200);
        conta.saca(200);
        System.out.println(conta.getSaldo());
        }
    }


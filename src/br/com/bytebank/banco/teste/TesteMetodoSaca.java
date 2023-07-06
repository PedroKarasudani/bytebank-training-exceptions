package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteMetodoSaca {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123,321);
        
        conta.deposita(200);
        try {
            conta.saca(200);
        } catch (Exception ex) {
            System.out.println("EX: " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());
        }
    }


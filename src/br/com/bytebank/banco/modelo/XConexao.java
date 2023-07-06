package br.com.bytebank.banco.modelo;

public class XConexao implements AutoCloseable{
    
    public XConexao(){
        System.out.println("Abrindo conexão");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo Dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
      System.out.println("Fecha Dados!!");
    }

}

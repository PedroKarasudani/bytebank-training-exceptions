public class XConexao {
    
    public XConexao(){
        System.out.println("Abrindo conexão");
    }

    public void leDados(){
        System.out.println("Recebendo Dados");
        throw new IllegalStateException();
    }

    public void fecha(){
        System.out.println("Fechando Conexão");
    }

}

public class XTestaConexao {
    public static void main(String[] args) {
        XConexao connect = null;

        try {
            connect = new XConexao();
            connect.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu Error");
        } finally {
            connect.fecha();
        }
        
    }
}

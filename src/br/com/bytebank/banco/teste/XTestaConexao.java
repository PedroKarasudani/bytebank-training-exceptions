package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.XConexao;

public class XTestaConexao {
    public static void main(String[] args) {

        try(XConexao conecta = new XConexao()){
            conecta.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }


    //----------------------------------------------
             
        // XConexao connect = null;

        // try {
        //     connect = new XConexao();
        //     connect.leDados();
        // } catch (IllegalStateException ex) {
        //     System.out.println("Deu Error");
        // } finally {
        //     connect.close();
        // }
        
    }
}

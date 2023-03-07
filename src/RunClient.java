package Questao1;

public class RunClient {

    public RunClient( int port ){
        rodar( port );
    }

    void rodar( int port ){
        try {
            
            //Cada cliente será executado em um processo exclusivo
            Client cliente = new Client(port, "192.168.1.102");
            
            System.out.println("Cliente enviando datagramas à porta: " + port);

            //Instancia uma thread para o cliente e inicia
            Thread thread = new Thread(cliente);
            thread.start();

        } catch (Exception e) {
            System.err.println("Exceção disparada: " + e.getMessage() );
        }
    }

    public static void main(String[] args){
        new RunClient(10001);
    }
}
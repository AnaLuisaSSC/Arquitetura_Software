package projrto_heranca_java.veiculo;

public class carro extends veiculo{
        private int portas; 

         public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

        public void abrirPortaMala(){
              System.out.println("Abrindo o porta-malas.");   
        }

       
}

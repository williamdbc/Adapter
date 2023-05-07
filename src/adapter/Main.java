package adapter;

public class Main {
    
    public static void main(String[] args) {
    Carro carro = new CarroEsportivo();
     carro.acelerar();

     Caminhao caminhao = new Caminhao();
     Carro adaptador = new CaminhaoAdapter(caminhao);
     adaptador.acelerar();
    }
    
}

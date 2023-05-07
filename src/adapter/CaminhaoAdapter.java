package adapter;

public class CaminhaoAdapter implements Carro{
    private Caminhao caminhao;
    
    public CaminhaoAdapter(Caminhao caminhao) {
        this.caminhao = caminhao;
    }
    
    public void acelerar() {
        caminhao.aumentarVelocidade();
    }
    
}

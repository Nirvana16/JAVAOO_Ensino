package aula02;

/**
 *
 * @author Danilo
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    Caneta(){ 
        if (cor == null){
            cor = "Arco-iris";
    }else
        System.out.println("Uma caneta" + this.cor);
    }
    
    public void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO");        
        }
        else{
            System.out.println("Rabisco");
        }
    }
    public void tampar(){
        tampada = true;
    }
}

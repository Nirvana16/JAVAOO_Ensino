package aula02;

/**
 *
 * @author Danilo
 */
public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.setTampada(false);
        c1.rabiscar();
        c1.setModelo("bic");
        c1.setCarga(50);
        
        System.out.println("Cor " + c1.getCor());
        System.out.println("Ponta " + c1.getPonta());
        System.out.println("Tampa: " + c1.isTampada());
        System.out.println("Modelo " + c1.getModelo());
        System.out.println("Carga " + c1.getCarga());
            }
       
    
}

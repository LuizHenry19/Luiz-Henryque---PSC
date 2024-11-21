public class TesteFormas {
    public static void main(String[] args) {
        
        Forma retangulo = new RetanguloConcreto(5.0, 3.0);  
        Forma circulo = new CirculoConcreto(4.0);          

        
        System.out.println("Retângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        
        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}

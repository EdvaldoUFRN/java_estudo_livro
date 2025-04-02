
public class MatTest {

    public static void main(String[] args) {
        Mat mat = new Mat();

        //Teste função raizQuadrada
        try {
            System.out.println("Teste Funcao raizQuadrada");
            System.out.println("numeros maiores que 0");
            double resultadoMaior = mat.raizQuadrada(100);
            System.out.println("resultado com o valor 100 => " + resultadoMaior);
            System.out.print("numeros menores ou igual a 0 => ");
            double resultadoMenor = mat.raizQuadrada(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

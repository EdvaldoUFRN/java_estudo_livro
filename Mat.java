
public class Mat {

    public double raizQuadrada(int val) {
        if (val <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0 para calcular a raiz quadrada.");
        }
        return Math.sqrt(val);
    }

}

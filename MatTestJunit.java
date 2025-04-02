
public class MatTestJunit {

    @Test
    void testeRaizQuadrada() {
        Mat mat = new Mat();
        double resultado = mat.raizQuadrada(25);
        assertEquals(5, resultado, "A raiz quadrada de 25 deve ser 5");
    }

    @Test
    void testeRaizQuadradaComExcecao() {
        Mat mat = new Mat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> mat.raizQuadrada(-1));
        assertEquals("O valor deve ser maior que 0 para calcular a raiz quadrada.", exception.getMessage());
    }
}

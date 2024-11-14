package es.santander.ascender.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {

        // Prueba sumar positivo : creo una calculadora para comenzar con resultado = 0
        Calculadora cutSumarPositivo = new Calculadora();
        double resultadoSumarPositivo = cutSumarPositivo.sumar(12.0);
        assertEquals(12.0, resultadoSumarPositivo);

        // Prueba sumar negativo : creo una calculadora para comenzar con resultado = 0
        Calculadora cutSumarNegativo = new Calculadora();
        double resultadoSumarNegativo = cutSumarNegativo.sumar(-112.0);
        assertEquals(-112.0, resultadoSumarNegativo);

    }

    @Test
    public void testOperarConResultadoAnterior() throws Exception {

        // Prueba sumar
        Calculadora cut = new Calculadora();
        double resultadoSumar = cut.sumar(12.0, 16.2);
        assertEquals(28.2, resultadoSumar);

        // prueba operar con un parámetro con resultado anterior

        double resultadoSumarConResultadoPrevio = cut.sumar(200.0);
        assertEquals(228.2, resultadoSumarConResultadoPrevio, 0.001);

        double resultadoRestarConResultadoPrevio = cut.restar(300.);
        assertEquals(-71.8, resultadoRestarConResultadoPrevio, 0.001);

        double resultadoMultiplicarConResultadoPrevio = cut.multiplicar(2);
        assertEquals(-143.6, resultadoMultiplicarConResultadoPrevio, 0.001);

        double resultadoDividirConResultadoPrevio = cut.dividir(-2.0);
        assertEquals(71.8, resultadoDividirConResultadoPrevio, 0.001);

    }

    @Test
    public void testSumarReseteoResultadoConDosParametros() {
        // Prueba específica para asegurar que resultado se reinicia cuando se usa el
        // método con dos parámetros
        Calculadora cut = new Calculadora();

        // Sumar con un parámetro
        cut.sumar(50.0);

        // Sumar con dos parámetros, que debería reiniciar el valor previo
        double resultado = cut.sumar(10.0, 15.0);
        assertEquals(25.0, resultado, 0.001);

        // Verificar que el valor anterior (50) no afectó el resultado
        assertEquals(25.0, cut.getResultado(), 0.001);
    }

    @Test
    public void testDividirEntreCero() {
        Calculadora cut = new Calculadora();

        // Verificar que al dividir entre cero se lanza una excepción
        assertThrows(Exception.class, () -> cut.dividir(10.0, 0.0));

        assertThrows(Exception.class, () -> cut.dividir(0.0));

    }

}

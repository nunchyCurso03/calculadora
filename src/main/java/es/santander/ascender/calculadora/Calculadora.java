package es.santander.ascender.calculadora;

public class Calculadora {

    private double resultado;

    // Constructor: inicializa ultimoResultado en 0 cuando se crea un nuevo objeto
    // de la clase Calculadora. Esto asegura que la calculadora comienza con 0

    public Calculadora() {
        this.resultado = 0;
    }
    //Método para sumar un parámetro al resultado anterior
    public double sumar(double sumando){
        resultado += sumando;
        return resultado;
    }


    // Método para sumar dos valores
    public double sumar(double sumando1, double sumando2) {
        resultado = 0; // Resetea el resultado
        resultado = sumando1 + sumando2;
        return resultado;

    }

      //Método para restar un parámetro al resultado anterior
      public double restar(double sustraendo){
        resultado -= sustraendo;
        return resultado;
    }


    // Método para restar dos valores
    public double restar(double minuendo, double sustraendo) {
        resultado = 0; // Resetea el resultado
        resultado = minuendo - sustraendo;
        return resultado;

    }

      //Método para multiplicar un parámetro al resultado anterior
      public double multiplicar(double multiplicador){
        resultado *= multiplicador;
        return resultado;
    }


    // Método para multiplicar dos valores
    public double multiplicar(double multiplicando, double multiplicador) {
        resultado = 0; // Resetea el resultado
        resultado = multiplicando * multiplicador;
        return resultado;

    }

      //Método para dividir un parámetro al resultado anterior
      public double dividir(double divisor) throws Exception{
        if(divisor ==0.0){
            throw new Exception("No se puede dividir por cero");
        }
        resultado /= divisor;
        return resultado;
    }


    // Método para dividir dos valores
    public double dividir(double dividendo, double divisor) throws Exception {
        resultado = 0; // Resetea el resultado
        if(divisor ==0.0){
            throw new Exception("No se puede dividir por cero");
        }
        resultado = dividendo / divisor;
        return resultado;

    }

    //Get para obtener el último resultado
    public double getResultado() {
        return resultado;
    }
    //Set para modificar el último resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

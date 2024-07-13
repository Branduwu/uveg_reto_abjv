public class Reto {

    // Método suma que recibe dos parámetros y devuelve una cadena con el resultado
    public String suma(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return "El resultado es: " + resultado;
    }

    // Método main
    public static void main(String[] args) {
        // Crear una instancia de la clase
        Reto reto = new Reto();

        // Llamar al método suma con los parámetros 10 y 5 e imprimir el resultado
        String resultado = reto.suma(10, 5);
        System.out.println(resultado);
    }
}

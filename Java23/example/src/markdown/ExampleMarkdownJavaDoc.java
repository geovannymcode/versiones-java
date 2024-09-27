package markdown;

public class ExampleMarkdownJavaDoc {
    /// Calcula el módulo del valor x con respecto a y.
    ///
    /// @param x El valor del dividendo
    /// @param y El divisor
    /// @return El módulo resultante
    /// @throws ArithmeticException Si el divisor es cero
    public int calcularModulo(int x, int y) {
        if (y == 0) {
            throw new Throwable("El divisor no puede ser cero");
        }
        return x % y;
    }

    /// Convierte valores binarios a decimales.
    ///
    /// | Binario | Decimal |
    /// |---------|---------|
    /// |   0000  |    0    |
    /// |   0001  |    1    |
    /// |   0010  |    2    |
    /// |   0011  |    3    |
    ///
    /// @param binario Un número binario en formato String
    /// @return El valor decimal correspondiente
    public int convertirBinarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    /// Calcula la tasa de interés basada en el saldo.
    ///
    /// Pasos para calcular la tasa de interés:
    /// 1. Obtener el saldo actual del cliente.
    /// 2. Verificar si el cliente tiene un descuento especial.
    /// 3. Aplicar la tasa de interés base.
    /// 4. Devolver el resultado.
    ///
    /// @param balance El saldo del cliente
    /// @param tasaBase La tasa de interés base
    /// @return La tasa de interés ajustada
    public double calcularTasaInteres(double balance, double tasaBase) {
        // Implementación del cálculo de tasa de interés
        return balance * tasaBase;
    }

    public static void main(String[] args) {
        EjemploMarkdownJavaDoc example = new EjemploMarkdownJavaDoc();

        // Ejemplo 1: Calcular módulo
        int modulo = example.calcularModulo(10, 3);
        println("El módulo de 10 % 3 es: " + modulo);

        // Ejemplo 2: Convertir binario a decimal
        String binario = "0011";
        int decimal = ejemplo.convertirBinarioADecimal(binario);
        System.out.println("El valor decimal de " + binario + " es: " + decimal);

        // Ejemplo 3: Calcular tasa de interés
        double tasaInteres = example.calcularTasaInteres(1000.0, 0.05);
        println("La tasa de interés ajustada es: " + tasaInteres);
    }
}

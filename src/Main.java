public class SistemaDeEvaluacion {

    public static void main(String[] args) {
        // Datos del estudiante del ejemplo
        String nombreEstudiante = "Ana Castillo";
        double[] notasEstudiante = {95.5, 87.0, 90.0};

        // Llamada al procedimiento principal para mostrar el resultado
        mostrarResultado(nombreEstudiante, notasEstudiante);
    }

    /**
     * Calcula el promedio de un arreglo de notas.
     * @param notas Arreglo de tipo double con las notas del estudiante.
     * @return El promedio de las notas.
     */
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * Obtiene el literal de calificación basado en el promedio.
     * @param promedio El promedio del estudiante.
     * @return Un carácter ('A', 'B', 'C', 'D', 'F') que representa la calificación literal.
     */
    public static char obtenerLiteral(double promedio) {
        if (promedio >= 90) {
            return 'A';
        } else if (promedio >= 80) {
            return 'B';
        } else if (promedio >= 70) {
            return 'C';
        } else if (promedio >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * Determina si el estudiante ha aprobado basándose en la calificación literal.
     * @param literal La calificación literal del estudiante.
     * @return 'true' si el estudiante aprobó (A, B, C), 'false' si reprobó (D, F).
     */
    public static boolean estaAprobado(char literal) {
        return literal == 'A' || literal == 'B' || literal == 'C';
    }

    /**
     * Imprime el resultado completo del estudiante, incluyendo nombre, notas, promedio, literal y estado de aprobación.
     * @param nombre El nombre del estudiante.
     * @param notas Arreglo de tipo double con las notas del estudiante.
     */
    public static void mostrarResultado(String nombre, double[] notas) {
        double promedio = calcularPromedio(notas);
        char literal = obtenerLiteral(promedio);
        boolean aprobado = estaAprobado(literal);

        System.out.println("Estudiante: " + nombre);
        System.out.print("Notas: [");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + (i < notas.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Literal: " + literal);
        System.out.println("Resultado: " + (aprobado ? "Aprobado ✅" : "Reprobado ❌"));
    }

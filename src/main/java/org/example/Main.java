package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {5, 9, 3},
                {4, 5, 6},
                {9, 7, 1}
        };

        int[][] transposedMatrix = transpose(originalMatrix);    //вызываем метод транспонирования

        System.out.println("Transponirovannaya matrica:");
        for (int[] row : transposedMatrix) {         //для каждой строки которая находится в массиве transposedMatrix
            for (int value : row) {                  // для каждой переменной которая находитс в строке выводим на экран с пробелом
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {        //метод транспонирования, в который передали многомерный массив
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];                     // Возвращаем пустую матрицу, если передана пустая или null матрица
        }

        int rows = matrix.length;                         // Количество строк в оригинальной матрице
        int cols = matrix[0].length;                      // Количество столбцов в оригинальной матрице

        int[][] transposed = new int[cols][rows];         // Создаем новую матрицу для транспонирования

        for (int i = 0; i < rows; i++) {                  //проходимся по всем строкам
            for (int j = 0; j < cols; j++) {              // проходимся по всем столбцам
                transposed[j][i] = matrix[i][j];          // Транспонируем (меняем местами и записываем)
            }
        }

        return transposed;                                // Возвращаем транспонированную матрицу
    }
}
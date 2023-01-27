import java.util.Arrays;

public class ArrayMultidimensional {



    public static void main(String[] args) {
        int[][] matriz = {{8,1,2,2,9}, {1,9,4,0,3}, {0,3,0,0,7}};
        //System.out.println(matriz[4][1]); Errorrrrr

        int[] sub = {1,2,3,4};
        matriz[0]=sub;

        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i] == null) {
                    System.out.print("Fila vacía");
                } else {
                    System.out.print(matriz[i][j] + ",");
                }

            }
            System.out.println();
        }

        int[][] int2d = new int[5][10];


    }
}

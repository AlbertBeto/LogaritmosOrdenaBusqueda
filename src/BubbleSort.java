public class BubbleSort {

    public static void burbuja(int[]original){

        for (int j=0;j<original.length;j++){

            for (int i=1;i<original.length;i++){
                if(original[i-1]>original[i]){
                    int copiador=original[i-1];
                    original[i-1]=original[i];
                    original[i]=copiador;
                }
            }
            //Imprimir el array en cada revolución superior.
            for (int o = 0; o < original.length; o++) {
                System.out.print(original[o] + " ");
            }
            System.out.println(" ");

        }

        //class burbuja
    }



}

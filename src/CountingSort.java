public class CountingSort {
    public static int[] ordenConteo(int[] original){
        //sacamos el número maximo.
        int max=0;
        for (int i=0;i<original.length-1;i++){
            if (original[i]>max){
                max=original[i];
            }
        }
        //creamos array contador
        int[] contador = new int[max+1];
        //procedemos a contar los numeros y a almacenarlos.
        for (int j=0;j< original.length;j++){
            contador[original[j]]=contador[original[j]]+1;
        }
        System.out.println("El número más alto es "+max);
        //Imprimir el array del contador.
        System.out.println("El array contador queda así:");
        for (int o = 0; o < contador.length; o++) {
            System.out.print(contador[o] + " ");
        }
        System.out.println(" ");
        //Vamos con el sumatorio
        int suma=0;
        for (int k=0;k< contador.length;k++){
            suma=suma+contador[k];
            contador[k]=suma;
        }
//Imprimir el array del sumatorio.
        System.out.println("El array sumatorio queda así:");
        for (int o = 0; o < contador.length; o++) {
            System.out.print(contador[o] + " ");
        }
        System.out.println(" ");
        //Vamos el array de salida.
        int[] salida=new int[original.length];
        int valor=0;
        for (int l=0;l<original.length;l++){
            valor=original[l];
            salida[contador[valor]-1]=original[l];
            if(contador[valor]>0){contador[valor]=contador[valor]-1;}
        }
//Imprimir el array definitivo.
        System.out.println("El array final ordenado es:");
        for (int o = 0; o < salida.length; o++) {
            System.out.print(salida[o] + " ");
        }
        System.out.println(" ");

        return salida;
    }
    //class
}

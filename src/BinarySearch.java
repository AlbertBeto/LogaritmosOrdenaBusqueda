public class BinarySearch {

    public static void BinarySearch(int[]array, int key, int low, int high){



boolean salida=false;

while(salida==false) {
    int mid= (low+high)/2;
    if (array[mid] == key) {
        salida = true;
        System.out.println("Se ha encontrado el valor buscado en la posición " + mid + " del array.");
    } else if (low==mid || high==mid) {
        salida=true;
        System.out.println("No se ha encontrado el valor dentro del array");
    } else if (array[mid] < key) {
        low = mid + 1;
    } else if (array[mid] > key) {
        high = mid - 1;

    }

//while
}
        //BinarySearch
    }

//class
}

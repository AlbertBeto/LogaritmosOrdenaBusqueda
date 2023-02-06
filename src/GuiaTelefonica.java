import java.util.Arrays;

public class GuiaTelefonica {
    EntradaTelefono teleguia[] = new EntradaTelefono[5];
public GuiaTelefonica(){

    teleguia[0]= new EntradaTelefono("Albert", 656777777);
    teleguia[1] = new EntradaTelefono("Edu", 656888888);
    teleguia[2] = new EntradaTelefono("Mai", 656222222);
    teleguia[3] = new EntradaTelefono("Mo", 656555555);
    teleguia[4] = new EntradaTelefono("Albert", 656666666);
    }



/*
        for(int i=0;i< teleguia.length;i++){

                    System.out.println(teleguia[i].getNombre()+" "+teleguia[i].getNumero());
                          System.out.println();
        }
  */

    public void busqueda(String nombre, EntradaTelefono[] array) {

        String buscador=nombre;
        int siEsta=0;

        for (int i=0;i< array.length;i++) {
            if (nombre == array[i].getNombre() ){
                System.out.println("Nombre: "+nombre+" Telefono: "+array[i].getNumero());
                siEsta=1;
            }
        }
        if (siEsta==0){
            System.out.println("Lo siento, el nombre no está en la agenda");
        }

    }


}

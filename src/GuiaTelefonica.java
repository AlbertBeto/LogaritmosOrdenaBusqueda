public class GuiaTelefonica {


    public static void main(String[] args) {
        EntradaTelefono teleguia[] = new EntradaTelefono[5];
        teleguia[0]= new EntradaTelefono("Albert", 656777777);
        teleguia[1] = new EntradaTelefono("Edu", 656888888);
        teleguia[2] = new EntradaTelefono("Mai", 656222222);
        teleguia[3] = new EntradaTelefono("Mo", 656555555);
        teleguia[4] = new EntradaTelefono("Bro", 656666666);

        for(int i=0;i< teleguia.length;i++){

                    System.out.println(teleguia[i].getNombre()+" "+teleguia[i].getNumero());
                          System.out.println();
        }
    }
/*
    public int busqueda(String nombre) {

        String buscador;

        for (int i=0;i< teleguia.length;i++) {
            buscador=teleguia[i];
            if (nombre == EntradaTelefono[i].getNombre() ){

            }

        }
        return 1;
    }
*/

}

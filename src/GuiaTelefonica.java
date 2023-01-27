public class GuiaTelefonica {
    String[] teleguia = new String[5];
    EntradaTelefono uno = new EntradaTelefono("Albert", 656777777);
    EntradaTelefono dos = new EntradaTelefono("Edu", 656888888);
    EntradaTelefono tres = new EntradaTelefono("Mai", 656222222);
    EntradaTelefono cuatro = new EntradaTelefono("Mo", 656555555);
    EntradaTelefono cinco = new EntradaTelefono("Bro", 656666666);
    teleguia[0] = uno;
    teleguia[1] = dos;
    teleguia[2] = tres;
    teleguia[3] = cuatro;
    teleguia[4] = cinco;
    public  void guiaTelefonica() {


    }


    public int busqueda(String nombre) {

String buscador;
        for (int i=0;i< teleguia.length;i++) {
            buscador=teleguia[i];
            if (nombre == teleguia[i].getNombre() ){

            }

        }
        return 1;
    }


}

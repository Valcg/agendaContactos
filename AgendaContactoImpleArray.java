import java.util.ArrayList;

public class AgendaContactoImpleArray implements AgendaContactos{


        private String nombreDeAgenda;
        private ArrayList<Contacto> contactos;

	public AgendaDeContactosDaoImplArrayList() {

            nombreDeAgenda = "nueva agenda";
            contactos = new ArrayList<>();
            cargardatos();

        }

        private void cargardatos() {

            contactos.add(new Contacto ("Valeria" , "Clemente" , "686894431" , "valeria@gmail.com" , "IBM"));
            contactos.add(new Contacto ("Carolina" , "Soto" , "686896666" , "carolina@gmail.com" , "AXI"));
            contactos.add(new Contacto ("Lupe" , "Perez" , "666994431" , "Lupe@gmail.com" , "NTT"));
            contactos.add(new Contacto ("Valquiria" , "Gomez" , "686564331" , "Maria@gmail.com" , "OLE"));

        }

        @Override
        public Boolean AltaContacto(Contacto contacto) {
            if(!contactos.contains(contacto)) {
                contactos.add(contacto);
                return true;
            }else {
                return false;
            }

        }

        @Override
        public Boolean EliminarContacto(Contacto contacto) {

            contactos.remove(contacto);

            return true;
        }

        @Override
        public Contacto buscarUno(String nombre) {
            Contacto contacto = new Contacto();
            contacto.setNombre(nombre);
            int pos = contactos.indexOf(contacto);

            if(pos == -1) {
                return null;
            }else {
                return contactos.get(pos);
            }
        }

        @Override
        public Contacto buscarTelefono(String telefono) {

            int posEncontrada=-1;


            for (int i = 0; i < contactos.size(); i++) {


                if (contactos.get(i).getTelefono()==telefono) {

                    posEncontrada=i;
                    break;
                }
            }

            if (posEncontrada == -1)

                return null;

            else

                return contactos.get(posEncontrada);

        }


        @Override
        public Contacto buscarEmail(String email) {

            int posEncontrada=-1;


            for (int i = 0; i < contactos.size(); i++) {


                if (contactos.get(i).getEmail()==email) {

                    posEncontrada=i;
                    break;
                }
            }

            if (posEncontrada == -1)

                return null;

            else

                return contactos.get(posEncontrada);

        }

        @Override
        public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {

            ArrayList<Contacto> aux = new ArrayList<>();

            for (Contacto ele : contactos) {


                if (nombre.substring(0,3).equalsIgnoreCase(ele.getNombre().substring(0,3) ) ) {

                    aux.add(ele);
                }
            }
            return aux;

        }

        @Override
        public Boolean cambiarDatos(Contacto contacto) {

            int posicion = contactos.indexOf(contacto);


            if (posicion == -1) {
                return false;
            }else {
                contactos.set(posicion, contacto);
            }
            return true;

        }


        @Override
        public ArrayList<Contacto> ContactosPorEmpresa(String empresa) {

            ArrayList<Contacto> aux = new ArrayList<>();


            for (Contacto ele : contactos) {

                if(ele.getEmpresa() == empresa) {

                    aux.add(ele);

                }


            }
            return aux;

        }








    }


import java.util.ArrayList;

/**
 * esta clase implementa los metodos del repositorio de la AgendaContactos
 */
public class AgendaContactoImpleArray implements AgendaContactos{


        private String nombreDeAgenda;
        private ArrayList<Contacto> contactos;

	public AgendaContactoImpleArray() {

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

    /**
     * este metodo es para dar de alta un contacto que no existe , si no existe lo agrega
     * @param  contacto recibe el contacto(crear un nuevo contacto)
     * @return devuelve un boolean paara saber si se dio de alta bien o no
     */
    @Override
        public Boolean AltaContacto(Contacto contacto) {
            if(!contactos.contains(contacto)) {
                contactos.add(contacto);
                return true;
            }else {
                return false;
            }

        }

    /**
     * este metodo elimina un contacto
     * @param contacto recibe un contacto para eliminar
     * @return devuelve un boolean paara saber si se dio de alta bien o no
     */
    @Override
        public Boolean EliminarContacto(Contacto contacto) {

            contactos.remove(contacto);

            return true;
        }


    /**
     * este metodo buscas un contacto dentro del array recibiendo el nombre que es "la clave primaria"
     * @param  nombre recibe
     * @return te devuelve el contacto completo que estas buscando dentro del array
     */
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

    /**
     * este metodo buscas un telefono dentro del array , recibiendo el telefono pero como no sabe donde esta
     * el telefono tiene que hacer un for
     * @param telefono
     * @return el contacto que localizo por el telefono
     */
    @Override
        public Contacto buscarTelefono(String telefono) {

            int posEncontrada=-1;


            for (int i = 0; i < contactos.size(); i++) {


                if (contactos.get(i).getTelefono() == telefono) {

                    posEncontrada=i;
                    break;
                }
            }

            if (posEncontrada == -1)

                return null;

            else

                return contactos.get(posEncontrada);

        }

    /**
     * buscamos un contacto por su email
     * @param email recibe
     * @return devuelve el contacto que buscamos por el email
     */

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

    /**
     * buscamos un contacto por las tres primeras letras de su nombre para eso nos hacemos un array auxiliar
     * donde guardaremos ese contacto que buscamos con el for , comparamos con lo que nos pasaron y si
     * coinciden pues devolvemos el array aux donde se guardo a todas las personas qu empiezen con esos caracteres
     * @param nombre  recibe las 3 primeras letras
     * @return el array con las personas de esas letras
     */
    @Override
        public ArrayList<Contacto> buscarContactoPortresPrimeros(String nombre) {

            ArrayList<Contacto> aux = new ArrayList<>();

            for (Contacto ele : contactos) {


                if (nombre.substring(0,3).equalsIgnoreCase(ele.getNombre().substring(0,3) ) ) {

                    aux.add(ele);
                }
            }
            return aux;

        }

    /**
     * localizamos un contacto para cambiar sus datos si lo encontramos dentro del array
     * @param contacto recibe creando un contacto con las nuevas cosas que quieres poner
     *  sin cambiar el nombre porque es lo que la identifica y luego le pasas el cpntacto sobre el que quieres hacer esos cambios.
     *
     * @return devuelve un boolean para decir si se ha cambiado bien o no
     */
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


    /**
     * buscamos los contactos por las empresas entoncea hacemos el array aux para meter alli dentro a todos
     * los contactos que tengan la misma empresa y devolver el array
     * @param empresa la empresa que queremos buscar
     * @return devuelve el array con los contactos por empresa
     */
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


/**
 * e esta clase estan los metodos en unn repositorio que seran implementados en la interface
 */

public class AgendaContactos {


        boolean AltaContacto(Contacto contacto);
        boolean EliminarContacto(Contacto contacto);
        boolean CambiarDatos(Contacto contacto);

        Contacto buscarUno(String Nombre);
        Contacto buscarTelefono(String Telefono);
        Contacto buscarEmail(String email);
        ArrayList<Contacto> buscarContactoPortresPrimeros(String nombre);
        ArrayList<Contacto> contactoPorEmpresa(String empresa);


}

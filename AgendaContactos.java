public class AgendaContactos {


        boolean AltaContacto(Contacto contacto);
        boolean EliminarContacto(Contacto contacto);
        boolean CambiarDatos(Contacto contacto);

        Contacto buscarUno(String Nombre);
        Contacto buscarTelefono(String Telefono);
        Contacto buscarEmail(String email);
        ArrayList<Contacto> buscarContactoPorEmpresa(String empresa);
        ArrayList<Contacto> contactoPorEmpresa(String empresa);


}
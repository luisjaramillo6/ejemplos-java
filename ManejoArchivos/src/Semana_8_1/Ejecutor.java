package Semana_8_1;

// Ejemplo tomado del libro 
// D EITEL , P AUL J. Y H ARVEY M. D EITEL
// CÓMO PROGRAMAR EN J AVA . Séptima edición
// fines educativos

// Este programa prueba la clase LeerArchivoTexto.

public class Ejecutor
{
   public static void main( String args[] )
   {
      LeerArchivo aplicacion = new LeerArchivo();

      aplicacion.abrirArchivo();
      aplicacion.leer_informacion();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto


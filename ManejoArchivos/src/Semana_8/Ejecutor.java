package Semana_8;

// Ejemplo tomado del libro 
// D EITEL , P AUL J. Y H ARVEY M. D EITEL
// CÓMO PROGRAMAR EN J AVA . Séptima edición
// fines educativos
// Prueba de la clase ArchivoTexto.

public class Ejecutor
{
   public static void main( String args[] )
   {
      Calificaciones aplicacion = new Calificaciones();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto


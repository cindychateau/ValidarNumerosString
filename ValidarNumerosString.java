/*
    Crear una función que recibe como parámetro un string. Esta función se encarga de
    validar que el string contenga únicamente números. No hacer uso de casting o métodos
    existentes que conviertan un string a número. Utilizar la tabla de ASCII
*/
public class ValidarNumerosString {

    public static boolean validarString(String texto){

        for(int i=0; i<texto.length(); i++){
            int ascii = texto.charAt(i);

            //Numeros tienen código ascii del 48-57
            if((ascii< 48 || ascii > 57) && ascii != 46) {
                return false;
            }            

        }

        return true;

    }

    public static void main (String args[]){
        String texto = "12345.123";
        System.out.println(validarString(texto));
    }

}
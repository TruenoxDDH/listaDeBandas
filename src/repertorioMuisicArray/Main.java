package repertorioMuisicArray;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {





    public static Scanner valor = new Scanner(System.in);
    public  static String entrada;
    public static void main(String[] args) {




        String dato1;
        int dato2;
        int dato3;
        String dato4;
        boolean respuesta;

        //valores canciones
        String datoC1;
        int datoc2;
        int datoc3;


        ArrayList ListaDeBandas = new ArrayList<bandaMusic>();


{
    for (int i = 1; i <= 2; i++) {


        System.out.println("Inserta una banda de tu interes");
        entrada = valor.nextLine();
        dato1 = entrada;
        System.out.println("Inserta numero de integrantes");
        entrada = valor.nextLine();
        dato2 = Integer.parseInt(entrada);
        System.out.println("Inserta año de creaccion");
        entrada = valor.nextLine();
        dato3 = Integer.parseInt(entrada);
        System.out.println("Inserta primer album");
        entrada = valor.nextLine();
        dato4 = entrada;

        System.out.println("Inserta un cancion ");
        entrada = valor.nextLine();
        datoC1=entrada;
        System.out.println("Inserta su duraccion en minutos");
        entrada= valor.nextLine();
        datoc2= Integer.parseInt(entrada);
        System.out.println("Calificaccion");
        entrada= valor.nextLine();
        datoc3= Integer.parseInt(entrada);

        cancioneBanda unacancion = new cancioneBanda(datoC1,datoc2,datoc3);
        unacancion.setNombreCancion(datoC1);
        unacancion.setDuraccionCancion(datoc2);
        unacancion.setCalificaccion(datoc3);

        bandaMusic banda1 = new bandaMusic(
                dato1, dato2, dato3, dato4, unacancion);

        ListaDeBandas.add(banda1);





    }
    System.out.println(ListaDeBandas.toString());

    bandaMusic.imprimirCanciones
}



//
        /*System.out.println(ListaDeBandas.toString());
        System.out.println("quieres encontrqr una banda ");
        entrada = valor.nextLine();
        respuesta= Boolean.parseBoolean(entrada);
        if (respuesta=true){

            System.out.println("Valor a encontrar");
            entrada = valor.nextLine();}

*/

        }


    }
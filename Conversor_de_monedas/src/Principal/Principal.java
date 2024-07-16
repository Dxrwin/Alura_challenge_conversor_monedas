package Principal;

import Busqueda_Api.ConexionApi;
import Modelos_Moneda.Monedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
       // ConexionApi consulta = new ConexionApi();

        boolean conversion =true;




            System.out.println("BIEVENIDO A CONVERSION DE MONEDAS ELIJA LA PRIMERA MONEDA BASE A CONVERTIR = \n");

            System.out.println("LISTADO DE OPCIONES DE MONEDAS A CONVERTIR = \n " +
                "####################################\n" +
                " 1. DOLAR >>>> peso Argentino \n" +
                " 2. PESO ARGENTINO >>> DOLAR \n" +
                " 3. DOLAR >>>>> REAL BRASILEÑO \n" +
                " 4. Real brasileño >>> DOLAR \n " +
                " 5. peso colombiano >>>> Dolar \n" +
                " 6 dolar >>>>> peso colombiano \n" +
                " 7. salir de la aplicacion \n");

        System.out.println("ESCOJA UNA OPCION POR FAVOR :");
        int opcion = Integer.parseInt(lectura.nextLine());

        switch (opcion){
            case 1:
                System.out.println("usted ha elejido conversion de moneda DOLAR A PESO ARGENTINO ");
                System.out.println("ingrese los dijitos de moneda DOLAR de interes");
                String valor = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor+"  DOLARES  a  PESOS  ARGENTINOS " );

              ConexionApi consulta = new ConexionApi();
               var Respuesta = consulta.Peticion("USD","ARS",valor);


                System.out.println(Respuesta);
                break;
            case 2:
                System.out.println("usted ha elejido conversion de moneda PESO ARGENTINO A DOLAR ");

                System.out.println("ingrese los dijitos de moneda ARGENTINA de interes");

                String valor2 = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor2+"   PESOS  ARGENTINOS A DOLAR" );

                ConexionApi consulta2 = new ConexionApi();
                var Respuesta2 = consulta2.Peticion("ARS","USD",valor2);


                System.out.println(Respuesta2);

                break;

            case 3:


                System.out.println("usted ha elejido conversion de moneda DOLAR A REAL BRASILEÑO ");
                System.out.println("ingrese los dijitos de moneda DOLAR de interes");
                String valor3 = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor3+"  DOLARES  a  REALES BRASILEÑOS " );

                ConexionApi consulta3 = new ConexionApi();
                var Respuesta3 = consulta3.Peticion("USD","BRL",valor3);


                System.out.println(Respuesta3);

                break;
            case 4:
                System.out.println("usted ha elejido conversion de moneda BRASILEÑA A DOLAR  ");
                System.out.println("ingrese los dijitos de moneda BRASILEÑA de interes");
                String valor4 = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor4+"  REALES BRASILEÑOS A DOLARES " );

                ConexionApi consulta4 = new ConexionApi();
                var Respuesta4 = consulta4.Peticion("BRL","USD",valor4);


                System.out.println(Respuesta4);
                break;


            case 5:

                System.out.println("usted ha elejido conversion de moneda de PESO COLOMBIANO A DOLAR ");
                System.out.println("ingrese los dijitos de moneda COLOMBIANA de interes");
                String valor5 = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor5+"  PESOS COLOMBIANOS A DOLARES " );

                ConexionApi consulta5 = new ConexionApi();
                var Respuesta5 = consulta5.Peticion("COP","USD",valor5);


                System.out.println(Respuesta5);


                break;


            case 6:
                System.out.println("usted ha elejido conversion de moneda DOLAR A PESO COLOMBIANO ");
                System.out.println("ingrese los dijitos de moneda DOLAR de interes");
                String valor6 = lectura.nextLine();
                System.out.println(" realizara el cambio de  "+valor6+"  DOLARES  a  PESOS  COLOMBBIANOS " );

                ConexionApi consulta6 = new ConexionApi();
                var Respuesta6 = consulta6.Peticion("USD","COP",valor6);


                System.out.println(Respuesta6);

                break;
            case 7:
                System.out.println("gracias por utilizar la aplicacion");
                break;

        }




        }



}


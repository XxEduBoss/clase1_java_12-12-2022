public class Main {

    public static void main(String[] args) {

        // Definición de variables

        //Enteros int
        int numero1 = 5;
        int numero2 = 5;


        //Decimales (double)
        double numero3 = 4.6;
        double numero4 = 5.5;


        //Boolean (bool)
        boolean numero5 = true;
        boolean numero6 = false;


        //Cadenas de texto (String)
        String texto1 = "Hola";
        String texto2 = "Adios";


        //Operaciones
        int resultado1 = numero1 + numero2;

        double resultado2 = numero3 + numero4;
        double resultado3 = numero3 * numero4;
        double resultado4 = numero3 / numero4;


        //Imprimir por consola
        System.out.println(numero1);


        //Operaciones con tipos
        System.out.println(texto1.length());


        //Condicionales
        if (numero1 > numero2){
            System.out.println("El número 1 es mayor");
        } else if (numero1 == numero2){
            System.out.println("Los números son iguales");
        } else{
            System.out.println("El número 2 es mayor");
        }


        //Creamos una carta
        Carta carta1 = new Carta();
        carta1.setPalo("Basto");
        carta1.setTipo("Rey");
        carta1.setValor(12);

        System.out.println(carta1);


    }

}
public class Hola {
    public static void main(String[] args) {
        // forma de definir variables en java 8
        String nombre; //string sirve para cadena de caracteres
        int a, b, c; // crear multiple variables pero de un solo tipo

        nombre = "Alex Roel";
        int edad = 25; // entero
        a = 1; // recuerda java es tipado y si la variable se define como int debe declarar su valor como int o dara error
        b = 2;
        c = 3;
        System.out.println(nombre);
        System.out.println(edad);
        edad= 26;
        System.out.println(edad);
        System.out.println(a + b + c);

        //Otra forma de definir variables en java 9 en adelante
        var primerNombre = "Daniel"; // se puede generar variables dinamicas como javascript con la palabra reservada var y como javascript asimila automaticamente el tipo de dato con el valor, este caso seria String por que asignamos un tipo de dato cadena
        System.out.println(primerNombre);
        // si intentamos cambiar el dato de string a int aunque sea una variable dinamica dara un error por que ya se convirtio anteriormente en string
        //primerNombre = 1;
        var segundoNombre = "Viera";
        var misNombres = primerNombre + " " + segundoNombre; // podemos generar concatenaciones con el simbolo + si son string si son enteros sumaria
        System.out.println("Mi nombre: " + misNombres);

    }
}

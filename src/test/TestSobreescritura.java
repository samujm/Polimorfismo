package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        //--------------------------------------------------------------《 POLIMORFISMO 》------------------------------------------------------------------------------------
        //----------- ▀ Significa multiples comportamientos, se visualiza en tiempo de ejecución -------------------
        //----------- ▀ Se necesita:  -------------------
        //----------- 1.- Tener herencia (clase padre e hija) para poder aplicar el concepto de sobreescritura  -------------------
        //----------- 2.- Haber sobreescrito desde la clase hija un metodo de la clase padre  -------------------

        //----------- << 1... Creamos un objeto de la clase padre << -------------------
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        //----------- << 5.1... Como se manda la variable empleado utiliza el metodo de la clase padre, EN TIEMPO DE EJECUCIÓN EL METODO QUE SE VA A EJECUTAR VA A SER DEL TIPO DE LA REFERENCIA DE LA VARIABLE QUE RECIBE  << -------------------
        imprimir(empleado); //Recibe variable empleado su referencia es empleado, se ejecuta el metodo de la clase padre

        //----------- << 2... Creamos un objeto de la clase hija << -------------------
        empleado = new Gerente("Karla", 50, "Contabilidad"); //Reutilizando la variable ya que es de un tipo compatible (padre), ya que importa la referencia
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        //----------- << 5.2... Como se manda la variable empleado utiliza el metodo de la clase padre << -------------------
        imprimir(empleado); //Recibe variable gerente su referencia es gerente, se ejecuta el metodo de la clase hija

    }

    //----------- << 3... Mandará llamar el metodo obtenerDetalles() de la clase padre o de la clase hija dependiendo de la referencia del objeto que se esté pasando al momento de ejecutar el programa << -------------------
    //----------- << 4... Recibe el tipo de la clase padre para poder recibir referencias de la clase padre y de la hija, es comun ponerle el nombre de la clase padre (Empleado empleado) << -------------------
    public static void imprimir(Empleado empleado) { //Es static por que se está mandando llamar desde el metodo static
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}

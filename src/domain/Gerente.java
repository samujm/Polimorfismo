package domain;

public class Gerente extends Empleado {

    private String departamento; //No tiene subclases en este ejercicio, se pone como privado

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //--------------------------------------------------------------《 NOTA 》------------------------------------------------------------------------------------
    //----------- ▀ El metodo hijo que sobreescribe el metodo padre no puede ser mas restrictivo, en este caso el padre tiene protected el hijo NO puede ser private -------------------
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }
}

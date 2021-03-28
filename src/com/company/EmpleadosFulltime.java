package com.company;
public class EmpleadosFulltime extends Empleados {
    // Campos específicos de la subclase.

    private String Salarioporhora;
    private String Sobretiempo;

    //Constructor de la subclase: incluimos como parámetros  del constructor de la superclase
    public EmpleadosFulltime(String nombre, String apellido, String Salarioporhora, String Sobretiempo,int numeroempleado) {
        super(nombre, apellido,numeroempleado );
        this.Salarioporhora = Salarioporhora;
        this.Sobretiempo = Sobretiempo;
    }
    // Campos específicos de la subclase

    public void setSalarioporHora(String Salarioporhora, String Sobretiempo) {
        this.Salarioporhora = Salarioporhora;
        this.Sobretiempo = Sobretiempo;
    }

    //Métodos específicos de la subclase

    @Override
    public String toString() {
        return (super.toString() + "\n Autorizado Sobretiempo: " + this.Sobretiempo +"\n  Salario: " + this.Salarioporhora);
    }
}
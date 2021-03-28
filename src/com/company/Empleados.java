//
//* Creamos una clase
package com.company;
  public class Empleados {

      // Estado (Atributos y su valor)

      public String nombre;
      public String apellido;
      public int codigoempleado;

      //Constructor

      public Empleados() {
          this.nombre = nombre;
          this.apellido = apellido;
          this.codigoempleado = codigoempleado;
      }

        public Empleados (String nombre, String apellido,int codigoempleado) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.codigoempleado = codigoempleado;
        }


      //Métodos

      public String getNombre() {
          return nombre;
      }

      public String getApellido() {
          return apellido;
      }

      public int getCodigoempleado() {
          return codigoempleado;
      }
      //   System.out.println

      @Override
       public String toString() {
          return ("Datos del Empleado: " + nombre + " " + apellido + " " + codigoempleado);
      }
  }

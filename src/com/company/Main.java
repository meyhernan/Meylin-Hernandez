package com.company;
//
 public class Main {

    public static void main(String[] args) {

        EmpleadosFulltime empleadosfulltime = new EmpleadosFulltime("Jose", "Guzman", "13.50", "SI",13640);

        System.out.println(empleadosfulltime.toString());
        System.out.println();

        empleadosfulltime.setSalarioporHora("25","NO");


        System.out.println(empleadosfulltime.toString());
        System.out.println();
    }
    }




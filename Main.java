import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;
        int opcionEscuela;
        int opcionCarrera;
        int opcionAsignatura;
        int opcionAlumno;
        int opcionEvaluacion;
        int codigoEscuela;
        int codigoCarrera;
        int codigoAsignatura;
        int opcionContinuar = 0;
        double nota;
        double nuevaNota;
        String nombreEscuela;
        String nombreCarrera;
        String nombreAsignatura;
        String rutAlumno;
        String nombreAlumno;
        boolean repetir = true;
        boolean salir = false;
        boolean RELLENO = true;

        Instituto instituto = new Instituto("Instituto Hardware","Acevilan Costilla",100);
        //El nombre de Acevilan Costilla no fue elegido al azar. Esconde un secreto. Invitamos a la lectora del codigo a descubrirlo :3

        System.out.println("Bienvenido al sistema de gestion del Instituto Hardware");
        do {

            //MENU PRINCIPAL - SELECCION DE AREA
            System.out.println("Por favor, ingrese el numero del area que desea gestionar:");
            System.out.println("    1. Escuelas");
            System.out.println("    2. Carreras");
            System.out.println("    3. Asignaturas");
            System.out.println("    4. Alumnos");
            System.out.println("    5. Evaluaciones");
            System.out.println("    0. SALIR");
            opcionPrincipal = sc.nextInt();
            if (opcionPrincipal > 5 || opcionPrincipal < 0) {
                System.out.println("Opcion ingresada incorrecta. Intente nuevamente");
            }

            //MENU SECUNDARIO - ESCUELAS
            else {
                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("\0*GESTION DE ESCUELAS*");
                        do {
                            System.out.println("Ingrese el numero de la opcion que corresponda:");
                            System.out.println("	1. Mostrar escuela");
                            System.out.println("	2. Agregar escuela");
                            System.out.println("	3. Modificar escuela");
                            System.out.println("	4. Eliminar escuela");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionEscuela = sc.nextInt();
                        } while (opcionEscuela > 4 || opcionEscuela < 0);

                        switch (opcionEscuela) {

                            //MOSTRAR ESCUELAS
                            case 1:
                                instituto.mostrarEscuelas();
                                break;

                            //AGREGAR ESCUELA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("\0Ingrese el nombre de la escuela:");
                                    nombreEscuela = sc.nextLine();
                                    if(instituto.agregarEscuela(nombreEscuela)){
                                        System.out.println("Escuela agregada con éxito.");
                                    }
                                    else{
                                        System.out.println("La escuela no pudo ser agregada.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otra escuela");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MODIFICAR ESCUELA
                            case 3:
                                repetir = true;
                                do {
                                    instituto.mostrarEscuelas();
                                    System.out.println("\0Ingrese el codigo de la escuela que desea modificar:");
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el nuevo nombre:");
                                    nombreEscuela = sc.nextLine();
                                    if(instituto.editarEscuela(codigoEscuela,nombreEscuela)){
                                        System.out.println("Escuela modificada con éxito.");
                                    }
                                    else{
                                        System.out.println("La escuela no pudo ser modificada.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese el numero de la opcion que corresponda:");
                                        System.out.println("	0. Modificar otra escuela");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                    if (opcionContinuar == 0) {
                                        repetir = true;
                                    } else {
                                        repetir = false;
                                    }
                                } while (repetir == true);
                                break;

                            //ELIMINAR ESCUELA
                            case 4:
                                repetir = true;
                                do {
                                    instituto.mostrarEscuelas();
                                    System.out.println("\0Ingrese el codigo de la escuela que desea eliminar:");
                                    codigoEscuela = sc.nextInt();
                                    if(instituto.eliminarEscuela(codigoEscuela)){
                                        System.out.println("Escuela eliminada con éxito.");
                                    }
                                    else{
                                        System.out.println("La escuela no pudo ser eliminada.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Eliminar otra escuela");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                    if (opcionContinuar == 0) {
                                        repetir = true;
                                    } else {
                                        repetir = false;
                                    }
                                } while (repetir == true);
                                break;

                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //MENU SECUNDARIO - CARRERAS
                    case 2:
                        System.out.println("\0*GESTION DE CARRERAS*");
                        do {
                            System.out.println("Ingrese el numero de la opcion que corresponda:");
                            System.out.println("	1. Mostrar carreras");
                            System.out.println("	2. Agregar carrera");
                            System.out.println("	3. Modificar carrera");
                            System.out.println("	4. Eliminar carrera");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionCarrera = sc.nextInt();
                        } while (opcionCarrera > 4 && opcionCarrera < 0);

                        switch(opcionCarrera) {

                            //MOSTRAR CARRERAS
                            case 1:
                                instituto.mostrarEscuelas();
                                System.out.println("\0Ingrese el codigo de la escuela:");
                                codigoEscuela = sc.nextInt();
                                instituto.mostrarCarreras(codigoEscuela);
                                break;

                            //AGREGAR CARRERA
                            case 2:
                                repetir = true;
                                do {
                                    instituto.mostrarEscuelas();
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el nombre de la carrera:");
                                    nombreCarrera = sc.nextLine();
                                    if(instituto.agregarCarrera(codigoEscuela,nombreCarrera)){
                                        System.out.println("Carrera agregadacon éxito.");
                                    }
                                    else{
                                        System.out.println("La carrera no pudo ser agregada");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otra carrera");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MODIFICAR CARRERA
                            case 3:
                                repetir = true;
                                do {
                                    instituto.mostrarEscuelas();
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    instituto.mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    if(instituto.editarCarrera(codigoEscuela,codigoCarrera)){
                                        System.out.println("Carrera modificada con éxito.");
                                    }
                                    else{
                                        System.out.println("La carrera no pudo ser modificada");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Modificar otra carrera");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //ELIMINAR CARRERA
                            case 4:
                                repetir = true;
                                do {
                                    instituto.mostrarEscuelas();
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    instituto.mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    if(instituto.eliminarCarrera(codigoEscuela,codigoCarrera)){
                                        System.out.println("Carrera eliminada con éxito.");
                                    }
                                    else{
                                        System.out.println("La carrera no pudo ser eliminada");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Eliminar otra carrera");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;
                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //MENU SECUNDARIO - ASIGNATURAS POR CARRERA
                    case 3:
                        System.out.println("\0*GESTION DE ASIGNATURAS POR CARRERA*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
                            System.out.println("	1. Mostrar asignaturas de una carrera");
                            System.out.println("	2. Agregar asignatura a una carrera");
                            System.out.println("	3. Modificar asignatura de una carrera");
                            System.out.println("	4. Eliminar asignatura de una carrera");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionAsignatura = sc.nextInt();
                        } while (opcionAsignatura > 4 && opcionAsignatura < 0);

                        switch(opcionAsignatura) {

                            //MOSTRAR ASIGNATURAS POR CARRERA
                            case 1:
                                //mostrarEscuelas
                                System.out.println("\0Ingrese el codigo de la escuela:");
                                codigoEscuela = sc.nextInt();
                                //mostrarCarreras(codigoEscuela);
                                System.out.println("Ingrese el codigo de la carrera:");
                                codigoCarrera = sc.nextInt();
                                instituto.mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                break;

                            //AGREGAR ASIGNATURA A UNA CARRERA
                            case 2:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el nombre de la asignatura:");
                                    nombreAsignatura = sc.nextLine();
                                    if(instituto.agregarAsignatura(codigoEscuela,codigoCarrera,nombreAsignatura)){
                                        System.out.println("Asignatura agregada con éxito.");
                                    }
                                    else{
                                        System.out.println("La asignatura no pudo ser agregada.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otra asignatura");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MODIFICAR ASIGNATURA DE UNA CARRERA
                            case 3:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturasPorCarrera(codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el nuevo nombre de la asignatura:");
                                    nombreAsignatura = sc.nextLine();
                                    //modificarAsignatura(codigoEscuela,codigoCarrera,nombreAsignatura);
                                    System.out.println("Asignatura modificada.");
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Modificar otra asignatura");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //ELIMINAR ASIGNATURA DE UNA CARRERA
                            case 4:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //eliminarAsignatura(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Asignatura eliminada.");
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Eliminar otra asignatura");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //MENU SECUNDARIO - ALUMNOS
                    case 4:
                        System.out.println("*\0GESTION DE ALUMNOS POR CARRERA*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
                            System.out.println("	1. Mostrar alumnos de una carrera");
                            System.out.println("	2. Agregar alumno a una carrera");
                            System.out.println("	3. Modificar alumno de una carrera");
                            System.out.println("	4. Eliminar alumno de una carrera");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionAlumno = sc.nextInt();
                        } while (opcionAlumno > 4 && opcionAlumno < 0);

                        switch(opcionAlumno) {
                            //MOSTRAR ALUMNOS POR ASIGNATURA
                            case 1:
                                //mostrarEscuelas
                                System.out.println("\0Ingrese el codigo de la escuela:");
                                codigoEscuela = sc.nextInt();
                                //mostrarCarreras(codigoEscuela);
                                System.out.println("Ingrese el codigo de la carrera:");
                                codigoCarrera = sc.nextInt();
                                //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                System.out.println("Ingrese el codigo de la asignatura:");
                                codigoAsignatura = sc.nextInt();
                                //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                break;

                            //AGREGAR ALUMNO A UNA ASIGNATURA
                            case 2:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("\0Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    System.out.println("Ingrese el nombre del alumno:");
                                    nombreAlumno = sc.nextLine();
                                    if(RELLENO/*agregarAlumno(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno,nombreAlumno)*/){
                                        System.out.println("Alumno agregado a la asignatura con éxito.");
                                    }
                                    else{
                                        System.out.println("El alumno ya se encuentra registrado en la asignatura.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otro alumno");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //AGREGAR ALUMNO A UNA ASIGNATURA
                            case 3:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoEscuela);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    System.out.println("Ingrese el nombre del alumno:");
                                    nombreAlumno = sc.nextLine();
                                    if(RELLENO/*agregarAlumno(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno,nombreAlumno)*/){
                                        System.out.println("Alumno agregado a la asignatura con éxito.");
                                    }
                                    else{
                                        System.out.println("El alumno no pudo ser agregado a la asignatura.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otra asignatura");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //ELIMINAR ALUMNO DE UNA ASIGNATURA
                            case 4:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Ingrese el rut del alumno");
                                    rutAlumno = sc.nextLine();
                                    if(RELLENO/*eliminarAlumno(codigoEscuela,codigoCarrera,codigoAsignatura)*/){
                                        System.out.println("Alumno eliminado de la asignatura con éxito.");
                                    }
                                    else{
                                        System.out.println("El alumno no pudo ser eliminado de la asignatura.");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Eliminar otra asignatura");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //MENU SECUNDARIO - EVALUACIONES
                    case 5:
                        System.out.println("\0*GESTION DE EVALUACIONES POR ASIGNATURA*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
                            System.out.println("	1. Mostrar notas de alumno");
                            System.out.println("	2. Agregar notas a un alumno");
                            System.out.println("	3. Modificar notas de un alumno");
                            System.out.println("	4. Eliminar notas de un alumno");
                            System.out.println("    5. Mostrar notas y promedio de un alumno");
                            System.out.println("	6. Ver ranking por asignatura");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionEvaluacion = sc.nextInt();
                        } while (opcionEvaluacion > 6 && opcionEvaluacion < 0);

                        switch(opcionEvaluacion) {

                            //MOSTRAR NOTAS DE ASIGNATURA POR ALUMNO
                            //mostrarEscuelas
                            System.out.println("\0Ingrese el codigo de la escuela:");
                            codigoEscuela = sc.nextInt();
                            //mostrarCarreras(codigoEscuela);
                            System.out.println("Ingrese el codigo de la carrera:");
                            codigoCarrera = sc.nextInt();
                            //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                            System.out.println("Ingrese el codigo de la asignatura:");
                            codigoAsignatura
                            //mostrarAlumnos(codigoEscuela,codigoCarrera);
                            System.out.println("Ingrese el rut del alumno:");
                            rutAlumno = sc.nextLine();
                            //mostrarNotas(codigoEscuela,codigoCarrera,codigoAsignatura,codigoAlumno);
                            break;

                            //AGREGAR NOTAS A UNA ASIGNATURA
                            case 2:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    do{
                                        System.out.println("        *Valores permitidos entre 1.0 y 7.0. Recuerde separar los decimales con punto (.)");
                                        System.out.println("Ingrese la nota*:");
                                        nota = sc.nextDouble();
                                    }while(nota<=1.0 && nota>=7.0);
                                    if(RELLENO/*agregarNota(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno,nota)*/){
                                        System.out.println("Nota agregada a la asignatura con exito");
                                    }
                                    else{
                                        System.out.println("La nota no pudo ser agregada a la asignatura");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Agregar otra nota");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MODIFICAR NOTAS DE UNA ASIGNATURA
                            case 3:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    //mostrarNotas(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno);
                                    do{
                                        System.out.println("        *Valores permitidos entre 1.0 y 7.0. Recuerde separar los decimales con punto (.)");
                                        System.out.println("Ingrese la nota* que desea modificar:");
                                        nota = sc.nextDouble();
                                    }while(nota<=1.0 && nota>=7.0);
                                    do{
                                        System.out.println("        *Valores permitidos entre 1.0 y 7.0. Recuerde separar los decimales con punto (.)");
                                        System.out.println("Ingrese el nuevo valor de la nota*:");
                                        nuevaNota = sc.nextDouble();
                                    }while(nuevaNota<=1.0 && nota>=7.0);
                                    if(RELLENO/*modificarNota(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno,nota,nuevaNota)*/){
                                        System.out.println("Nota modificada con exito");
                                    }
                                    else{
                                        System.out.println("La nota no pudo ser modificada");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Modificar otra nota");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //ELIMINAR NOTAS DE UNA ASIGNATURA
                            case 4:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    //mostrarNotas(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno);
                                    do{
                                        System.out.println("        *Valores permitidos entre 1.0 y 7.0. Recuerde separar los decimales con punto (.)");
                                        System.out.println("Ingrese la nota* que desea eliminar:");
                                        nota = sc.nextDouble();
                                    }while(nota<=1.0 && nota>=7.0);
                                    if(RELLENO/*eliminarNota(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno,nota)*/){
                                        System.out.println("Nota eliminada con exito");
                                    }
                                    else{
                                        System.out.println("La nota no pudo ser eliminada");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Eliminar otra nota");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MOSTRAR NOTAS Y PROMEDIO DE ALUMNO POR ASIGNATURA
                            case 5:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    //mostrarAlumnos(codigoEscuela,codigoCarrera,codigoAsignatura);
                                    System.out.println("Ingrese el rut del alumno:");
                                    rutAlumno = sc.nextLine();
                                    if(RELLENO/*mostrarNotas(codigoEscuela,codigoCarrera,codigoAsignatura,rutAlumno);*/){    //DUDA: al ser boolean, puede imprimir antes de entregar true?
                                    }
                                    else{
                                        System.out.println("No se puede mostrar el promedio");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Mostrar notas de otro alumno");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //MOSTRAR RANKING POR ASIGNATURA
                            case 6:
                                repetir = true;
                                do {
                                    //mostrarEscuelas
                                    System.out.println("\0Ingrese el codigo de la escuela:");
                                    codigoEscuela = sc.nextInt();
                                    //mostrarCarreras(codigoEscuela);
                                    System.out.println("Ingrese el codigo de la carrera:");
                                    codigoCarrera = sc.nextInt();
                                    //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                    System.out.println("Ingrese el codigo de la asignatura:");
                                    codigoAsignatura = sc.nextInt();
                                    if(RELLENO/*mostrarRanking(codigoEscuela,codigoCarrera,codigoAsignatura);*/){    //DUDA: al ser boolean, puede imprimir antes de entregar true?
                                    }
                                    else{
                                        System.out.println("No se puede mostrar el ranking");
                                    }
                                    do {
                                        System.out.println("\0Ingrese la opcion que corresponda:");
                                        System.out.println("	0. Mostrar otro ranking");
                                        System.out.println("	1. Volver al menu principal");
                                        opcionContinuar = sc.nextInt();
                                        if (opcionContinuar == 0) {
                                            repetir = true;
                                        } else {
                                            repetir = false;
                                        }
                                    } while (opcionContinuar > 1 && opcionContinuar < 0);
                                } while (repetir == true);
                                break;

                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //SALIR
                    case 0:
                        salir = true;
                        System.out.println("\0\0\0\0Gracias por usar nuestro sistema de gestion del Instituto Hardware");
                        break;
                }
            }
        } while ((opcionPrincipal>5 || opcionPrincipal<0) || salir==false);
    }
}


/*


https://docs.google.com/document/d/1gvv3NEF8Da0e9OxaioAIK80jBCy_ViHW8mR9KUC4kK0/edit


//REQUISITOS PARTE A
 - Dos niveles de anidacion:					Tenemos 6 niveles (universidad->escuela->carrera->asignatura->alumno->nota)
 - Dos clases con sobrecarga de metodos:		ListaAsignaturasPorAlumno->RankingAlumno->(1.Mostrar alumnos con mejor nota / 2.Mostrar alumnos con nota X)
												ListaAsignaturasPorCarrera->RankingCarrera->(1.Mostrar asignatura con mejor promedio / 2.Mostrar asignatura con promedio X)
 - Todos los atr. priv. con GyS:				Listo! (FALTA los GyS de los arreglos)
 - Menu interactivo:							En proceso!
	- Insercion:								escuela, carrera, alumno, asignatura, nota
	- Edicion:									escuela, carrera, alumno, asignatura, nota
	- Eliminacion								escuela, carrera, alumno, asignatura, nota
	- Generacion de reportes:					mostrarCarrerasEscuela, mostrarAsignaturasCarrera, mostrarAlumnosCarrera, mostrarAlumnosAsignatura,
	- Funcionalidades propias:					promedioNotasAsignatura, promedioNotasAlumno



//JERARQUIA (de menor a mayor, si hay 2 por linea estan a la par)
ListaNotas
ListaAlumnosPorAsignatura
Asignatura						Evaluacion
ListaAsignaturasPorAlumno		ListaEvaluaciones
Alumno							ListaAlumnosPorCarrera		ListaAsignaturasPorCarrera
Carrera
ListaCarrera
Escuela
ListaEscuelas
Universidad



//LISTADO DE FUNCIONES
mostrarEscuelas
agregarEscuela(nombreEscuela)
modificarEscuela(codigoEscuela)
eliminarEscuela(codigoEscuela)
mostrarCarreras(codigoEscuela)
agregarCarrera(codigoEscuela,nombreCarrera)
modificarCarrera(codigoEscuela,codigoCarrera)
eliminarCarrera(codigoEscuela,codigoCarrera)
agregarAsignaturaPorCarrera(codigoEscuela,codigoCarrera,nombreAsignatura)
eliminarAsignaturasPorCarrera(codigoEscuela,codigoCarrera,codigoAsignatura)
modificarAsignaturasPorCarrera(codigoEscuela,codigoCarrera,nombreAsignatura)
eliminarAsignaturaPorCarrera(codigoCarrera,codigoAsignatura)
mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera)
existeAlumnoPorCarrera(codigoEscuela,codigoCarrera,rutAlumno)
agregarAlumnoPorCarrera(codigoEscuela,codigoCarrera,rutAlumno,nombreAlumno,emailAlumno)
mostrarAsignaturasPorAlumnoNoInscritas(codigoEscuela,codigoCarrera,codigoAlumno)
agregarAsignaturaPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura)
eliminarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura)
mostrarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura)
agregarNotas(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,nota)
ModificarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,codigoNota,nota)
eliminarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,codigoNota)
mostrarAlumnosConPromedioSuperior(codigoEscuela,codigoCarrera,codigoAsignatura)
mostrarAlumnosConPromedioDeterminado(codigoEscuela,codigoCarrera,codigoAsignatura,nota)



//CENTRAR PANTALLA (poner al final)
System.out.print("\033[H\033[2J");
System.out.flush();



//PREGUNTAS PARA LA PROFE
 - presentacion en que enfocar
 - fichero en caso de nombre
*/
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
        int opcionRanking;
        int escuela;
        int codigoEscuela;
        int codigoCarrera;
        int codigoAsignatura;
        int codigoAlumno;
        int codigoNota;
        int opcionContinuar = 0;
        float nota;
        String nombreEscuela;
        String nombreCarrera;
        String nombreAsignatura;
        String rutAlumno;
        String nombreAlumno;
        String emailAlumno;
        boolean repetir = true;
        boolean salir = false;
        boolean RELLENO = true;
        int cantNotas = 30;

        System.out.println("Bienvenido al sistema de gestion del Instituto Hardware");
        do {

            //MENU PRINCIPAL - SELECCION DE AREA
            System.out.println("Por favor, seleccione el area que desea gestionar");
            System.out.println("1. Escuelas");
            System.out.println("2. Carreras");
            System.out.println("3. Asignaturas");
            System.out.println("4. Alumnos");
            System.out.println("5. Evaluaciones");
            System.out.println("0. SALIR");
			
            opcionPrincipal = sc.nextInt();
            if (opcionPrincipal > 5 || opcionPrincipal < 0) {
                System.out.println("Opcion ingresada incorrecta. Intente nuevamente");
            }

            //MENU SECUNDARIO - ESCUELAS
            else {
                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("*GESTION DE ESCUELAS*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
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
                                //mostrarEscuelas
                                break;
                            //AGREGAR ESCUELA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el nombre de la escuela");
                                    nombreEscuela = sc.nextLine();
                                    //agregarEscuela(nombreEscuela);
                                    System.out.println("Escuela agregada.");

                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    //mostrarEscuelas;
                                    System.out.println("Ingrese el codigo de la escuela que desea modificar:");
                                    codigoEscuela = sc.nextInt();
                                    //modificarEscuela(codigoEscuela);
                                    System.out.println("Escuela modificada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela que desea eliminar:");
                                    //mostrarEscuelas;
                                    codigoEscuela = sc.nextInt();
                                    //eliminarEscuela(codigoEscuela);
                                    System.out.println("Escuela eliminada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                        System.out.println("*GESTION DE CARRERAS*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
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
                                System.out.println("Ingrese el codigo de la escuela");
                                //mostrarEscuelas
                                codigoEscuela = sc.nextInt();
                                //mostrarCarreras(codigoEscuela);
                                break;

                            //AGREGAR CARRERA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el nombre de la carrera");
                                    nombreCarrera = sc.nextLine();
                                    //agregarCarrera(codigoEscuela,nombreCarrera);
                                    System.out.println("Carrera agregada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    //modificarCarrera(codigoEscuela,codigoCarrera);
                                    System.out.println("Carrera modificada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras
                                    codigoCarrera = sc.nextInt();
                                    //eliminarCarrera(codigoEscuela,codigoCarrera);
                                    System.out.println("Carrera eliminada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                        System.out.println("*GESTION DE ASIGNATURAS POR CARRERA*");
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
                                System.out.println("Ingrese el codigo de la escuela");
                                //mostrarEscuelas
                                codigoEscuela = sc.nextInt();
                                System.out.println("Ingrese el codigo de la carrera");
                                //mostrarCarreras(codigoEscuela);
                                codigoCarrera = sc.nextInt();
                                //mostrarAsignaturas(codigoCarrera);
                                break;

                            //AGREGAR ASIGNATURA A UNA CARRERA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el nombre de la asignatura");
                                    nombreAsignatura = sc.nextLine();
                                    //agregarAsignaturaPorCarrera(codigoCarrera,nombreAsignatura);
                                    System.out.println("Asignatura agregada.");

                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorCarrera(codigoCarrera);
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el nuevo nombre de la asignatura");
                                    nombreAsignatura = sc.nextLine();
                                    //modificarAsignaturaPorCarrera(codigoCarrera,nombreAsignatura);
                                    System.out.println("Asignatura modificada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorCarrera(codigoCarrera);
                                    codigoAsignatura = sc.nextInt();
                                    //eliminarAsignaturaPorCarrera(codigoCarrera,codigoAsignatura);
                                    System.out.println("Asignatura eliminada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                        System.out.println("*GESTION DE ALUMNOS POR CARRERA*");
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
                                System.out.println("Ingrese el codigo de la escuela");
                                //mostrarEscuelas
                                codigoEscuela = sc.nextInt();
                                System.out.println("Ingrese el codigo de la carrera");
                                //mostrarCarreras(codigoEscuela);
                                codigoCarrera = sc.nextInt();
                                System.out.println("Ingrese el codigo de la asignatura");
                                //mostrarAsignaturas(codigoEscuela,codigoCarrera);
                                codigoAsignatura = sc.nextInt();
                                //mostrarAlumnosPorAsignatura(codigoEscuela,codigoCarrera,codigoAsignatura);
                                break;

                            //AGREGAR ALUMNO A UNA CARRERA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el rut del alumno");
                                    rutAlumno = sc.nextLine();
                                    if(RELLENO/*existeAlumnoPorCarrera(codigoEscuela,codigoCarrera,rutAlumno)*/){
                                        System.out.println("El alumno ya se encuentra registrado en la carrera.");
                                    }
                                    else{
                                        System.out.println("Ingrese el nombre del alumno");
                                        nombreAlumno = sc.nextLine();
                                        System.out.println("Ingrese el email del alumno");
                                        emailAlumno = sc.nextLine();
                                        //agregarAlumnoPorCarrera(codigoEscuela,codigoCarrera);
                                        System.out.println("Alumno agregado.");
                                    }

                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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

                            //AGREGAR ASIGNATURAS A UN ALUMNO
                            case 3:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo del alumno");
                                    //mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera);
                                    codigoAlumno = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorAlumnoNoInscritas(codigoEscuela,codigoCarrera,codigoAlumno);
                                    codigoAsignatura = sc.nextInt();
                                    //agregarAsignaturaPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura);
                                    System.out.println("Asignatura agregada.");

                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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

                            //ELIMINAR ASIGNATURA DE UN ALUMNO
                            case 4:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo del alumno");
                                    //mostrarAlumnosPorCarrera
                                    codigoAlumno = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorAlumno
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Asignatura eliminada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                        System.out.println("*GESTION DE EVALUACIONES*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
                            System.out.println("	1. Mostrar notas por asignatura");
                            System.out.println("	2. Agregar notas a una asignatura");
                            System.out.println("	3. Modificar notas de una asignatura");
                            System.out.println("	4. Eliminar notas de una asignatura");
                            System.out.println("	5. Ver ranking");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionAsignatura = sc.nextInt();
                        } while (opcionAsignatura > 5 && opcionAsignatura < 0);

                        switch(opcionAsignatura) {

                            //MOSTRAR NOTAS POR ASIGNATURA
                            case 1:
                                System.out.println("Ingrese el codigo de la escuela");
                                //mostrarEscuelas
                                codigoEscuela = sc.nextInt();
                                System.out.println("Ingrese el codigo de la carrera");
                                //mostrarCarreras(codigoEscuela);
                                codigoCarrera = sc.nextInt();
                                System.out.println("Ingrese el codigo del alumno");
                                //mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera);
                                codigoAlumno = sc.nextInt();
                                System.out.println("Ingrese el codigo de la asignatura");
                                //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                codigoAsignatura = sc.nextInt();
                                //mostrarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura);
                                break;

                            //AGREGAR NOTAS A UNA ASIGNATURA
                            case 2:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo del alumno");
                                    //mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera);
                                    codigoAlumno = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                    codigoAsignatura = sc.nextInt();
                                    do{
                                        System.out.println("Ingrese la nota");
                                        nota = sc.nextFloat();
                                    }while(nota<=1.0 && nota>=7.0);
                                    //agregarNota(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,nota);
                                    System.out.println("Nota agregada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo del alumno");
                                    //mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera);
                                    codigoAlumno = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la nota que desea modificar");
                                    //mostrarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura);
                                    codigoNota = sc.nextInt();
                                    do{
                                        System.out.println("Ingrese el nuevo valor de la nota");
                                        nota = sc.nextFloat();
                                    }while(nota<=1.0 && nota>=7.0);
                                    //ModificarNotaPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,codigoNota,nota);
                                    System.out.println("Nota modificada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras(codigoEscuela);
                                    codigoCarrera = sc.nextInt();
                                    System.out.println("Ingrese el codigo del alumno");
                                    //mostrarAlumnosPorCarrera(codigoEscuela,codigoCarrera);
                                    codigoAlumno = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la asignatura");
                                    //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                    codigoAsignatura = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la nota que desea eliminar");
                                    //mostrarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura);
                                    codigoNota = sc.nextInt();
                                    //eliminarNotasPorAsignatura(codigoEscuela,codigoCarrera,codigoAlumno,codigoAsignatura,codigoNota);
                                    System.out.println("Asignatura eliminada.");
                                    do {
                                        System.out.println("Ingrese la opcion que corresponda:");
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

                            //VER RANKING
                            case 5:
                                do{
                                    System.out.println("Ingrese la opcion que corresponda:");
                                    System.out.println("	0. Mostrar alumnos con el mejor promedio");
                                    System.out.println("	1. Mostrar alumnos por promedio especifico");
                                    opcionRanking = sc.nextInt();
                                }while(opcionRanking<0 || opcionRanking>1);

                                switch(opcionRanking){
                                    //MOSTRAR ALUMNOS CON MEJOR PROMEDIO
                                    case 0:
                                        System.out.println("Ingrese el codigo de la escuela");
                                        //mostrarEscuelas
                                        codigoEscuela = sc.nextInt();
                                        System.out.println("Ingrese el codigo de la carrera");
                                        //mostrarCarreras(codigoEscuela);
                                        codigoCarrera = sc.nextInt();
                                        System.out.println("Ingrese el codigo de la asignatura");
                                        //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                        codigoAsignatura = sc.nextInt();
                                        //mostrarAlumnosConPromedioSuperior(codigoEscuela,codigoCarrera,codigoAsignatura);
                                        break;

                                    //MOSTRAR ALUMNOS CON UN PROMEDIO DETERMINADO POR USUARIO
                                    case 1:
                                        System.out.println("Ingrese el codigo de la escuela");
                                        //mostrarEscuelas
                                        codigoEscuela = sc.nextInt();
                                        System.out.println("Ingrese el codigo de la carrera");
                                        //mostrarCarreras(codigoEscuela);
                                        codigoCarrera = sc.nextInt();
                                        System.out.println("Ingrese el codigo de la asignatura");
                                        //mostrarAsignaturasPorAlumno(codigoEscuela,codigoCarrera,codigoAlumno);
                                        codigoAsignatura = sc.nextInt();
                                        System.out.println("Ingrese el promedio de nota que desea buscar. Valores entre 1.0 y 7.0. Recuerde separar los decimales con punto (.)");
                                        nota = sc.nextFloat();
                                        //mostrarAlumnosConPromedioDeterminado(codigoEscuela,codigoCarrera,codigoAsignatura,nota);
                                        break;
                                }
                                break;

                            //VOLVER AL MENU PRINCIPAL
                            case 0:
                                break;
                        }
                        break;

                    //SALIR
                    case 0:
                        salir = true;
                        System.out.println("Gracias por usar nuestro sistema de gestion del Instituto Hardware");
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
 - avisar lo hablado con ayudante
 - preguntar funcionalidades extras
*/
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
        int escuela;
        int codigoEscuela;
        int codigoCarrera;
        int opcionContinuar = 0;
        String nombreEscuela;
        String nombreCarrera;
        boolean repetir = true;


        System.out.println("Bienvenido al sistema de gestion del Instituto Hardware/n/n");
        do {
            //MENU PRINCIPAL - SELECCION DE AREA
            System.out.println("Por favor, seleccione el area que desea gestionar");
            System.out.println("1. Escuelas");
            System.out.println("2. Carreras");
            System.out.println("3. Asignaturas");
            System.out.println("4. Alumnos");
            System.out.println("0. SALIR");

            opcionPrincipal = sc.nextInt();
            if (opcionPrincipal > 5 && opcionPrincipal < 0) {
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
                        } while (opcionEscuela > 4 && opcionEscuela < 0);
                        
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
                                } while (repetir = true);
                                break;

                            //MODIFICAR ESCUELA
                            case 3:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela que desea modificar:");
                                    //mostrarEscuelas;
                                    escuela = sc.nextInt();
                                    //modificarEscuela(escuela);
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
                                } while (repetir = true);
                                break;

                            //ELIMINAR ESCUELA
                            case 4:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela que desea eliminar:");
                                    //mostrarEscuelas;
                                    escuela = sc.nextInt();
                                    //eliminarEscuela(escuela);
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
                                } while (repetir = true);
                                break;
                        }
                        break;

                    //MENU SECUNDARIO - CARRERAS
                    case 2:
                        System.out.println("*GESTION DE CARRERAS*");
                        do {
                            System.out.println("Ingrese la opcion que corresponda:");
                            System.out.println("	1. Mostrar carrera");
                            System.out.println("	2. Agregar carrera");
                            System.out.println("	3. Modificar carrera");
                            System.out.println("	4. Eliminar carrera");
                            System.out.println("	0. VOLVER AL MENU PRINCIPAL");
                            opcionCarrera = sc.nextInt();
                        } while (opcionCarrera > 4 && opcionCarrera < 0);
                        
                        switch(opcionCarrera) {

                            //MOSTRAR CARRERAS
                            case 1:
                                //mostrarCarreras
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
                                    //agregarCarrera(codigoEscuela,);
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
                                } while (repetir = true);
                                break;
    
                            //MODIFICAR CARRERA
                            case 3:
                                repetir = true;
                                do {
                                    System.out.println("Ingrese el codigo de la escuela");
                                    //mostrarEscuelas
                                    codigoEscuela = sc.nextInt();
                                    System.out.println("Ingrese el codigo de la carrera");
                                    //mostrarCarreras
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
                                } while (repetir = true);
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
                                } while (repetir = true);
                                break;
                        }
                    break;

                    //MENU SECUNDARIO - ASIGNATURAS
                    case 3:

                        break;

                    //MENU SECUNDARIO - ALUMNOS
                    case 4:

                        break;
                }
            }

        } while (opcionPrincipal > 4 && opcionPrincipal < 0);

    }
}






/*

https://docs.google.com/document/d/1gvv3NEF8Da0e9OxaioAIK80jBCy_ViHW8mR9KUC4kK0/edit

//REQUISITOS PARTE A
 - Dos niveles de anidacion:					Tenemos 6 niveles (universidad->escuela->carrera->asignatura->alumno->nota)
 - Dos clases con sobrecarga de metodos:		ListaAsignaturasPorAlumno->RankingAlumno->(1.Mostrar alumnos con mejor nota / 2.Mostrar alumnos con nota X)
												ListaAsignaturasPorCarrera->RankingCarrera->(1.Mostrar asignatura con mejor promedio / 2.Mostrar asignatura con promedio X)
 - Todos los atr. priv. con GyS:				Listo! (FALTA los GyS de los arreglos)
 - Menu interactivo:							FALTA TODA LA PARTE LOGICA
	- Insercion:								escuela, carrera, alumno, asignatura, nota
	- Edicion:									escuela, carrera, alumno, asignatura, nota
	- Eliminacion								escuela, carrera, alumno, asignatura, nota
	- Generacion de reportes:					mostrarCarrerasEscuela, mostrarAsignaturasCarrera, mostrarAlumnosCarrera, mostrarAlumnosAsignatura, mostrarNotasAlumno
	- Funcionalidades propias:					promedioNotasAsignatura, promedioNotasAlumno


//FUNCIONALIDADES
agregarAsignatura
editarAsignatura
eliminarAsignatura

agregarAlumno
editarAlumno
eliminarAlumno




//JERARQUIA (de menor a mayor, si hay 2 por linea estan a la par)
ListaAlumnosPorAsignatura
Asignatura						Evaluacion
ListaAsignaturasPorAlumno		ListaEvaluaciones
Alumno							ListaAlumnosPorCarrera		ListaAsignaturasPorCarrera
Carrera
ListaCarrera
Escuela
ListaEscuelas
Universidad

*/
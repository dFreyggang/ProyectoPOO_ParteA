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
		int codigoAsignatura;
		int codigoAlumno;
        int opcionContinuar = 0;
        String nombreEscuela;
        String nombreCarrera;
		String nombreAsignatura;
		String rutAlumno;
		String nombreAlumno;
		String emailAlumno;
        boolean repetir = true;
		boolean salir = false;
		int cantNotas = 30;


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
            if (opcionPrincipal > 4 || opcionPrincipal < 0) {
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
                                } while (repetir == true);
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
                                } while (repetir == true);
                                break;

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
									nombreAsignatura = sc.nextInt();
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
									if(/*existeAlumnoPorCarrera(codigoEscuela,codigoCarrera,rutAlumno)*/){
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

                            //MODIFICAR ASIGNATURA DE UN ALUMNO
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
									//mostrarAsignaturasPorAlumno(codigoCarrera);
									codigoAsignatura = sc.nextInt();
									System.out.println("Ingrese el nuevo nombre de la asignatura");
									nombreAsignatura = sc.nextInt();
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
                        }
                    	break;
					
					//MENU SECUNDARIO - EVALUACIONES
					case 5:
						
						
						
						System.out.println("	5. Agregar nota a un alumno");
						System.out.println("	6. Modificar nota a un alumno");
						System.out.println("	7. Eliminar nota a un alumno");
						break;

					//SALIR
					case 0:
						salir = true;
						System.out.println("Gracias por usar nuestro sistema de gestion del Instituto Hardware");
						break;
                }
            }

        } while ((opcionPrincipal>4 || opcionPrincipal<0) && salir==false);

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
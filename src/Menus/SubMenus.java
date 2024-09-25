package Menus;

import Explicaciones.Detalles;
import Programas.EjercicioProgramas;
import java.util.Scanner;
public class SubMenus {
    Detalles detalles = new Detalles();
    EjercicioProgramas ejercicioProgramas = new EjercicioProgramas();
    private Scanner scanner;
    public SubMenus() {
        scanner = new Scanner(System.in);
    }
    private int mostrarSubMenuDatosPrimitivos() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDCD1 １ ＿ Ｄａｔｏｓ  Ｐｒｉｍｉｔｉｖｏｓ ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Que es byte                                           ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Que es Short                                          ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Que es Int                                            ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Que es long                                           ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Que es float                                          ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 6- Que es double                                         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 7- Que es char                                           ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 8- Que es boolean                                        ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 9- Volver al menu anterior                               ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuDatosPrimitivos() {
        int opcionSubMenuDatosPrimitivos;
        do {
            opcionSubMenuDatosPrimitivos = mostrarSubMenuDatosPrimitivos();
            switch (opcionSubMenuDatosPrimitivos) {
                case 1:
                    detalles.ejecutarExplicacionByte();
                    break;
                case 2:
                    detalles.ejecutarExplicacionShor();
                    break;
                case 3:
                    detalles.ejecutarExplicacionInt();
                    break;
                case 4:
                    detalles.ejecutarExplicacionLong();
                    break;
                case 5:
                    detalles.ejecutarExplicacionFloat();
                    break;
                case 6:
                    detalles.ejecutarExplicacionDouble();
                    break;
                case 7:
                    detalles.ejecutarExplicacionChar();
                    break;
                case 8:
                    detalles.ejecutarExplicacionBoolean();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionSubMenuDatosPrimitivos != 9);
    }
    private int mostrarSubMenuTipoOperadores() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDD02 ４ ＿ Ｔｉｐｏ  Ｏｐｅｒａｄｏｒｅｓ  ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Operador Aritmetico                         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Operador racional                           ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Operadores logicos                          ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Operadores de asignación                    ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Operadores de incremento y decremento       ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 6- Volver al menu anterior                     ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSuMenuTipoOperadores() {
        int opcionSubMenuTipoOperadores;
        do {
            opcionSubMenuTipoOperadores = mostrarSubMenuTipoOperadores();
            switch (opcionSubMenuTipoOperadores) {
                case 1:
                    ejecutarSubMenuOperadorAritmetico();
                    break;
                case 2:
                    ejecutarSubMenuOperadorRacional();
                    break;
                case 3:
                    ejecutarSubMenuOperadorLogico();
                    break;
                case 4:
                    ejecutarSubMenuOperadorAsignación();
                    break;
                case 5:
                    ejecutarSubMenuIncrementoDecremento();
                    break;
            }
        } while (opcionSubMenuTipoOperadores != 6);
    }
    public int mostrarsubMenuOperadorAritmético() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("             \uD83D\uDD02 １＿ Operador Aritmético ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Suma                         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Resta                        ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Multiplicación               ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- División                     ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Modulo                       ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 6- Volver al menú anterior      ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuOperadorAritmetico() {
        int opcionSubMenuOperadorAritmetico;
        do {
            opcionSubMenuOperadorAritmetico = mostrarsubMenuOperadorAritmético();
            switch (opcionSubMenuOperadorAritmetico) {
                case 1:
                    detalles.ejecutarExplicacionSuma();
                    break;
                case 2:
                    detalles.ejecutarExplicacionResta();
                    break;
                case 3:
                    detalles.ejecutarExplicacionMultiplicacion();
                    break;
                case 4:
                    detalles.ejecutarExplicacionDivision();
                    break;
                case 5:
                    detalles.ejecutarExplicacionModulo();
                    break;
            }
        } while (opcionSubMenuOperadorAritmetico != 6);
    }
    public int mostrarSubMenuOperadorRacional() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDCD1 2 ＿ Operador Racional ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Igual a ==                   ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Distinto de =!               ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Mayor que >                  ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Menor que <                  ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Mayor o igual que >=         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 6- Menor o igual que <=         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 7- Volver al menú  anterior      ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuOperadorRacional() {
        int opcionSubMenuOperadorRacional;
        do {
            opcionSubMenuOperadorRacional = mostrarSubMenuOperadorRacional();
            switch (opcionSubMenuOperadorRacional) {
                case 1:
                    detalles.ejecutarExplicacionIgual();
                    break;
                case 2:
                    detalles.ejecutarExplicacionDistinto();
                    break;
                case 3:
                    detalles.ejecutarExplicacionMayor();
                    break;
                case 4:
                    detalles.ejecutarExplicacionMenor();
                    break;
                case 5:
                    detalles.ejecutarExplicacionMayorIgual();
                    break;
                case 6:
                    detalles.ejecutarExplicacionMenorIgual();
                    break;
            }
        } while (opcionSubMenuOperadorRacional != 7);
    }
    public int mostrarSubMenuOperadorLogicos() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDCD1 3 ＿ Operador Lógicos ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- And &&                       ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Or ||                        ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Not !                        ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Salir                        ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuOperadorLogico() {
        int opcionSubMenuOperadorLogico;
        do {
            opcionSubMenuOperadorLogico = mostrarSubMenuOperadorLogicos();
            switch (opcionSubMenuOperadorLogico) {
                case 1:
                    detalles.ejecutarExplicacionAnd();
                    break;
                case 2:
                    detalles.ejecutarExplicacionOr();
                    break;
                case 3:
                    detalles.ejecutarExplicacionNot();
                    break;
            }
        } while (opcionSubMenuOperadorLogico != 4);
    }
    public int mostrarSubMenuOperadorAsignacion() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDCD1 4 ＿ Operador de Asignación ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Asignación =                      ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Asignación con suma +=            ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Asignación con resta -            ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Asignación con multiplicación  *= ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Asignación con división  /=       ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 6- Asignación con modulo  %=         ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 7- Salir                             ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuOperadorAsignación() {
        int opcionSubMenuOperadorAsignación;
        do {
            opcionSubMenuOperadorAsignación = mostrarSubMenuOperadorAsignacion();
            switch (opcionSubMenuOperadorAsignación) {
                case 1:
                    detalles.ejecutarExplicacionAsignacion();
                    break;
                case 2:
                    detalles.ejecutarExplicacionAsignacionSuma();
                    break;
                case 3:
                    detalles.ejecutarExplicacionAsignacionResta();
                    break;
                case 4:
                    detalles.ejecutarExplicacionMultiplicacion();
                    break;
                case 5:
                    detalles.ejecutarExplicacionAsignacionDivi();
                    break;
                case 6:
                    detalles.ejecutarExplicacionAsigModu();
                    break;
            }
        } while (opcionSubMenuOperadorAsignación != 7);
    }
    public int mostrarSubMenuoperadorIncrementoDecremento() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              \uD83D\uDCD1 5 ＿ Operadores de incremento y decremento ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83C\uDFB2 1- Incremento ++                ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 2- Decremento --                ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 3- Pre incremento ++variable    ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 4- Post incremento variable++   ⚡");
        System.out.println("⚡                   \uD83C\uDFB2 5- Salir                        ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuIncrementoDecremento() {
        int opcionSubMenuIncrementoDecremento;
        do {
            opcionSubMenuIncrementoDecremento = mostrarSubMenuoperadorIncrementoDecremento();
            switch (opcionSubMenuIncrementoDecremento) {
                case 1:
                    detalles.ejecutarExplicacionIncremento();
                    break;
                case 2:
                    detalles.ejecutarExplicacionDecremento();
                    break;
                case 3:
                    detalles.ejecutarExplicacionPreIncremento();
                    break;
                case 4:
                    detalles.ejecutarExplicacionPostIncremento();
                    break;
            }
        } while (opcionSubMenuIncrementoDecremento != 5);
    }
    public int mostrarSubMenuCondiIfElse() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                   ⚡");
        System.out.println("⚡              ➰  Ｃｏｎｄｉｃｉｏｎａｌ  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ                 ⚡");
        System.out.println("⚡                                                                                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   ➰  1- Explicación If                                           ⚡");
        System.out.println("⚡                   ➰  2- Explicación Else                                         ⚡");
        System.out.println("⚡                   ➰  3- Explicación Else If                                      ⚡");
        System.out.println("⚡                   ➰  4- Programa de If, Else If y Else                           ⚡");
        System.out.println("⚡                   ➰  5- Volver al menú anterior                                  ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuCondiIfElse() {
        int opcionSubMenuCondiIfElse;
        do {
            opcionSubMenuCondiIfElse = mostrarSubMenuCondiIfElse();
            switch (opcionSubMenuCondiIfElse) {
                case 1:
                    detalles.ejecutarExplicacionCondiIf();
                    break;
                case 2:
                    detalles.ejecutarExplicacionCondiElse();
                    break;
                case 3:
                    detalles.ejecutarExplicacionCondElseIf();
                    break;
                case 4:
                    ejercicioProgramas.ejecutarProgramaIf();
                    break;
            }
        } while (opcionSubMenuCondiIfElse != 5);
    }
    public int mostrarSubMenuProgramaIf() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("              ➰  Programa  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ ");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   ➰  1- Ejercicio de la Edad                                ⚡");
        System.out.println("⚡                   ➰  2- Salir                                               ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuSubMenuProgramaIf() {
        int opcionSubMenuSubMenuProgramaIf;
        do {
            opcionSubMenuSubMenuProgramaIf = mostrarSubMenuProgramaIf();
            switch (opcionSubMenuSubMenuProgramaIf) {
                case 1:
                    ejercicioProgramas.ejecutarProgramaIf();
                    break;
            }
        } while (opcionSubMenuSubMenuProgramaIf != 2);
    }
    public int mostrarSubMenuCondicionalSwitch() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡                   📚 ６ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｓｗｉｔｃｈ                           ⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   📚  1- Ｅｘｐｌｉｃａｃｉｏｎ ｓｗｉｔｃｈ                             ⚡");
        System.out.println("⚡                   📚  2- Ｐｒｏｇｒａｍａ  ｓｗｉｔｃｈ                                 ⚡");
        System.out.println("⚡                   📚  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubCondicionalSwitch() {
        int opcionSubMenuCondicionalSwitch;
        do {
            opcionSubMenuCondicionalSwitch = mostrarSubMenuCondicionalSwitch();
            switch (opcionSubMenuCondicionalSwitch) {
                case 1:
                    detalles.ejecutarexplicacionＳｗｉｔｃｈ();
                    break;
                case 2:
                    ejercicioProgramas.ejecutarProgramaｓｗｉｔｃｈ();
                    break;
            }
        } while (opcionSubMenuCondicionalSwitch != 3);
    }
    public int mostrarSubMenuCondＴｅｒｎａｒｉａ() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡                   \uD83E\uDD13 ７ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｔｅｒｎａｒｉａ                        ⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83E\uDD13  1- Ｅｘｐｌｉｃａｃｉｏｎ  Ｔｅｒｎａｒｉａ                        ⚡");
        System.out.println("⚡                   \uD83E\uDD13  2- Ｐｒｏｇｒａｍａ  Ｔｅｒｎａｒｉａ                             ⚡");
        System.out.println("⚡                   \uD83E\uDD13  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubmenuCondＴｅｒｎａｒｉａ() {
        int opcionSubMenuCondＴｅｒｎａｒｉａ;
        do {
            opcionSubMenuCondＴｅｒｎａｒｉａ = mostrarSubMenuCondＴｅｒｎａｒｉａ();
            switch (opcionSubMenuCondＴｅｒｎａｒｉａ) {
                case 1:
                    detalles.ejecutarExplicacionTernaria();
                    break;
                case 2:
                    ejercicioProgramas.programaTernaria();
                    break;
            }
        } while (opcionSubMenuCondＴｅｒｎａｒｉａ != 3);
    }
    public int mostrarSubMenuDoWhile() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡                   \uD83D\uDD01 ８ ＿ Ｂｕｃｌｅ  Ｄｏ Ｗｈｉｌｅ                                  ⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83D\uDD01  1- Ｅｘｐｌｉｃａｃｉｏｎ  Ｄｏ Ｗｈｉｌｅ                         ⚡");
        System.out.println("⚡                   \uD83D\uDD01  2- Ｐｒｏｇｒａｍａ  Ｄｏ Ｗｈｉｌｅ                              ⚡");
        System.out.println("⚡                   \uD83D\uDD01  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuCondDoWhile() {
        int opcionSubMenuCondDoWhile;
        do {
            opcionSubMenuCondDoWhile = mostrarSubMenuDoWhile();
            switch (opcionSubMenuCondDoWhile) {
                case 1:
                    detalles.ejecutarExplicacionDoWhile();
                    break;
                case 2:
                    ejercicioProgramas.ejecutarProgramaDoWhile();
                    break;
            }
        } while (opcionSubMenuCondDoWhile != 3);
    }
    public int motrarSubMenuWhile() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡                   \uD83D\uDD01 ８ ＿ Ｂｕｃｌｅ  Ｗｈｉｌｅ                                  ⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   \uD83D\uDD01  1- Ｅｘｐｌｉｃａｃｉｏｎ   Ｗｈｉｌｅ                         ⚡");
        System.out.println("⚡                   \uD83D\uDD01  2- Ｐｒｏｇｒａｍａ   Ｗｈｉｌｅ                              ⚡");
        System.out.println("⚡                   \uD83D\uDD01  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarSubMenuWhile() {
        int opcionSubMenuCondWhile;
        do {
            opcionSubMenuCondWhile = motrarSubMenuWhile();
            switch (opcionSubMenuCondWhile) {
                case 1:
                    detalles.ejecutarExplicacionWhile();
                    break;
                case 2:
                    ejercicioProgramas.ejecutarprogramaWhile();
                    break;
            }
        } while (opcionSubMenuCondWhile != 3);
    }
    public int mostrarSubMenuFor() {
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡                       ⚙\uFE0F  １０ ＿ Ｂｕｃｌｅ  Ｆｏｒ                                   ⚡");
        System.out.println("⚡                                                                                    ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡                   ⚙\uFE0F  1- Ｅｘｐｌｉｃａｃｉｏｎ Ｂｕｃｌｅ  Ｆｏｒ                        ⚡");
        System.out.println("⚡                   ⚙\uFE0F  2- Ｐｒｏｇｒａｍａ  Ｂｕｃｌｅ  Ｆｏｒ                            ⚡");
        System.out.println("⚡                   ⚙\uFE0F  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt();
    }
    public void ejecutarFor() {
        int opcionSubMenuCondFor;
        do {
            opcionSubMenuCondFor = mostrarSubMenuFor();
            switch (opcionSubMenuCondFor) {
                case 1:
                    detalles.explicacionFor();
                    break;
                case 2:
                    ejercicioProgramas.ejecutarProgramaFor();
                    break;
            }
        } while (opcionSubMenuCondFor != 3);
    }
}


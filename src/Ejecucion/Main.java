package Ejecucion;

import Explicaciones.Detalles;
import Menus.SubMenus;
import Menus.MenuPrincipal;
import Programas.EjercicioProgramas;
import Utilidades.Validaciones;

import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scannerMenu = new Scanner(System.in);

        int opcionPrincipal; // Menú principal del programa
        int opcionSubmenuDatos; // Submenú datos primitivos
        int opcionSubmenuTipOpe; // submenú tipo operadores
        int opcionSubmenuArit; // submenú tipo aritmético
        int opcionSubmenuTipRa; // Submenú tipo racional
        int opcionSubmenuLogi; // Submenú tipo lógicos
        int opcionSubmenuAsig; // Submenu tipo asignación
        int opcionSubmenuIncre; // Submenú incremental
        int opcionSubmenuIf; // Submenú if
        int opcionSubmenuProgIf; // Submenú programa If
        int opcionSubmenuSwitc; //  Submenú Switc
        int opcionSubmenuTernaria; // submenu Ternaria
        int opcionSubmenuDoWhile; //  submenu DoWhile
        int opcionSubmenuFor; // submenú For
        int opcionSubmenuWhile; // submenú while

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        SubMenus subMenus = new SubMenus();
        Validaciones validaciones = new Validaciones();
        Detalles detalles = new Detalles();
        EjercicioProgramas ejercicioProgramas = new EjercicioProgramas();


        do {


            //Llamado del menu principal
            MenuPrincipal.menuPrincipal();

            //Validación de errores
            Validaciones.opcionValida(scannerMenu);

            // captura de la opción del menú principal
            opcionPrincipal = scannerMenu.nextInt();

            // Validación mediante switch
            switch (opcionPrincipal) {

                case 1:
                    do {

                        // Llamado submenú datos primitivos
                        SubMenus.subMenuDatosPrimitivos();
                        // captura opción submenú datos primitivos
                        opcionSubmenuDatos = scannerMenu.nextInt();

                        switch (opcionSubmenuDatos) {

                            case 1:
                                Detalles.explicacionByte(scannerMenu);
                                break;
                            case 2:
                                Detalles.explicaciónShort(scannerMenu);
                                break;
                            case 3:
                                Detalles.explicaciónInt(scannerMenu);
                                break;
                            case 4:
                                Detalles.explicaciónInt(scannerMenu);
                                break;
                            case 5:
                                Detalles.expliacaciónFloat(scannerMenu);
                                break;

                            case 6:
                                Detalles.explicacióndouble(scannerMenu);
                                break;

                            case 7:
                                Detalles.explicaciónChar(scannerMenu);
                                break;

                            case 8:
                                Detalles.explicaciónboolean(scannerMenu);
                                break;
                            default:
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                        }
                        // Volver al submenú datos primitivos
                    } while (opcionSubmenuDatos != 9) ; // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                // Opcion menu principal String
                case 2:

                    Detalles.explicacionSｔｒｉｎｇ(scannerMenu);
                    break;

                // Opcion menu principal Constantes
                case 3:
                    Detalles.explicacionCｏｎｓｔａｎｔｅｓ(scannerMenu);
                    break;
                // sub menu tipo operadores
                case 4:
                    do {


                        SubMenus.SubMenuTｉｐｏＯｐｅｒａｄｏｒｅｓ();
                        // captura opcion sub menu tipo operadores
                        opcionSubmenuTipOpe = scannerMenu.nextInt();


                        switch (opcionSubmenuTipOpe) {

                            case 1:
                                // submenú operadores aritmeticos
                                do {
                                    SubMenus.SubMenuTｉｐｏＯｐｅｒａｄｏｒｅｓ();
                                    opcionSubmenuArit = scannerMenu.nextInt();

                                    switch (opcionSubmenuArit) {

                                        case 1:
                                            Detalles.explicacionSuma(scannerMenu);
                                            break;
                                        case 2:
                                            Detalles.explicacionResta(scannerMenu);
                                            break;
                                        case 3:
                                            Detalles.explicacionMultiplicación(scannerMenu);
                                            break;
                                        case 4:
                                            Detalles.explicacionDivisión(scannerMenu);

                                            break;
                                        case 5:
                                            Detalles.explicacionModulo(scannerMenu);
                                            break;
                                        default:
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                            System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");
                                    }
                                } while (opcionSubmenuArit != 6); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 2:
                                do {
                                    SubMenus.SubMenuOperadorRacional();
                                    opcionSubmenuTipRa = scannerMenu.nextInt();

                                    switch (opcionSubmenuTipRa) {
                                        case 1:
                                            Detalles.explicacionIgual(scannerMenu);
                                            break;
                                        case 2:
                                            Detalles.explicacionDistinto(scannerMenu);
                                            break;
                                        case 3:
                                            Detalles.explicacionMayor(scannerMenu);
                                            break;
                                        case 4:
                                            Detalles.explicacionMenor(scannerMenu);
                                            break;
                                        case 5:
                                            Detalles.explicacionMayorIgual(scannerMenu);
                                            break;
                                        case 6:
                                            Detalles.explicacionMenorIgual(scannerMenu);
                                            break;
                                        default:
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                            System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                                    }
                                } while (opcionSubmenuTipRa != 7); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 3:
                                do {


                                    SubMenus.SubMenuOperadorLogicos();
                                    opcionSubmenuLogi = scannerMenu.nextInt();

                                    switch (opcionSubmenuLogi) {
                                        case 1:
                                            Detalles.explicacionAnd(scannerMenu);
                                            break;
                                        case 2:
                                            Detalles.explicacionOr(scannerMenu);
                                            break;
                                        case 3:
                                            Detalles.explicacionNot(scannerMenu);
                                            break;

                                    }
                                } while (opcionSubmenuLogi != 4); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 4:
                                do {

                                    SubMenus.SubMenuOperadorAsignacion();
                                    opcionSubmenuAsig = scannerMenu.nextInt();

                                    switch (opcionSubmenuAsig) {
                                        case 1:
                                            Detalles.explicacionAsignación(scannerMenu);
                                            break;
                                        case 2:
                                            Detalles.explicacionAsignacionSuma(scannerMenu);
                                            break;
                                        case 3:
                                            Detalles.explicacionAsignacionResta(scannerMenu);
                                            break;
                                        case 4:
                                            Detalles.explicacionAsignacionMulti(scannerMenu);
                                            break;
                                        case 5:
                                            Detalles.explicacionAsignacionDivi(scannerMenu);
                                            break;
                                        case 6:
                                            Detalles.explicacionAsigModu(scannerMenu);
                                            break;
                                        default:

                                    }
                                } while (opcionSubmenuAsig != 7); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;
                            case 5:
                                do {
                                    SubMenus.SubMenuoperadorIncrementoDecremento();

                                    opcionSubmenuIncre = scannerMenu.nextInt();

                                    switch (opcionSubmenuIncre) {
                                        case 1:
                                            Detalles.explicacionIncremento(scannerMenu);
                                            break;
                                        case 2:
                                            Detalles.explicacionDecremento(scannerMenu);
                                            break;
                                        case 3:
                                            Detalles.explicacionPreIncremento(scannerMenu);
                                            break;
                                        case 4:
                                            Detalles.explicacionPostIncremento(scannerMenu);
                                            break;
                                        default:
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                            System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                                    }
                                } while (opcionSubmenuIncre != 5); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;
                            default:
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                        }


                    } while (opcionSubmenuTipOpe != 6); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                case 5:
                    do {

                        SubMenus.SubMenuCondiIfElse();
                        opcionSubmenuIf = scannerMenu.nextInt();

                        switch (opcionSubmenuIf) {
                            case 1:
                                Detalles.explicacionCondiIf(scannerMenu);
                                break;

                            case 2:
                                Detalles.explicacionCondiElse(scannerMenu);
                                break;

                            case 3:
                                Detalles.explicacionCondiElseIf(scannerMenu);
                                break;

                            case 4:
                                do {
                                    SubMenus.SubMenuProgramaIf();
                                    opcionSubmenuProgIf = scannerMenu.nextInt();

                                    switch (opcionSubmenuProgIf) {
                                        case 1:
                                            EjercicioProgramas.programaIf(scannerMenu);
                                            break;

                                    }
                                } while (opcionSubmenuProgIf != 2); // salir del menu
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            default:
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                        }
                    } while (opcionSubmenuIf != 5); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                case 6:
                    do {
                        SubMenus.SubMenuCondicionalSwitch();
                        opcionSubmenuSwitc = scannerMenu.nextInt();

                        switch (opcionSubmenuSwitc) {
                            case 1:
                                Detalles.explicacionＳｗｉｔｃｈ(scannerMenu);
                                break;

                            case 2:
                                EjercicioProgramas.programaｓｗｉｔｃｈ(scannerMenu);
                                break;
                        }
                    } while (opcionSubmenuSwitc != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                case 7:
                    do {
                        SubMenus.SubMenuCondＴｅｒｎａｒｉａ();
                        opcionSubmenuTernaria = scannerMenu.nextInt();

                        switch (opcionSubmenuTernaria) {
                            case 1:
                                Detalles.explicacionＴｅｒｎａｒｉａvoid(scannerMenu);
                                break;

                            case 2:

                                EjercicioProgramas.programaTernaria(scannerMenu);
                                break;
                        }

                    } while (opcionSubmenuTernaria != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                case 8:
                    do {

                        SubMenus.SubMenuDoWhile();
                        opcionSubmenuDoWhile = scannerMenu.nextInt();

                        switch (opcionSubmenuDoWhile) {

                            case 1:

                                Detalles.explicacionDoWhile(scannerMenu);

                                break;
                            case 2:
                                EjercicioProgramas.progrmaDoWhile(scannerMenu);
                                break;
                        }

                    } while (opcionSubmenuDoWhile != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                case 9:
                    do {

                        SubMenus.subMenuWhile();

                        opcionSubmenuWhile = scannerMenu.nextInt();

                        switch (opcionSubmenuWhile) {
                            case 1:
                                Detalles.explicacionWhile(scannerMenu);
                                break;
                            case 2:

                                EjercicioProgramas.programaWhile();
                                    break;
                                    
                                }



                        }while (opcionSubmenuWhile != 3); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                case 10:
                    do{

                        SubMenus.subMenuFor();

                        opcionSubmenuFor = scannerMenu.nextInt();

                        switch (opcionSubmenuFor){
                            case 1:
                                Detalles.explicacionFor(scannerMenu);
                                break;
                            case 2:
                                EjercicioProgramas.programaFor(scannerMenu);
                                break;
                            default:
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");
                        }
                    } while (opcionSubmenuFor != 3); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;


                case 0:
                    System.out.println("   \uD83D\uDC4B\uD83C\uDFFC ＨＡＳＴＡ  ＰＲＯＮＴＯ \uD83D\uDC4B\uD83C\uDFFC ");
                    System.out.println(" ⠀⠀⠀⠀⠀⠀⣀⣀⠤⠀⠒⠒⠒⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⢤⡀⣠⣀⣈⣲⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⢀⡔⢁⠄⠀⠀⠀⠀⠀⢈⡽⠋⠙⢍⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⢠⠋⢀⡼⠤⠤⣀⠀⠀⠀⡎⠀⠰⠽⠈⢣⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢰⡏⢰⣿⣁⠀⠀⠈⡅⠀⠀⠱⣄⠀⠀⠀⢀⠇⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢸⠃⠈⣭⠛⠁⢀⡔⣱⠊⠙⡭⠛⢯⣍⣭⡁⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢸⠀⠘⢩⠑⠒⠃⢰⢘⠦⠊⠀⠀⠈⠉⠁⠘⣄⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⢸⡄⠀⠀⠀⠀⠀⡧⠚⠀⠀⢀⣀⡠⠤⠤⠐⠁⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⣷⠀⠀⠀⠀⢀⠃⣠⠔⠊⠁⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠘⣆⠀⠀⢀⡾⠊⠀⠀⠀⠀⢀⣀⣀⣤⡤⣄⠀⡸⡠⠤⠀⢀⠈⢲⠉⡏⠈⡇\n" +
                            "⠀⠀⠈⠃⠄⡀⠀⢰⠏⢳⠀⠀⡼⠀⡏⢀⡇⢸⣤⡇⠃⠀⡇⡜⢀⡞⣰⠃⠀⡇\n" +
                            "⠀⠀⠀⠀⠀⠈⠀⢸⠀⢸⠤⠴⠃⠼⠁⠞⠀⢸⠋⠀⡆⠀⠉⠁⠀⠈⠀⠁⡠⠔\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⡠⠖⠁⡠⠞⠁⠀⢀⡠⠞⢁⣠⠞⠁⠀\n" +
                            "⠀⠀⠀⠀⠀⠴⠚⠁⠀⠀⠀⠀⣀⡤⠊⠀⠀⠀⠀⠀⠀⠠⠋⠐⠊⠉⠀⠀⠀⠀ ");
                    break;
            }


        } while (opcionPrincipal != 0);
        System.out.println(" \uD83D\uDE0E Saliendo...\uD83D\uDDB1\uFE0F  ");
        scannerMenu.close();
    }
}
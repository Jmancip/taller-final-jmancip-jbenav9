package ejecucion;

import menus.SubMenu;
import menus.menuPrincipal;
import org.w3c.dom.ls.LSOutput;
import utilidades.Validaciones;

import java.sql.SQLOutput;
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

        do {

            //Llamado del menu principal
            menuPrincipal.menuPrincipal();

            //Validación de errores
            Validaciones.opcionValida(scannerMenu);

            // captura de la opción del menú principal
            opcionPrincipal = scannerMenu.nextInt();

            // Validación mediante switch
            switch (opcionPrincipal) {

                case 1:
                    do {

                        // Llamado submenú datos primitivos
                        SubMenu.datosPrimitivos();
                        // captura opción submenú datos primitivos
                        opcionSubmenuDatos = scannerMenu.nextInt();

                        switch (opcionSubmenuDatos) {

                            case 1:
                                SubMenu.explicacionByte(scannerMenu);
                                break;
                            case 2:
                                SubMenu.explicaciónShort(scannerMenu);
                                break;
                            case 3:
                               SubMenu.explicaciónInt(scannerMenu);
                                break;
                            case 4:
                                SubMenu.explicaciónInt(scannerMenu);
                                break;
                            case 5:
                                SubMenu.expliacaciónFloat(scannerMenu);
                                break;

                            case 6:
                                SubMenu.explicacióndouble(scannerMenu);
                                break;

                            case 7:
                                SubMenu.explicaciónChar(scannerMenu);
                                break;

                            case 8:
                               SubMenu.explicaciónboolean(scannerMenu);
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

                   SubMenu.sｔｒｉｎｇ(scannerMenu);
                    break;

                // Opcion menu principal Constantes
                case 3:
                    SubMenu.cｏｎｓｔａｎｔｅｓ(scannerMenu);
                    break;
                // sub menu tipo operadores
                case 4:
                    do {


                        SubMenu.tｉｐｏＯｐｅｒａｄｏｒｅｓ();
                        // captura opcion sub menu tipo operadores
                        opcionSubmenuTipOpe = scannerMenu.nextInt();


                        switch (opcionSubmenuTipOpe) {

                            case 1:
                                // submenú operadores aritmeticos
                                do {
                                    SubMenu.tｉｐｏＯｐｅｒａｄｏｒｅｓ();
                                    opcionSubmenuArit = scannerMenu.nextInt();

                                    switch (opcionSubmenuArit) {

                                        case 1:
                                            SubMenu.suma(scannerMenu);
                                            break;
                                        case 2:
                                            SubMenu.resta(scannerMenu);
                                            break;
                                        case 3:
                                            SubMenu.multiplicación(scannerMenu);
                                            break;
                                        case 4:
                                            SubMenu.división(scannerMenu);

                                            break;
                                        case 5:
                                            SubMenu.modulo(scannerMenu);
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
                                    SubMenu.operadorRacional();
                                    opcionSubmenuTipRa = scannerMenu.nextInt();

                                    switch (opcionSubmenuTipRa) {
                                        case 1:
                                            SubMenu.igual(scannerMenu);
                                            break;
                                        case 2:
                                            SubMenu.distinto(scannerMenu);
                                            break;
                                        case 3:
                                            SubMenu.mayor(scannerMenu);
                                            break;
                                        case 4:
                                            SubMenu.menor(scannerMenu);
                                            break;
                                        case 5:
                                            SubMenu.mayorIgual(scannerMenu);
                                            break;
                                        case 6:
                                            SubMenu.menorIgual(scannerMenu);
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


                                    SubMenu.operadorLogicos();
                                    opcionSubmenuLogi = scannerMenu.nextInt();

                                    switch (opcionSubmenuLogi) {
                                        case 1:
                                            SubMenu.and(scannerMenu);
                                            break;
                                        case 2:
                                            SubMenu.or(scannerMenu);
                                            break;
                                        case 3:
                                            SubMenu.not(scannerMenu);
                                            break;

                                    }
                                } while (opcionSubmenuLogi != 4); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 4:
                                do {

                                    SubMenu.operadorAsignacion();
                                    opcionSubmenuAsig = scannerMenu.nextInt();

                                    switch (opcionSubmenuAsig) {
                                        case 1:
                                            SubMenu.asignación(scannerMenu);
                                            break;
                                        case 2:
                                            SubMenu.asignacionSuma(scannerMenu);
                                            break;
                                        case 3:
                                            SubMenu.asignacionResta(scannerMenu);
                                            break;
                                        case 4:
                                            SubMenu.asignacionMulti(scannerMenu);
                                            break;
                                        case 5:
                                            SubMenu.asignacionDivi(scannerMenu);
                                            break;
                                        case 6:
                                            SubMenu.asigModu(scannerMenu);
                                            break;
                                        default:

                                    }
                                } while (opcionSubmenuAsig != 7); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;
                            case 5:
                                do {
                                    SubMenu.operadorIncrementoDecremento();

                                    opcionSubmenuIncre = scannerMenu.nextInt();

                                    switch (opcionSubmenuIncre) {
                                        case 1:
                                            SubMenu.incremento(scannerMenu);
                                            break;
                                        case 2:
                                            SubMenu.decremento(scannerMenu);
                                            break;
                                        case 3:
                                            SubMenu.preIncremento(scannerMenu);
                                            break;
                                        case 4:
                                            SubMenu.postIncremento(scannerMenu);
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

                        opcionSubmenuIf = scannerMenu.nextInt();

                        switch (opcionSubmenuIf) {
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                        \uD83C\uDFB2 Ｑｕｅ ｅｓ ＩＦ                                         ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ La estructura condicional más simple en Java es el if, se evalúa una condición  ⚡\n" +
                                        "⚡ y en caso de que se cumpla se ejecuta el contenido entre las llaves {} o en     ⚡\n" +
                                        "⚡ caso de que se omitan se ejecuta el código hasta el primer «;» por lo tanto si  ⚡\n" +
                                        "⚡ no se usan los {} la condición aplica solo a la siguiente instrucción al if.    ⚡\n" +
                                        "⚡    Ejemplo: // Si la temperatura es mayor que 25                                ⚡\n" +
                                        "⚡    if (temperatura > 25) {                                                      ⚡\n" +
                                        "⚡    System.out.println(\"A la playa!!!\");                                         ⚡\n" +
                                        "⚡   }                                                                             ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                   \uD83C\uDFB2  Ｑｕｅ ｅｓ ＥＬＳＥ                                      ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Con el if solo podemos hacer que se ejecute un fragmento de código o no pero ⚡\n" +
                                        "⚡ en el caso de que no se cumpla la condición no se hace nada (sigue el flujo  ⚡\n" +
                                        "⚡ normal de ejecución) por lo que si queremos que se ejecute otra cosa cuando  ⚡\n" +
                                        "⚡ no se cumpla la condición solo con el if tenemos que hacer otro con la       ⚡\n" +
                                        "⚡ condición inversa provocando que se tenga que comprobar la condición 2 veces ⚡\n" +
                                        "⚡ mientras que si usamos el else solo necesitamos hacer la comprobación una    ⚡\n" +
                                        "⚡ sola vez.                                                                    ⚡\n" +
                                        "⚡ Ejemplo:                                                                     ⚡\n" +
                                        "⚡    // Usando if con else                                                     ⚡\n" +
                                        "⚡    // Si la temperatura es mayor que 25 ... y si no ...                      ⚡\n" +
                                        "⚡       if (temperatura > 25) {                                                ⚡\n" +
                                        "⚡            System.out.println(\"A la playa!!!\");                              ⚡\n" +
                                        "⚡       } else {                                                               ⚡\n" +
                                        "⚡            System.out.println(\"Esperando al buen tiempo...\");                ⚡\n" +
                                        "⚡       }                                                                      ⚡\n");

                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 3:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                      \uD83C\uDFB2 Ｑｕｅ ｅｓ ＥＬＳＥ ＩＦ                      ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Con el ＥＬＳＥ ＩＦ sirve para que si no se cumple la primera condición (la   ⚡\n" +
                                        "⚡ del if principal) se evalue esta nueva condición de modo que se puede        ⚡\n" +
                                        "⚡ concatenar la cantidad de if else que se necesiten para cubrir todos los     ⚡\n" +
                                        "⚡ distintos escenarios que precisen ser tratados de una forma particular,      ⚡\n" +
                                        "⚡ siendo el ultimo else el que se ejecute cuando no se cumpla ninguna condición⚡\n" +
                                        "⚡ (el else es siempre opcional).                                               ⚡\n" +
                                        "⚡ Ejemplo:                                                                     ⚡\n" +
                                        "⚡    if (temperatura > 25) {                                                   ⚡\n" +
                                        "⚡    // Si la temperatura es mayor que 25 ...                                  ⚡\n" +
                                        "⚡        System.out.println(\"A la playa!!!\");                                  ⚡\n" +
                                        "⚡          // si es mayor que 15 y no es mayor que 25 ..                       ⚡\n" +
                                        "⚡        System.out.println(\"A la montaña!!!\");                                ⚡\n" +
                                        "⚡         } else if (temperatura < 5 && nevando) {                             ⚡\n" +
                                        "⚡   // si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25   ⚡\n" +
                                        "⚡       System.out.println(\"A esquiar!!!\"                                      ⚡\n" +
                                        "⚡         } else {                                                             ⚡\n" +
                                        "⚡ // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando⚡\n" +
                                        "⚡       System.out.println(\"A descansar... zZz                                 ⚡\n" +
                                        "⚡   }                                                                          ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 4:
                                do {
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("              ➰  Programa  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ ");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("⚡                   ➰  1- Ejercicio de la Edad                                ⚡");
                                    System.out.println("⚡                   ➰  2- Salir                                               ⚡");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");

                                    opcionSubmenuProgIf = scannerMenu.nextInt();

                                    switch (opcionSubmenuProgIf) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡                                                                           ⚡");
                                            System.out.println("⚡       Digite su edad 🙄 para ver si esta aun joven o cucho 👇🏽             ⚡");
                                            System.out.println("⚡                                                                           ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("");
                                            Scanner scannerEdad = new Scanner(System.in);
                                            int edad = scannerEdad.nextInt();

                                            if (edad <= 12) {
                                                System.out.println("Ｕｓｔｅｄ ｅｓ ｕｎ ｎｉｎ̃ｏ 👶🏽 (｡･∀･)ﾉﾞ");
                                                System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
                                                        "───█▒▒░░░░░░░░░▒▒█───\n" +
                                                        "────█░░█░░░░░█░░█────\n" +
                                                        "─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
                                                        "█░░█─▀▄░░░░░░░▄▀─█░░█");

                                            } else if (edad >= 13 && edad <= 20) {

                                                System.out.println("Ｕｓｔｅｄ ｅｓ Ｊｏｖｅｎ， ｙａ ｓｅ ｅｓｔａ  ｍａｄｕｒａｎｄｏ (⓿_⓿)");
                                                System.out.println("░░░░▄▄▄▄▀▀▀▀▀▀▀▀▄▄▄▄▄▄\n" +
                                                        "░░░░█░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░▀▀▄\n" +
                                                        "░░░█░░░▒▒▒▒▒▒░░░░░░░░▒▒▒░░█\n" +
                                                        "░░█░░░░░░▄██▀▄▄░░░░░▄▄▄░░░█\n" +
                                                        "░▀▒▄▄▄▒░█▀▀▀▀▄▄█░░░██▄▄█░░░█\n" +
                                                        "█▒█▒▄░▀▄▄▄▀░░░░░░░░█░░░▒▒▒▒▒█\n" +
                                                        "█▒█░█▀▄▄░░░░░█▀░░░░▀▄░░▄▀▀▀▄▒█\n" +
                                                        "░█▀▄░█▄░█▀▄▄░▀░▀▀░▄▄▀░░░░█░░█\n" +
                                                        "░░█░░▀▄▀█▄▄░█▀▀▀▄▄▄▄▀▀█▀██░█\n" +
                                                        "░░░█░░██░░▀█▄▄▄█▄▄█▄████░█\n" +
                                                        "░░░░█░░░▀▀▄░█░░░█░███████░█\n" +
                                                        "░░░░░▀▄░░░▀▀▄▄▄█▄█▄█▄█▄▀░░█\n" +
                                                        "░░░░░░░▀▄▄░▒▒▒▒░░░░░░░░░░█\n" +
                                                        "░░░░░░░░░░▀▀▄▄░▒▒▒▒▒▒▒▒▒▒░█\n" +
                                                        "░░░░░░░░░░░░░░▀▄▄▄▄▄░░░░░█");

                                            } else if (edad >= 21 && edad <= 60) {
                                                System.out.println("Ｕｓｔｅｄ ｅｓ ｕｎ ｃｕｃｈｏ 👩🏽‍🎤👨🏽‍，  ａｕｎ ｐｕｅｄｅ ｈａｃｅｒ ａｌｇｏ ( ఠ ͟ʖ ఠ) ");
                                                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                                        "░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░\n" +
                                                        "░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░\n" +
                                                        "░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░\n" +
                                                        "░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░\n" +
                                                        "░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░\n" +
                                                        "░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░\n" +
                                                        "░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░\n" +
                                                        "░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░\n" +
                                                        "░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░\n" +
                                                        "░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░\n" +
                                                        "░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░\n" +
                                                        "░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░\n" +
                                                        "░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░\n" +
                                                        "░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░\n" +
                                                        "░░░░█░░░░░░░░░░░░░░░░░░░░░█░░\n" +
                                                        "░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░\n" +
                                                        "░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░\n" +
                                                        "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

                                            } else {
                                                System.out.println("Ｙａ  ｐａｉｌａｓ 👨🏽‍🦳👵🏽 ⚆_⚆ ｕｓｔｅｄ  ｅｓ  ｕｎ  ａｂｕｅｌｏ .·´¯`(>▂<)´¯`·. ");
                                                System.out.println("───────█████████████████████\n" +
                                                        "────████▀─────────────────▀████\n" +
                                                        "──███▀───────────────────────▀███\n" +
                                                        "─██▀───────────────────────────▀██\n" +
                                                        "█▀───────────────────────────────▀█\n" +
                                                        "█─────────────────────────────────█\n" +
                                                        "█─────────────────────────────────█\n" +
                                                        "█─────────────────────────────────█\n" +
                                                        "█───█████─────────────────█████───█\n" +
                                                        "█──██▓▓▓███─────────────███▓▓▓██──█\n" +
                                                        "█──██▓▓▓▓▓██───────────██▓▓▓▓▓██──█\n" +
                                                        "█──██▓▓▓▓▓▓██─────────██▓▓▓▓▓▓██──█\n" +
                                                        "█▄──████▓▓▓▓██───────██▓▓▓▓████──▄█\n" +
                                                        "▀█▄───▀███▓▓▓██─────██▓▓▓███▀───▄█▀\n" +
                                                        "──█▄────▀█████▀─────▀█████▀────▄█\n" +
                                                        "─▄██───────────▄█─█▄───────────██▄\n" +
                                                        "─███───────────██─██───────────███\n" +
                                                        "─███───────────────────────────███\n" +
                                                        "──▀██──██▀██──█──█──█──██▀██──██▀\n" +
                                                        "───▀████▀─██──█──█──█──██─▀████▀\n" +
                                                        "────▀██▀──██──█──█──█──██──▀██▀\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "──────────██──█──█──█──██\n" +
                                                        "───────────█▄▄█▄▄█▄▄█▄▄█\n");
                                            }
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
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

                        opcionSubmenuSwitc = scannerMenu.nextInt();

                        switch (opcionSubmenuSwitc) {
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡                   📚 Ｑｕｅ ｅｓ Ｓｗｉｔｃｈ                                       ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Es una estructura condicional como if else, con la gran diferencia, de que en   ⚡");
                                System.out.println("⚡ este, solo tenemos una expresión de comparación. En torno a esta, se evaluarán  ⚡");
                                System.out.println("⚡ una serie de selectores de código.                                              ⚡");
                                System.out.println("⚡ Su relevancia radica en su capacidad para simplificar la toma de decisiones     ⚡");
                                System.out.println("⚡ basada en múltiples condiciones.                                                ⚡");
                                System.out.println("⚡ Ejemplo:                                                                        ⚡");
                                System.out.println("⚡     int numero = 2;                                                             ⚡\n" +
                                        "⚡           switch (numero) {                                                     ⚡\n" +
                                        "⚡               case 1:                                                           ⚡\n" +
                                        "⚡                   System.out.println(\"Uno\");                                    ⚡\n" +
                                        "⚡                   break;                                                        ⚡\n" +
                                        "⚡               case 2:                                                           ⚡\n" +
                                        "⚡                   System.out.println(\"Dos\");                                    ⚡\n" +
                                        "⚡                   break;                                                        ⚡\n" +
                                        "⚡               default:                                                          ⚡\n" +
                                        "⚡                   System.out.println(\"Otro número\");                            ⚡\n" +
                                        "⚡                       }                                                         ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡                   📚  Ｐｒｏｇｒａｍａ  ｓｗｉｔｃｈ  📚                                ⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                Scanner scannerSwitch = new Scanner(System.in);
                                System.out.println("⚡                     Digite la nota de 1 a 10 📚                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                int nota = scannerSwitch.nextInt();

                                switch (nota) {
                                    case 1:
                                    case 2:
                                        System.out.println("⚡                       Su calificación es: F                                        ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        break;
                                    case 3:
                                    case 4:
                                        System.out.println("⚡                        Su calificación es: D                                       ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        break;
                                    case 5:
                                    case 6:
                                        System.out.println("⚡                        Su calificación es: C                                       ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        break;
                                    case 7:
                                    case 8:
                                        System.out.println("⚡                        Su calificación es: B                                       ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        break;
                                    case 9:
                                    case 10:
                                        System.out.println("⚡                        Su calificación es: A                                       ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        break;
                                    default:
                                        System.out.println("⚡                 Número no válido, por favor verifique                              ⚡");
                                        System.out.println("⚡                                                                                    ⚡");

                                }
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                        }
                    } while (opcionSubmenuSwitc != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                case 7:
                    do {
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

                        opcionSubmenuTernaria = scannerMenu.nextInt();

                        switch (opcionSubmenuTernaria) {
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡                   📚 Ｑｕｅ ｅｓ Ｔｅｒｎａｒｉａ                                    ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ El operador ternario es una forma concisa de escribir una declaración if-else en⚡");
                                System.out.println("⚡ una sola línea. Se compone de tres partes:                                      ⚡");
                                System.out.println("⚡ -La condición a evaluar (condición booleana)                                    ⚡");
                                System.out.println("⚡ -El valor si la condición es verdadera (valor verdadero)                        ⚡");
                                System.out.println("⚡ -El valor si la condición es falsa (valor falso)                                ⚡");
                                System.out.println("⚡ El operador ternario en Java es una construcción que permite tomar decisiones   ⚡");
                                System.out.println("⚡ basadas en una condición booleana de manera concisa en una sola línea de código.⚡");
                                System.out.println("⚡ vaiable =(condicion) ? valor_si_verdadero : valor_si_falso;                     ⚡");
                                System.out.println("⚡ Ejemplo:                                                                        ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡  int edad = 20;                                                                 ⚡\n" +
                                        "⚡   String mensaje = (edad >= 18) ? \"Eres mayor de edad\" : \"Eres menor de edad\";  ⚡\n" +
                                        "⚡          System.out.println(mensaje);                                           ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡ En este caso, si la variable edad es mayor o igual a 18, se asignará el mensaje ⚡");
                                System.out.println("⚡ \"Eres mayor de edad\"; de lo contrario, se asignará  \"Eres menor de edad         ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡ El operador ternario es útil para simplificar la escritura de expresiones       ⚡");
                                System.out.println("⚡ condicionales simples, pero se debe usar con precaución para mantener la        ⚡");
                                System.out.println("⚡ legibilidad del código, evitando anidar demasiadas expresiones ternarias        ⚡");
                                System.out.println("⚡ complejas en una sola línea.                                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 2:

                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                Scanner scannerTernaria = new Scanner(System.in);
                                System.out.println("⚡               \uD83E\uDD13 Digite un número para ver si es Par o Impar 👇                    ⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                int numero = scannerTernaria.nextInt();

                                String resultado = (numero % 2 == 0) ? "Par" : "Impar";
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡              \uD83E\uDD13 El número es " + resultado + " \uD83E\uDD13                                                ⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                        }

                    } while (opcionSubmenuTernaria != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                case 8:
                    do {
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

                        opcionSubmenuDoWhile = scannerMenu.nextInt();

                        switch (opcionSubmenuDoWhile) {

                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡                   \uD83D\uDD01 Ｑｕｅ ｅｓ Ｄｏ Ｗｈｉｌｅ                                     ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ La sentencia do-while en Java es una estructura de control de ciclo que ejecuta ⚡");
                                System.out.println("⚡ un bloque de código una o más veces mientras se cumple una condición específica.⚡");
                                System.out.println("⚡ La diferencia entre el ciclo while y el ciclo do-while es que en el ciclo while ⚡");
                                System.out.println("⚡ la condición se evalúa antes de ejecutar el código, mientras que en el ciclo    ⚡");
                                System.out.println("⚡ do-while, el código se ejecuta primero y luego se evalúa la condición.          ⚡");
                                System.out.println("⚡ Si la condición se cumple, el ciclo se repite, de lo contrario, el ciclo se     ⚡");
                                System.out.println("⚡ detiene.                                                                        ⚡");
                                System.out.println("⚡ El ciclo do-while en Java se utiliza cuando se desea garantizar que el código   ⚡");
                                System.out.println("⚡ se ejecute al menos una vez, independientemente de si se cumple la condición.   ⚡");
                                System.out.println("⚡ Ejemplo:                                                                        ⚡");
                                System.out.println("⚡                                                                                 ⚡");
                                System.out.println("⚡  Ejemplo 1: El código imprimirá los números del 1 al 10                         ⚡");
                                System.out.println("⚡       int i = 1;                                                                ⚡");
                                System.out.println("⚡       do {                                                                      ⚡");
                                System.out.println("⚡          System.out.println(i);                                                 ⚡");
                                System.out.println("⚡          i++;                                                                   ⚡");
                                System.out.println("⚡          } while (i <= 10);                                                     ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                Scanner scannerDoWhile = new Scanner(System.in);
                                System.out.println("⚡                        \uD83D\uDD01 Adivina el número entre 1 y 10                          ⚡");
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                double rand = Math.random();
                                int numeroSecreto = (int) (rand * 10) + 1;
                                int intento;
                                boolean adivinado = false;

                                do {
                                    System.out.println("⚡                                                                                    ⚡");
                                    System.out.println("⚡        Ｉｎｇｒｅｓａ  ｔｕ  ｎｕｍｅｒｏ  ｐａｒａ  ｑｕｅ  ａｄｉｖｉｎｅ： 👇:              ⚡");
                                    System.out.println("⚡                                                                                    ⚡");
                                    System.out.println("");
                                    intento = scannerDoWhile.nextInt();

                                    if (intento < numeroSecreto) {
                                        System.out.println("⚡                                                                                    ⚡");
                                        System.out.println("⚡            Ｄｅｍａｓｉａｄｏ  ｂａｊｏ， ｉｎｔｅｎｔａ  ｎｕｅｖａｍｅｎｔｅ                 ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                    } else if (intento > numeroSecreto) {
                                        System.out.println("⚡                                                                                    ⚡");
                                        System.out.println("⚡           Ｄｅｍａｓｉａｄｏ  ａｌｔｏ，  ｉｎｔｅｎｔａ  ｎｕｅｖａｍｅｎｔｅ．               ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                    } else {
                                        System.out.println("⚡                                                                                    ⚡");
                                        System.out.println("⚡                             \uD83D\uDC4D  (͠≖ ͜ʖ͠≖)\uD83D\uDC4C                                        ⚡");
                                        System.out.println("⚡      Ｆｅｌｉｃｉｔａｃｉｏｎｅｓ   ｈａｓ   ａｄｉｖｉｎａｄｏ   ｅｌ   ｎｕｍｅｒｏ．         ⚡");
                                        System.out.println("⚡                                                                                    ⚡");
                                        adivinado = true;
                                    }
                                } while (!adivinado);
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                        }

                    } while (opcionSubmenuDoWhile != 3); // salir del menu
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                case 9:
                    do {
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

                        opcionSubmenuWhile = scannerMenu.nextInt();

                        switch (opcionSubmenuWhile) {
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                \uD83C\uDFB2 Bucle while    ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" Esta es una estructura de control que permite ejecutar un bloque de codigo repetidamente meintras que se cumpla una condifición especifica, \n " +
                                        " su funcionamiento inicia con la evaluación de la condicion antes de cada interacion se evalua la condicion que se proporciona en donde si la condicion es verdadera \n" +
                                        " se ejecuta el bloque de codigo dentro del bucle, si la condicion es falsa el bucle termina y el flujo del programa continua con la siguiente linea de codigo .");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 2:
                                Scanner scanner = new Scanner(System.in);

                                int sum = 0;
                                int num;

                                System.out.println("Ingrese números para sumar.");


                                while (true) {
                                    System.out.print("Ingrese un número: ");
                                    num = scanner.nextInt();



                                    for (int i = 1; i<=num; i++){
                                        sum += i;


                                }
                                    System.out.println("La suma de los números ingresados es: " + sum);
                                    System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                    scanner.nextLine(); // Captura el salto de línea restante
                                    scanner.nextLine(); // Espera a que el usuario presione Enter
                                    break;
                                    
                                }


                                                        }
                        }while (opcionSubmenuWhile != 3); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;





                case 10:
                    do{
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

                        opcionSubmenuFor = scannerMenu.nextInt();

                        switch (opcionSubmenuFor){
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                ⚙\uFE0F Ｑｕｅ ｅｓ  Ｂｕｃｌｅ  Ｆｏｒ                              ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ El bucle for es una estructura de control que se usa para repetir en un   ⚡");
                                System.out.println("⚡ bloque de codigo un numero especifico de veces el for se compone de la    ⚡");
                                System.out.println("⚡ siguiente forma: Inialización: Se establece una variable de control que   ⚡");
                                System.out.println("⚡ generalmente se utiliza para contabilizar las iteraziones, esta solo se   ⚡");
                                System.out.println("⚡ ejecuta una vez y al principio del bucle.  Condición: Esta es una         ⚡");
                                System.out.println("⚡ expresión booleana que se evalua antes de cada iteración, si la condición ⚡");
                                System.out.println("⚡ es true el bucle continua de lo contrario termina.  Actualización: Esta   ⚡");
                                System.out.println("⚡ se ejecuta al final de cada una de las iteraciones y generalmente se      ⚡");
                                System.out.println("⚡ utiliza para modificar la variable de control.                            ⚡");
                                System.out.println("⚡ Ejemplo de un bucle For:                                                  ⚡");
                                System.out.println("⚡ for(int i = 0; i < 10; i++)                                               ⚡");
                                System.out.println("⚡                {                                                          ⚡");
                                System.out.println("⚡       System.out.println(i);                                              ⚡");
                                System.out.println("⚡                               }                                           ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                       ⚙\uFE0F  Ｐｒｏｇｒａｍａ  Ｂｕｃｌｅ  Ｆｏｒ                           ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡                                                                                    ⚡");

                                Scanner scanner = new Scanner(System.in);
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡              Ingrese un numero para realizar la suma 👇:                           ⚡");

                                int num  = scanner.nextInt();

                                if (num <= 0 ){
                                    System.out.println("⚡                                                                           ⚡");
                                    System.out.println("⚡       El número debe ser mayor a 0                                        ⚡");
                                    return;
                                }
                                int sum = 0;
                                for (int i = 1; i<=num; i++){
                                    sum += i;
                                }
                                System.out.println("⚡                                                                                    ⚡");
                                System.out.println("⚡                            La Sumatoria es " + sum   +"                                      ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
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
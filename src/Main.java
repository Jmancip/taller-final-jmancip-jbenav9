import org.w3c.dom.ls.LSOutput;

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
            // Menú principal del taller
            System.out.println("\n" +
                    "█▀▄▀█ █▀▀ █▄░█ █░█   █▀▀ ▄▀█ █▀█ █ ▀█▀ █░█ █░░ █▀█   █▀▀ █▀█ █▀█ █▀▄▀█ ▄▀█ █▀▀ █ █▀█ █▄░█\n" +
                    "█░▀░█ ██▄ █░▀█ █▄█   █▄▄ █▀█ █▀▀ █ ░█░ █▄█ █▄▄ █▄█   █▀░ █▄█ █▀▄ █░▀░█ █▀█ █▄▄ █ █▄█ █░▀█");

            System.out.println("─────────────────▄▄▄▄▄▄▄▄▄▄▄\n" +
                    "────────────▄▄▀▀▀░░░░░░░░░░░▀▄▄\n" +
                    "────────▄▄▀▀░░░░░░░▄▄▄▄▄▄▄░░░░░▀▄\n" +
                    "──────▄▀░░░░░░░░░▄▄▄▄▄▄▄▄▄▄▄░░░░░█\n" +
                    "────▄▀░░░░░▄▄▄▄▄▄▄░░░░░░░░░░░▄▄▄▄▄█▄▄\n" +
                    "───▄▀░▐▌░░░░░░░░░░▀▀░░░░░░░▀▀░░░░░░█\n" +
                    "──█░░░▀░░░░░░░▄▀▀▀▄░░░░▄░░░░▄▀▀▀▄░░▐▌\n" +
                    "─█░░░░░░▄▄▄░░▐░░▄░░▌░░░░▀▄░▐░░▄░░▌░░█\n" +
                    "▐▌░░░░▀▀░░░░▄░▀▄▄▄▀░░░░░░░▌░▀▄▄▄▀░░░▐▌\n" +
                    "█░░░░░░░░░░░░▀▄▄▄░░░░░░░░▐░░░░░▄▄▄▀░░█\n" +
                    "█░░░░▄▀░░░░░░░▄▄░░░░░░▄▀░▐░░░▄▄░░░░░░█\n" +
                    "▐▌░░▀░░░░░░░▄▀░░░▐▀░░░░░░░▀▌░░░▀▄░░░░█\n" +
                    "▐▌░░░▐░░░░░▐▌░░░░░▀█░░░░░░░▌░░░░█░░░░█\n" +
                    "─█░░░░░░░░░░░░░░▄░░▀▀▄▄▄▄▀▀░▀▄░░░░░░░█\n" +
                    "─▐▌░░░░░░░░░░░▄▀░░░░▄▄▄▄▄▄░░░░▌░░░░░░█\n" +
                    "──█░░░░░░░░░░▐░░░░▄▀░░░░░░▀▄░░▌░░░░░▐▌\n" +
                    "──▐▌░░░░░░░░░▐░░░░▀░░░▀▀░░░▀░░░░░░░░█\n" +
                    "───█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▐▌\n" +
                    "───▐▌░░░░░░░░░▄███████▄░░░░▄████████▄\n" +
                    "────▀▄████████████▀█████▄▄████████▀██\n" +
                    "───▄██▀▄░░░░░███▀▄██████▀▀██████▀▄███\n" +
                    "───▀▀───▀▀▀▀▀▀█████████▀▀▀▀█████████▀\n" +
                    "───────────────▀▀▀▀▀▀▀──────▀▀▀▀▀▀▀");
            System.out.println("\n" +
                    "░░░▒█ ▒█░▒█ ▒█░░░ ▀█▀ ░█▀▀█ ▒█▄░▒█ 　 ▒█▀▄▀█ ░█▀▀█ ▒█▄░▒█ ▒█▀▀█ ▀█▀ ▒█▀▀█ ▒█▀▀▀ \n" +
                    "░▄░▒█ ▒█░▒█ ▒█░░░ ▒█░ ▒█▄▄█ ▒█▒█▒█ 　 ▒█▒█▒█ ▒█▄▄█ ▒█▒█▒█ ▒█░░░ ▒█░ ▒█▄▄█ ▒█▀▀▀ \n" +
                    "▒█▄▄█ ░▀▄▄▀ ▒█▄▄█ ▄█▄ ▒█░▒█ ▒█░░▀█ 　 ▒█░░▒█ ▒█░▒█ ▒█░░▀█ ▒█▄▄█ ▄█▄ ▒█░░░ ▒█▄▄▄ \n" +
                    "\n" +
                    "░░░▒█ ▒█░▒█ ▒█▀▀▀█ ▒█▄░▒█ 　 ▒█▀▀█ ▒█▀▀▀ ▒█▄░▒█ ░█▀▀█ ▒█░░▒█ ▀█▀ ▒█▀▀▄ ▒█▀▀▀ ▒█▀▀▀█ \n" +
                    "░▄░▒█ ▒█▀▀█ ▒█░░▒█ ▒█▒█▒█ 　 ▒█▀▀▄ ▒█▀▀▀ ▒█▒█▒█ ▒█▄▄█ ░▒█▒█░ ▒█░ ▒█░▒█ ▒█▀▀▀ ░▀▀▀▄▄ \n" +
                    "▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█░░▀█ 　 ▒█▄▄█ ▒█▄▄▄ ▒█░░▀█ ▒█░▒█ ░░▀▄▀░ ▄█▄ ▒█▄▄▀ ▒█▄▄▄ ▒█▄▄▄█");
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
            System.out.println("⚡           \uD83D\uDCD1 １ ＿ Ｄａｔｏｓ  Ｐｒｉｍｉｔｉｖｏｓ                                       ⚡");
            System.out.println("⚡           \uD83E\uDDFE ２ _ Ｓｔｒｉｎｇ                                                        ⚡");
            System.out.println("⚡           \uD83D\uDD17 ３ ＿ Ｃｏｎｓｔａｎｔｅｓ                                                 ⚡");
            System.out.println("⚡           \uD83D\uDD02 ４ ＿ Ｔｉｐｏ  Ｏｐｅｒａｄｏｒｅｓ                                        ⚡");
            System.out.println("⚡           ➰ ５ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ                 ⚡");
            System.out.println("⚡           \uD83D\uDCDA ６ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｓｗｉｔｃｈ                                   ⚡");
            System.out.println("⚡           \uD83E\uDD13 ７ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｔｅｒｎａｒｉａ                                ⚡");
            System.out.println("⚡           \uD83D\uDD01 ８ ＿ Ｂｕｃｌｅ  Ｄｏ Ｗｈｉｌｅ                                          ⚡");
            System.out.println("⚡           ♾\uFE0F ９ ＿ Ｂｕｃｌｅ  Ｗｈｉｌｅ                                              ⚡");
            System.out.println("⚡           ⚙\uFE0F１０ ＿ Ｂｕｃｌｅ  Ｆｏｒ                                                 ⚡");
            System.out.println("⚡           \uD83C\uDFAF ０ ＿ Ｓａｌｉｒ                                                         ⚡");
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

            // opción del usuario
            System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
            // opción invalida del menú
            while (!scannerMenu.hasNextInt()) {
                System.out.println("   \uD83D\uDC80 \uD83D\uDC80  Ｉｎｇｒｅｓｅ  ｎｕｍｅｒｏ  ｖａｌｉｄｏ  ｄｅｌ  ｍｅｎｕ  ｐｏｒ  ｆａｖｏｒ. \uD83D\uDC80 \uD83D\uDC80 ");
                scannerMenu.next();
                System.out.println("                    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5   °_°   ");
                System.out.println(" (づ｡◕‿‿◕｡)づ Ｉｎｇｒｅｓｅ ｓｕ  ｏｐｃｉｏｎ  ｄｅ  ｎｕｅｖｏ  (乛-乛)\uD83C\uDFF4\u200D☠\uFE0F  ");
            }

            // captura de la opción del menú principal
            opcionPrincipal = scannerMenu.nextInt();

            // Validación mediante switch
            switch (opcionPrincipal) {

                case 1:
                    do {
                        // submenú datos primitivos
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
                        // captura opción submenú datos primitivos
                        opcionSubmenuDatos = scannerMenu.nextInt();

                        switch (opcionSubmenuDatos) {

                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println("                          \uD83C\uDFB2  Explicación Byte                                       ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println(" Es utilizado para datos pequeños y optimización de memoria en array grandes \n en su rango de valores puede almacenar valores desde -128 hasta 127 \n en cuanto a su tamaño este ocupa 1 byte (8 bits) en la memoria. \n Ejemplo: byte primerNumero = 19. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                       \uD83C\uDFB2  Explicación  Short                                          ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" Es otro tipo de dato primitivo numérico entero el cual es utilizado para almacenar valores enteros, \n en cuanto a su tamaño este ocupa 2 byte (16 bits) en la memoria, \n en su rango de valores este puede almacenar  desde los -32,768 hasta 32,767. \n Ejemplo: short numCorto =  30,301. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 3:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("           \uD83C\uDFB2  Explicación Int  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("  Es el tipo de dato entero más utilizado comúnmente, \n en cuanto a su tamaño este ocupa 4 byte (32 bits) en memoria, \n en su rango de valores este puede almacenar desde -2,147,483,648 hasta 2,147,483,647. \n Ejemplo: int numero1 = 190291. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            case 4:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("            \uD83C\uDFB2 Explicación Long  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" Es utilizado para valores enteros muy grandes" +
                                        "\n en cuanto a su tamaño este ocupa 8 byte (64 bits) en memoria, " +
                                        "\n en su rango de valores este puede almacenar desde -9,223,372," +
                                        "\n 036,854,775,808 hasta 9,223,372,036,854,775,807." +
                                        " \n Ejemplo long num21 = 2123123123123123123. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine();  // Espera a que el usuario presione Enter
                                break;
                            case 5:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                \uD83C\uDFB2 Expliacación Float  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("  Se utiliza en números con ,(coma) es decir los números decimales con una precisión simple, \n en cuanto a su tamaño ocupa 4 bytes (32 bits) en memoria \n en su rango de valores este puede almacenar un aproximado de 1.4E-45 hasta ±3.4E38, \n también ofrece una precisión de un aproximado de 7 dígitos decimales.\n Ejemplo: float numDec = 3,14. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine();  // Espera a que el usuario presione Enter
                                break;

                            case 6:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                \uD83C\uDFB2 Explicación double  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" Se utiliza en números  con (coma) flotantes y una precisión doble, es útil" +
                                        "\n cuando se requiere números  decimales con alta precisión y un rango amplio, " +
                                        "\n en cuanto a su tamaño ocupa 8 bytes (64 bits) en memoria," +
                                        " \n en su rango de valores este puede almacenar desde ±4.9E-324 hasta ±1.8E308, " +
                                        "\n también  ofrece una precisión de un aproximado 15-16 dígitos decimales significativos. " +
                                        "\n Ejemplo: double numDec = 3.1415926535. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();// Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 7:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                \uD83C\uDFB2 Explicación Char  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Se utiliza para almacenar un solo caracter como letras, digitos y simbolos, " +
                                        "\n en cuanto a su tamaño este ocupa 2 bytes (16 bits) en memoria " +
                                        "\n en cuanto a su rango de valores este puede almacenar un rango de 0 a 65,535" +
                                        "\n los cuales cubren todos los caracteres desde U+0000 hasta U+FFFF." +
                                        " \n Ejemplo: chat simbolo = '#'. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();// Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 8:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("                \uD83C\uDFB2 Explicación boolean  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" Se utiliza para almacenar valores logicos los cuales pueden ser verdadero  " +
                                        "\n o falso y este es utilizado para controlar el flujo en las ejecuciones de" +
                                        "\n las estructuras de cotrol en la programación como son if , for y while " +
                                        "\n en cuanto a su tamaño no se tiene una especificación clara en cuanto a la ocupación  " +
                                        "\n y esta generalmente ocupa el menor espacio posible. " +
                                        "\n Ejemplo boolean verdad = true \n boolean falso = false. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();// Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                            default:
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                                System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                                System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");

                        }
                        // Volver al submenú datos primitivos
                    } while (opcionSubmenuDatos != 9); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                // Opcion menu principal String
                case 2:

                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("                \uD83E\uDDFE ２ _ Ｓｔｒｉｎｇ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("Los Strings son objetos de java con una sintaxis para representar\n" +
                            "una cadena de caracteres, también  se pueden definir para representar textos.\n" +
                            "Un ejemplo claro: es String str = \"Hola Mundo\";\n                            ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("\uD83D\uDE0E Para volver al menu principal presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                    scannerMenu.nextLine(); // Captura el salto de línea restante
                    scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                    break;

                // Opcion menu principal Constantes
                case 3:
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("              \uD83D\uDD17 ３ ＿ Ｃｏｎｓｔａｎｔｅｓ   ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("Las constantes son representadas mediante  variables las cuales \n" +
                            "no se pueden modificar una vez que se les asigne el valor y se utilizan la.\n" +
                            "palabra clave final\";\n" +
                            "Un ejemplo de definición  es: \n public static final String txt_Mensaje = \"Bienvenido al semillero!\"\n ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("\uD83D\uDE0E Para volver al menu principal presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                    scannerMenu.nextLine(); // Captura el salto de línea restante
                    scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                    break;
                // sub menu tipo operadores
                case 4:
                    do {

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

                        // captura opcion sub menu tipo operadores
                        opcionSubmenuTipOpe = scannerMenu.nextInt();


                        switch (opcionSubmenuTipOpe) {

                            case 1:
                                // submenú operadores aritmeticos
                                do {
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


                                    // captura opcion submenúoperador Aritmético
                                    opcionSubmenuArit = scannerMenu.nextInt();

                                    switch (opcionSubmenuArit) {

                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("              \uD83D\uDD02  Suma  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para la adición de dos operadores, \n Ejemplo: int suma = 1 + 1, suma = 2. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Resta  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para la sustracción de dos operadores, \n Ejemplo: int resta = 2 - 1, resta = 1. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Multiplicación  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para la multiplicación de dos operadores, \n Ejemplo: int multiplicación = 5 * 2, multiplicación = 10. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  División  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para la división de dos operadores, \n Ejemplo: int división = 4 '\' 2, división = 2. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter

                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Modulo  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para la devolver el residuo de una división de dos operadores, \n Ejemplo: int modulo = 10 '%' 3, división = 1.");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
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


                                    opcionSubmenuTipRa = scannerMenu.nextInt();

                                    switch (opcionSubmenuTipRa) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Igual a ==  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si dos valores son iguales, \n Ejemplo: boolean igual = 1 = 1, igual = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Distinto de =!  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si dos valores son diferentes, \n Ejemplo: boolean distinto = 2 =! 1, distinto = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Mayor que >  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("  Esta se utiliza para comprobar si el primer valor es mayor que el segundo, \n Ejemplo: boolean mayor = 4 > 2, mayor = true. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Menor que <  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta se utiliza para comprobar si el primer valor es menor que el segundo, \n Ejemplo: boolean menor = 1 < 3, menor = true. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Mayor o igual que >=   ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es mayor o igual que el segundo, \n Ejemplo: boolean variable = 5 >= 5, variable = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 6:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Menor o igual que <=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es menor o igual que el segundo, \n Ejemplo: boolean variable = 4 <= 5, variable = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
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
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("              \uD83D\uDCD1 3 ＿ Operador Lógicos ");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 1- And &&                       ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 2- Or ||                        ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 3- Not !                        ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 4- Salir                        ⚡");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");

                                    opcionSubmenuLogi = scannerMenu.nextInt();

                                    switch (opcionSubmenuLogi) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  And &&    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta devuelve true si en ambos casos los operadores son verdaderos, \n Ejemplo: true && true = true.");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Or ||    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta devuelve true si al menos uno de los operadores es verdadero, \n Ejemplo: true && true = true. \n Ejemplo: true && false = true. ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Not !    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta invierte o niega el valor del operador, \n Ejemplo: !true = false. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;

                                    }
                                } while (opcionSubmenuLogi != 4); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 4:
                                do {
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
                                    opcionSubmenuAsig = scannerMenu.nextInt();

                                    switch (opcionSubmenuAsig) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("               \uD83C\uDFB2  Asignación =    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("  Esta asigna un valor a una variable, \n Ejemplo: int valor = 5 .");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("             \uD83C\uDFB2  Asignación con suma +=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta suma el valor de la derecha al operador de la izquierda y luego este asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor += 10, valor = 20 .");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Asignación con resta -    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta resta el valor de la derecha al operador de la izquierda y luego este asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor -= 10, valor = 0 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Asignación con multiplicación  *=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("  Esta multiplica el valor de la izquierda por el valor de la derecha y asigna el valor a la variable izquierda, \n Ejemplo: int valor = 5, valor *= 10, valor = 50 .");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Asignación con división  /=     ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta divide el operador izquierdo por el valor de la derecha y asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 20, valor /= 5, valor = 4 .");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 6:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2  Asignación con modulo  %=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta calcula el módulo del operador izquierdo por el valor de la derecha " +
                                                    "\n y asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor %= 3, valor = 1 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        default:

                                    }
                                } while (opcionSubmenuAsig != 7); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;
                            case 5:
                                do {
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

                                    opcionSubmenuIncre = scannerMenu.nextInt();

                                    switch (opcionSubmenuIncre) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2 Incremento ++    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println(" Esta aumenta el valor de una variable en 1, \n Ejemplo: int inc = 10, inc++, inc = 11 .");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2 Decremento --    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta disminuye el valor de una variable en 1, \n Ejemplo: int dec = 10, dec--, inc = 9 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("            \uD83C\uDFB2 Pre incremento ++variable    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta incrementa el valor de una variable antes de su uso, \n Ejemplo: int pre = 10 int pre1 = i++, pre = 11 pre1 = 11 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("                \uD83C\uDFB2 Post incremento variable++    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta incrementa el valor de una variable después de su uso, \n Ejemplo: int pos = 10 int pos1 = i++, pre = 11 pre1 = 11 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine(); // Captura el salto de línea restante
                                            scannerMenu.nextLine(); // Espera a que el usuario presione Enter
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
                        System.out.println("⚡                   ♾\uFE0F ９ ＿ Ｂｕｃｌｅ  Ｗｈｉｌｅ                                      ⚡");
                        System.out.println("⚡                                                                                    ⚡");
                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                        System.out.println("⚡                   ♾\uFE0F  1- Ｅｘｐｌｉｃａｃｉｏｎ   Ｗｈｉｌｅ                             ⚡");
                        System.out.println("⚡                   ♾\uFE0F  2- Ｐｒｏｇｒａｍａ   Ｗｈｉｌｅ                                  ⚡");
                        System.out.println("⚡                   ♾\uFE0F  3- Ｖｏｌｖｅｒ  ａｌ  ｍｅｎｕ  Ａｎｔｅｒｉｏｒ                   ⚡");
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
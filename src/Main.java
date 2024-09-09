import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scannerMenu = new Scanner(System.in);

        int opcionPrincipal; // Menu principal del programa
        int opcionSubmenuDatos; // Sub menú datos primitivos
        int opcionSubmenuTipOpe; // sub menú tipo operadores
        int opcionSubmenuArit; // sub menú tipo aritmético
        int opcionSubmenuTipRa; // sub menú tipo racional
        int opcionSubmenuLogi; // sub menú tipo lógicos
        int opcionSubmenuAsig; // sub menú tipo asignación
        int opcionSubmenuIncre; // sub menú incremental
        int opcionSubmenuIf; // sub menú if




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
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
            System.out.println("✔       \uD83D\uDCD1 １ ＿ Ｄａｔｏｓ  Ｐｒｉｍｉｔｉｖｏｓ                                    ✔");
            System.out.println("✔       \uD83E\uDDFE ２ _ Ｓｔｒｉｎｇ                                                     ✔");
            System.out.println("✔       \uD83D\uDD17 ３ ＿ Ｃｏｎｓｔａｎｔｅｓ                                             ✔");
            System.out.println("✔       \uD83D\uDD02 ４ ＿ Ｔｉｐｏ  Ｏｐｅｒａｄｏｒｅｓ                                     ✔");
            System.out.println("✔       ➰ ５ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ                         ✔");
            System.out.println("✔       d                                       ✔");
            System.out.println("✔       ♾\uFE0F ９ ＿ Ｂｕｃｌｅ  Ｗｈｉｌｅ                                                ✔");
            System.out.println("✔       ⚙\uFE0F１０ ＿ Ｂｕｃｌｅ  Ｆｏｒ                                                   ✔");
            System.out.println("✔       \uD83C\uDFAF ０ ＿ Ｓａｌｉｒ                                                      ✔");
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

            // opción del usuario
            System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
           // opcion invalida del menu
            while (!scannerMenu.hasNextInt()) {
                System.out.println("   \uD83D\uDC80 \uD83D\uDC80  Ｉｎｇｒｅｓｅ  ｎｕｍｅｒｏ  ｖａｌｉｄｏ  ｄｅｌ  ｍｅｎｕ  ｐｏｒ  ｆａｖｏｒ. \uD83D\uDC80 \uD83D\uDC80 ");
                scannerMenu.next();
                System.out.println("                    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5   °_°   ");
                System.out.println(" (づ｡◕‿‿◕｡)づ Ｉｎｇｒｅｓｅ ｓｕ  ｏｐｃｉｏｎ  ｄｅ  ｎｕｅｖｏ  (乛-乛)\uD83C\uDFF4\u200D☠\uFE0F  ");
            }

            // captura de la opcion del menu principal
            opcionPrincipal = scannerMenu.nextInt();

            // Validación mediante switch
            switch (opcionPrincipal) {

                case 1:
                    do {
                        // sub menu datos primitivos
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

                        // captura opcion sub menu datos primitivos
                        opcionSubmenuDatos = scannerMenu.nextInt();

                        switch (opcionSubmenuDatos) {

                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println("         \uD83C\uDFB2  Explicación Byte                                       ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println("⚡ Es utilizado para datos pequeños y optimización de memoria en array grandes \n en su rango de valores puede almacenar valores desde -128 hasta 127 \n en cuanto a su tamaño este ocupa 1 byte (8 bits) en la memoria. \n Ejemplo: byte primerNumero = 19. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡   ");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            case 2:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println(" \uD83C\uDFB2  Explicación  Short                                          ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Es otro tipo de dato primitivo numérico entero el cual es utilizado para almacenar valores enteros, \n en cuanto a su tamaño este ocupa 2 byte (16 bits) en la memoria,\n en su rango de valores este puede almacenar  desde los -32,768 hasta 32,767. \n Ejemplo: short numCorto =  30,301. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            case 3:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2  Explicación Int  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Es el tipo de dato entero más utilizado comúnmente, \n en cuanto a su tamaño este ocupa 4 byte (32 bits) en memoria, \n en su rango de valores este puede almacenar desde -2,147,483,648 hasta 2,147,483,647. \n Ejemplo: int numero1 = 190291. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            case 4:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 Explicación Long  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Es utilizado para valores enteros muy grandes \n en cuanto a su tamaño este ocupa 8 byte (64 bits) en memoria, \n en su rango de valores este puede almacenar desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. \n Ejemplo long num21 = 2123123123123123123. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            case 5:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 Explicación Float  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Se utiliza en números con,(coma) es decir los números decimales con una precisión simple, \n en cuanto a su tamaño ocupa 4 bytes (32 bits) en memoria \n en su rango de valores este puede almacenar un aproximado de 1.4E-45 hasta ±3.4E38, \n también ofrece una precisión de un aproximado de 7 dígitos decimales.\n Ejemplo: float numDec = 3,14. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;

                            case 6:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 Explicación double  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Se utiliza en números con (coma) flotantes y una precisión doble, es útil cuando se requiere números decimales con alta precisión y un rango amplio, \n en cuanto a su tamaño ocupa 8 bytes (64 bits) en memoria, \n en su rango de valores este puede almacenar desde ±4.9E-324 hasta ±1.8E308, \n también ofrece una precisión de un aproximado 15-16 dígitos decimales significativos. \n Ejemplo: double numDec = 3.1415926535. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;

                            case 7:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 Explicación Char  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Se utiliza para almacenar un solo carácter como letras, dígitos y símbolos, \n en cuanto a su tamaño este ocupa 2 bytes (16 bits) en memoria \n en cuanto a su rango de valores este puede almacenar un rango de 0 a 65,535 los cuales cubren todos los caracteres desde U+0000 hasta U+FFFF. \n Ejemplo: chat símbolo = '#'. ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;

                            case 8:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 3- Explicación boolean  ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Se utiliza para almacenar valores lógicos los cuales pueden ser verdadero o falso y este es utilizado para controlar el flujo en las ejecuciones de las estructuras de control en la programación como son if,for y while, \n en cuanto a su tamaño no se tiene una especificación clara en cuanto a la ocupación y esta generalmente ocupa el menor espacio posible. \n Ejemplo boolean verdad = true \n boolean falso = false. ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            default:


                        }
                        // Volver al sub menu datos primitivos
                    } while (opcionSubmenuDatos != 9); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                    // Opcion menu principal String
                case 2:

                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("String\n");
                    System.out.println("Los Strings son objetos de java con una sintaxis para representar\n" +
                            "una cadena de caracteres, también se pueden definir para representar textos.\n" +
                            "Un ejemplo claro: es String str = \"Hola Mundo\";\n                            ");
                    System.out.println("\uD83D\uDE0E Para volver al menu principal presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                    scannerMenu.nextLine();
                    scannerMenu.nextLine();
                    break;

                // Opcion menu principal Constantes
                case 3:
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("Constantes\n");
                    System.out.println("Las constantes son representadas mediante  variables las cuales \n" +
                            "no se pueden modificar una vez que se les asigne el valor y se utilizan la.\n" +
                            "palabra clave final\";\n" +
                            "Un ejemplo de definición es:  public static final String txt_Mensaje = \"Bienvenido al semillero!\"\n                      ");
                    System.out.println("\uD83D\uDE0E Para volver al menu principal presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                    scannerMenu.nextLine();
                    scannerMenu.nextLine();
                    break;
                default:
                    System.out.println("\uD83D\uDE0E Para volver al menu principal presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                    scannerMenu.nextLine();
                    scannerMenu.nextLine();
                    break;

                // sub menu tipo operadores
                case 4:
                    do {

                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                        System.out.println("              \uD83D\uDCD1 １ ＿ Tipos de operadores ");
                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 1- Operador Aritmetico                         ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 2- Operador racional                           ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 3- Operadores logicos                          ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 4- Operadores de asignación       ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 5- Operadores de incremento y decremento       ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 6- Volver al menu anterior                     ⚡");
                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                        // captura opcion sub menu tipo operadores
                        opcionSubmenuTipOpe = scannerMenu.nextInt();


                        switch (opcionSubmenuTipOpe) {

                            case 1:
                                // sub menu operadores aritmeticos
                                do {
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("              \uD83D\uDCD1 １ ＿ Operador Aritmetico ");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 1- Suma                         ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 2- Resta                        ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 3- Multiplicación               ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 4- División                     ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 5- Modulo                       ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 6- Volver al menu anterior      ⚡");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                                    // captura opcion sub menu operador aritmetico
                                    opcionSubmenuArit = scannerMenu.nextInt();

                                    switch (opcionSubmenuArit) {

                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Suma  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para la adición de dos operadores, \n Ejemplo: int suma = 1 + 1, suma = 2. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Resta  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para la sustracción de dos operadores, \n Ejemplo: int resta = 2 - 1, resta = 1. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  División  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para la división de dos operadores, \n Ejemplo: int división = 4 '\' 2, división = 2. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Modulo  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para la devolver el residuo de una división de dos operadores, \n Ejemplo: int modulo = 10 '%' 3, división = 1. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Multiplicación  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para la multiplicación de dos operadores, \n Ejemplo: int multiplicación = 5 * 2, multiplicación = 10. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        default:

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
                                    System.out.println("⚡                   \uD83C\uDFB2 7- Salir                        ⚡");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                                    opcionSubmenuTipRa = scannerMenu.nextInt();

                                    switch (opcionSubmenuTipRa) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Igual a ==  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si dos valores son iguales, \n Ejemplo: boolean igual = 1 = 1, igual = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Distinto de =!  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si dos valores son diferentes, \n Ejemplo: boolean distinto = 2 =! 1, distinto = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Mayor que >  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es mayor que el segundo, \n Ejemplo: boolean mayor = 4 > 2, mayor = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Menor que <  ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es menor que el segundo, \n Ejemplo: boolean menor = 1 < 3, menor = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Mayor o igual que >=   ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es mayor o igual que el segundo, \n Ejemplo: boolean variable = 5 >= 5, variable = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 6:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Menor o igual que <=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta se utiliza para comprobar si el primer valor es menor o igual que el segundo, \n Ejemplo: boolean variable = 4 <= 5, variable = true. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        default:

                                    }
                                } while (opcionSubmenuTipRa != 7); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;

                            case 3:
                                do {
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("              \uD83D\uDCD1 3 ＿ Operador Logicos ");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 1- And &&                       ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 2- Or ||                        ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 3- Not !                        ⚡");
                                    System.out.println("⚡                   \uD83C\uDFB2 4- Salir                        ⚡");
                                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                                    opcionSubmenuLogi = scannerMenu.nextInt();

                                    switch (opcionSubmenuLogi) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  And &&    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta devuelve true si en ambos casos los operadores son verdaderos, \n Ejemplo: true && true = true.⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Or ||    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta devuelve true si al menos uno de los operadores es verdadero, \n Ejemplo: true && true = true. \n Ejemplo: true && false = true.⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Not !    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta invierte o niega el valor del operador, \n Ejemplo: !true = false. ⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;

                                    }
                                }while (opcionSubmenuLogi != 4); // Volver al Menú Principal
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

                                    opcionSubmenuAsig = scannerMenu.nextInt();

                                    switch (opcionSubmenuAsig) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación =    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta asigna un valor a una variable, \n Ejemplo: int valor = 5 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación con suma +=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta suma el valor de la derecha al operador de la izquierda y luego este asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor += 10, valor = 20 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación con resta -    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta resta el valor de la derecha al operador de la izquierda y luego este asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor -= 10, valor = 0 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación con multiplicación  *=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta multiplica el valor de la izquierda por el valor de la derecha y asigna el valor a la variable izquierda, \n Ejemplo: int valor = 5, valor *= 10, valor = 50 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 5:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación con división  /=     ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta divide el operador izquierdo por el valor de la derecha y asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 20, valor /= 5, valor = 4 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 6:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2  Asignación con modulo  %=    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta calcula el módulo del operador izquierdo por el valor de la derecha y asigna el resultado a la variable izquierda, \n Ejemplo: int valor = 10, valor %= 3, valor = 1 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
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

                                    opcionSubmenuIncre = scannerMenu.nextInt();

                                    switch (opcionSubmenuIncre) {
                                        case 1:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2 Incremento ++    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta aumenta el valor de una variable en 1, \n Ejemplo: int inc = 10, inc++, inc = 11 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2 Decremento --    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta disminuye el valor de una variable en 1, \n Ejemplo: int dec = 10, dec--, inc = 9 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 3:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2 Pre incremento ++variable    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta incrementa el valor de una variable antes de su uso, \n Ejemplo: int pre = 10 int pre1 = i++, pre = 11 pre1 = 11 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                        case 4:
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("       \uD83C\uDFB2 Post incremento variable++    ");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("⚡ Esta incrementa el valor de una variable después de su uso, \n Ejemplo: int pos = 10 int pos1 = i++, pre = 11 pre1 = 11 .⚡");
                                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                            scannerMenu.nextLine();
                                            scannerMenu.nextLine();
                                            break;
                                            default:

                                    }
                                } while (opcionSubmenuIncre != 5); // Volver al Menú Principal
                                System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                                break;
                        }



                    }while (opcionSubmenuTipOpe != 6); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;

                case 5:
                    do {

                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                        System.out.println("              \uD83D\uDCD1 Ｃｏｎｄｉｃｉｏｎａｌ  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ ");
                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 1- Explicación If                         ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 2- Explicación Else If                           ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 3- Explicación Else                          ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 4- Programa de If, Else If y Else       ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 5- Operadores de incremento y decremento       ⚡");
                        System.out.println("⚡                   \uD83C\uDFB2 6- Volver al menu anterior                     ⚡");
                        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

                        opcionSubmenuIf = scannerMenu.nextInt();

                        switch (opcionSubmenuIf) {
                            case 1:
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("       \uD83C\uDFB2 Explicación If    ");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("⚡ Es una estructura de control condicional la cual permite ejecutar bloques \n de codigo  que se basan en la evaluación de una condición booleana. \n Su estructura se basa de la siguiente manera: \n if (condición) {\n } \n Ejemplo de un if: \n int numero = 100 \n if(numero>50) { \n System.out.println(El número es mayor que 5); \n } ⚡");
                                System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                                System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
                                scannerMenu.nextLine();
                                scannerMenu.nextLine();
                                break;
                            default:

                        }
                    } while (opcionSubmenuIf != 5); // Volver al Menú Principal
                    System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
                    break;
                        }



        } while (opcionPrincipal < 10);
        System.out.println(" \uD83D\uDE0E Saliendo...\uD83D\uDDB1\uFE0F  ");
    }
}


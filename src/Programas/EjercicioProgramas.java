package Programas;

import java.util.Scanner;

public class EjercicioProgramas {

    public static void programaIf(Scanner scannerMenu){

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

    }

    public static void programaｓｗｉｔｃｈ (Scanner scannerMenu){
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

    }

    public static void programaTernaria(Scanner scannerMenu){

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

    }

    public static void progrmaDoWhile(Scanner scannerMenu){
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
    }

    public static void programaWhile() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Ingrese números para sumar.");


        while (true) {
            System.out.print("Ingrese un número: ");
            num = scanner.nextInt();


            for (int i = 1; i <= num; i++) {
                sum += i;


            }
            System.out.println("La suma de los números ingresados es: " + sum);
            System.out.println("\uD83D\uDE0E Para continuar presione la tecla enter \uD83D\uDDB1\uFE0F \n ");
            scanner.nextLine(); // Captura el salto de línea restante
            scanner.nextLine(); // Espera a que el usuario presione Enter
        }
    }

    public static void programaFor(Scanner scannerMenu){
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
    }

    }




import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scannerMenu = new Scanner(System.in);


        int opcion = 0;

        do {
            // Menú del taller
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
                    "░░█ █░█ █░░ █ ▄▀█ █▄░█   █▀▄▀█ ▄▀█ █▄░█ █▀▀ █ █▀█ █▀▀\n" +
                    "█▄█ █▄█ █▄▄ █ █▀█ █░▀█   █░▀░█ █▀█ █░▀█ █▄▄ █ █▀▀ ██▄");
            System.out.println("\n" +
                    "░░█ █░█ █▀█ █▄░█       █▄▄ █▀▀ █▄░█ ▄▀█ █░█ █ █▀▄ █▀▀ █▀\n" +
                    "█▄█ █▀█ █▄█ █░▀█       █▄█ ██▄ █░▀█ █▀█ ▀▄▀ █ █▄▀ ██▄ ▄█");
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
            System.out.println("✔       \uD83D\uDCD1 １ ＿ Ｄａｔｏｓ  Ｐｒｉｍｉｔｉｖｏｓ                                   ✔");
            System.out.println("✔       \uD83E\uDDFE ２ _ Ｓｔｒｉｎｇ                                                     ✔");
            System.out.println("✔       \uD83D\uDD17 ３ ＿ Ｃｏｎｓｔａｎｔｅｓ                                             ✔");
            System.out.println("✔       \uD83D\uDD02 ４ ＿ Ｔｉｐｏ  Ｏｐｅｒａｄｏｒｅｓ                                     ✔");
            System.out.println("✔       ➰ ５ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  ＩＦ，  ＥＬＳＥ，  ＥＬＳＥ ＩＦ              ✔");
            System.out.println("✔       \uD83D\uDCDA ６ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｓｗｉｔｃｈ                                ✔");
            System.out.println("✔       \uD83E\uDD13 ７ ＿ Ｃｏｎｄｉｃｉｏｎａｌ  Ｔｅｒｎａｒｉａ                             ✔");
            System.out.println("✔       \uD83D\uDD01 ８ ＿ Ｂｕｃｌｅ  Ｄｏ Ｗｈｉｌｅ                                       ✔");
            System.out.println("✔       ♾\uFE0F ９ ＿ Ｂｕｃｌｅ  Ｗｈｉｌｅ                                           ✔");
            System.out.println("✔       ⚙\uFE0F１０ ＿ Ｂｕｃｌｅ  Ｆｏｒ                                              ✔");
            System.out.println("✔       \uD83C\uDFAF ０ ＿ Ｓａｌｉｒ                                                      ✔");
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

            // opción del usuario
            System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
            while (!scannerMenu.hasNextInt()) {
                System.out.println("   \uD83D\uDC80 \uD83D\uDC80  Ｉｎｇｒｅｓｅ  ｎｕｍｅｒｏ  ｖａｌｉｄｏ  ｄｅｌ  ｍｅｎｕ  ｐｏｒ  ｆａｖｏｒ. \uD83D\uDC80 \uD83D\uDC80 ");
                scannerMenu.next();
                System.out.println("                    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5   °_°   ");
                System.out.println(" (づ｡◕‿‿◕｡)づ Ｉｎｇｒｅｓｅ ｓｕ  ｏｐｃｉｏｎ  ｄｅ  ｎｕｅｖｏ  (乛-乛)\uD83C\uDFF4\u200D☠\uFE0F  ");
            }
            opcion = scannerMenu.nextInt();

            // Validación mediante switch
            switch (opcion) {
                case 1:

                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("              \uD83D\uDCD1 １ ＿ Ｄａｔｏｓ  Ｐｒｉｍｉｔｉｖｏｓ ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("⚡                   \uD83C\uDFB2 1- Que es byte                                           ⚡");
                    System.out.println("⚡                   \uD83C\uDFB2 2- Que es Short                                          ⚡");
                    System.out.println("⚡                   \uD83C\uDFB2 3- Que es Int                                            ⚡");
                    System.out.println("⚡                   \uD83C\uDFB2 4- Que es long                                           ⚡");
                    System.out.println("⚡                   \uD83C\uDFB2 5- Que es float                                          ⚡");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");


                    int opcion1 = scannerMenu.nextInt();

                    switch (opcion1) {

                        case 1:
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            System.out.println("⚡  Expliacaió Byte                                                          ⚡");
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            System.out.println("⚡ se utiliza  para xxxxxxxxxxxxxx                                           ⚡");
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            break;

                        case 2:
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            System.out.println("⚡  Expliacaió Short                                                          ⚡");
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            System.out.println("⚡ se utiliza  para xxxxxxxxxxxxxx                                           ⚡");
                            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                            break;
                        default:
                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5  ");
                            System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
                            System.out.println("    (⌐■_■) --︻╦╤─ ¬-------- ");
                    }

                    break;


                    }
                case 2:
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("             \uD83E\uDDFE ２ _ Ｓｔｒｉｎｇ   ");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("⚡                   se utilza para XXXXXXXXXXX                                 ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    break;

                case 3:
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("                \uD83D\uDD17 ３ ＿ Ｃｏｎｓｔａｎｔｅｓ                            ");
                    System.out.println("⚡                   se utilza para XXXXXXXXXXX                                 ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    break;

                case 4:
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
                    System.out.println("                \uD83D\uDD02 ４ ＿ Ｔｉｐｏ  Ｏｐｅｒａｄｏｒｅｓ                     ");
                    System.out.println("⚡                   se utilza para XXXXXXXXXXX                                 ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡                                                                              ⚡");
                    System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
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
                default:
                    System.out.println(" ＯＰＣＩＯＮ  ＮＯ  ＶＡＬＩＤＡ (◣_◢) ");
            }
            //
            if (opcion != 0) {
                System.out.println(" \uD83D\uDE0E Ｐａｒａ  ｃｏｎｔｉｎｕａｒ  ｄａｒ  Ｅｎｔｅｒ \uD83D\uDDB1\uFE0F  ");
                scannerMenu.nextLine();
                scannerMenu.nextLine();
                for (int i = 0; i < 10; i++) {
                    System.out.println("");
                }

            }

        } while (opcion != 0);

        scannerMenu.close();
    }
}

package Menus;

import Explicaciones.Detalles;
import java.util.Scanner;
public class MenuPrincipal {
    private Scanner scanner;
    SubMenus subMenus = new SubMenus();
    Detalles detalles = new Detalles();
    public MenuPrincipal() {
        scanner = new Scanner(System.in);
    }
    private int mostrarMenu() {
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
        System.out.println(" \uD83D\uDC49  Ｄｉｇｉｔｅ  ｕｎａ   ｏｐｃｉｏｎ  ｄｅｌ  Ｍｅｎｕ  \uD83D\uDC48 ");
        return scanner.nextInt(); // Captura la opción seleccionada
    }
    public void ejecutarMenuPrincipal() {
        int opcionMenuPrincipal;
        do {
            opcionMenuPrincipal = mostrarMenu();
            switch (opcionMenuPrincipal) {
                case 1:
                    subMenus.ejecutarSubMenuDatosPrimitivos();
                    break;
                case 2:
                    detalles.explicacionString();
                    break;
                case 3:
                    detalles.explicacionConstantes();
                    break;
                case 4:
                    subMenus.ejecutarSuMenuTipoOperadores();
                    break;
                case 5:
                    subMenus.ejecutarSubMenuCondiIfElse();
                    break;
                case 6:
                    subMenus.ejecutarSubCondicionalSwitch();
                    break;
                case 7:
                    subMenus.ejecutarSubmenuCondＴｅｒｎａｒｉａ();
                    break;
                case 8:
                    subMenus.ejecutarSubMenuCondDoWhile();
                    break;
                case 9:
                    subMenus.ejecutarSubMenuWhile();
                    break;
                case 10:
                    subMenus.ejecutarFor();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenuPrincipal != 0);
    }
}




package Utilidades;

import java.util.Scanner;

public class Validaciones {

    public static void opcionValida(Scanner scannerMenu) {

        while (!scannerMenu.hasNextInt()) {
            System.out.println("   \uD83D\uDC80 \uD83D\uDC80  Ｉｎｇｒｅｓｅ  ｎｕｍｅｒｏ  ｖａｌｉｄｏ  ｄｅｌ  ｍｅｎｕ  ｐｏｒ  ｆａｖｏｒ. \uD83D\uDC80 \uD83D\uDC80 ");
            scannerMenu.next();
            System.out.println("                    (⌐■_■) --︻╦╤─ ¬-------- \uD83D\uDCA5   °_°   ");
            System.out.println(" (づ｡◕‿‿◕｡)づ Ｉｎｇｒｅｓｅ ｓｕ  ｏｐｃｉｏｎ  ｄｅ  ｎｕｅｖｏ  (乛-乛)\uD83C\uDFF4\u200D☠\uFE0F  ");
        }
    }

    int opcionSubmenuDatos;

    public static int subMenuDatosPrimitivos(int opcionSubmenuDatos) {

        while (opcionSubmenuDatos != 9) ; // Volver al Menú Principal
        System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
        return opcionSubmenuDatos;
    }

    int opcionSubmenuArit;
    public static int opcionSubmenuArit (int opcionSubmenuArit){

        while (opcionSubmenuArit != 6); // Volver al Menú Principal
        System.out.println(" \uD83D\uDE0E Volviendo al menu anterior...\uD83D\uDDB1\uFE0F  ");
        return opcionSubmenuArit;
    }

}

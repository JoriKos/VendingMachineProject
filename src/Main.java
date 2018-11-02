import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int G = 320;
        System.out.println(" __     __  ________  __    __  _______   ______  __    __   ______          \n" +
                "/  |   /  |/        |/  \\  /  |/       \\ /      |/  \\  /  | /      \\         \n" +
                "$$ |   $$ |$$$$$$$$/ $$  \\ $$ |$$$$$$$  |$$$$$$/ $$  \\ $$ |/$$$$$$  |        \n" +
                "$$ |   $$ |$$ |__    $$$  \\$$ |$$ |  $$ |  $$ |  $$$  \\$$ |$$ | _$$/         \n" +
                "$$  \\ /$$/ $$    |   $$$$  $$ |$$ |  $$ |  $$ |  $$$$  $$ |$$ |/    |        \n" +
                " $$  /$$/  $$$$$/    $$ $$ $$ |$$ |  $$ |  $$ |  $$ $$ $$ |$$ |$$$$ |        \n" +
                "  $$ $$/   $$ |_____ $$ |$$$$ |$$ |__$$ | _$$ |_ $$ |$$$$ |$$ \\__$$ |        \n" +
                "   $$$/    $$       |$$ | $$$ |$$    $$/ / $$   |$$ | $$$ |$$    $$/         \n" +
                "    $/     $$$$$$$$/ $$/   $$/ $$$$$$$/  $$$$$$/ $$/   $$/  $$$$$$/          \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                " __       __   ______    ______   __    __  ______  __    __  ________       \n" +
                "/  \\     /  | /      \\  /      \\ /  |  /  |/      |/  \\  /  |/        |      \n" +
                "$$  \\   /$$ |/$$$$$$  |/$$$$$$  |$$ |  $$ |$$$$$$/ $$  \\ $$ |$$$$$$$$/       \n" +
                "$$$  \\ /$$$ |$$ |__$$ |$$ |  $$/ $$ |__$$ |  $$ |  $$$  \\$$ |$$ |__          \n" +
                "$$$$  /$$$$ |$$    $$ |$$ |      $$    $$ |  $$ |  $$$$  $$ |$$    |         \n" +
                "$$ $$ $$/$$ |$$$$$$$$ |$$ |   __ $$$$$$$$ |  $$ |  $$ $$ $$ |$$$$$/          \n" +
                "$$ |$$$/ $$ |$$ |  $$ |$$ \\__/  |$$ |  $$ | _$$ |_ $$ |$$$$ |$$ |_____       \n" +
                "$$ | $/  $$ |$$ |  $$ |$$    $$/ $$ |  $$ |/ $$   |$$ | $$$ |$$       |      \n" +
                "$$/      $$/ $$/   $$/  $$$$$$/  $$/   $$/ $$$$$$/ $$/   $$/ $$$$$$$$/       \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                "                                                                             ");

        System.out.println("Je hebt €" + G);
        System.out.println("Wil je iets eten?");
        String[] antwoorden;
        antwoorden = new String[10];

        Scanner s = new Scanner(System.in);

        String a1 = s.nextLine();
        int b1 = 0;
        int b2 = 0;
        String lc = a1.toLowerCase();
        if (lc.equals("ja")) {
            System.out.println("Vlees of vegetarisch (vlees)?");
            b1 = 1;
            b2 = 0;
        }
        else if (lc.equals("nee")){
            System.out.println("Wil je dan wat drinken?");
            b2 = 1;
            b1 = 0;
        }
        else{
            System.out.println("Vul ''Ja'' of ''Nee'' in");
        }

        String a2 = s.nextLine();
        lc = a2.toLowerCase();
        if (b1 == 1){
        switch (lc) {
            case "vlees":
                System.out.println("Warm of koud (opwarmen of gelijk krijgen)");
            case "vegetarisch":
                System.out.println("Met of zonder vlees?");
            case "vegetarisch (vlees)":
                System.out.println("Met of zonder vlees?");
        }
        }

        if (b2 == 1){
            switch (lc) {
                case "ja":
                    System.out.println("Wat wilt u drinken?" +
                            "* Fanta" +
                            "* Coca Cola (meerdere varianten)" +
                            "* Pepsi (meerdere varianten)" +
                            "* Water" +
                            "* Koffie" +
                            "* Thee");
                    b2 = 2;
                case "nee":
                    System.out.println("Oké, de vending machine sluit nu af");
                    break;
            }
            }
            if (b2 == 2) {

            }
        }
    }

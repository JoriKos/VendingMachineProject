import java.util.Scanner;

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
        if (a1.equals("ja")) {
            System.out.println("Vlees of vegetarisch (vlees)?");
        }
        else if (a1.equals("Ja")) {
            System.out.println("Vlees of vegetarisch (vlees)?");
        }
        else if (a1.equals("JA")) {
            System.out.println("Vlees of vegetarisch (vlees)?");
        }
        else if (a1.equals("ja")) {
            System.out.println("Vlees of vegetarisch (vlees)?");
        }
        else if (a1.equals("nee")){
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("Nee")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("NEe")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("NEE")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("NeE")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("nEE")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("neE")) {
            System.out.println("Wil je dan wat drinken?");
        }
        else if (a1.equals("nEe")) {
            System.out.println("Wil je dan wat drinken?");
        }


        String a2 = s.nextLine();


    }
}

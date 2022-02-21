package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        int celeCislo = Integer.parseInt(args[0]);
        long celeDlheCislo = 1000000000;
        float desatinneCislo = 2.5f;
        double desatinneCisloPlus = 1.444444444;
        char znak = 'a';
        String retazec = "retazec";
        boolean bool = true;

        int podiel = 2/3;
        System.out.println(podiel);

        int zvysok = 2%3;
        System.out.println(zvysok);

        float podielFloat = 2/3.0f;
        System.out.println(podielFloat);

        if(celeCislo == 4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        for(celeCislo = 0; celeCislo < 5; celeCislo++){
            switch (celeCislo) {
                case 1:
                    System.out.println("case1");
                    break;
                case 2:
                    System.out.println("case2");
                    break;
                default:
                    System.out.println("default");
            }
        }

    }
}

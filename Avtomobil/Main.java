public class Main {
    public static void main (String[] args) {
        Avtomobil3 obj1 = new Avtomobil3 ("BMW", "M5", "crna", 160000);

        obj1.mnozenjeKm(2);
        System.out.println(obj1.getMarka());
        System.out.println(obj1.getModel());
        System.out.println(obj1.getBoja());
        System.out.println(obj1.getPominatiKm());

    }
}
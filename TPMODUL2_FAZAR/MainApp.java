
public class MainApp {

    public static void main(String[] args) {
        Perangkat p = new Perangkat("Kawai", 8, 1.8f);
        p.inform();
        System.out.println();

        Laptop l = new Laptop("Chainsawman", 16, 2.4f, true);
        l.inform();
        l.bukaGame("FIFA23");
        l.kirimemail("rajeppp37@gmail.com");
        l.kirimemail("rajeppp37@gmail.com", "zarftrajep@gmail.com");
        System.out.println();

        Handphone h = new Handphone("Bearbrand", 6, 2.2f, false);
        h.inform();
        h.telp(696969);
        h.kirimsms(696969);
        h.kirimsms(69696, 96969);
        System.out.println();
    };
    
}

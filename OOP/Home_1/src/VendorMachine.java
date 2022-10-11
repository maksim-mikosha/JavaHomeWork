public class VendorMachine {
    public static void main(String[] args) {
        Aqua pw = new Aqua(1,"Bonaqua",5,"0,5");
        Aqua pw2 = new Aqua(2,"Sprite",15,"1");
        Snacks sn = new Snacks(3, "Pistatio", 3, "200 gr");
        System.out.println(pw);
        System.out.println(pw2);
        System.out.println(sn);
    }
}
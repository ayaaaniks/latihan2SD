import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan= new ArrayList<>();
        ArrayList<String> deletedHewan = new ArrayList<>();

        Hewan.add("Kuda");
        Hewan.add("Sapi");
        Hewan.add("Kambing");
        Hewan.add("Gajah");
        Hewan.add("Kerbau");
        System.out.println(Hewan);

        deletedHewan.add("Sapi");
        deletedHewan.add("Gajah");
        for (int i = 0; i < deletedHewan.size(); i++) {
            Hewan.remove(deletedHewan.get(i));
        }
        System.out.println(Hewan);
    }
}
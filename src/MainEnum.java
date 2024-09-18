import enumerator.Planeta;

public class MainEnum {
    public static void main(String[] args) {
        System.out.println(Planeta.JUPITER);

        for(Planeta planeta : Planeta.values()) {
            System.out.println(planeta);
        }
    }
}

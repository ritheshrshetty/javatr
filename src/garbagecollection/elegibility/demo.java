package garbagecollection.elegibility;

public class demo {
    public void finalize() {
        System.out.println("garbage collected");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            demo obj = new demo();
            obj = null;
        }

        System.gc();
    }
}

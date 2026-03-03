package Strings.bufferbuilderspeed;

public class speed {
    static void main(String[] args) {
        long starttine=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("hello");
        for (int i = 0; i < 100000000; i++) {
            sbf.append("world");

        }
        long stoptime = System.currentTimeMillis();
        System.out.println("time taken by sbf:"+ (stoptime-starttine)+"ms");

        starttine=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("hello");
        for (int i = 0; i < 100000000; i++) {
            sbl.append("world");

        }
        stoptime=System.currentTimeMillis();
        System.out.println("time taken by sbl:"+(stoptime-starttine)+"ms");
    }
}

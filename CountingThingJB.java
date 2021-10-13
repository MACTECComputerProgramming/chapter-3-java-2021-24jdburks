
package counting.thing.jb;

/**
 *
 * @author maconrm180
 */
public class CountingThingJB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 15;
        int a, b, c, d;
        a = count ++;
        b = count;
        c = ++count;
        d = count;
        System.out.println(a + "," +b+ "," +c+ "," +d);
    }
    
}

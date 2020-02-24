
package mathtest;

public class Math {

    private static double sqrt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static double sin(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static double cos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String floor(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String ceil(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String min(char c, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String round(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String max(char c, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int random() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getSquare(){
        return Math.sqrt(37);
    }
    public double getSine(){
        return  Math.sin(300);
    }
    public double getCosin(){
        return Math.cos(300);
    }
    public String getAllOperaciones(){
        return "floor: " + Math.floor(22.8) + "Ceiling: " + Math.ceil(22.8) + "Round: " + Math.round(22.8) + "Min:" + Math.min('D', 71) + "Max: " + Math.max('D', 71) + "RandomNum: " + (int)(Math.random()*100)%(20+0);
    }
}

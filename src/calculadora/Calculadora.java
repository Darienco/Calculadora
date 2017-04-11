
package calculadora;


public class Calculadora {

        double x;
        double y;
        double r;
     
    public Calculadora(){
        x = 0;
        y = 0;
        r = 0;
        
    }

    double Soma(double x, double y) {
        r = x + y;
    return r;
    }

    double Subtracao(double x, double y) {
        r = x - y;
    return r;
    }

    double Multiplicacao(double x, double y) {
        r = x * y;
    return r;
    }

    double Divisao(double x, double y) {
        r = x / y;
    return r;
    }
    
    void LimparTela( String x, String y){
     
    }
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    
    
            }

}
    
    


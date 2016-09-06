
package clases;


public class Fraccionario {
    private int numerador;
    private int denominador;
    
    public Fraccionario(int numerador, int denominador) throws DenominadorCeroException{
        this.numerador = numerador;
       this.denominador = denominador;
        if (this.denominador == 0){
            throw new DenominadorCeroException();
        }
        
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario suma(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
    }
    
    public Fraccionario resta(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador - this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
    }
    
     public Fraccionario multiplicacion(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
    }
     
     public Fraccionario division(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador;
        den = this.denominador * f2.numerador;
        f = new Fraccionario(num,den);
        return f;
    }
    
}

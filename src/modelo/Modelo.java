
package modelo;


public class Modelo {
    
private int numerouno;
private int numeroDos;
private int resultado;

    public int getNumerouno() {
        return numerouno;
    }

    public void setNumerouno(int numerouno) {
        this.numerouno = numerouno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int Multiplicar(){
        this.resultado=this.numerouno*this.numeroDos;
        return  this.resultado;
    }
    
    
}

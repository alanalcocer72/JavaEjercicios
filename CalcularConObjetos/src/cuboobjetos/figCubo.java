package cuboobjetos;


import java.lang.Math;

public class figCubo extends figCuadrado
{

    public double x;

    public figCubo(double lado) {
        super(lado);

        this.x = lado;
    }


    public  double calcularVolumen(){
        return Math.pow(this.x,3);
        //Metodo que va a calcular el volumen.
    }


    public   double calcularPerimetro(boolean is_super)//Metodo que va a calcular el perimetro.
    {

        if (is_super){
           return super.calcularPerimetro ();
        }
        else{
            return this.x*12;
        }


    }
}



package cuboobjetos;

public class figCuadrado {

    public double x;

    public  figCuadrado(double lado) {
        this.x =  lado;
    }




    public  double calcularArea(){
        return this.x * this.x;
    }

    public  double calcularPerimetro()
    {
        return this.x *4;
    }
}


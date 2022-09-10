public class Principal {

    public static void main(String[] args) {
        System.out.println(suma(2,4,6));

        coche miCoche = new coche();
        miCoche.agregar_puertas(4);

        System.out.println(miCoche.mostrar_Npuertas());
    }
   static int suma(int a, int b, int c)
    {
        return a + b + c;
    }

}

class coche{
    int nro_puertas = 0;

    void agregar_puertas(int puertas_extra)
    {
        this.nro_puertas += puertas_extra;
    }

    int mostrar_Npuertas()
    {
        return this.nro_puertas;
    }

}
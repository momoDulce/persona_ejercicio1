

public class Principal_Persona
{
    //Se coloca el método principal (main) para poder ejecutar el programa
    
    public static void main(String args[]){
        //Se instan los objetos a partir de la clase Persona
        Persona objeto_profesor = new Persona("Raul", 34, "Hombre", 67.99);
        Persona objeto_profesora = new Persona("María", 30, "Mujer", 58.56);
    
        //Se manda a llamar el método de ImprimirDatos a traves de los objetos
        objeto_profesor.ImprimirDatos();
        objeto_profesora.ImprimirDatos();
    }
}


public class Persona
{
    //Se declaran los atributos de la clase que van a utilizar los objetos 
    String nombre;
    int edad;

    String sexo;
    double peso;
    
    //Se coloca el constructor de la clase
    public Persona(String nombre, int ed, String sex, double pes){
    this.nombre = nombre;
    this.edad = ed;
    this.sexo = sex;
    this.peso = pes;
    }
    
    public void ImprimirDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El sexo es: " + sexo);
        System.out.println("El peso es: " + peso);
        
    }
}

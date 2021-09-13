
package empresa;

public class Empleado {
    public String Name;
    public int Age; 
    
    Empleado(){
        Name = "";
        Age = 0; 
    }
    
    public void registro(String Name, int Age){
        this.Name = Name; 
        this.Age = Age; 
    }

    @Override
    public String toString() {
        return "Empleado{" + "Name=" + Name + ", Age=" + Age + '}';
    }
    
    
    
}

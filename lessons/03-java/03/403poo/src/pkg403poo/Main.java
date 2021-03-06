package pkg403poo;
/**
 * ArrayList: Lista de armazenamentos, não é necessário passar o tamanho
 * (apesar de possível).
 *
 * @author João Pedro LPS
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criação de Lista:
        ArrayList students = new ArrayList();
        students.add("John");
        students.add("Peter");
        students.add("Mary");
        
        //Métodos para lidar com o vetor/lista:
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(2));
        
        if(students.contains("John")){
            System.out.println("Shout Out to John!");
        }
        
        students.set(2, "Joanna");        
        System.out.println("Remove: " + students.remove(1));
        System.out.println(students);
        
    }
}

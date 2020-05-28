
package backend;

import java.util.ArrayList;
import java.util.Scanner;


public class Student extends Person implements Menu{
    ArrayList<Person> student=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    Person person=new Person();

   

    @Override
    public void addStudent() {
        System.out.print("Enter student name: ");
        person.name=scanner.nextLine().trim();
        System.out.print("Enter Address: ");
        person.address=scanner.nextLine().trim();
        System.out.print("Enter mobile number: ");
        person.mobile=scanner.nextLong();
        student.add(person);
        
        
    }

    @Override
    public void updateStudent() {
        
    }

    @Override
    public void removeStdent() {
        
    }

    @Override
    public void searchStudent() {
        
    }

    @Override
    public void showAllStudent() {
        if(student==null)
            System.out.println("Rcords is empty.");
        else{
            for(Person p:student){
                System.out.println("Student ID: "+p.id+"\nStudent Name: "+p.name+"\nStudent Address: "+p.address+"\nMobile Number "+p.mobile);
                
            }
        }
        
    }

   
     
    
    
}

public class Example{

    public static void main(String[] args){
        
  

        Student s1 = new Student("Chad", 33, 7);
        Student s2 = new Student("Walt", 2, 7);
        Student s3 = new Student("Teddy", 1, 7);
        Student s4 = new Student("Gwen", 0, 7);
        User u1 = new User("James", 35);
        Animal a1 = new Animal("ollie", "Husky");
        Animal a2 = new Animal("Izzie", "Bear");
        Animal a3 = new Animal("bacon", "Snake");
        Animal a4 = new Animal("Tanner", "Poodle");
        
        s1.studentDisplay();
        System.out.println(u1.name);
        System.out.println(a1.name);
        System.out.println("----------------------------");

        a2.attack(s1);
        a4.attack(s2);
        a3.attack(s3);
        a1.attack(s4);
    
    }
    
    }

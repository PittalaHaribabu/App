public class Encapsulation2 {
    public static void main(String[] args) {
          Encapsulation1 obj = new Encapsulation1();
          obj.setName("John");
          obj.setAge(25);
            System.out.println("Name: " + obj.getName());
            System.out.println("Age: " + obj.getAge());
            //wrong access
           // obj.name = "John"; // Error: name has private access in Encapsulation1
           // obj.age = 25; // Error: age has private access in Encapsulation1
        
    }

  

}

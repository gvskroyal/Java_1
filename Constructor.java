public class Constructor {
    int age=5;
    public Constructor(){
        System.out.println("I am default comnstructor");
    }

    public Constructor(int age,String name){
        System.out.println("iam parameterized consrtructor");
        System.out.println(name+" : "+age);
    }
    public static void main(String[] args) {
         new Constructor();
         new Constructor(30,"raju");
    }
    
}

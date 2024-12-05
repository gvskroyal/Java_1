public class Methods {
    //modifier returntype method_name
    public void pen(){
        System.out.println("this is pen method");
    }
    //method overloading // same name but parametres are defferent is nothing but method overloading
    public void pen(int n){
        System.out.println("we have "+n+" pens");
    }
    public String pen (String pen_name){
        System.out.println("we have "+pen_name+" pens");
        return null;
    }
    public void paper(){
        System.out.println("i am paper method ");
    }
    public static void main(String[] args) {
        //classname reference_variable = new_keyword object_creation
        Methods mds=new Methods();
        mds.pen();
        mds.paper();
        mds.pen(5);
        mds.pen("natraj");
    }

}

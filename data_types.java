public class data_types {
    public data_types(){
        //primitive data types
        int i=123;
        float f=13.5f;
        double d=123.654;
        long l=893648923;
        short st=45;
        byte b=23;
        char c='A';
        boolean bn= true;
        

        // non-primitive data types
        String s="hi world";
        System.out.println(s);
    }
    public void Data_types(int i){
        
        System.out.println(i);
        /*System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(st);
        System.out.println(b);
        System.out.println(c);*/

    }
    public static void main(String[] args) {
        data_types dt=new data_types(); 
        dt.Data_types(7);

    }
}
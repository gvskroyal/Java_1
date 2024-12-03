public class Arrays {
            public static void main(String[] args) {
        String[] cars={"bmw","maruthi","tata","lumborgini"};
        int[] ages={25,30,35,40,45};
        ages[0]=20;
        for(int i=0;i<=cars.length-1;i++){
            System.out.println(cars[i]);
        }
        System.out.println(cars.length);
        for(int i=0;i<=ages.length-1;i++){
            System.out.println(ages[i]);
        }
        System.out.println(ages.length);
    }
    
}

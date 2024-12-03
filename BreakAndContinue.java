public class BreakAndContinue{
    public void Break_(){
        System.err.println("break and continue statement used");
        for(int k=0;k>=0;k++){
            if(k==30){
                break;
            }
            else if(k>=10 && k<=20) {
                continue;
            }
            else{
                System.out.println(k);
            }
        }
    }
    public static void main(String[] args) {
        BreakAndContinue bc=new BreakAndContinue();
        bc.Break_();
    }
}
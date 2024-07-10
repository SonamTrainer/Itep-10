package newD;


@FunctionalInterface
interface Fun{
void stet();

}
class Check{
    public static void show(){
        System.out.println("show..");
    }
}


public class  _10test{
    public static void main(String[] args) {
       // Fun ck= Check::show;
       Check check = new Check();
        Fun fun = check::show; 
        fun.stet();
    }
    
}

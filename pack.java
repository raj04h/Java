package hr; // create a new package
// import hr.A;
class A{
    protected void show(){
        System.out.println("A");
    }
}


public class pack extends A{
    public static void main(String[] args){
        A a = new A();
                a.show(); 
    }

}

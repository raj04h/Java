class A{
    A(int a){
        System.out.println("helo user"+a);
    }
}
class B extends A{
    B(){
        super(100);  // only for parameterised constructor we write supper with values
        System.out.println("helo learner");
    }
}
class Test{
    public static void main(String[] args) {
        B r=new B();
        
    }
}
class person{
    int age=21;
    int weight=56;
    String colour="light";
    void eat()
    {
        System.out.println("i am eating");

    }
    void sleep()
    {
        System.out.println("i am sleeping");
    }
    public static void main(String[] args) {
        person p=new person();
        p.eat();
        p.sleep();
        System.out.println(p.age); 
        System.out.println(p.weight);


    }
}
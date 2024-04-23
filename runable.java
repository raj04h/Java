public class runable implements Runnable {
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("my child thread");
        }
    }    
}

class Brunable{
    public static void main(String[] args){ 
        runable r= new runable(); //main thread
        Thread t= new Thread(); //t thread child thread
        r.run();
        t.start();
        
        for (int i=1;i<=10;i++){
            System.out.println("my parrent run");
        }
    }
}
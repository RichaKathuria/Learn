package interview;

public class SingletonClass {

    private static SingletonClass instance;
    private static int counter=0;

    private SingletonClass(){

        if(instance==null){
            instance=new SingletonClass();
        }

    }

    public static SingletonClass getInstance(){
        ++instance.counter;
        return instance;
    }


}

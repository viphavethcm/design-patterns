package SingletonPatterns;

import java.util.Random;

public class DuySingleton {
    private static DuySingleton uniqueInstance;
    private int idx;

    private DuySingleton(int idx){
        this.idx = idx;
    }

    public static DuySingleton getInstance(){
        if (uniqueInstance == null){
            synchronized (DuySingleton.class){//lazy loading
                if (uniqueInstance == null){
                    Random random = new Random();
                    uniqueInstance = new DuySingleton(random.nextInt(100));
                }
            }
        }
        return uniqueInstance;
    }

    public void sayHi(){
        System.out.println("hello,I'm Duy number "+idx);
    }

//    synchronized static void block(DuySingleton) {not lazy loading
//        Random random = new Random();
//        uniqueInstance = new DuySingleton(random.nextInt(100));
//    }
}

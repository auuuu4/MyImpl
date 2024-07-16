package m2on.study;

import java.util.Random;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * @Author: auuuu4
 * @Date: 2024/07/08/17:00  ```````````````````````````````````````````````````````````````````````````````````````````````````````````````` `
 * @Description:
 */

public class Main {
    class B{
        public static boolean cp(AbMethod method,int n){
            return method.kk(n);
        }

    }
    public static void main(String[] args) {
        int a = new Random().nextInt();
        System.out.println(B.cp(n -> a>n,a));


    }


}
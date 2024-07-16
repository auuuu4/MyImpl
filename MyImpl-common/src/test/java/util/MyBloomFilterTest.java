package util;

import m2on.study.util.MyBloomFilter;

/**
 * Created with IntelliJ IDEA.
 * @Author: auuuu4
 * @Date: 2024/07/08/16:26
 * @Description:
 */
public class MyBloomFilterTest {
    public static void main(String[] args) {
        MyBloomFilter bloomFilter = new MyBloomFilter();
//        String s1 = "hhahah";
//        String s2 = "asd-ada9d0w";

//        System.out.println(bloomFilter.contain(s1));
//        System.out.println(bloomFilter.contain(s2));
//
//        bloomFilter.addValue(s1);
//        System.out.println(bloomFilter.contain(s1));
//        System.out.println(bloomFilter.contain(s2));
//
//        bloomFilter.addValue(s2);
//        System.out.println(bloomFilter.contain(s2));
//        System.out.println(bloomFilter.contain(s2));

        int v1 = 123456;
        int v2 = 123455;

        System.out.println(bloomFilter.contain(v1));
        System.out.println(bloomFilter.contain(v2));

        bloomFilter.addValue(v1);
        System.out.println(bloomFilter.contain(v1));
        System.out.println(bloomFilter.contain(v2));

        bloomFilter.addValue(v2);
        System.out.println(bloomFilter.contain(v1));
        System.out.println(bloomFilter.contain(v2));
    }
}

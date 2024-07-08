package util;

/**
 * Created with IntelliJ IDEA.
 * @Author: auuuu4
 * @Date: 2024/07/08/16:26
 * @Description:
 */
public class MyBloomFilterTest {
    public static void main(String[] args) {
        m2on.study.util.MyBloomFilter bloomFilter = new m2on.study.util.MyBloomFilter();
        String s1 = "hhahah";
        String s2 = "asd-ada9d0w";

        System.out.println(bloomFilter.contain(s1));
        System.out.println(bloomFilter.contain(s2));

        bloomFilter.addValue(s1);
        System.out.println(bloomFilter.contain(s1));
        System.out.println(bloomFilter.contain(s2));

        bloomFilter.addValue(s2);
        System.out.println(bloomFilter.contain(s2));
        System.out.println(bloomFilter.contain(s2));

    }
}

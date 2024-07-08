package m2on.study.util;

import java.util.BitSet;

/**
 * Created with IntelliJ IDEA.
 * @Author: auuuu4
 * @Date: 2024/07/08/15:36
 * @Description: 自定义 BloomFilter
 */
public class MyBloomFilter {

    /**
     * 此处大小应该根据业务量计算，设为 n
     * 设希望的误报率为 p，数组大小为 m，哈希数数量为 k，则：
     * m = -(n*ln(p))/(ln(2)^2)
     * k = (m/n)*ln(2)
     */
    private static final int DEFAULT_SIZE = 2 << 24;

    /**
     * 尽量选择较大的质数，避免周期性冲突
     */
    private static final int[] SEEDS = new int[]{3,13,41,71,91,133};

    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash_FNV_1a[] func = new SimpleHash_FNV_1a[SEEDS.length];

    public MyBloomFilter() {
        for (int i=0;i<SEEDS.length;i++){
            func[i] = new SimpleHash_FNV_1a(DEFAULT_SIZE,SEEDS[i]);
        }
    }

    public void addValue(Object v){
        for(int i=0;i<SEEDS.length;i++){
            bits.set(func[i].hash(v));
        }
    }
    public boolean contain(Object v){
        for(int i=0;i<SEEDS.length;i++){
            if(!bits.get(func[i].hash(v)))
                return false;
        }
        return true;
    }

    private static class SimpleHash_FNV_1a {
        private int cap;
        private int seed;

        public SimpleHash_FNV_1a(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }
        public int hash(Object value){
            int h ;
            return (value == null) ? 0 : Math.abs(((cap - 1) * seed & ((h = value.hashCode()) ^ (h >>> 16))) % cap);
//            return (value == null) ? 0 : Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)) % cap);
        }
    }
}

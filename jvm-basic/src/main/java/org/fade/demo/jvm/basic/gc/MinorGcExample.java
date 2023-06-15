package org.fade.demo.jvm.basic.gc;

/**
 * Minor GC 示例
 * @author fade
 */
public class MinorGcExample {

    public static void main(String[] args) {
        // 需配置jvm参数 -XX:+PrintGCDetails
        /*
        Heap
         PSYoungGen      total 133120K, used 109134K [0x000000072b700000, 0x0000000734b80000, 0x00000007c0000000)
          eden space 114176K, 95% used [0x000000072b700000,0x0000000732193a08,0x0000000732680000)
          from space 18944K, 0% used [0x0000000733900000,0x0000000733900000,0x0000000734b80000)
          to   space 18944K, 0% used [0x0000000732680000,0x0000000732680000,0x0000000733900000)
         ParOldGen       total 304640K, used 0K [0x0000000602400000, 0x0000000614d80000, 0x000000072b700000)
          object space 304640K, 0% used [0x0000000602400000,0x0000000602400000,0x0000000614d80000)
         Metaspace       used 3208K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
         */
//        allocate1();
        /*
         Heap
         PSYoungGen      total 133120K, used 11966K [0x000000072b700000, 0x000000073bb00000, 0x00000007c0000000)
          eden space 114176K, 9% used [0x000000072b700000,0x000000072c1e1890,0x0000000732680000)
          from space 18944K, 4% used [0x0000000732680000,0x000000073274e010,0x0000000733900000)
          to   space 18944K, 0% used [0x000000073a880000,0x000000073a880000,0x000000073bb00000)
         ParOldGen       total 304640K, used 100008K [0x0000000602400000, 0x0000000614d80000, 0x000000072b700000)
          object space 304640K, 32% used [0x0000000602400000,0x00000006085aa010,0x0000000614d80000)
         Metaspace       used 3209K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
         **/
        allocate2();
    }

    public static void allocate1() {
        byte[] allocation1;
        // 大小需要根据自己电脑配置设置
        allocation1 = new byte[100000*1024];
    }

    public static void allocate2() {
        byte[] allocation1, allocation2;
        allocation1 = new byte[100000*1024];
        allocation2 = new byte[10000*1024];
    }

}

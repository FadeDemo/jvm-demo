package org.fade.demo.jvm.basic.gc;

/**
 * <p>通过注释重写的{@link #finalize}方法比对效果</p>
 * @author fade
 */
public class FinalizeExample {

    /**
     * gc root
     * */
    private static FinalizeExample obj;

    public static void main(String[] args) {
        obj = new FinalizeExample();
        obj = null;
        System.gc();
        extracted();
        obj = null;
        System.gc();
        extracted();
    }

    private static void extracted() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (obj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is alive");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize...");
        obj = this;
    }
}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.cglib.core.ClassEmitter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("hi!", "", "hi!");
    }

    @Test
    public void test02() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test03() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        classEmitter0.getStaticHook();
    }

    @Test
    public void test04() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "hi!", "", (int) (short) -1);
    }

    @Test
    public void test05() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "hi!");
    }

    @Test
    public void test06() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        classEmitter0.getSuperType();
    }

    @Test
    public void test07() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "");
    }

    @Test
    public void test08() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        classEmitter0.getAccess();
    }

    @Test
    public void test09() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "hi!", "hi!", (int) 'a');
    }

    @Test
    public void test10() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test11() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        classEmitter0.getClassType();
    }

    @Test
    public void test12() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("hi!", "hi!", "hi!");
    }

    @Test
    public void test13() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        classEmitter0.visitAnnotation("", true);
    }

    @Test
    public void test14() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
    }

    @Test
    public void test15() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "hi!", "");
    }

    @Test
    public void test16() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        String[] strArray8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 1, 0, "hi!", "hi!", "", strArray8);
    }

    @Test
    public void test17() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test18() throws Throwable {
        ClassEmitter classEmitter0 = new ClassEmitter();
        String[] strArray9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 100, (-1), "", "hi!", "hi!", strArray9);
    }
}

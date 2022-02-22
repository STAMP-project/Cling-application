import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean11 = type5.equals((java.lang.Object) enhancer6);
        int int13 = type5.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type5.getDimensions();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean11 = type5.equals((java.lang.Object) enhancer6);
        int int13 = type5.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type5.getInternalName();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        enhancer8.setInterceptDuringConstruction(true);
        enhancer8.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer8.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray16 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        boolean boolean7 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer0.generateClass((org.mockito.asm.ClassVisitor) classAdapter14);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        boolean boolean7 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter10.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 100, type3);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        enhancer7.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean12 = type6.equals((java.lang.Object) enhancer7);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(3, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type6.getElementType();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 100, type3);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        enhancer7.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean12 = type6.equals((java.lang.Object) enhancer7);
        int int14 = type6.getOpcode(4);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type6.getInternalName();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean11 = type5.equals((java.lang.Object) enhancer6);
        java.lang.ClassLoader classLoader12 = enhancer6.getClassLoader();
        boolean boolean13 = enhancer6.getUseCache();
        enhancer6.setUseCache(true);
        enhancer6.setInterceptDuringConstruction(true);
        enhancer6.setAttemptLoad(true);
        enhancer6.setUseCache(false);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer6.generateClass((org.mockito.asm.ClassVisitor) classAdapter32);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 100, type3);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        enhancer7.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean12 = type6.equals((java.lang.Object) enhancer7);
        int int14 = type6.getOpcode(4);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(154, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type6.getDimensions();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter7);
    }
}


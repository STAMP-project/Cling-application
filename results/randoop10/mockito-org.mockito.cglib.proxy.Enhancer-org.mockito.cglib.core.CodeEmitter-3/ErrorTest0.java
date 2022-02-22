import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("hi!", false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("", true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray10 = new java.lang.String[] { "L752058665", "V", "L752058665", "V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(112, (int) '#', "hi!", "L752058665", "L752058665", strArray10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("double", "L752058665");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org/mockito/asm/ClassAdapter", "L752058665", "(VZVDDZ)V");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "L1504852975");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("double", "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Z", "Z", "Z", (int) (short) 10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L752058665", "L1504852975", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L366761034", "org/mockito/asm/ClassAdapter");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1504852975", "boolean", "Z");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(VZVDDZ)V", "L1504852975", "L1504852975", 156);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/asm/ClassAdapter", "L366761034");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lorg/mockito/asm/ClassAdapter;", "Lorg/mockito/asm/ClassAdapter;", "L752058665");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L752058665", "Z", "L1743707293");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) ' ', 112, "L1743707293", "V", "L366761034", strArray9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Lorg/mockito/asm/ClassAdapter;", "Lorg/mockito/asm/ClassAdapter;", "B", 3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] { "Lorg/mockito/asm/ClassAdapter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 0, 3, "", "L366761034", "B", strArray10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L366761034", "", "", (int) 'a');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "(VZVDDZ)B", "(VZVDDZ)Z");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type6 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) ' ', 6, "L1743707293", type5, typeArray7, "boolean");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("(VZVDDZ)F", "L1504852975(VZVDDZ)F", "L752058665");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter2.getAccess();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "(VZVDDZ)D", "(VZVDDZ)V", "Z", "B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(155, (int) (short) 0, "L1504852975", "V(VZVDDZ)Z", "L268445913", strArray13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L752058665", "L366761034", "void");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getClassType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "V(VZVDDZ)Z", "L721774646" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, (int) (byte) 1, "Lorg/mockito/cglib/proxy/Enhancer;", "(VZVDDZ)V", "L752058665", strArray11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L2099206551", "L268445913", "L2099206551");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("V", "", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2099206551", "void", "Lorg/mockito/asm/ClassAdapter;", 108);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(155, (int) (short) 100, "hi!", "boolean", "L1992969913", strArray9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("I", "org/mockito/asm/ClassAdapter", "Z");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("org/mockito/asm/ClassAdapter", "L1504852975(VZVDDZ)F");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(VZVDDZ)V", "L1992969913", "V", (int) (short) 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("hi!", "(VZVDDZ)D", "(VZVDDZ)Z", 9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2008666061", "(VZVDDZ)B", "org/mockito/cglib/proxy/Enhancer", 9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "(VZVDDZ)B", "I", "(VZVDDZ)D", "org/mockito/asm/ClassAdapter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(157, 7, "L1743707293L2099206551", "L1743707293", "B", strArray13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("boolean", "V", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L366761034", "org/mockito/asm/Type", "(VZVDDZ)V");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "org/mockito/asm/Type", "L1484054928", "L2099206551" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(156, 104, "L752058665", "L1743707293L2099206551", "V(VZVDDZ)Z", strArray12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, 158, "L1322174323", "D", "(VZVDDZ)F", strArray7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("double", "org/mockito/asm/Type", "void", (int) (short) -1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L130596860", "(VZVDDZ)B", "I", 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getSuperType();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(VZVDDZ)B", false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("Z", true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1504852975", false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("(VZVDDZ)F", false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("D", false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter0.visitField((int) (short) 0, "boolean", "Z", "", (java.lang.Object) 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("hi!", true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "boolean", "boolean", "org/mockito/cglib/proxy/Enhancer", "L1504852975", "L1504852975" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(108, 154, "L1484054928", "L2138166596", "L1996995678", strArray14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L1743707293L2099206551", "L752058665" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(1, (int) (byte) -1, "org/mockito/asm/ClassAdapter", "L1732407415", "I", strArray11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "(VZVDDZ)B", "(VZVDDZ)Z", "L1994954489", "V", "L248841306", "L366761034" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(97, 4, "L841400544", "Z", "L130596860", strArray16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "L1484054928" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(12, (int) '#', "L686231569", "Lorg/mockito/cglib/proxy/Enhancer;", "(VZVDDZ)F", strArray9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1743707293L2099206551", "double", "L1322174323", (int) 'a');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L366761034", "(VZVDDZ)F", "V(VZVDDZ)Z");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("void", true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("Lorg/mockito/asm/ClassAdapter;(VZVDDZ)D", false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/asm/Type", "L812611876");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1994954489", true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("I", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Lorg/mockito/cglib/proxy/Enhancer;", "L1504852975(VZVDDZ)F", "V", (int) (byte) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1504852975(VZVDDZ)F", "V(VZVDDZ)Z", "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("", "F");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(2, "hi!", type6, (java.lang.Object) 10.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "(VZVDDZ)Lorg/mockito/asm/ClassAdapter;", "L2008666061", "(VZVDDZ)V", "L1657710914", "L248841306" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, (int) (short) 10, "L1743707293L2099206551", "V(VZVDDZ)Z", "L1743707293", strArray14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("V", "L130596860", "L358904201", 12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getSuperType();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L248841306", false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1743707293L2099206551", "L1525292118", "org/mockito/asm/ClassAdapter", 7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L1743707293L2099206551", "L268445913", "L1743707293", "Lorg/mockito/cglib/proxy/Enhancer;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, (int) (byte) 100, "L1978972406", "org/mockito/asm/ClassAdapterL752058665", "L1504852975(VZVDDZ)F", strArray12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1732407415", "Lorg/mockito/cglib/proxy/Enhancer;", "L1504852975(VZVDDZ)F", 104);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1536626907", "(VZVDDZ)Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("L1992969913", false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2138166596", "org/mockito/asm/ClassAdapterL752058665", "L2008666061", 7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L1536626907", false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "(VZVDDZ)Lorg/mockito/asm/ClassAdapter;", "L77565596", "F", "L36687257", "V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (byte) -1, 112, "(VZVDDZ)F", "L268445913", "L841189875", strArray15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("int", false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("Lorg/mockito/asm/ClassAdapter;", true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "F", "L1446367709", "L2138166596", "L1086904050", "L1239877000" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(126, 6, "void", "L897069994", "L1992969913", strArray15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit(128, (int) '#', "org/mockito/asm/Type", "L1657710914", "Lorg/mockito/asm/ClassAdapter;", strArray7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type5.getDimensions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("D", "L841189875", "V(VZVDDZ)Z", (int) ' ');
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("L1671059460", false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("Lorg/mockito/asm/Type;", false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("L1536626907", "L208886740");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1996995678", "L1657710914", "L2008666061");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L841400544", "L1432582366");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter4.getAccess();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L358904201", "(VZVDDZ)B");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L620069157", "L1813731514", "L1053141475", (int) (byte) 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("L686231569", "L1687015796", "L358904201", (int) (short) 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("", true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L1504852975(VZVDDZ)F", "L841400544", "L1275808266");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L2008666061", "(VZVDDZ)B", "V", 153);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1692426059", "L752058665", "L1432582366");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1086904050", "org/mockito/asm/Type");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter7.getSuperType();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter3.visitAnnotation("L620069157", false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.getStaticHook();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter9);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(6, (int) (byte) 100, "L1525292118", "L1525292118", "L1924393039", strArray16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("L567616057", true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "", "L1629035627");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1168010489", false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("I", false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "L130596860", "V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 154, "(VZVDDZ)V", "L553683093", "L1782117476", strArray9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1813731514", "L44469293", "L1687015796", "L1994954489" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(129, (int) (byte) 0, "V", "L358904201", "L721774646", strArray15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getClassType();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        java.lang.String[] strArray33 = new java.lang.String[] { "org/mockito/asm/Type", "L1504852975(VZVDDZ)F", "org/mockito/asm/ClassAdapter", "L841189875", "L1692426059", "Z(VZVDDZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visit((int) (short) 1, 9, "L1613418225", "Z", "", strArray33);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("L44469293", false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter3.visitAnnotation("L1826703268", false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "void" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, 6, "[Lorg/mockito/asm/Type;", "org/mockito/cglib/proxy/Enhancer", "L130596860", strArray11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "[Lorg/mockito/asm/Type;", "L1316695361", "(VZVDDZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(9, 158, "L62152432", "L1484054928", "L1322174323", strArray13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("L2138166596", false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L596579347", "L1316695361", "L366761034");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L724782650", "org/mockito/asm/ClassAdapterL752058665");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getClassType();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1783601623", "float", "L2075593147", "int", "Lorg/mockito/cglib/core/DefaultNamingPolicy;", "(VZVDDZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(37, 0, "L164367872", "L1120870793", "L391346706", strArray15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getClassType();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "(VZVDDZ)J", "L1826703268", "L1053141475", "L1484054928", "(VZVDDZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 0, "L752058665", "L1676198467", "L248841306", strArray13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type2.getSort();
        label0.info = type2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type2.getInternalName();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L553683093", "", "L1417996126");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L208886740", "L2083023304");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter5.visitField((int) '#', "boolean", "V", "(VZVDDZ)F", (java.lang.Object) "Z(VZVDDZ)Z");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "L1983874247", "L358904201", "L1883407862", "L584615473", "L725309748" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(108, (int) (byte) 10, "float", "L1536626907", "L1554115659", strArray15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "L620069157", "L1432582366", "L223152632", "L1992698878", "L1876786777" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(96, 124, "L1992969913", "L1086904050", "I", strArray16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "L1924393039" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(155, 155, "", "L686231569", "L1554115659", strArray11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(100, 0, "L1992698878", "", "L1030427947", strArray9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1883407862", "L953668985", "L2083023304", 128);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter7.getAccess();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter6.getSuperType();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org.mockito.cglib.core.DefaultNamingPolicy", "V(VZVDDZ)Z", "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 1, 0, "(VZVDDZ)Lorg/mockito/asm/ClassAdapter;", "L1242893416", "L1629035627", strArray9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = classEmitter20.getAccess();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("void", "L998809716", "L390131005", 5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getClassType();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1120870793", "L1783601623", "L1017610699", (int) (short) -1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type2);
        int int5 = local4.getIndex();
        int int6 = local4.getIndex();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1783601623", "L2099206551", "L724782650", 128);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type5.getElementType();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1992969913", true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1992698878", "L1826703268", "L584615473");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] { "L1883407862" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(112, 112, "L721774646", "L(VZVDDZ)F;", "L358904201", strArray10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray18 = new java.lang.String[] { "F", "L2075593147", "L1883407862", "L1529493516", "", "L1497102070" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(116, 153, "L317413995", "Lorg/mockito/asm/ClassAdapter;", "org/mockito/asm/ClassAdapter", strArray18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "L596579347", "L1983458680", "L1657527755" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, 130, "Lorg/mockito/asm/ClassAdapter;(VZVDDZ)D", "L1030427947", "L77565596", strArray10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L223152632", "L129499459", "L1983874247", 154);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        java.lang.String str8 = type6.getDescriptor();
        java.lang.String str9 = type6.getDescriptor();
        java.lang.String str10 = type6.getClassName();
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(VZVDDZ)Lorg/mockito/asm/ClassAdapter;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(128, 2, "L2008666061", type6, typeArray12, "L1184313214");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitSource("L1053141475", "L1782117476");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("L1981714406", true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("org.mockito.cglib.core.DefaultNamingPolicy", false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter4.visitAnnotation("L1316695361", false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("org/mockito/asm/ClassAdapter", "L2121887112", "L814023571");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 1, type2);
        int int6 = type2.getSort();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 1, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type2.getInternalName();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray19 = new java.lang.String[] { "L1687404073", "(VZVDDZ)D", "L225572111", "L1509967069", "L752058665", "L1983458680" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(12, 128, "L427352724", "L1924393039", "L1978972406", strArray19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1946937017", "L1177973625", "L1184313214", 100);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L998809716", "L1275808266", "L1177973625", "L1120870793" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) '4', 128, "L2121887112", "L1216068248", "L1529493516", strArray15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L387160357", "L1316695361", "L268445913");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray18 = new java.lang.String[] { "int", "L1497102070", "L248841306", "L248841306", "L584615473", "L16830575" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(131, (int) (byte) 0, "L358904201", "L1605074712", "L1844269850", strArray18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("(VZVDDZ)D", true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "L612390187", "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 7, "L2099206551", "L130596860", "L1432582366", strArray10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter0.getAccess();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int4 = type3.getSize();
        java.lang.String str5 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1432582366", "I", "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter4.getAccess();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L77141118", "L553683093", "(VZVDDZ)D");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "L1053141475", "L1177973625", "B", "L841400544", "L943182723", "L1509967069" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(131, 131, "L647156935", "", "L584615473", strArray17);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L948589765", "L1504852975");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("L1844269850", true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L1525292118", "L725309748");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("", true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getSuperType();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter2.getAccess();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("L835726325", true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(4, (int) '4', "L129499459", "L391346706", "L16830575", strArray13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L1017610699", "L1446367709" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(157, 108, "L484498695", "L1883407862", "L366761034", strArray11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1529493516", "L155348897");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter0.visitAnnotation("L1613418225", false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("(VZVDDZ)F", false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitSource("L1687404073", "L155348897");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L1484054928", "L674338831", "L2099206551L725309748");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("B", true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        java.lang.String[] strArray32 = new java.lang.String[] { "double", "L2083023304", "L752058665", "L1216068248", "(VZVDDZ)F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visit((int) '#', 130, "Z", "L391346706", "org.mockito.cglib.core.DefaultNamingPolicy", strArray32);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("L1062643606", "L1492359772");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L547021491", "L1605074712", "L1554115659" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) 1, (int) (byte) 100, "L1776554373", "L686231569", "D", strArray12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("Lorg/mockito/cglib/proxy/Enhancer;", false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("L547021491", true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter0.getSuperType();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "L2025149649", "org.mockito.cglib.core.DefaultNamingPolicy", "L1053141475" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(128, 1, "L378268450", "L1484054928", "L1086904050", strArray12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L1556730167", true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitEnd();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getSuperType();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("L1184313214", true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("", true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter6.getClassType();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("L1275808266", true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "L1017610699", "I", "L1322174323", "L172430406" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 100, (int) '#', "L763715179", "L446894012", "D", strArray14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1223472036", "L1732407415", "L985797428" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 1, 108, "L2053696036", "(VZVDDZ)Lorg/mockito/cglib/proxy/Enhancer;", "float", strArray13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitEnd();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.toString();
        int int7 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitOuterClass("L2075593147", "L841400544", "L1529493516");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter4.visitAnnotation("Z", true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L1316695361", "", "L2104316594", 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "L1657710914(VZVDDZ)D", "L1782117476", "L254386793" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(153, 130, "L589248689", "L998809716", "L1657710914(VZVDDZ)D", strArray17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L444044038", "L1426037201", "L1379274785");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) 0.0f);
        boolean boolean9 = type5.equals((java.lang.Object) 1L);
        int int11 = type5.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type5.getElementType();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(100, (int) 'a', "L1549611535", "L293145078", "L1073754273", strArray9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2018788246", "L680145188", "L1605074712", 156);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1556730167", "L2083023304", "L62152432");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "L837022981", "L1285445915", "L1073754273", "L1073754273", "L2008666061", "L577814422" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(40, 100, "short", "L248841306", "void", strArray16);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("L1790336892", false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("V(VZVDDZ)Z", "L36687257", "", 126);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter0.getStaticHook();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("L1776554373", "L1846957972", "L1687106275");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(VZVDDZ)D", "L2058297898");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "L1992969913(VZVDDZ)I", "L1168010489", "L1211990953", "L1844269850", "L1981714406" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(100, 3, "Lorg/mockito/cglib/core/DefaultNamingPolicy;", "L1580583216", "Z(VZVDDZ)Z", strArray15);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray13 = new java.lang.String[] { "(VZVDDZ)S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(5, 154, "L223152632", "L1264862103", "L1973651698", strArray13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L237201199", "L680145188", "L584615473");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1379274785", "L1579619181", "L1566324183", "L150050493", "L1316695361" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(0, 154, "L(VZVDDZ)F;", "L1251787567", "L1992969913", strArray18);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(155, (int) 'a', "L1743707293L2099206551", "D", "L943182723", strArray13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(VZVDDZ)V");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("L2138166596", type1, typeArray3);
        int int5 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L126731936", "L188230968", "L97905512");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("L1675552605", true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("L897069994", "L2134766798");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1992969913(VZVDDZ)I", "L1405028189", "L2124294804", "L1671059460", "L1605074712" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(3, 156, "L735265960", "L1053141475", "L1341270979", strArray15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L126731936", "L998809716", "L1239877000");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1566854777", "L620069157", "L1992969913", (int) (short) 100);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org.mockito.cglib.core.DefaultNamingPolicy", "L2031403860", "L1662694306", (int) (short) 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L1208992339", "L1322174323");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("int", "L1662694306", "L1827922230", 103);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("L1732407415", "L225800228", "L1790336892");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1732407415", "LL1417996126;", "", "L390131005" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) '#', 10, "L1924393039", "(VZVDDZ)LL1417996126;", "L1933067334", strArray13);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter9.getStaticHook();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("L1702587028", false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("L91700735", "L129499459", "L248963347", 9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(VZVDDZ)Z");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter6.getAccess();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VZVDDZ)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L129499459", "L387160357", "L706173412", 3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L2064772506", "L760636920", "L1687404073", 135);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1001046971", "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L2121887112", "L1497102070");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("L1743707293", "L2099206551");
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.String str6 = label4.toString();
        boolean boolean7 = signature3.equals((java.lang.Object) str6);
        boolean boolean8 = type0.equals((java.lang.Object) boolean7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1265863621", "L77141118");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L1242893416", "L1648413439");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 100, type3);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        int int9 = type6.getSort();
        int int10 = type6.getSize();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(158, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type6.getDimensions();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitInnerClass("Lorg/mockito/cglib/core/ClassEmitter;", "L875903719", "org/mockito/cglib/proxy/Enhancer", 157);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1743707293L2099206551", "L2104316594");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L724782650", "L1946937017", "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 97, "L2030749840", "L1533784510", "L1882364076", strArray9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L1992698878", "", "L1216409721");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L304752667", "L1086904050");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L1328331877", "[Lorg/mockito/asm/Type;", "L37247043", 101);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter5.getAccess();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classEmitter20.visitAnnotation("L101265413", false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("L1722984057", "L115434019");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "L393672762", "L668898394", "L724782650", "L2139006638", "L1622809277" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(10, 9, "L1050235934", "L792355294", "L1671059460", strArray16);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "L1211990953", "L1846957972", 37);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2066645885", "boolean", "L948589765", (int) 'a');
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L358904201", "L430576019", "L115434019", 10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitOuterClass("L514696048", "L1035675990", "");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L2104316594", "Lorg/mockito/asm/ClassAdapter;(VZVDDZ)D", "L1882364076", (int) 'a');
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1844275656", "L2138166596", "L225369984", 2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("L1992698878", "L1687404073", "F", 112);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("L1992969913", "L1206237627", "L877318430");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1017610699", "(VZVDDZ)LL1083669132;");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1933067334", "L484498695", "L1892947959");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter5.getSuperType();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("L30912104", false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L735265960", true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L1330132437", "L1746294294");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitEnd();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L1924393039", "L1662694306", "L547021491", 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter3.visitAnnotation("L1053141475", false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 100, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        int int8 = type6.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type6.getDimensions();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "L1426037201", "L589248689", "[Lorg/mockito/asm/Type;", "L841189875", "L1322117433" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(100, 130, "double", "Ljava/lang/Class;", "L1090595989", strArray13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("D", "L1208992339", "L812611876");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitEnd();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "L897273688", "org/mockito/cglib/proxy/EnhancerL1924393039", "L1979329435", "L1876786777" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(119, (int) '#', "byte", "L1844269850", "L846452476", strArray14);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray19 = new java.lang.String[] { "L1962797525", "L1743707293L2099206551", "L856642839", "L1580583216", "L2075593147", "V(VZVDDZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) (short) 100, 0, "L1860595041", "L1827922230", "L517672556", strArray19);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1782117476", "L358904201", "L726361432");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(101, (int) (byte) 100, "L532931807", "L1086904050", "L1073754273", strArray9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "L856642839", "L52503460", "Ljava/lang/Class;", "L2094317720", "L2134766798" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit((int) (byte) -1, 129, "L1743707293", "L1225874836", "[Ljava/lang/Class;", strArray13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1405028189", "L1876786777");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L2012514645", "L1308390399", "L1216409721");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitInnerClass("L1505628010", "L1979329435", "L466292801", 108);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getSuperType();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitInnerClass("(VZVDDZ)LL1083669132;", "L1114899467", "L1439576070", 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitEnd();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = classEmitter20.getSuperType();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("boolean", "void");
        java.lang.String str16 = signature15.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter6.visitField(40, "L461426880", "Lorg/mockito/cglib/proxy/Enhancer;", "L567616057", (java.lang.Object) signature15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getClassType();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L144644057", "L1722984057", "(VZVDDZ)S");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type3);
        int int6 = type3.getSort();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(7, type3);
        org.mockito.asm.Type type8 = local7.getType();
        java.lang.String str9 = type8.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("org/mockito/cglib/core/LocalVariablesSorter", "L446894012");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L596579347", "L129499459", "org/mockito/asm/ClassAdapter", "L1556730167" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 100, 105, "L2030749840", "L985797428", "LL390131005;", strArray12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getClassType();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1184030459", "L908819131", "L550424738");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1629035627", "L52503460", "L567616057", "L1308390399", "L36687257" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit((int) '4', 2, "L1586560223", "F", "L647156935", strArray13);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter0.getAccess();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("F", true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L515540468", "L97905512", "L317413995");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("L374970195", "L1436592738");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitEnd();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitInnerClass("L1994954489", "L293145078", "L1070962350", 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1417996126", "L735265960", "L504842811" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit((int) (byte) 1, 104, "L680145188", "", "L1580583216", strArray18);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1294012429", "L1749586613", "L1128526140", 123);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L875903719", true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1316695361", "L402234981");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitEnd();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter7.visitAnnotation("hi!", true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(0, type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L155348897", "L1623429859", "hi!(VZVDDZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(103, 116, "L1374689910", "L248963347", "L1641697616", strArray12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L2053696036", "L1417996126", "L841400544", "(VZVDDZ)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 119, "L2124294804", "L1100205971", "(VZVDDZ)LL1083669132;", strArray13);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter6.getSuperType();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSort();
        int int8 = type1.getOpcode(101);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        int int5 = type1.getSort();
        int int6 = type1.getSort();
        int int8 = type1.getOpcode((-1));
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("(VZVDDZ)F");
        boolean boolean11 = type1.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type1.getDimensions();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("L1090595989", "L405509670", "L878412837");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L36687257", "L2066645885");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L429556365", "L706173412", "Z");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L639333309", "L1426037201", "Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray17 = new java.lang.String[] { "L1389186090", "L706731432", "L1062643606", "L2139006638", "L30912104" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(36, 119, "", "(VZVDDZ)J", "L1994954489", strArray17);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L2124294804", "L446894012", "Lorg/mockito/cglib/core/DefaultNamingPolicy;");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(128, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        boolean boolean11 = type5.equals((java.lang.Object) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitOuterClass("L706731432", "L2124294804", "L(VZVDDZ)F;");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("L466292801", true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1533784510", "L1566854777", "L596579347", "L271453753", "(VZVDDZ)V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(3, 0, "L124338108", "L1001046971", "L124338108", strArray18);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitOuterClass("org/mockito/cglib/core/DefaultNamingPolicy", "L1597798442", "");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label7.info = label9;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        label0.info = label7;
        java.lang.String str14 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        label0.info = classEmitter20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter1.visitAnnotation("L223152632", true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getSuperType();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(128, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        boolean boolean11 = type5.equals((java.lang.Object) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classAdapter9.visitAnnotation("", true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray17 = new java.lang.String[] { "L774241002", "L15588800", "L1647042140", "L1844275656", "L498067007" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) ' ', 123, "L735265960", "L427352724", "L620069157", strArray17);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L1946937017", "L476485645");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L77141118" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) ' ', 123, "L304752667", "L77565596", "L1328331877", strArray12);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray19 = new java.lang.String[] { "double", "L668898394", "L550424738", "L446894012" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(0, (int) (short) 10, "double", "L686231569", "L706731432", strArray19);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        int int5 = type1.getSort();
        int int6 = type1.getSort();
        int int8 = type1.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L706731432", "L1035675990");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L126731936", "L1790336892", "L1855280001");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L674338831", "D");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("L814023571");
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(116, type12);
        org.mockito.asm.Type type14 = local13.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(36, "L897273688", type9, (java.lang.Object) local13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitSource("L760636920", "L1223472036");
    }
}


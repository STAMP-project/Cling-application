import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray12 = new java.lang.String[] { "I", "hi!", "", "", "hi!", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 10, (int) (byte) -1, "(SSII)I", "", "hi!", strArray12);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "I", "", 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("I", "(SSII)I", "", 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "(SSII)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 1, (int) (short) 100, "I", "Lorg/mockito/asm/Type;", "(SSII)I", strArray9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type18, type19, type21 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 0, 130, "", type6, typeArray23, "L1553700172");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("I", "(SSII)I");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(SSII)I", "(SSII)I", "", (int) '#');
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 10, type5);
        int int8 = type5.getOpcode(10);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray23);
        boolean boolean26 = type5.equals((java.lang.Object) typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(2, "", type5, (java.lang.Object) 1.0d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("I", false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!", "", "I", 157);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("int", "org/mockito/asm/Type", "int", (int) (byte) 100);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(96, 126, "", "Lorg/mockito/asm/Type;", "I", strArray6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!(SSII)I", "I", "(SSII)I", "hi!(SSII)I", "int", "Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 128, "hi!(SSII)I", "", "", strArray13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit(7, 5, "", "L1553700172", "L1553700172", strArray9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = type16.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type16.getElementType();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("I", "org/mockito/asm/Type", "", 3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("(SSII)I", "org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        int int4 = type1.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L652832830", "L1553700172", "L1553700172");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!(IIJV)Z", "org/mockito/asm/Type" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((-1), 128, "hi!(SSII)I", "hi!", "L1553700172", strArray10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("int", true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L5916778", "L1839661580", "L652832830", 2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("hi!", "L652832830");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = type16.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type16.getDimensions();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        int int4 = type1.getOpcode(10);
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray19);
        boolean boolean22 = type1.equals((java.lang.Object) typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type1.getInternalName();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1839661580", "L1553700172", "", 1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type11 = type10.getElementType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (byte) 10, type13);
        int int16 = type13.getOpcode(10);
        int int17 = type13.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        boolean boolean34 = type13.equals((java.lang.Object) typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(153, 157, "I", type11, typeArray31, "L652832830");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("L1553700172", false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "(SSII)I");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!(IIJV)Z", "L1553700172", "org/mockito/asm/Type", 2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type11, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) '#', (int) (byte) 0, "(BZZ)I", type9, typeArray27, "L1839661580");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("int", "", "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type13, typeArray29);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type13 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(116, 104, "I", type11, typeArray33, "(SSII)I");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.String str14 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type2.getDimensions();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("(SSII)I", false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("F", "int", "(BZZ)I", 153);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        org.mockito.asm.Type type9 = local8.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type12 = type11.getElementType();
        boolean boolean14 = type11.equals((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) ' ', "L652832830", type9, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type3.getElementType();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray21 = new java.lang.String[] { "(SSII)Z", "hi!(IIJV)Z", "", "Lorg/mockito/asm/Type;", "L1553700172" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(156, 157, "Lorg/mockito/asm/Type;", "hi!", "org/mockito/asm/Type", strArray21);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 100, "", type5, (java.lang.Object) classAdapter10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("org/mockito/asm/Type(SSII)Z", "hi!");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (byte) 10, type10);
        int int12 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.Class<?> wildcardClass27 = type15.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(124, "L5916778", type10, (java.lang.Object) type29);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(100, (int) (short) 10, "void", type11, typeArray14, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1839661580", "hi!", "int");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter4.visitAnnotation("F", false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "Lorg.mockito.asm.Type;", "L1092460119", (int) '4');
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.getStaticHook();
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getClassType();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("L1655322812", "L652832830", "(BZZ)I", 7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("", true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("int", "L5916778");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(1, 157, "L1655322812", type8, typeArray27, "org/mockito/asm/Type");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org/mockito/asm/Type", "Lorg/mockito/asm/Type;", "L5916778", "L1092460119" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, 153, "(SSII)I", "L1839661580", "F", strArray11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter7.getClassType();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        boolean boolean15 = type2.equals((java.lang.Object) "I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type2.getElementType();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type0.getDimensions();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(SSII)Z", true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitEnd();
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(124, (int) '#', "F", "L783288789", "Z", strArray15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1092460119", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        java.lang.String[] strArray14 = new java.lang.String[] { "Z", "hi!(IIJV)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '#', 0, "(SSII)Z", "void", "L1553700172", strArray14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("Lorg.mockito.asm.Type;", "hi!(IIJV)Z");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("(SSII)Z", true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classAdapter42.visitAnnotation("char", false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "(SSII)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 1, 108, "L824714731", "L824714731", "Z", strArray10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!(IIJV)Z", "hi!", "int", "F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(130, 158, "void", "void", "void", strArray12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1946254240", "I", "(SSII)I");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitInnerClass("boolean", "int", "I", 4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("L1946254240", "Lorg/mockito/asm/Type;", "L1553700172", 124);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classAdapter42.visitAnnotation("(SSII)Z", true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = type14.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type14.getElementType();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray22);
        java.lang.String str24 = signature23.getDescriptor();
        java.lang.String str25 = signature23.toString();
        org.mockito.asm.Type[] typeArray26 = signature23.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type5, typeArray26);
        label0.info = type5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type5.getInternalName();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1839661580", "", "L822689388", (int) (byte) 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        int int45 = type43.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean53 = type51.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(0, type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type43, typeArray59);
        int int63 = type43.getSort();
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local(104, type43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.declare_field(5, "", type43, (java.lang.Object) "org/mockito/asm/Type");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "Lorg.mockito.asm.Type;", "org/mockito/asm/Type(SSII)Z", "L1655322812", "int", "Z", "L1277466335" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((-1), (int) ' ', "", "(SSII)J", "hi!", strArray13);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(124, 96, "L230405251", "char", "L5916778", strArray14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        label0.info = type3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray10 = new java.lang.String[] { "L1380537372", "L1919555830", "L783288789", "org/mockito/asm/Type(SSII)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) -1, 126, "hi!(IIJV)Z", "hi!(IIJV)Z", "(SSII)I", strArray10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org/mockito/asm/Type", "hi!", "L652832830", 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitSource("", "L1553700172");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter6.getAccess();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L783288789", "char", "", 157);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter0.getSuperType();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int5 = type3.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter6.getSuperType();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 10, type2);
        int int5 = type2.getOpcode(10);
        int int6 = type2.getSize();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(128, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type2.getDimensions();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L19896701" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(2, 154, "(SSII)Z", "", "(SSII)S", strArray11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("L230405251", true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("int", true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter6.visitAnnotation("L652832830", false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter7.getClassType();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("L5916778", true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter6.visitAnnotation("void", false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter42.visitEnd();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("hi!(SSII)I", "L1120710497");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((-1), 96, "int", "L652832830", "L824714731", strArray11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("int", "L1104695901", "L19896701", 8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L230405251", "L1380537372", "", 3);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(5);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.Class<?> wildcardClass27 = type15.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 10, "L1655322812", type9, (java.lang.Object) type29);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lorg/mockito/asm/Type;", "(SSII)Z", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1277466335", "org/mockito/cglib/core/Signature", "(SSII)S", 163);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray22);
        java.lang.String str24 = signature23.getDescriptor();
        java.lang.String str25 = signature23.toString();
        org.mockito.asm.Type[] typeArray26 = signature23.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type5, typeArray26);
        label0.info = type5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type5.getElementType();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray19 = new java.lang.String[] { "org/mockito/asm/Type(SSII)Z", "L1946254240", "(IIJV)Z", "", "(IIJV)Z", "L19896701" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((int) (byte) -1, 100, "boolean", "L5916778", "hi!", strArray19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("L1380537372", false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1277466335", "org/mockito/asm/Type", "L230405251", "hi!(SSII)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(154, 116, "(SSII)J", "L1104695901", "(SSII)S", strArray12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str12 = type11.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(158, "L1817833920", type11, (java.lang.Object) 0.0f);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("Lint;", true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1200714846", "L1380537372");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!(IIJV)Z", "L652832830(SSII)Z", "hi!(SSII)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) '#', (int) (byte) 1, "F", "", "L783288789", strArray10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org/mockito/asm/Type(SSII)Z", "org.mockito.asm.Type", "(SSII)S");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, 9, "", "L783288789", "L1380537372", strArray10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        java.lang.String str23 = signature22.getDescriptor();
        java.lang.String str24 = signature22.getDescriptor();
        java.lang.String str25 = signature22.getName();
        org.mockito.asm.Type type26 = signature22.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray46);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type30, typeArray46);
        int int50 = type30.getSort();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(104, type30);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(0, type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray64);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type68);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean72 = type70.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local76 = new org.mockito.cglib.core.Local(0, type75);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type70, type73, type75, type77 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type68, typeArray78);
        java.lang.String str80 = type68.getDescriptor();
        boolean boolean81 = signature65.equals((java.lang.Object) type68);
        org.mockito.asm.Type[] typeArray82 = signature65.getArgumentTypes();
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L652832830", type30, typeArray82);
        java.lang.String str84 = signature83.getName();
        org.mockito.asm.Type[] typeArray85 = signature83.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(0, 155, "void", type26, typeArray85, "(SSII)Z");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.declare_field(155, "L783288789", type33, (java.lang.Object) "L230405251");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L5916778", "(BZZ)I", "L1553700172");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("org/mockito/cglib/core/Signature", "L19896701", "L1092460119", 157);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("L1277466335", "L1200714846", "L445802793");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = classEmitter21.getAccess();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (short) 0);
        int int29 = type26.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (byte) 10, type31);
        int int34 = type31.getOpcode(10);
        int int35 = type31.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(0, type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray49);
        boolean boolean52 = type31.equals((java.lang.Object) typeArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.begin_class(116, 9, "Lint;", type26, typeArray49, "org/mockito/asm/Type(SSII)Z");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type17, typeArray33);
        int int37 = type17.getSort();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(104, type17);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (short) 0, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(0, type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((int) (short) 0, type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean59 = type57.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(0, type62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("hi!", type55, typeArray65);
        java.lang.String str67 = type55.getDescriptor();
        boolean boolean68 = signature52.equals((java.lang.Object) type55);
        org.mockito.asm.Type[] typeArray69 = signature52.getArgumentTypes();
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("L652832830", type17, typeArray69);
        java.lang.String str71 = type17.getClassName();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local((int) (byte) 10, type73);
        int int76 = type73.getOpcode(10);
        int int77 = type73.getSize();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local((int) (short) 0, type81);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean85 = type83.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local89 = new org.mockito.cglib.core.Local(0, type88);
        org.mockito.asm.Type type90 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray91 = new org.mockito.asm.Type[] { type83, type86, type88, type90 };
        org.mockito.cglib.core.Signature signature92 = new org.mockito.cglib.core.Signature("hi!", type81, typeArray91);
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type78, typeArray91);
        boolean boolean94 = type73.equals((java.lang.Object) typeArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 1, 126, "L652832830", type17, typeArray91, "org.mockito.asm.Type");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitSource("L1553700172", "org/mockito/asm/Type(SSII)Z");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L652832830(SSII)Z", "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("(BZZ)I", "org/mockito/asm/Type", "L824714731");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter7.getSuperType();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1339020033", "L1380537372", "L1092460119");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.toString();
        org.mockito.asm.Type[] typeArray34 = signature31.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type13, typeArray34);
        label8.info = type13;
        java.lang.String str38 = label8.toString();
        java.lang.String str39 = label8.toString();
        java.lang.Class<?> wildcardClass40 = label8.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) -1, "L1200714846", type7, (java.lang.Object) wildcardClass40);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L783288789", "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter4.getSuperType();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1946254240", "L1120710497", "org/mockito/asm/Label");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L971768301", "L1104695901");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("int", "Z", "hi!(IIJV)Z");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type3 = local2.getType();
        int int4 = type3.getSort();
        java.lang.String str5 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter6.getSuperType();
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classEmitter0.visitAnnotation("Lint;", false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = classEmitter7.getAccess();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = classEmitter43.getAccess();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (byte) 10, type9);
        org.mockito.asm.Type type11 = local10.getType();
        int int13 = type11.getOpcode(112);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (byte) 10, type16);
        int int19 = type16.getOpcode(10);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray36);
        java.lang.String str38 = signature37.getDescriptor();
        java.lang.String str39 = signature37.toString();
        org.mockito.asm.Type[] typeArray40 = signature37.getArgumentTypes();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        java.lang.String str42 = type23.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type21, type23, type43, type44 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type7, type11, type16 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int53 = type52.getSort();
        boolean boolean54 = type6.equals((java.lang.Object) int53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) (byte) 10, type56);
        org.mockito.asm.Type type58 = local57.getType();
        int int60 = type58.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(5, "boolean", type6, (java.lang.Object) type58);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 3, "L307348924", "(SSII)Z", "J", strArray9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L65611762", "L652832830");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        int int19 = type14.getOpcode(158);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) '#', "L5916778", type14, (java.lang.Object) "hi!(SSII)I");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L971768301", "L1057178490");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter6.visitAnnotation("L19896701", true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = classEmitter36.getClassType();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int27 = type26.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.declare_field(130, "void", type26, (java.lang.Object) false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L125209319", "J");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        java.lang.String[] strArray19 = new java.lang.String[] { "void", "L1919555830" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) ' ', (int) (byte) 100, "L1612818439", "L307348924", "L783288789", strArray19);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1738126850", "g.mockito.asm.Type", "L979286802");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray17 = new java.lang.String[] { "L5916778", "L822689388", "L1655322812", "(BZZ)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(124, 156, "L652832830(SSII)Z", "L783288789", "L1120710497", strArray17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (byte) 10, type19);
        org.mockito.asm.Type type21 = local20.getType();
        int int23 = type21.getOpcode(112);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (byte) 10, type26);
        int int29 = type26.getOpcode(10);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        java.lang.String str48 = signature47.getDescriptor();
        java.lang.String str49 = signature47.toString();
        org.mockito.asm.Type[] typeArray50 = signature47.getArgumentTypes();
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray50);
        java.lang.String str52 = type33.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean56 = type54.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type31, type33, type53, type54 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray57);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type17, type21, type26 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int63 = type62.getSort();
        boolean boolean64 = type16.equals((java.lang.Object) int63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean68 = type66.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local((int) (short) 0, type73);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean77 = type75.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local81 = new org.mockito.cglib.core.Local(0, type80);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type75, type78, type80, type82 };
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("hi!", type73, typeArray83);
        java.lang.String str85 = signature84.getDescriptor();
        java.lang.String str86 = signature84.toString();
        org.mockito.asm.Type[] typeArray87 = signature84.getArgumentTypes();
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray87);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("", type66, typeArray87);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.begin_class((int) (short) 1, (int) '4', "Lint;", type12, typeArray87, "L1839661580");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "L1612818439", "L652832830(SSII)Z", "org/mockito/cglib/core/Signature" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(6, (int) (byte) 100, "L979286802", "hi!(SSII)I", "L652832830", strArray11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("org/mockito/asm/Type(SSII)Z", "", "(SSII)Z", (int) (short) 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        java.lang.String[] strArray32 = new java.lang.String[] { "org/mockito/asm/Type(SSII)Z", "Lorg/mockito/cglib/core/Signature;", "L1738126850", "F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visit(8, 126, "", "F", "void", strArray32);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter7.getClassType();
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.toString();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type1, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type1.getDimensions();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1655322812", "(SSII)S");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        java.lang.String str18 = type16.getClassName();
        java.lang.String str19 = type16.getClassName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(108, type16);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) (short) 0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray39);
        java.lang.String str41 = signature40.getDescriptor();
        java.lang.String str42 = signature40.toString();
        org.mockito.asm.Type[] typeArray43 = signature40.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type22, typeArray43);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(130, 126, "F", type16, typeArray46, "L1119605581");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "org/mockito/cglib/core/ClassEmitter", "(SSII)S", (int) 'a');
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (byte) 10, type26);
        org.mockito.asm.Type type28 = local27.getType();
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(0);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type34, typeArray44);
        java.lang.String str46 = signature45.getDescriptor();
        boolean boolean48 = signature45.equals((java.lang.Object) "");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean56 = type54.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(0, type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type54, type57, type59, type61 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray62);
        java.lang.String str64 = signature63.getDescriptor();
        java.lang.String str65 = signature63.toString();
        org.mockito.asm.Type[] typeArray66 = signature63.getArgumentTypes();
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray66);
        boolean boolean68 = signature45.equals((java.lang.Object) typeArray66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(154, "V", type28, (java.lang.Object) signature45);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) 'a', 156, "L652832830", "L824714731", "L1380537372", strArray7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        java.lang.Object obj21 = label19.info;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        label19.info = type22;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        int int25 = type24.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field((int) '#', "F", type22, (java.lang.Object) int25);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("org/mockito/asm/Type", "J", "J", 2);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        org.mockito.asm.Type type9 = local8.getType();
        int int10 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (byte) 10, type15);
        org.mockito.asm.Type type17 = local16.getType();
        int int19 = type17.getOpcode(112);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (byte) 10, type22);
        int int25 = type22.getOpcode(10);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray42);
        java.lang.String str44 = signature43.getDescriptor();
        java.lang.String str45 = signature43.toString();
        org.mockito.asm.Type[] typeArray46 = signature43.getArgumentTypes();
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray46);
        java.lang.String str48 = type29.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type27, type29, type49, type50 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray53);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type13, type17, type22 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray55);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int59 = type58.getSort();
        boolean boolean60 = type12.equals((java.lang.Object) int59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean64 = type62.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) (short) 0, type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean73 = type71.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local77 = new org.mockito.cglib.core.Local(0, type76);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type71, type74, type76, type78 };
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("hi!", type69, typeArray79);
        java.lang.String str81 = signature80.getDescriptor();
        java.lang.String str82 = signature80.toString();
        org.mockito.asm.Type[] typeArray83 = signature80.getArgumentTypes();
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray83);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("", type62, typeArray83);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(100, 0, "Lorg/mockito/asm/ClassAdapter;", type9, typeArray83, "L1553700172");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("L1380537372", true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("(SSII)S", "L652832830", "org/mockito/cglib/core/Signature", 9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("Lorg/mockito/asm/ClassAdapter;", "org/mockito/asm/Type(SSII)Z");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(0, type1);
        int int3 = local2.getIndex();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("(SSII)Z", "L824714731");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type3.getElementType();
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.getStaticHook();
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classEmitter36.visitAnnotation("L1655322812", true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        org.mockito.asm.Type type9 = local8.getType();
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (byte) 10, type17);
        org.mockito.asm.Type type19 = local18.getType();
        int int21 = type19.getOpcode(112);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (byte) 10, type24);
        int int27 = type24.getOpcode(10);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type34, typeArray44);
        java.lang.String str46 = signature45.getDescriptor();
        java.lang.String str47 = signature45.toString();
        org.mockito.asm.Type[] typeArray48 = signature45.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        java.lang.String str50 = type31.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type29, type31, type51, type52 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray55);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type15, type19, type24 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) '#', 157, "L1057178490", type9, typeArray57, "L1655322812");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        java.lang.String[] strArray47 = new java.lang.String[] { "L1119605581", "L5916778", "L1946254240" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visit(0, (int) (byte) 100, "L848514023", "L5916778", "L783288789", strArray47);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type4);
        org.mockito.asm.Type type6 = local5.getType();
        int int8 = type6.getOpcode(112);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        int int14 = type11.getOpcode(10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = signature32.getDescriptor();
        java.lang.String str34 = signature32.toString();
        org.mockito.asm.Type[] typeArray35 = signature32.getArgumentTypes();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        java.lang.String str37 = type18.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type16, type18, type38, type39 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type2, type6, type11 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        java.lang.String str46 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type1.getDimensions();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter6.getStaticHook();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("void", "void", "(SSII)Z");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = classEmitter36.getAccess();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitSource("L1200714846", "L5916778");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org/mockito/asm/Type", "org/mockito/asm/Type", "L652832830(SSII)Z", 130);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classEmitter36.visitAnnotation("Lorg/mockito/asm/ClassAdapter;", false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        label0.info = type17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type17.getDimensions();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L125209319", "L1120710497", "L1738126850", 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.String str14 = type2.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (byte) 10, type16);
        int int19 = type16.getOpcode(10);
        int int20 = type16.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray34);
        boolean boolean37 = type16.equals((java.lang.Object) typeArray34);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type2.getDimensions();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1655322812", "L1655322812", "int(SSII)Z", "L1946254240", "L1817833920" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(1, 116, "int(SSII)Z", "J", "L346918716", strArray18);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classAdapter42.visitAnnotation("L125209319", true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter1.getClassType();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        int int4 = type1.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.getStaticHook();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("(IIJV)Z", "org/mockito/cglib/core/ClassEmitter", "L522853662", (int) '4');
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter0.getSuperType();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(0, type2);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(158, type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.end_class();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1489470797", "hi!(IIJV)Z", "(SSII)V");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitOuterClass("()I", "L1120710497", "L652832830");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = classEmitter6.getAccess();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (byte) 10, type17);
        int int20 = type17.getOpcode(10);
        int int21 = type17.getSize();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(128, type17);
        int int23 = type17.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field((int) (short) 1, "J", type17, (java.lang.Object) classEmitter45);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("L1339020033", "L164340220", "L387271767");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1946254240", "org/mockito/asm/Type" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit((int) (short) 100, 0, "L1612818439", "L1478451963", "L2067377401", strArray13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.String str2 = label1.toString();
        java.lang.Object obj3 = label1.info;
        label1.info = (byte) 10;
        java.lang.String str6 = label1.toString();
        java.lang.String str7 = label1.toString();
        java.lang.String str8 = label1.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        label1.info = type9;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (byte) 0, type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type9.getInternalName();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitEnd();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = type13.getDescriptor();
        int int27 = type13.getOpcode(4);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) (short) 0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(0, type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (short) 0, type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean48 = type46.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(0, type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type44, typeArray54);
        java.lang.String str56 = type44.getDescriptor();
        boolean boolean57 = signature41.equals((java.lang.Object) type44);
        org.mockito.asm.Type type58 = signature41.getReturnType();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean62 = type60.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local((int) (short) 0, type67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean71 = type69.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local75 = new org.mockito.cglib.core.Local(0, type74);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type69, type72, type74, type76 };
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("hi!", type67, typeArray77);
        java.lang.String str79 = signature78.getDescriptor();
        java.lang.String str80 = signature78.toString();
        org.mockito.asm.Type[] typeArray81 = signature78.getArgumentTypes();
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("", type60, typeArray81);
        org.mockito.asm.Type[] typeArray84 = signature83.getArgumentTypes();
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class((int) (byte) 100, 154, "void", type13, typeArray84, "(IIJV)L(SSII)I;");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type4);
        org.mockito.asm.Type type6 = local5.getType();
        int int8 = type6.getOpcode(112);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        int int14 = type11.getOpcode(10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = signature32.getDescriptor();
        java.lang.String str34 = signature32.toString();
        org.mockito.asm.Type[] typeArray35 = signature32.getArgumentTypes();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        java.lang.String str37 = type18.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type16, type18, type38, type39 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type2, type6, type11 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        java.lang.String str46 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type1.getInternalName();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("hi!(SSII)I");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        org.mockito.asm.Type type9 = local8.getType();
        int int11 = type9.getOpcode(112);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (byte) 10, type14);
        int int17 = type14.getOpcode(10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = signature35.getDescriptor();
        java.lang.String str37 = signature35.toString();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray38);
        java.lang.String str40 = type21.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type19, type21, type41, type42 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type5, type9, type14 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type2.getDimensions();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("hi!(SSII)I", "L1919555830", "L1738126850");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L848514023", "L346918716");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (short) 0);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(8, type1);
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1339020033", "(SSII)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((int) (short) 100, 154, "L824714731", "g.mockito.asm.Type", "()I", strArray15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 10, type2);
        int int5 = type2.getOpcode(10);
        int int6 = type2.getSize();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(128, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type2.getInternalName();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.end_class();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("Lint;", "L978151164", "L1092460119");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1104695901" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visit(9, 124, "hi!", "L387271767", "L1104695901", strArray14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        java.lang.String[] strArray55 = new java.lang.String[] { "L1655322812", "L230405251", "L466824257", "L1612818439", "(SSII)I", "org/mockito/cglib/core/SignatureL824714731" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter42.visit(153, 154, "(IIJV)Z", "L125209319", "(IIJV)Z", strArray55);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(SSII)I");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getSuperType();
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = classEmitter36.getAccess();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        java.lang.String[] strArray21 = new java.lang.String[] { "org/mockito/cglib/core/SignatureL824714731", "L230405251", "Lorg/mockito/asm/Type;", "L1092460119" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(6, (int) (short) 100, "L1489470797", "L130196723", "L522853662", strArray21);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray25 = new java.lang.String[] { "(SSII)V", "Lorg/mockito/cglib/core/Signature;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visit(96, (int) (short) 100, "org/mockito/asm/Type", "L230405251", "org.mockito.asm.Type", strArray25);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter9.getStaticHook();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("", "", "L1946254240", (int) (short) 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("(SSII)V", "Lorg/mockito/asm/ClassAdapter;", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1738126850", "L387271767", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray12 = new java.lang.String[] { "int" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(130, (int) 'a', "L130196723", "L69766229", "L201825708", strArray12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L69766229", "L2067377401", "org/mockito/asm/Label");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.String str14 = type2.getDescriptor();
        int int16 = type2.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type2.getDimensions();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray24 = new java.lang.String[] { "L307348924", "L1057178490" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(10, 0, "L1478451963", "L971768301", "hi!(SSII)I", strArray24);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("hi!(SSII)I");
        int int22 = type21.getSize();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", "L824714731");
        boolean boolean27 = signature25.equals((java.lang.Object) "hi!(SSII)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.declare_field((int) 'a', "L1919555830", type21, (java.lang.Object) signature25);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(116, type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.toString();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("void", type2, typeArray22);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType("I");
        int int28 = type27.getSort();
        boolean boolean29 = signature24.equals((java.lang.Object) type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type27.getDimensions();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L164340220", "char", "L1041943309", 100);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = classEmitter7.getAccess();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.end_class();
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter6.getClassType();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter11.getClassType();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L62281897", "L1380537372", "L1277466335");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L228963152", true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1057178490", "L967299587", "L652832830");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        java.lang.String str21 = signature20.getDescriptor();
        java.lang.String str22 = signature20.toString();
        org.mockito.asm.Type[] typeArray23 = signature20.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type2, typeArray23);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(1, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type2.getDimensions();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("S", "L971768301", "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (short) 0, type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean51 = type49.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local(0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type49, type52, type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type47, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("L130196723", type44, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.begin_class(154, 153, "L1119605581", type40, typeArray57, "L978151164");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("L1489470797", true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter0.getClassType();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classEmitter36.visitAnnotation("L130196723", true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter4.visitAnnotation("L5916778", false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("", ".mockito.asm.Type");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1057178490", "L1612818439(SSII)L(SSII)I;", "L979286802", "org/mockito/asm/Type", "Lorg/mockito/cglib/core/ClassEmitter;", "L201825708" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit(5, 7, "", "[Lorg/mockito/asm/Type;", "L1612818439", strArray14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitOuterClass("L1621943971", "L1092460119", "L1278752730");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray14);
        java.lang.String str16 = signature15.getDescriptor();
        java.lang.String str17 = signature15.toString();
        org.mockito.asm.Type[] typeArray18 = signature15.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        java.lang.String str20 = type1.getClassName();
        int int21 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("org.mockito.asm.Type", "J", "Lint;");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classEmitter40.visitAnnotation("L1919555830", true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L822689388", "(SSII)Lorg/mockito/asm/Type;", "L1278752730");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = classEmitter15.getClassType();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L1839661580", "L2067377401", "L652832830(SSII)Z");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter6.getAccess();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("boolean", "L445802793", "L230405251");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1041943309", "Lorg/mockito/asm/ClassAdapter;", "L1956668340");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) (byte) 1, 128, "Lorg/mockito/asm/ClassAdapter;", "(IIJV)Z", "(SSII)LLorg/mockito/asm/Type;;", strArray18);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "L466824257", "L65611762", 158);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type15, typeArray31);
        int int35 = type15.getSort();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(104, type15);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(0, type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local((int) (short) 0, type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean57 = type55.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local(0, type60);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray63);
        java.lang.String str65 = type53.getDescriptor();
        boolean boolean66 = signature50.equals((java.lang.Object) type53);
        org.mockito.asm.Type[] typeArray67 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("L652832830", type15, typeArray67);
        java.lang.String str69 = type15.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor70 = classEmitter7.visitField(1, "Lorg.mockito.asm.Type;", "(SSII)L/mockito/asm/Type;", "org/mockito/asm/Label", (java.lang.Object) type15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter4.visitAnnotation("L228963152", false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "org/mockito/asm/Type", "int(SSII)Z", "L(SSII)I;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(156, (int) (byte) -1, "Lorg/mockito/cglib/core/ClassEmitter;", "L125209319", "L125209319", strArray16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1266914296", "L978151164", "L783288789", (int) (byte) 10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1946254240", "L164340220", "L1839661580(SSII)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(15, 154, "F", "L2067377401", "L(SSII)I;", strArray15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type43, typeArray53);
        java.lang.Class<?> wildcardClass55 = type43.getClass();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        int int59 = type58.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.declare_field(10, "L979286802", type57, (java.lang.Object) type58);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitOuterClass("int", "L652832830", "L125209319");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        java.lang.String str20 = type8.getDescriptor();
        int int22 = type8.getOpcode(4);
        int int23 = type8.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray37);
        java.lang.String str39 = signature38.getDescriptor();
        java.lang.String str40 = signature38.toString();
        org.mockito.asm.Type[] typeArray41 = signature38.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(153, 0, "[Lorg/mockito/asm/Type;", type8, typeArray41, "hi!(IIJV)Z");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/cglib/core/SignatureL824714731", "J");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(SSII)J", "L697878919", "Lrg/mockito/asm/Type;");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        java.lang.Class<?> wildcardClass21 = type9.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type24 = type23.getElementType();
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = type24.getElementType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type29 = type28.getElementType();
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = type29.getElementType();
        int int32 = type31.getDimensions();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (short) 0, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(0, type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray51);
        java.lang.String str53 = signature52.getDescriptor();
        java.lang.String str54 = signature52.toString();
        org.mockito.asm.Type[] typeArray55 = signature52.getArgumentTypes();
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type34, typeArray55);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(0, (int) ' ', "L1839661580", type26, typeArray55, "L971768301");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter12.getClassType();
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(128, 104, "(SSII)J", "L1692099272", "L1839661580", strArray8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((int) '4', 112, "(SSII)L(SSII)I;", "L1655322812", "L1910189211", strArray14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type34.getInternalName();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L1277466335", "L346918716");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray16 = new java.lang.String[] { "(SSII)J", "L1738126850", "L62281897" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((int) (short) 1, (int) '4', "L652832830", "L692745398", "float", strArray16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classEmitter12.visitAnnotation("L1478451963", true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("F", "(SSII)J");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        java.lang.String str4 = type2.getClassName();
        java.lang.String str5 = type2.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type7 = local6.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter0.getAccess();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (short) 0);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(8, type1);
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter4.visitAnnotation("L783288789", true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classEmitter12.visitAnnotation("L62281897", false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(130, type21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field((int) (short) -1, "L692745398", type21, (java.lang.Object) "L195886792");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.end_class();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter12.visitInnerClass("L346918716", "", "Lorg/mockito/cglib/core/Signature;", (int) '4');
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray37);
        java.lang.String str39 = type27.getDescriptor();
        boolean boolean40 = signature24.equals((java.lang.Object) type27);
        org.mockito.asm.Type type41 = signature24.getReturnType();
        label7.info = type41;
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter47);
        label7.info = classEmitter50;
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter50.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("hi!", "g.mockito.asm.Type");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter0.getClassType();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = type16.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) type16);
        org.mockito.asm.Type type30 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray31 = signature13.getArgumentTypes();
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L1839661580", "(SSII)I");
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        boolean boolean36 = signature13.equals((java.lang.Object) signature34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass38 = type37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        boolean boolean40 = signature13.equals((java.lang.Object) str39);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (byte) 10, type43);
        int int46 = type43.getOpcode(10);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local((int) (short) 0, type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean57 = type55.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local(0, type60);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray63);
        java.lang.String str65 = signature64.getDescriptor();
        java.lang.String str66 = signature64.toString();
        org.mockito.asm.Type[] typeArray67 = signature64.getArgumentTypes();
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray67);
        java.lang.String str69 = type50.getClassName();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean73 = type71.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type48, type50, type70, type71 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", type43, typeArray74);
        java.lang.String str76 = signature75.getDescriptor();
        org.mockito.asm.Type[] typeArray77 = signature75.getArgumentTypes();
        org.mockito.asm.Type type78 = signature75.getReturnType();
        boolean boolean79 = signature13.equals((java.lang.Object) type78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int80 = type78.getDimensions();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type40 = classEmitter36.getClassType();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitSource("L522853662", "org/mockito/asm/ClassAdapter");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/asm/Type(SSII)Z", "L697878919");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("L65611762", "(SSII)Z");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("", "L1339020033", "Lg.mockito.asm.Type;");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1655322812", "L1174170939", "int(SSII)Z");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        java.lang.String str36 = type34.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = type34.getInternalName();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Z", "org/mockito/asm/Type", "(BZZ)I", 4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L824714731", "L5916778", "L1174170939");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        java.lang.String[] strArray19 = new java.lang.String[] { "L445802793", "Lorg.mockito.asm.Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) (short) 1, (int) (byte) 10, "L65611762", "F", "L1978514335", strArray19);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1196090204", "L910107650" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) '#', 116, "L1978514335", "L505576469", "L1092460119", strArray13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L1119605581", "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (short) 0);
        int int26 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean29 = type23.equals((java.lang.Object) classEmitter27);
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        label30.info = classEmitter73;
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter73.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter78 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("org/mockito/asm/Label", "(BZZ)I", "org/mockito/asm/Type(SSII)Z", 120);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray14);
        java.lang.String str16 = signature15.getDescriptor();
        java.lang.String str17 = signature15.toString();
        org.mockito.asm.Type[] typeArray18 = signature15.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        java.lang.String str20 = type1.getClassName();
        int int21 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type1.getElementType();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("J", true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("hi!(SSII)I");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        org.mockito.asm.Type type9 = local8.getType();
        int int11 = type9.getOpcode(112);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (byte) 10, type14);
        int int17 = type14.getOpcode(10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = signature35.getDescriptor();
        java.lang.String str37 = signature35.toString();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray38);
        java.lang.String str40 = type21.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type19, type21, type41, type42 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type5, type9, type14 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = type2.getInternalName();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (short) 0);
        int int26 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean29 = type23.equals((java.lang.Object) classEmitter27);
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        label30.info = classEmitter73;
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter73.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1092460119", "Lorg/mockito/cglib/core/Local;", "L346918716", 8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (short) 0);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(8, type9);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (byte) 10, type15);
        int int18 = type15.getOpcode(10);
        int int19 = type15.getSize();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(128, type15);
        org.mockito.asm.Type type21 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(155, "L1612818439(SSII)L(SSII)I;", type9, (java.lang.Object) local20);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = classEmitter17.getSuperType();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        int int14 = type12.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type12, typeArray28);
        java.lang.String str32 = signature31.toString();
        java.lang.String str33 = signature31.getDescriptor();
        org.mockito.asm.Type type34 = signature31.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor35 = classEmitter4.visitField(39, "org/mockito/cglib/core/Signature", "(SSII)LL1054904739;", "L1956668340", (java.lang.Object) type34);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1691523271", "L267112046");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1738126850", "L822689388", "L466824257", (-1));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = local3.getType();
        int int5 = type4.getSort();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(10, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter18.visitOuterClass("L125209319", "L307348924", "L31281388");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitSource("L1839661580(SSII)I", "org/mockito/asm/Type(SSII)Z");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "float", "S", "(SSII)L(SSII)I;", "(SSII)L/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(9, (int) (short) 100, "", "L979286802", "org/mockito/asm/Type", strArray17);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classAdapter18.visitAnnotation("L62281897", false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("L971768301", true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter43.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter47 = classEmitter43.getStaticHook();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        java.lang.String str36 = type3.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 10, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = type3.getDimensions();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        java.lang.String str29 = type17.getDescriptor();
        boolean boolean30 = signature14.equals((java.lang.Object) type17);
        org.mockito.asm.Type type31 = signature14.getReturnType();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(155, type31);
        org.mockito.asm.Type type33 = local32.getType();
        org.mockito.asm.Type type34 = local32.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type34.getElementType();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classAdapter12.visitAnnotation("L125209319", false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("L73193953", false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.getStaticHook();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classAdapter12.visitAnnotation("L1655322812", false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter43.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = classEmitter43.getAccess();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter18.visitInnerClass("Lorg/mockito/cglib/core/ClassEmitter;", "L267112046", "L1054904739", 104);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (byte) 10, type16);
        org.mockito.asm.Type type18 = local17.getType();
        int int20 = type18.getOpcode(112);
        java.lang.String str21 = type18.getDescriptor();
        java.lang.String str22 = type18.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray36);
        java.lang.Class<?> wildcardClass38 = type26.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        int int44 = type42.getOpcode((int) (short) 1);
        int int46 = type42.getOpcode(3);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local((int) (short) 0, type64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean68 = type66.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local72 = new org.mockito.cglib.core.Local(0, type71);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type66, type69, type71, type73 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", type64, typeArray74);
        java.lang.String str76 = type64.getDescriptor();
        boolean boolean77 = signature61.equals((java.lang.Object) type64);
        org.mockito.asm.Type type78 = signature61.getReturnType();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local((int) (short) 0, type81);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean85 = type83.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local89 = new org.mockito.cglib.core.Local(0, type88);
        org.mockito.asm.Type type90 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray91 = new org.mockito.asm.Type[] { type83, type86, type88, type90 };
        org.mockito.cglib.core.Signature signature92 = new org.mockito.cglib.core.Signature("hi!", type81, typeArray91);
        java.lang.String str93 = signature92.getDescriptor();
        java.lang.String str94 = signature92.toString();
        org.mockito.asm.Type[] typeArray95 = signature92.getArgumentTypes();
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("L1612818439", type78, typeArray95);
        org.mockito.cglib.core.Signature signature97 = new org.mockito.cglib.core.Signature("", type42, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.declare_field(0, "L1672110834", type18, (java.lang.Object) type42);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L5916778", "L130196723", "L522853662", 112);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("L1883222277", "L1738126850", "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = classEmitter21.getClassType();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("L65611762", "org/mockito/asm/Type(SSII)Z", "L1655322812", 15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("L822689388");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        int int18 = type16.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray32);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type16, typeArray32);
        java.lang.String str36 = signature35.getName();
        org.mockito.asm.Type[] typeArray37 = signature35.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.begin_class(4, 0, "L1672110834", type14, typeArray37, "L228963152");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitSource("L1883222277", "L445802793");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lorg/mockito/asm/Label;", "C", ".mockito.asm.Type");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = classEmitter17.getSuperType();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitInnerClass("L1691523271", "int(SSII)Z", "Z", (int) (byte) 1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L164340220", "L1621943971");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        java.lang.Object obj5 = label3.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        label3.info = type6;
        java.lang.String str8 = label3.toString();
        java.lang.String str9 = label3.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = local12.getType();
        int int14 = type13.getSort();
        java.lang.String str15 = type13.getDescriptor();
        label3.info = type13;
        java.lang.String str17 = type13.getDescriptor();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        java.lang.Object obj20 = label18.info;
        label18.info = (byte) 10;
        java.lang.String str23 = label18.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("L1120710497");
        label18.info = type25;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 1, "L1278752730", type13, (java.lang.Object) type25);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("L450163105", "L466824257", "L1069707858", 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = classEmitter6.getSuperType();
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L910107650", "L1875004829", "L824714731");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter17.getStaticHook();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitSource("char", "L(SSII)I;");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter8.visitAnnotation("L184600696", true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (short) 0);
        int int26 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean29 = type23.equals((java.lang.Object) classEmitter27);
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        label30.info = classEmitter73;
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter73.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        java.lang.String[] strArray86 = new java.lang.String[] { "L1978514335", "Lorg/mockito/asm/Label;", "L1054904739" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visit(124, (int) 'a', "L1069707858", "L273914349", "L557246694", strArray86);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("L1831278292", "L1672110834", "hi!(SSII)I");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter15.visitAnnotation("", true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitSource("L1738126850", "L32308378");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitSource("Lorg/mockito/cglib/core/Local;", "boolean");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray15);
        java.lang.String str17 = signature16.getDescriptor();
        java.lang.String str18 = signature16.toString();
        org.mockito.asm.Type[] typeArray19 = signature16.getArgumentTypes();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray37);
        java.lang.String str39 = type27.getDescriptor();
        boolean boolean40 = signature24.equals((java.lang.Object) type27);
        org.mockito.asm.Type type41 = signature24.getReturnType();
        label7.info = type41;
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter47);
        label7.info = classEmitter50;
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter50.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classEmitter4.visitAnnotation("org/mockito/asm/Type", true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = classEmitter12.getAccess();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass(".mockito.asm.Type", "org/mockito/asm/Label", "L445802793", 120);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 10, type2);
        int int5 = type2.getOpcode(10);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray22);
        java.lang.String str24 = signature23.getDescriptor();
        java.lang.String str25 = signature23.toString();
        org.mockito.asm.Type[] typeArray26 = signature23.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        java.lang.String str28 = type9.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type7, type9, type29, type30 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray33);
        java.lang.String str35 = type2.getClassName();
        java.lang.String str36 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type2.getDimensions();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classEmitter6.visitAnnotation("L246572149", false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitSource("g/mockito/asm/Type", "(SSII)LL1054904739;");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int16 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type0.getDimensions();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.String str2 = label1.toString();
        java.lang.Object obj3 = label1.info;
        label1.info = (byte) 10;
        java.lang.String str6 = label1.toString();
        java.lang.String str7 = label1.toString();
        java.lang.String str8 = label1.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        label1.info = type9;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (byte) 0, type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type9.getElementType();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = classEmitter0.getSuperType();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter39.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean43 = signature38.equals((java.lang.Object) classAdapter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter42.visitSource("L1489470797", "L793530458");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classAdapter12.visitAnnotation("L824714731", true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(116, type43);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(8, type43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.declare_field(164, "int(SSII)Z", type43, (java.lang.Object) "L1910189211");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitInnerClass("L1691523271", "L926711611", "(SSII)L(SSII)I;", (int) (byte) 10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1278752730", "L1872853792");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitEnd();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "Lorg.mockito.asm.Type;", "L1023671742", "(BZZ)I", "L1092460119Z", "g/mockito/asm/Type" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit((int) (byte) 10, (int) (short) 10, "L199920831", "(SSII)I", "(BZZ)Lorg/mockito/cglib/core/Signature;", strArray17);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (short) 0);
        int int26 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean29 = type23.equals((java.lang.Object) classEmitter27);
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        label30.info = classEmitter73;
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter73.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        java.lang.String[] strArray88 = new java.lang.String[] { "L1558886110", "L1277466335", "L230405251", "L505576469", "L387271767" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visit(11, 0, "boolean", "L544212942", "L5916778", strArray88);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1307346202", "L1658239688", "L580477125", "L1621943971", "L19896701" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(97, 164, "L230405251", "(SSII)LLorg/mockito/asm/Type;;", "L1057178490", strArray13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L793530458", "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (short) 0);
        int int26 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        boolean boolean29 = type23.equals((java.lang.Object) classEmitter27);
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter70);
        label30.info = classEmitter73;
        org.mockito.cglib.core.ClassInfo classInfo75 = classEmitter73.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        java.lang.String[] strArray83 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visit(156, 157, "org/mockito/asm/Label", "L652832830", "L1672110834", strArray83);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("L2067377401");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getClassName();
        boolean boolean18 = type15.equals((java.lang.Object) type16);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.Class<?> wildcardClass33 = type21.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type36 = type35.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.declare_field((int) (short) 100, "L67485284", type16, (java.lang.Object) type35);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        java.lang.String[] strArray52 = new java.lang.String[] { "org/mockito/asm/Label", "Lorg/mockito/cglib/core/Local;", "float", "L1910189211" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visit(0, (int) (short) -1, "(SSII)F", "L1831278292", "L1489470797", strArray52);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitEnd();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        label0.info = classEmitter36;
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter36.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classEmitter36.visitAnnotation("", false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1041943309", "L1978514335", "L910107650", "int", "L1174170939" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(6, 126, "L548396313", "L445802793", "L1478451963", strArray12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.end_class();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type4);
        org.mockito.asm.Type type6 = local5.getType();
        int int8 = type6.getOpcode(112);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        int int14 = type11.getOpcode(10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = signature32.getDescriptor();
        java.lang.String str34 = signature32.toString();
        org.mockito.asm.Type[] typeArray35 = signature32.getArgumentTypes();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        java.lang.String str37 = type18.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type16, type18, type38, type39 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray42);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type2, type6, type11 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        int int48 = type47.getSort();
        boolean boolean49 = type1.equals((java.lang.Object) int48);
        int int51 = type1.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int52 = type1.getDimensions();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode(112);
        java.lang.String str16 = type13.getDescriptor();
        java.lang.String str17 = type13.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (byte) 10, type20);
        int int23 = type20.getOpcode(10);
        int int24 = type20.getSize();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(128, type20);
        int int26 = local25.getIndex();
        org.mockito.asm.Type type27 = local25.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(132, "(SSII)Z", type13, (java.lang.Object) local25);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1919555830", "L892989894", "L299448579");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L636503337", "", "L848514023", (int) (short) -1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (short) 0);
        int int11 = type8.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("I");
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", "L824714731");
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (short) 0);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(8, type30);
        int int34 = local33.getIndex();
        int int35 = local33.getIndex();
        org.mockito.asm.Type type36 = local33.getType();
        org.mockito.asm.Type type37 = local33.getType();
        boolean boolean38 = signature27.equals((java.lang.Object) type37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(128, "g.mockito.asm.Type", type23, (java.lang.Object) boolean38);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("L73193953", true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type20, typeArray36);
        int int40 = type20.getSort();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(104, type20);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (short) 0, type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean48 = type46.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(0, type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type44, typeArray54);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local((int) (short) 0, type58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean62 = type60.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(0, type65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type60, type63, type65, type67 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("hi!", type58, typeArray68);
        java.lang.String str70 = type58.getDescriptor();
        boolean boolean71 = signature55.equals((java.lang.Object) type58);
        org.mockito.asm.Type[] typeArray72 = signature55.getArgumentTypes();
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("L652832830", type20, typeArray72);
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("L1946254240", type1, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int75 = type1.getDimensions();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L357159786", true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = type16.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) type16);
        org.mockito.asm.Type[] typeArray30 = signature13.getArgumentTypes();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        boolean boolean34 = signature13.equals((java.lang.Object) (short) 0);
        java.lang.String str35 = signature13.getName();
        org.mockito.asm.Type type36 = signature13.getReturnType();
        boolean boolean38 = type36.equals((java.lang.Object) "L910107650");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type36.getDimensions();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("hi!", "L2013356395", "L346918716");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "L824714731", "L1196090204", "(IIJV)LL848514023;", "V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(0, 15, "L1014079532", "C", "org/mockito/cglib/core/ClassEmitter", strArray14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "[Lorg/mockito/asm/Type;", "L146154080", "L1558886110" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) '#', 154, "(SSII)I", "L228963152", "(BZZ)Lorg/mockito/cglib/core/Signature;", strArray14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L357159786" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(126, 0, "hi!(IIJV)Z", "S", "int(SSII)Z", strArray11);
    }
}


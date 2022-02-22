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
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "(ZDZ)Z", "", "(ZZZZ)Z", "(ZZZZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(130, 0, "", "", "(ZZZZ)Z", strArray12);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type3, type14, type15 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type1.getInternalName();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "void", "(ZZZZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(4, (-1), "", "(ZZZZ)Z", "", strArray9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(108, type5);
        org.mockito.asm.Type type17 = local16.getType();
        int int18 = type17.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type22, type33, type34 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(130, 0, "(VZZVZZ)V", type17, typeArray36, "J");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("(ZDZ)Z", true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("(VZZVZZ)V", false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("boolean", "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(108, type5);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(96, (int) (byte) 0, "(ZDZ)Z", type18, typeArray20, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "hi!", "(ZDZ)Z", (int) (short) 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type5, type16, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(108, type23);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(108, type38);
        org.mockito.asm.Type type50 = local49.getType();
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type1, type3, type35, type36, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray54);
        java.lang.String str56 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int57 = type0.getDimensions();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("boolean", "void", "Z");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("void", "org/mockito/asm/Type", "org/mockito/asm/Type", (int) '#');
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type5, type16, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(108, type23);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(108, type38);
        org.mockito.asm.Type type50 = local49.getType();
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type1, type3, type35, type36, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type0.getDimensions();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("(VZZVZZ)V", true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField(100, "boolean", "Z", "void", (java.lang.Object) type8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type1, type3, type5, type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.getDescriptor();
        java.lang.String str12 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type1, type3, type5, type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type15, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type0.getDimensions();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        boolean boolean10 = type8.equals((java.lang.Object) label9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        int int13 = type11.getOpcode(5);
        label9.info = 5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 10, "hi!", type7, (java.lang.Object) 5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("J", "(ZZZZ)Z", "(ZZZZ)Z", (int) (short) -1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type3, type14, type15 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type1.getDimensions();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getSuperType();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        boolean boolean17 = type13.equals((java.lang.Object) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type13.getInternalName();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type13.getElementType();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("()Z", "", "void", (int) (short) 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(ZZZZ)Z", "(ZZZZ)Z", "org/mockito/asm/Type", 2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org.mockito.asm.Type", "(ZDZ)Z");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "()Lorg/mockito/asm/Type;", "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(3, (int) ' ', "", "(VZZVZZ)V", "void", strArray10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        org.mockito.asm.Type type8 = signature6.getReturnType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(108, type12);
        org.mockito.asm.Type type24 = local23.getType();
        boolean boolean25 = type10.equals((java.lang.Object) local23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) -1, "()Lorg/mockito/asm/Type;", type8, (java.lang.Object) local23);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(VZZVZZ)V", "hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("Z", true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(2, 13, "()Lorg/mockito/asm/Type;", "", "Z", strArray10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter2.getAccess();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(VZZVZZ)V", true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type13.getInternalName();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ZZZZ)Z", "org/mockito/cglib/core/ClassEmitter", "()Lorg/mockito/asm/Type;", (int) (byte) 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "()Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(2, (int) (short) -1, "()V", "void", "Lorg/mockito/asm/MethodAdapter;", strArray12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1035675070", "boolean()Lorg/mockito/asm/Type;", "Lhi!;", 5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1974286099", "Z", "L1974286099");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("char", "L1974286099", "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("()V", "Lorg/mockito/cglib/core/ClassEmitter;", "void");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("boolean", "Lhi!;", "boolean()Lorg/mockito/asm/Type;", 6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type13.getInternalName();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.asm.Type type15 = local12.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/asm/Type", "()V");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        java.lang.String str16 = type13.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type13.getDimensions();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 100, "L1974286099", type4, (java.lang.Object) classEmitter10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L1617403293", true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("", "Lorg/mockito/asm/Type;", "V");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type13.getDimensions();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type5, type16, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(108, type23);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(108, type38);
        org.mockito.asm.Type type50 = local49.getType();
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type1, type3, type35, type36, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = type0.getInternalName();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getClassType();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("Z", false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/ClassEmitter;", "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 10, "L822822720", type5, (java.lang.Object) "()V");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("Lorg/mockito/asm/MethodAdapter;", "char", "", 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        java.lang.String str20 = type9.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type29, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type24, type35, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray38);
        org.mockito.asm.Type[] typeArray43 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(158, 154, "Z", type9, typeArray43, "(ZZZZ)Z");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("org/mockito/asm/MethodAdapter", "org.mockito.asm.Type");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) ' ', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org.mockito.asm.Type", "L()Z;", "L1974286099");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1974286099", "L919849236", "L1974286099", (int) '4');
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("org/mockito/cglib/core/ClassEmitter", "L1617403293");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type14.getDimensions();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/MethodAdapter;");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type16, type18 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(108, type11);
        org.mockito.asm.Type type23 = local22.getType();
        boolean boolean24 = type9.equals((java.lang.Object) local22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(124, "Lorg/mockito/asm/MethodAdapter;", type9, (java.lang.Object) "Lhi!;");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L919849236", "(ZDZ)Z", "org.mockito.asm.Type", (int) (byte) -1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type16, type18 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(108, type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter2.visitField(2, "L822822720", "V", "L680829613", (java.lang.Object) local22);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("(ZZZZ)Z", "(ZDZ)C", "L1411121776");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("Lorg/mockito/cglib/core/ClassEmitter;", "L1365617678", "L919849236");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L92807203", "L1035675070", "L838408294", 124);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter2.getAccess();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "Lhi!;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(112, 158, "C", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "()Lorg/mockito/asm/Type;", strArray8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1220550033", "L1283204962", "Lorg/mockito/asm/MethodAdapter;", "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visit((int) (short) 0, (int) (short) 10, "()Z", "L(ZDZ)Z;", "J", strArray18);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter3.visitField(4, "(VZZVZZ)V", "(ZZZZ)Lorg/mockito/asm/Type;", "boolean()Lorg/mockito/asm/Type;", (java.lang.Object) 6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "org/mockito/asm/Type");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        org.mockito.asm.Type type7 = signature5.getReturnType();
        boolean boolean8 = signature2.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type7.getInternalName();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter3.visitField(153, "L1220550033", "J", "org/mockito/asm/MethodAdapter", (java.lang.Object) 6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lhi!;", "org/mockito/asm/Type");
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        boolean boolean19 = signature13.equals((java.lang.Object) type18);
        int int20 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter5.visitField(108, "Lorg/mockito/asm/Type;(VZZVZZ)V", "Lorg/mockito/asm/MethodAdapter;", "L919849236", (java.lang.Object) type18);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter3.visitAnnotation("short", true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("org/mockito/asm/Type", true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L919849236", true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1687456611", "L442156004");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getSuperType();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L()Z;", "boolean");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type1, type3, type5, type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type15, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type41, type43 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(108, type36);
        org.mockito.asm.Type type48 = local47.getType();
        boolean boolean49 = type34.equals((java.lang.Object) local47);
        java.lang.String str50 = type34.getClassName();
        boolean boolean51 = type0.equals((java.lang.Object) type34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type0.getInternalName();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1617403293", "L2068771860");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L919849236", "L814527759");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getClassType();
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L838408294", "Lorg/mockito/asm/Type;(VZZVZZ)V", "S", 104);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "C", "L1283204962" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(7, (int) (short) -1, "L1974286099", "()Z", "org.mockito.asm.Type", strArray14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "(VZZVZZ)Lorg/mockito/asm/Type;", "Lorg/mockito/asm/MethodAdapter;", "()V", "()Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) 'a', 3, "L323416934", "L1974286099", "(ZDZ)C", strArray16);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter3.getAccess();
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1404759413", "org/mockito/asm/MethodAdapter", "L1974286099" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(1, 8, "L303557794", "hi!", "L1035675070org.mockito.asm.Type", strArray15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("L1687456611", true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = type3.getDescriptor();
        int int8 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type3.getInternalName();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("L680829613", true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L1617403293", "L814527759", "V", 155);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(108, type12);
        java.lang.Class<?> wildcardClass24 = type12.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter2.visitField(13, "(ZDZ)Z", "L(ZDZ)Z;", "L(ZDZ)Z;", (java.lang.Object) str26);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("", "J");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter2.getClassType();
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L838408294", "L1035675070", "L1035675070", 9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("L1405890076", "boolean()Lorg/mockito/asm/Type;", "L407651636", 155);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter0.getClassType();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("()Z", "Z");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitSource("L()Z;", "void");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "L2068771860" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(97, (int) (byte) -1, "org/mockito/asm/Type", "org.mockito.asm.MethodAdapter", "L1035675070org.mockito.asm.Type", strArray11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(108, type9);
        java.lang.Class<?> wildcardClass21 = type9.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("boolean", type27, typeArray33);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str38 = signature37.getName();
        boolean boolean39 = signature34.equals((java.lang.Object) signature37);
        java.lang.String str40 = signature34.toString();
        org.mockito.asm.Type type41 = signature34.getReturnType();
        org.mockito.asm.Type[] typeArray42 = signature34.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(1, 100, "org/mockito/asm/Type", type23, typeArray42, "(ZZZZ)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1094307244", "org.mockito.asm.MethodAdapter");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getSuperType();
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "L14978671", "(VZZVZZ)I", "L407651636" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(9, 3, "org/mockito/cglib/core/ClassEmitter", "L2068771860", "char", strArray13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("boolean()Lorg/mockito/asm/Type;", "C");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter14 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitSource("(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(5, "L932695130", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "L1739346356", (java.lang.Object) true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter5.getClassType();
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("(ZDZ)J", false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(124, type14);
        org.mockito.asm.Type type16 = local15.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type16.getDimensions();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1283204962", "L1094307244", "char", 8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter5.getAccess();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field((int) (byte) 1, "L667761749", type7, (java.lang.Object) 0.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZDZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("void", true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("()Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type15, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(108, type10);
        org.mockito.asm.Type type22 = local21.getType();
        int int24 = type22.getOpcode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(4, "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", type8, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("long", "()V", "char", (int) (short) -1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) ' ', type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray24 = new java.lang.String[] { "L(ZDZ)Z;", "Lorg/mockito/asm/MethodAdapter;", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "L407651636", "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(128, 4, "L(ZDZ)Z;", "(ZDZ)C", "L822822720", strArray24);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = type3.toString();
        int int8 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1035675070", "L407651636", "L1411121776", 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter5.getAccess();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        java.lang.String[] strArray17 = new java.lang.String[] { "Lorg/mockito/asm/Type;(VZZVZZ)V", "boolean()Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visit((int) (byte) 1, 2, "J", "L2089788194", "L()Z;", strArray17);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L822822720", "L1644355547", "org/mockito/asm/Type");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray17 = new java.lang.String[] { "L(ZDZ)Z;", "L14978671", "org/mockito/asm/MethodAdapter", "L1644355547" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(116, 4, "", "boolean()Lorg/mockito/asm/Type;", "org.mockito.asm.Type", strArray17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getDescriptor();
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("L(ZDZ)Z;", true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "L919849236", "()Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/ClassEmitter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(153, 96, "L442156004", "void", "S", strArray10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter5.getSuperType();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1739346356", "L1283204962");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "S", "S", "L822822720", "L1404759413" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(126, 7, "Lhi!;", "L2068771860", "()V", strArray13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter5.getClassType();
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray23 = new java.lang.String[] { "L92807203", "L1739346356", "Lorg/mockito/cglib/core/ClassEmitter;", "C" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (short) 10, (int) (byte) -1, "L1365617678", "L1035675070", "L303557794", strArray23);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter2.getAccess();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(154, 15, "L323416934", type9, typeArray20, "boolean");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(124, type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        boolean boolean11 = type0.equals((java.lang.Object) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter10.visitEnd();
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = classEmitter10.getSuperType();
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("Lorg/mockito/asm/Type;", "V");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZDZ)Z");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) 'a', (int) '4', "(VZZVZZ)Z", "L1687456611", "", strArray9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray7);
        java.lang.String str9 = type5.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type13, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type5, typeArray19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type5.getElementType();
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type12, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.String str18 = type7.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type22, type33, type34 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray36);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray36);
        java.lang.String str40 = type7.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass43 = type42.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] {};
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray46);
        org.mockito.asm.Type[] typeArray50 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("boolean", type44, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(130, 9, "hi!", type7, typeArray50, "L442156004");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        java.lang.String str8 = type7.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type7.getDimensions();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("org/mockito/asm/MethodAdapter", "L1094307244");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray20 = new java.lang.String[] { "L932695130", "L1411121776", "char", "Z", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "(VZZVZZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(153, 14, "Lorg/mockito/cglib/core/ClassEmitter;", "(ZDZ)Z", "J", strArray20);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("", false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type22, type24 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type17, type28, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.Class<?> wildcardClass34 = typeArray31.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor35 = classEmitter8.visitField(126, "()V", "[Lorg/mockito/asm/Type;", "L1404759413", (java.lang.Object) wildcardClass34);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "L303557794", "L1220550033", "L323416934", "L711231962", "(VZZVZZ)J", "S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(155, (int) 'a', "", "L1318254146", "(ZDZ)LL667761749;", strArray14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("(ZDZ)Z");
        int int13 = type12.getDimensions();
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("L1617403293", type12, typeArray24);
        java.lang.String str27 = type12.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor28 = classEmitter5.visitField(96, "void", "boolean()Lorg/mockito/asm/Type;", "org/mockito/asm/MethodAdapter", (java.lang.Object) type12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type1, type3, type5, type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type15, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray29);
        java.lang.String str33 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type0.getElementType();
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("Lhi!;", "S", "Lboolean;", 7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter3.getSuperType();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "org/mockito/asm/Type");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        org.mockito.asm.Type type7 = signature5.getReturnType();
        boolean boolean8 = signature2.equals((java.lang.Object) type7);
        int int9 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L303557794", "C");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1471807529", "L1220550033", "int", "L1617403293" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 0, 154, "L92807203", "L323416934", "V", strArray12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("Z", "L822822720");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray9);
        org.mockito.asm.Type type12 = type7.getElementType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type18, type29, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type41, type43 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(108, type36);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSize();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int59 = type58.getSize();
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type54, type56, type58 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray60);
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(108, type51);
        org.mockito.asm.Type type63 = local62.getType();
        int int64 = type63.getSize();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int66 = type65.getSize();
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type14, type16, type48, type49, type63, type65 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray67);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray67);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray67);
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int72 = type0.getDimensions();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter3.visitField(15, "L1545089558", "Lorg/mockito/cglib/core/ClassEmitter;", "(VZZVZZ)I", (java.lang.Object) str12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getSuperType();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type16, type27, type28 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(108, type34);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSize();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type52, type54, type56 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray58);
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(108, type49);
        org.mockito.asm.Type type61 = local60.getType();
        int int62 = type61.getSize();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type63.getSize();
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type12, type14, type46, type47, type61, type63 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray65);
        java.lang.String str67 = type11.getClassName();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((int) ' ', type69);
        int int71 = type69.getSort();
        java.lang.String str72 = type69.getClassName();
        java.lang.String str73 = type69.toString();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int77 = type76.getSize();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int79 = type78.getSize();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int81 = type80.getSize();
        org.mockito.asm.Type type82 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int83 = type82.getSize();
        org.mockito.asm.Type[] typeArray84 = new org.mockito.asm.Type[] { type76, type78, type80, type82 };
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type75, typeArray84);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type87 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int88 = type87.getSize();
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] { type75, type86, type87 };
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray89);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(0, 0, "org/mockito/asm/MethodAdapter", type11, typeArray89, "L1283204962");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("L814527759", false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type19, type21 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        java.lang.String str25 = type14.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type34, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type29, type40, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray43);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int54 = type53.getSize();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = type55.getSize();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int58 = type57.getSize();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type53, type55, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray59);
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local(108, type50);
        org.mockito.asm.Type type62 = local61.getType();
        boolean boolean63 = type48.equals((java.lang.Object) local61);
        java.lang.String str64 = type48.getClassName();
        boolean boolean65 = type14.equals((java.lang.Object) type48);
        java.lang.String str66 = type48.getClassName();
        java.lang.String str67 = type48.getClassName();
        java.lang.String str68 = type48.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor69 = classEmitter3.visitField((int) '#', "", "Lhi!;", "L680829613", (java.lang.Object) str68);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(153, 19, "S", "[Lorg/mockito/asm/Type;", "L1283204962", strArray6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.lang.String str23 = type22.toString();
        int int24 = type22.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        org.mockito.asm.Type type32 = type27.getElementType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type38, type49, type50 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray52);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int58 = type57.getSize();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int62 = type61.getSize();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type63.getSize();
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type59, type61, type63 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray65);
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local(108, type56);
        org.mockito.asm.Type type68 = local67.getType();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int73 = type72.getSize();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int75 = type74.getSize();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int77 = type76.getSize();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int79 = type78.getSize();
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type72, type74, type76, type78 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type71, typeArray80);
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local(108, type71);
        org.mockito.asm.Type type83 = local82.getType();
        int int84 = type83.getSize();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int86 = type85.getSize();
        org.mockito.asm.Type[] typeArray87 = new org.mockito.asm.Type[] { type34, type36, type68, type69, type83, type85 };
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray87);
        java.lang.String str89 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray87);
        org.mockito.cglib.core.Signature signature90 = new org.mockito.cglib.core.Signature("L822822720", type22, typeArray87);
        org.mockito.asm.Type[] typeArray92 = org.mockito.asm.Type.getArgumentTypes("()Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.begin_class((int) (byte) 10, 96, "(ZDZ)LL667761749;", type22, typeArray92, "Lhi!;");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getSuperType();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        java.lang.String str3 = type0.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray13);
        org.mockito.asm.Type type16 = type11.getElementType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type22, type33, type34 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type45, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray49);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(108, type40);
        org.mockito.asm.Type type52 = local51.getType();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSize();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int59 = type58.getSize();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int61 = type60.getSize();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSize();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type58, type60, type62 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray64);
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(108, type55);
        org.mockito.asm.Type type67 = local66.getType();
        int int68 = type67.getSize();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int70 = type69.getSize();
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type18, type20, type52, type53, type67, type69 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray71);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray71);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray71);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray71);
        boolean boolean76 = type0.equals((java.lang.Object) str75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type77 = type0.getElementType();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "org/mockito/cglib/core/ClassEmitter", "short", "L814527759", "(ZDZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(1, 0, "L1687456611", "L1465382310", "()Lorg/mockito/asm/Type;", strArray20);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray23 = new java.lang.String[] { "L323416934", "boolean", "L1465382310boolean()Lorg/mockito/asm/Type;", "org/mockito/cglib/core/ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (short) 10, 15, "L1349766657", "(VZZVZZ)J", "", strArray23);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str15 = signature14.getName();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type type22 = signature20.getReturnType();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray25 = signature20.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.Class<?> wildcardClass27 = typeArray25.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor28 = classEmitter5.visitField(7, "L1739346356", "S", "L1465382310", (java.lang.Object) typeArray25);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        org.mockito.asm.Type type13 = type8.getElementType();
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(108, type18);
        org.mockito.asm.Type type30 = local29.getType();
        boolean boolean31 = type16.equals((java.lang.Object) local29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(130, "", type13, (java.lang.Object) type16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type22, type33, type34 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type45, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray49);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(108, type40);
        org.mockito.asm.Type type52 = local51.getType();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSize();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int59 = type58.getSize();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int61 = type60.getSize();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSize();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type58, type60, type62 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray64);
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(108, type55);
        org.mockito.asm.Type type67 = local66.getType();
        int int68 = type67.getSize();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int70 = type69.getSize();
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type18, type20, type52, type53, type67, type69 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray71);
        java.lang.String str73 = type17.getClassName();
        java.lang.String str74 = type17.getClassName();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter76.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo79 = classEmitter78.getClassInfo();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter78);
        java.lang.Class<?> wildcardClass82 = classEmitter81.getClass();
        java.lang.String str83 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type type84 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type type85 = type84.getElementType();
        org.mockito.asm.Type[] typeArray87 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("L303557794", type85, typeArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(155, 156, "org.mockito.asm.Type", type17, typeArray87, "L1094307244");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitSource("LL1283204962;", "L932695130");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1687456611", "J", "L1807136932", "(VZZVZZ)V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) -1, 130, "boolean()Lorg/mockito/asm/Type;", "L1405890076", "org.mockito.asm.Type", strArray14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        java.lang.String str8 = type4.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type12, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        java.lang.String str21 = signature20.getDescriptor();
        org.mockito.asm.Type type22 = signature20.getReturnType();
        java.lang.String str23 = type22.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type22.getElementType();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ZDZ)LL667761749;", "L1365617678", "L1687456611", 4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter2.getSuperType();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("LL(ZDZ)Z;;", "char", "L1405890076");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter3.getClassType();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter10.getAccess();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.getDescriptor();
        int int5 = type2.getSort();
        java.lang.String str6 = type2.getDescriptor();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type2.getDimensions();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        java.lang.String str13 = type12.toString();
        int int15 = type12.getOpcode((int) (short) 10);
        int int17 = type12.getOpcode(0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.lang.String str23 = type22.toString();
        java.lang.String str24 = type22.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(1, "Lorg/mockito/asm/Type;(VZZVZZ)V", type12, (java.lang.Object) str24);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("(ZZZZ)Z", false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter2.getAccess();
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("int", "(ZDZ)Lhi!;", "L838408294", 126);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("()Z", true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit((int) (short) -1, (int) ' ', "L1035675070", "L584923487", "L1465382310boolean()Lorg/mockito/asm/Type;", strArray19);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1163088796", true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter3.getAccess();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1220550033", "J");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray20 = new java.lang.String[] { "L838408294", "L2089788194", "Z", "org/mockito/asm/Type", "(VZZVZZ)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(128, (int) (short) 1, "L1094307244", "org.mockito.asm.MethodAdapter", "L838408294", strArray20);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("Z(ZDZ)Lorg/mockito/asm/Type;", "", "L1365617678");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("L838408294", true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter9.visitAnnotation("L1035675070", true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter0.getSuperType();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(124, type15);
        int int17 = local16.getIndex();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(5, type18);
        int int20 = type18.getSort();
        int int21 = type18.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type18.getElementType();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        int int8 = type7.getSize();
        int int9 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type7.getInternalName();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        java.lang.String str16 = type14.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(153, type14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter5.visitField((int) (byte) 10, "L1687456611", "Lorg/mockito/cglib/core/ClassEmitter;", "", (java.lang.Object) type14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type15, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(108, type10);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(124, type22);
        org.mockito.asm.Type type24 = local23.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(116, "LL(ZDZ)Z;;", type24, (java.lang.Object) "L1365617678L1974286099");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L102130681", "[Lorg/mockito/asm/Type;", "()J", "Z(ZDZ)Lorg/mockito/asm/Type;", "L102130681" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) 'a', 3, "L1365617678(VZZVZZ)Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;(VZZVZZ)V", "()Lorg/mockito/asm/Type;", strArray13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lboolean;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(6, 8, "L()Z;", "L621408288", "void", strArray12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1974286099", "void", "L1465382310", 1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        org.mockito.asm.Type[] typeArray10 = signature9.getArgumentTypes();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        int int12 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter10.visitEnd();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter2.getClassType();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getSuperType();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L814527759", "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter8.visitAnnotation("(VZZVZZ)Lorg/mockito/asm/Type;", false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L378005426", "L()Z;");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) ' ', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(108, type1);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode((int) (short) 10);
        boolean boolean17 = type13.equals((java.lang.Object) 5);
        int int18 = type13.getSort();
        int int19 = type13.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type13.getDimensions();
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(3, type1);
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("L(ZDZ)Z;", false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("short", "L1479046152", "(ZDZ)Lhi!;");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter0.visitField(10, "Lorg/mockito/cglib/core/ClassEmitter;", "[Lorg/mockito/asm/Type;", "L14978671", (java.lang.Object) 0.0f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray12 = new java.lang.String[] { "L378005426", "L1545089558", "()J", "(VZZVZZ)Lboolean;", "L1644355547", "L1868982687" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, 2, "()C", "Lorg/mockito/asm/Type;", "(VZZVZZ)Lboolean;", strArray12);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitEnd();
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "L1035675070org.mockito.asm.Type", "L927860561", "Lboolean;", "()J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(2, (int) (short) 10, "Lboolean;", "L1644355547", "(VZZVZZ)V", strArray16);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1365617678", "boolean", "L589152921", (int) (short) -1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("org/mockito/cglib/core/ClassEmitter", true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L23834678", "L1644355547");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("(VZZVZZ)Z", "()V", "L1739346356");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) ' ', type14);
        int int16 = type14.getSort();
        boolean boolean17 = type10.equals((java.lang.Object) int16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        java.lang.String str29 = type18.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type36, type38, type40 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type33, type44, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(8, 162, "L()Z;", type10, typeArray47, "Lorg/mockito/asm/Type;(VZZVZZ)V");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray17 = new java.lang.String[] { "L378005426", "L1035675070", "(VZZVZZ)I", "L919849236", "L1035675070" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (byte) -1, 108, "L2103455107", "L814527759", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", strArray17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type16, type18 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(108, type11);
        java.lang.Class<?> wildcardClass23 = type11.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        java.lang.String str27 = type26.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field((int) (byte) 10, "Lboolean;", type26, (java.lang.Object) 32);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1405890076", "L919849236");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("()Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(96, "L927860561", type7, (java.lang.Object) classEmitter10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray7 = new java.lang.String[] { "(VZZVZZ)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(19, (int) (byte) 1, "(VZZVZZ)Lboolean;", "", "(VZZVZZ)Lboolean;", strArray7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "L(ZDZ)Z;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(126, (int) (byte) 1, "L1163088796", "L287947411", "L2103455107", strArray8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("(VZZVZZ)Lboolean;", "L1283204962");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(5);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L684189155", true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1479046152", "L1035675070org.mockito.asm.Type");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getSuperType();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L932695130", "(VZZVZZ)V", "L1405890076", (int) (byte) 100);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter10.visitField((int) (short) -1, "L621408288", "Lorg/mockito/asm/Type;", "L1687456611", (java.lang.Object) type16);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L680829613", "char", "(VZZVZZ)I");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter2.visitField((int) ' ', "(VZZVZZ)Z", "V", "org.mockito.asm.MethodAdapter", (java.lang.Object) 96);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter5.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("boolean", "short");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) -1, 157, "L1801076680", "Z(ZDZ)Lorg/mockito/asm/Type;", "S", strArray15);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classAdapter10.visitAnnotation("L1512990248", true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZDZ)Z");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] { "(ZZZZ)Z", "L323416934", "L378005426" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(1, 1, "L1422889561", "V", "org/mockito/asm/MethodAdapter", strArray15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "L684189155", "Lorg/mockito/cglib/core/ClassEmitter;", "Z", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((-1), 108, "L405320994", "boolean()Lorg/mockito/asm/Type;", "L1739346356", strArray13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter0.getAccess();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type2, type13, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(10, type1);
        org.mockito.asm.Type type19 = local18.getType();
        int int21 = type19.getOpcode(154);
        java.lang.String str22 = type19.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type19.getDimensions();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L()Z;", "(ZZZZ)V");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "L102130681", "L407651636", "L53947990", "Lboolean;", "(ZZZZ)V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (byte) 100, 158, "L584923487", "L2091114728", "long", strArray16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter10.visitSource("L1617403293", "int");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(108, type12);
        org.mockito.asm.Type type24 = local23.getType();
        boolean boolean25 = type10.equals((java.lang.Object) local23);
        int int26 = type10.getDimensions();
        int int27 = type10.getDimensions();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type34, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(108, type29);
        java.lang.Class<?> wildcardClass41 = type29.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        int int43 = type42.getSize();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        org.mockito.asm.Type[] typeArray50 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray50);
        java.lang.String str52 = type48.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass55 = type54.getClass();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] {};
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray58);
        org.mockito.asm.Type[] typeArray62 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("boolean", type56, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type48, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(100, 157, "L1094307244", type10, typeArray62, "(VZZVZZ)Z");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type13, type15 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(108, type8);
        org.mockito.asm.Type type20 = local19.getType();
        int int22 = type20.getOpcode((int) (short) 10);
        boolean boolean24 = type20.equals((java.lang.Object) 5);
        int int25 = type20.getSort();
        int int26 = type20.getSort();
        boolean boolean27 = type6.equals((java.lang.Object) type20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type20.getElementType();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("L1739346356", true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitSource("L23834678", "L407651636");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitEnd();
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("()Z");
        java.lang.String str17 = type16.toString();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter8.visitField(97, "LL(ZDZ)Z;;", "(ZZZZ)L(ZDZ)Z;", "L1465382310boolean()Lorg/mockito/asm/Type;", (java.lang.Object) type16);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(0, "L1318254146", "()Lorg/mockito/asm/Type;", "L407651636", (java.lang.Object) 'a');
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter2.getAccess();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = classEmitter8.getAccess();
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("L1220550033", "L1593923218");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.end_class();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter8.visitAnnotation("L456046094", false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("Lboolean;", "Lboolean;", "L1837687843");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("org.mockito.asm.Type", "L1101597737", "Lorg.mockito.asm.Type;");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L(ZDZ)Z;", "L1512990248");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("", "org.mockito.asm.Type");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("Lorg/mockito/asm/Type;(VZZVZZ)V", "(ZDZ)LL667761749;", "L953603811");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("org.mockito.asm.Type", "()J");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(3, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("L1365617678L1974286099", "L1097027957", "L2103455107");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("L1405890076", false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type13, type15 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type8, type19, type20 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSize();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type31, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(108, type26);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSize();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type44, type46, type48 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray50);
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(108, type41);
        org.mockito.asm.Type type53 = local52.getType();
        int int54 = type53.getSize();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = type55.getSize();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type4, type6, type38, type39, type53, type55 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray57);
        java.lang.String str59 = type3.getClassName();
        int int60 = type3.getSize();
        boolean boolean61 = type0.equals((java.lang.Object) int60);
        java.lang.String str62 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = type0.getInternalName();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(3, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter10.visitOuterClass("", "Lboolean;", "L667761749");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        java.lang.String str11 = signature8.toString();
        org.mockito.asm.Type type12 = signature8.getReturnType();
        org.mockito.asm.Type[] typeArray13 = signature8.getArgumentTypes();
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type4.getElementType();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(124, type15);
        int int17 = local16.getIndex();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(5, type18);
        java.lang.String str20 = type18.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type18.getInternalName();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(124, type15);
        int int17 = local16.getIndex();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(5, type18);
        int int20 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type18.getDimensions();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray22);
        java.lang.String str24 = type20.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray30);
        org.mockito.asm.Type[] typeArray34 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("boolean", type28, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type20, typeArray34);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("L92807203");
        int int39 = type38.getDimensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.declare_field(124, "J", type20, (java.lang.Object) type38);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("", true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        java.lang.String str12 = type10.getDescriptor();
        int int13 = type10.getSort();
        java.lang.String str14 = type10.getDescriptor();
        java.lang.String str15 = type10.toString();
        java.lang.String str16 = type10.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(131, "L1365617678(VZZVZZ)Lorg/mockito/asm/Type;", type10, (java.lang.Object) type17);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L692844999", "L1279723392", "L1974286099");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(VZZVZZ)Lorg/mockito/asm/Type;", "L1035675070org.mockito.asm.Type");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L378005426", "L584923487", "L919849236", 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray18 = new java.lang.String[] { "org/mockito/asm/MethodAdapter", "org/mockito/cglib/core/ClassEmitter", "L92807203", "(VZZVZZ)Lorg/mockito/asm/Type;", "L1035675070", "L1097174238" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visit(155, 162, "Lboolean;", "L287947411", "L1411121776", strArray18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1978153554", "", "L303557794", (int) ' ');
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1801076680", "g.mockito.asm.Type", "L2090579940" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(11, 10, "(ZZZZ)L(ZDZ)Z;", "L287947411", "", strArray13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.getDescriptor();
        int int5 = type2.getSort();
        java.lang.String str6 = type2.getDescriptor();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type2.getInternalName();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray18 = new java.lang.String[] { "(ZDZ)Lhi!;", "L122952548", "short", "(VZZVZZ)Lorg/mockito/asm/Type;", "(ZZZZ)Z", "L1747244172" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(7, 15, "L442156004", "L589152921", "L210958629", strArray18);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1084619953", "L122952548", "(VZZVZZ)Z", "L1397373588", "L92807203" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(13, 156, "L88840360", "org.mockito.asm.MethodAdapter", "L1465382310boolean()Lorg/mockito/asm/Type;", strArray15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.String[] strArray23 = new java.lang.String[] { "()Z", "J", "L()Z;", "Lorg/mockito/asm/MethodAdapter;", "L1163088796", "(ZDZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visit(1, 154, "", "L667761749", "()J", strArray23);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.String str7 = type6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type6.getInternalName();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = classEmitter5.getAccess();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L102130681", "int", "L1739346356", 104);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("boolean", type17, typeArray23);
        org.mockito.asm.Type type25 = type17.getElementType();
        org.mockito.asm.Type type26 = type25.getElementType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        java.lang.String str30 = type28.getDescriptor();
        int int31 = type28.getSort();
        java.lang.String str32 = type28.getDescriptor();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(124, type28);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.begin_class((int) (short) -1, 131, "(ZDZ)LL667761749;", type25, typeArray37, "L1189152835");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter10.getStaticHook();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("L1471807529", false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type18, type20 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(108, type13);
        java.lang.Class<?> wildcardClass25 = type13.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str32 = signature31.getName();
        java.lang.String str33 = signature31.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.declare_field(124, "J", type28, (java.lang.Object) str33);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(1, type1);
        org.mockito.asm.Type type5 = local4.getType();
        int int6 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitEnd();
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("L14978671", "L102130681", "L2089788194", 134);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.getClassName();
        int int10 = type8.getSize();
        int int12 = type8.getOpcode(2);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("boolean");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(ZDZ)Z");
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L1279723392", type15, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(9, (int) (byte) 10, "L338344542", type8, typeArray18, "boolean()Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("Lorg/mockito/asm/MethodAdapter;", "L680829613()Z", "L1035675070org.mockito.asm.Type", (int) (short) 10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L1927930107", "()L)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L2103455107", "()J");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("", "L1369017023");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        org.mockito.asm.Type[] typeArray10 = signature9.getArgumentTypes();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        int int12 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type1.getDimensions();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("(ZDZ)LLorg/mockito/asm/Type;;", "L1974286099");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str4 = signature3.getName();
        org.mockito.asm.Type type5 = signature3.getReturnType();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str10 = signature9.getName();
        org.mockito.asm.Type type11 = signature9.getReturnType();
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str16 = signature15.getName();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        java.lang.String str18 = signature15.toString();
        org.mockito.asm.Type type19 = signature15.getReturnType();
        org.mockito.asm.Type[] typeArray20 = signature15.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L1405890076", type6, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type6.getInternalName();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitInnerClass("L684189155", "L1801076680", "L919849236", 116);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "L2089788194", "L1035675070org.mockito.asm.Type", "L1747244172", "L1575838413" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(157, (int) (short) -1, "L1404759413", ")Lboolean", "L838408294", strArray15);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1807136932", "()Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(5, 127, "L1404759413", "org.mockito.asm.Type", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", strArray12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type19, type21 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(108, type14);
        java.lang.Class<?> wildcardClass26 = type14.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        int int29 = type27.getOpcode(9);
        java.lang.String str30 = type27.getDescriptor();
        int int32 = type27.getOpcode(104);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSize();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type34, type45, type46 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.begin_class((int) (short) 100, (int) (byte) -1, "", type27, typeArray48, "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(124, type14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type14.getInternalName();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1260082257", "long", "(VZZVZZ)Z");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L1735542660", "L1463757694");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("Lorg/mockito/cglib/core/Signature;", false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter11.visitOuterClass("org/mockito/cglib/core/Local", "L1617403293", "L1260082257");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("Lorg/mockito/cglib/core/Signature;", ")Lboolean");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("J", "L814527759");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L692844999", "boolean");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(101, type9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        int int23 = type18.getDimensions();
        int int24 = type18.getDimensions();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str28 = signature27.getName();
        java.lang.String str29 = signature27.toString();
        java.lang.String str30 = signature27.getDescriptor();
        boolean boolean32 = signature27.equals((java.lang.Object) "L1035675070");
        boolean boolean34 = signature27.equals((java.lang.Object) 'a');
        java.lang.String str35 = signature27.toString();
        java.lang.String str36 = signature27.toString();
        org.mockito.asm.Type[] typeArray37 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L2103455107", type18, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(154, 0, "L814527759", type9, typeArray37, "()J");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L953603811", "S", "(VZZVZZ)I", 130);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("", false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type2, type13, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(10, type1);
        org.mockito.asm.Type type19 = local18.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(6, 101, "L1097027957", "L1575838413", "L1404759413", strArray11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(124, type15);
        int int17 = local16.getIndex();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(5, type18);
        int int21 = type18.getOpcode(0);
        java.lang.String str22 = type18.getDescriptor();
        java.lang.String str23 = type18.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type18.getDimensions();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("Lorg/mockito/asm/MethodAdapter;", "L378005426", "L102130681");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) ' ', type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type12, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type7, type18, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type1.getElementType();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(124, type15);
        int int17 = local16.getIndex();
        org.mockito.asm.Type type18 = local16.getType();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(5, type18);
        int int20 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type18.getElementType();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = classEmitter10.getAccess();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type5, type16, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(108, type23);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(108, type38);
        org.mockito.asm.Type type50 = local49.getType();
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type1, type3, type35, type36, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray54);
        java.lang.String str56 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type57 = type0.getElementType();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lhi!;");
        boolean boolean7 = signature2.equals((java.lang.Object) type6);
        java.lang.String str8 = signature2.getName();
        java.lang.String str9 = signature2.getName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        org.mockito.asm.Type type22 = type17.getElementType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type33, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type28, type39, type40 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int54 = type53.getSize();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type51, type53 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray55);
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(108, type46);
        org.mockito.asm.Type type58 = local57.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int65 = type64.getSize();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int67 = type66.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int69 = type68.getSize();
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type62, type64, type66, type68 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray70);
        org.mockito.cglib.core.Local local72 = new org.mockito.cglib.core.Local(108, type61);
        org.mockito.asm.Type type73 = local72.getType();
        int int74 = type73.getSize();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int76 = type75.getSize();
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type24, type26, type58, type59, type73, type75 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray77);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray77);
        boolean boolean82 = signature2.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type83 = type10.getElementType();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter8.getClassType();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("boolean");
        int int19 = type18.getSize();
        java.lang.String str20 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("()Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(6, 32, "L122952548", type18, typeArray22, "(ZZZZ)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] { "L323416934" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(96, 128, "L927860561", "L1097027957", "L1090326295", strArray15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("()Lorg/mockito/asm/Type;", "L1854090784", "Z", 97);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("()L)Lorg/mockito/asm/Type;", false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        int int8 = type7.getSize();
        int int9 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type7.getInternalName();
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter3.getAccess();
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classAdapter10.visitAnnotation("org.mockito.asm.MethodAdapter", false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1349766657", "L1974286099", "L405320994", 10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1405890076", ")Lorg/mockito/asm/Type", "L1091897295", "org/mockito/cglib/core/Local", "L1570070216" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 19, "(VZZVZZ)V", "", "Lorg/mockito/asm/Type;", strArray14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter6.getStaticHook();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("S", "L578220100", "L684189155");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1422889561", "L1927930107", "L2091114728", 35);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1974286099", "L1807136932");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean5 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitInnerClass("(ZDZ)LL667761749;", "L1220550033", "L456046094", (-1));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter9.visitAnnotation("L1479046152", false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter9.visitAnnotation("", true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter10.visitAnnotation("L1283204962", false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("org.mockito.asm.MethodAdapter", true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getClassType();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(3, type1);
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type1, type3, type5, type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int12 = type0.getOpcode(2);
        int int14 = type0.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type0.getElementType();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitOuterClass("L1371510827", "L1465382310", "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("(VZZVZZ)Lboolean;", "L405320994");
    }
}


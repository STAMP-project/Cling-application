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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        boolean boolean4 = type1.equals((java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Lorg/mockito/cglib/proxy/Enhancer;", "()D", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(156, 132, "(CBBBD)B", "", "L1219436756", strArray6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField((int) (byte) 100, "()B", "B", "(CBBBD)B", (java.lang.Object) label5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray6);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("double", type4, typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1183194368", "Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("()B", "L1183194368");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("", "L1183194368", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", 8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("()D", true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 9);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type5, typeArray7);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        java.lang.String str12 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 9);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type5, typeArray7);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L415954201", "org.mockito.cglib.proxy.Enhancer", "L1215949361", 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("Lbyte;", true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(6, 112, "L1215949361", "float", "L811491585", strArray8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("J", "org.mockito.cglib.core.ClassEmitter", "L1176429447", 33);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.mockito.asm.Type type7 = type6.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(0, "L62291075", "Lorg/mockito/cglib/core/ClassEmitter;", "L1219436756", (java.lang.Object) type7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1376825083", "L609610250", "()B");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSort();
        label0.info = type5;
        java.lang.String str10 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type5.getDimensions();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter1.getClassType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type1.getInternalName();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        int int13 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type0.getDimensions();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        boolean boolean4 = type1.equals((java.lang.Object) 0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSize();
        java.lang.String str14 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type10, type11, type12, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type6, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.getStaticHook();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(124, type2);
        boolean boolean5 = type2.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("L1176429447", type2, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type2.getDimensions();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("Lmockito/cglib/proxy/Enhancer;", "L1215949361", "L1896510863", 6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray6);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("double", type4, typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!B", "L609610250", "L323961326", 56);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1669940407", "L1861156735", "hi!B(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        label1.info = type2;
        java.lang.String str25 = type2.toString();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(2, type2);
        java.lang.String str27 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type2.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(100, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSort();
        label0.info = type5;
        java.lang.String str10 = type5.toString();
        int int11 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type5.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type18.getElementType();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        int int30 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type1.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L2062398980", "", "L1388843798", 134);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter1.getAccess();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(2);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) 9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("double", type12, typeArray14);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray14);
        int int19 = type6.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) 9);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("double", type24, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) (short) -1, (int) (byte) -1, "L1107939627", type6, typeArray26, "L364561303");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1887820774", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "()Lbyte;", (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg.mockito.cglib.proxy.Enhancer;(CBBBD)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L811491585()Lorg/mockito/cglib/proxy/Enhancer;", "org/mockito/cglib/core/ClassEmitter", "L57827812", "(CBBBD)Lg/mockito/cglib/proxy/Enhancer;", "L1219436756(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(132, 129, "L628732888", "LL1591299506;", "org.mockito.cglib.core.ClassEmitter", strArray12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("g/mockito/cglib/proxy/Enhancer", true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L344090587", "L1691517500");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSort();
        label0.info = type5;
        java.lang.String str10 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type5.getElementType();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double()B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "L834974120", "L811491585", "L317143579", "L364561303", "L1272227541" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(7, 153, "L540219313", "L511180962", "L940014775", strArray14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(124, type2);
        boolean boolean5 = type2.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("L1176429447", type2, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = type8.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSort();
        label0.info = type5;
        int int10 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type5.getDimensions();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        java.lang.String str4 = label1.toString();
        java.lang.String str5 = label1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        int int9 = type6.getSort();
        label1.info = type6;
        java.lang.String str11 = type6.toString();
        int int12 = type6.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(6, type6);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray6);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("double", type4, typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getSuperType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(124);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(128);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("double", type1, typeArray3);
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(100, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("byte", "()D");
        boolean boolean19 = signature13.equals((java.lang.Object) signature18);
        java.lang.String str20 = signature13.toString();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str24 = signature23.getDescriptor();
        boolean boolean26 = signature23.equals((java.lang.Object) (short) 1);
        java.lang.String str27 = signature23.getDescriptor();
        java.lang.String str28 = signature23.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) str28);
        org.mockito.asm.Type[] typeArray30 = signature13.getArgumentTypes();
        org.mockito.asm.Type type31 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type31.getInternalName();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        int int21 = local20.getIndex();
        int int22 = local20.getIndex();
        boolean boolean23 = signature13.equals((java.lang.Object) local20);
        org.mockito.asm.Type type24 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type24.getElementType();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        label1.info = type2;
        java.lang.String str25 = type2.toString();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(2, type2);
        org.mockito.asm.Type type27 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type27.getElementType();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L97833253", "L1635907023", "()D", (int) '#');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter1.getAccess();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("()F");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type5, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("L344090587", type3, typeArray7);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(153, type3);
        int int12 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type3.getInternalName();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L271863166", "L939001656", "L939001656", 130);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("double", type1, typeArray3);
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str6 = signature5.getDescriptor();
        java.lang.String str7 = signature5.toString();
        boolean boolean8 = type1.equals((java.lang.Object) str7);
        int int9 = type1.getSort();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(12, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1405652840", "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("", true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L151982618", "L1322951530", "L609610250(CBBBD)I", "byte()B", "L2092976140", "L431718108" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(137, 60, "L1545770093", "L570834333", "", strArray15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L832025776", "L1844782234", "", (int) ' ');
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        boolean boolean15 = signature13.equals((java.lang.Object) 124);
        java.lang.String str16 = signature13.toString();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label0.info = type6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type6.getInternalName();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        int int20 = type18.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type18.getElementType();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 9);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type5, typeArray7);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        int int12 = type0.getSort();
        int int13 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L1383235484", "L1271687813", "L764013078", "Lg/mockito/cglib/proxy/Enhancer;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(9, 0, "L1226923971", "()B", "F", strArray11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L634294698", "L1780027517", "L1097027747", 4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1618290657", "", "()I");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode(169);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "L2115054512", "L1645816022" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) -1, 12, "L1745913920", "L66945845", "L1522584370", strArray10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("double", type13, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray15);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("L1393077681", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type1.getElementType();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getName();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type15.getElementType();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type5);
        boolean boolean8 = type5.equals((java.lang.Object) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSize();
        java.lang.String str12 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSize();
        java.lang.String str18 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type14, type15, type16, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type10, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray21);
        label2.info = type3;
        java.lang.String str26 = type3.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(2, type3);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(6, type3);
        java.lang.String str29 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type3.getDimensions();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.toString();
        java.lang.String str7 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = "L97833253";
        java.lang.String str12 = label9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter0.visitField(108, "L1622326596V", "LL1635907023;", "()Lbyte;", (java.lang.Object) label9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.Object obj3 = label2.info;
        java.lang.String str4 = label2.toString();
        java.lang.String str5 = label2.toString();
        java.lang.String str6 = label2.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        int int10 = type7.getSort();
        label2.info = type7;
        java.lang.String str12 = type7.toString();
        int int13 = type7.getSort();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(6, type7);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type type16 = local14.getType();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(124, type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type16.getInternalName();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("D", "L1058391566", "L106089070");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str3 = type2.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(10, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type2.getDimensions();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1715005878", "L13801669(CBBBD)LL1570394950;", "L1559302689()LD;");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L24941292", false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("L13801669");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) 9);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("double", type23, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray25);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray25);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("L986186832", type16, typeArray25);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("L536912034", type1, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type1.getDimensions();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("()Lbyte;", false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getSuperType();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str5 = signature4.getDescriptor();
        java.lang.String str6 = signature4.toString();
        boolean boolean7 = type0.equals((java.lang.Object) str6);
        int int8 = type0.getSort();
        int int9 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L415954201", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("byte", "()B");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getName();
        org.mockito.asm.Type[] typeArray10 = signature7.getArgumentTypes();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("L769857137", type1, typeArray10);
        java.lang.String str12 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        int int13 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter1.getAccess();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str5 = signature4.getDescriptor();
        java.lang.String str6 = signature4.toString();
        boolean boolean7 = type0.equals((java.lang.Object) str6);
        int int8 = type0.getSort();
        java.lang.String str9 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        java.lang.String str4 = label1.toString();
        java.lang.String str5 = label1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        int int9 = type6.getSort();
        label1.info = type6;
        java.lang.String str11 = type6.toString();
        int int12 = type6.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(6, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type6.getElementType();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "LD;", "L1562247076", "org/mockito/asm/Label", "L392222537", "Lg/mockito/cglib/core/ClassEmitter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(115, 161, "L1163398162", "L1602064172", "L80068385", strArray11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("byte()D", "()F", "L948301698", 172);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSort();
        label0.info = type5;
        java.lang.String str10 = type5.toString();
        int int11 = type5.getSort();
        java.lang.String str12 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type5.getElementType();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "()B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        int int6 = type3.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type3.getElementType();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("()B");
        int int8 = type6.getOpcode((int) (short) 100);
        boolean boolean9 = type4.equals((java.lang.Object) int8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type4.getDimensions();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getClassType();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L2054033535", "L704347320", "L612957451");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        int int30 = type1.getSort();
        int int31 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type1.getDimensions();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        int int30 = type1.getSort();
        java.lang.String str31 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type1.getElementType();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type16.getDimensions();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("double", type1, typeArray3);
        java.lang.String str6 = signature5.toString();
        org.mockito.asm.Type[] typeArray7 = signature5.getArgumentTypes();
        org.mockito.asm.Type type8 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        int int4 = type0.getOpcode(110);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(3);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        boolean boolean4 = type1.equals((java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getName();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        int int21 = local20.getIndex();
        int int22 = local20.getIndex();
        boolean boolean23 = signature13.equals((java.lang.Object) local20);
        org.mockito.asm.Type type24 = local20.getType();
        org.mockito.asm.Type type25 = local20.getType();
        org.mockito.asm.Type type26 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type26.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField(102, "L216607661", "I", "[Ljava/lang/Class;", (java.lang.Object) "L1769803632");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str5 = signature4.getDescriptor();
        java.lang.String str6 = signature4.toString();
        boolean boolean7 = type0.equals((java.lang.Object) str6);
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("org/mockito/cglib/core/Signature", "L1641322138");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("L1622326596", "()B");
        java.lang.String str4 = signature3.getName();
        java.lang.String str5 = signature3.toString();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(6, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type6.getInternalName();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        java.lang.String str4 = label1.toString();
        java.lang.String str5 = label1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        int int9 = type6.getSort();
        label1.info = type6;
        java.lang.String str11 = type6.toString();
        int int12 = type6.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(6, type6);
        int int14 = local13.getIndex();
        org.mockito.asm.Type type15 = local13.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "L1047282847");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        java.lang.String str11 = label7.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSize();
        java.lang.String str14 = type12.getClassName();
        int int15 = type12.getSort();
        label7.info = type12;
        java.lang.String str17 = type12.toString();
        int int18 = type12.getSort();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(6, type12);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(33, type12);
        boolean boolean21 = signature2.equals((java.lang.Object) type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type12.getInternalName();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type3);
        boolean boolean6 = type3.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L1176429447", type3, typeArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("double", type13, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray15);
        java.lang.String str20 = type3.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(1, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type3.getInternalName();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(124, type2);
        boolean boolean5 = type2.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("L1176429447", type2, typeArray6);
        int int8 = type2.getSort();
        java.lang.String str9 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type2.getElementType();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "L1397519858", "L118235952");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1892759149", "L2042627386", "L1912331275", 18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("()LLorg/mockito/cglib/proxy/Enhancer;(CBBBD)B;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray17 = org.mockito.asm.Type.getArgumentTypes("()B");
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L1622326596V", type11, typeArray17);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(7, 4, "L1163398162", type8, typeArray20, "rg/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("org/mockito/cglib/core/Signature", "L172715535");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(124, type1);
        boolean boolean4 = type1.equals((java.lang.Object) 0);
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type16.getElementType();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type3);
        boolean boolean6 = type3.equals((java.lang.Object) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSize();
        java.lang.String str10 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSize();
        java.lang.String str16 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type12, type13, type14, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type8, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        label0.info = type1;
        java.lang.Object obj24 = label0.info;
        java.lang.Object obj25 = label0.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(124, type30);
        boolean boolean33 = type30.equals((java.lang.Object) 0);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSize();
        java.lang.String str37 = type35.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        int int42 = type41.getSize();
        java.lang.String str43 = type41.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type39, type40, type41, type44 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type35, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray46);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray46);
        label27.info = type28;
        java.lang.String str51 = type28.toString();
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(2, type28);
        label0.info = local52;
        org.mockito.asm.Type type54 = local52.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type54.getDimensions();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("(CBBBD)LLorg/mockito/cglib/proxy/Enhancer;(CBBBD)B;");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type3.getElementType();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str6 = signature5.getDescriptor();
        java.lang.String str7 = signature5.toString();
        boolean boolean8 = type1.equals((java.lang.Object) str7);
        int int9 = type1.getSort();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(12, type1);
        org.mockito.asm.Type type11 = local10.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type11.getDimensions();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.toString();
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L1058391566", "L1172801658", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(102, 172, "L1723891711L66945845", "L1415763448", "L49893", strArray12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L2098764357", "L1857424828", "org/mockito/cglib/proxy/Enhancer", (int) (byte) 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int6 = type1.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "()B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        int int6 = type3.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type3.getDimensions();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray4);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("double", type2, typeArray4);
        label0.info = typeArray4;
        java.lang.String str8 = label0.toString();
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getName();
        label0.info = str15;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(124, type18);
        int int22 = local21.getIndex();
        int int23 = local21.getIndex();
        org.mockito.asm.Type type24 = local21.getType();
        label0.info = type24;
        int int26 = type24.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type24.getInternalName();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L765896309", "LL1194531551;");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("()B", "L647241134");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("double", type13, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray15);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("L1393077681", type1, typeArray15);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type21.getInternalName();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1743036955", "L1318509916");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        label1.info = type2;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(12, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type2.getDimensions();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L415954201", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        int int21 = local20.getIndex();
        int int22 = local20.getIndex();
        boolean boolean23 = signature13.equals((java.lang.Object) local20);
        org.mockito.asm.Type type24 = local20.getType();
        org.mockito.asm.Type type25 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type25.getDimensions();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label0.info = type6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type6.getDimensions();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "()B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        int int6 = type3.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type3.getDimensions();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = type6.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str13 = signature12.getDescriptor();
        java.lang.String str14 = signature12.toString();
        boolean boolean15 = type8.equals((java.lang.Object) str14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.asm.Type.getArgumentTypes("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type6.getElementType();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1383235484", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1622326596()B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L555634975", "L1910205185", "L574929459", 12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        int int5 = local4.getIndex();
        int int6 = local4.getIndex();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        int int5 = local4.getIndex();
        int int6 = local4.getIndex();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1369304480", "L7294237", "L727628128");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.String str5 = label3.toString();
        java.lang.String str6 = label3.toString();
        java.lang.String str7 = label3.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSize();
        java.lang.String str10 = type8.getClassName();
        int int11 = type8.getSort();
        label3.info = type8;
        java.lang.String str13 = type8.toString();
        int int14 = type8.getSort();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(6, type8);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(124, type17);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(114, type19);
        org.mockito.asm.Type type21 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type21.getDimensions();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1212979374", "L1559302689()LD;", "L1410107159", 169);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("double", type1, typeArray3);
        java.lang.String str6 = signature5.getDescriptor();
        java.lang.String str7 = signature5.toString();
        java.lang.String str8 = signature5.toString();
        java.lang.String str9 = signature5.toString();
        org.mockito.asm.Type type10 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray2);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type1);
        int int5 = local4.getIndex();
        int int6 = local4.getIndex();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getDescriptor();
        java.lang.String str16 = signature13.getName();
        java.lang.String str17 = signature13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        int int21 = local20.getIndex();
        int int22 = local20.getIndex();
        boolean boolean23 = signature13.equals((java.lang.Object) local20);
        org.mockito.asm.Type type24 = local20.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type24.getDimensions();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        label1.info = type2;
        java.lang.String str25 = type2.toString();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(2, type2);
        java.lang.String str27 = type2.getDescriptor();
        java.lang.String str28 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type2.getDimensions();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lmockito/cglib/proxy/Enhancer;(CBBBD)LLorg/mockito/cglib/proxy/Enhancer;(CBBBD)B;", "hi!", "L559411787", "L827200588" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(18, 0, "L310869811L2063875655", "L95809685", "L1478457740", strArray12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(124, type3);
        boolean boolean6 = type3.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L1176429447", type3, typeArray7);
        int int9 = type3.getSort();
        java.lang.String str10 = type3.toString();
        int int11 = type3.getSort();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(115, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type3.getDimensions();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getClassType();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("", "L1935131509", "L179910547");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int4 = type0.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(124, type7);
        boolean boolean10 = type7.equals((java.lang.Object) 0);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("L1176429447", type7, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.String str14 = signature12.getName();
        java.lang.String str15 = signature12.getDescriptor();
        boolean boolean17 = signature12.equals((java.lang.Object) "L1358254217");
        org.mockito.asm.Type[] typeArray18 = signature12.getArgumentTypes();
        java.lang.String str19 = signature12.getName();
        org.mockito.asm.Type[] typeArray20 = signature12.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(124);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(141, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label0.info = type6;
        java.lang.String str8 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type6.getDimensions();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray4);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("double", type2, typeArray4);
        label0.info = typeArray4;
        java.lang.String str8 = label0.toString();
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.getName();
        label0.info = str15;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(124, type18);
        int int22 = local21.getIndex();
        int int23 = local21.getIndex();
        org.mockito.asm.Type type24 = local21.getType();
        label0.info = type24;
        int int26 = type24.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type24.getDimensions();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("byte", "()D");
        boolean boolean19 = signature13.equals((java.lang.Object) signature18);
        java.lang.String str20 = signature13.toString();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str24 = signature23.getDescriptor();
        boolean boolean26 = signature23.equals((java.lang.Object) (short) 1);
        java.lang.String str27 = signature23.getDescriptor();
        java.lang.String str28 = signature23.getDescriptor();
        boolean boolean29 = signature13.equals((java.lang.Object) str28);
        org.mockito.asm.Type[] typeArray30 = signature13.getArgumentTypes();
        org.mockito.asm.Type type31 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type31.getElementType();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L252255995", false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 9);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type5, typeArray7);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("L1290020851", true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L906056677", "L46483501", "L1871435028", 168);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("I", type1, typeArray8);
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type type13 = signature11.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type13.getDimensions();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type[] typeArray15 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        java.lang.String str17 = type16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type16.getInternalName();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(124, type2);
        boolean boolean5 = type2.equals((java.lang.Object) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSize();
        java.lang.String str15 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type11, type12, type13, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type7, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        int int3 = type2.getSize();
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSize();
        java.lang.String str10 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type6, type7, type8, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type2, typeArray13);
        boolean boolean16 = signature14.equals((java.lang.Object) 124);
        org.mockito.asm.Type[] typeArray17 = signature14.getArgumentTypes();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        java.lang.String str19 = type18.getDescriptor();
        java.lang.String str20 = type18.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(56, type18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type18.getElementType();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L883194231L579554369", true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label0.info = type6;
        java.lang.String str8 = type6.getClassName();
        java.lang.String str9 = type6.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Lorg.mockito.cglib.proxy.Enhancer;(CBBBD)B");
        org.mockito.asm.Type type12 = type11.getElementType();
        java.lang.String str13 = type12.getClassName();
        boolean boolean14 = type6.equals((java.lang.Object) str13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type6.getElementType();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("double", type13, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray15);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("L1393077681", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type1.getDimensions();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("byte", "()D");
        boolean boolean19 = signature13.equals((java.lang.Object) signature18);
        java.lang.String str20 = signature13.getDescriptor();
        java.lang.String str21 = signature13.getName();
        org.mockito.asm.Type type22 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type22.getInternalName();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("LLorg.mockito.cglib.proxy.Enhancer;(CBBBD)B;", "", "(CBBBD)F", 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L927820283", "(CBBBD)D", "LL424350036;");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("", "L1842222770");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L415954201", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type4.getInternalName();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1871600126", "L1930573442", "L652937309", "L775034206", "L509225657" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(44, 150, "L545558187", "L1723891711B", "L1108529292()Lbyte;", strArray12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(100, type3);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(133, type3);
        java.lang.String str8 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        int int31 = type1.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type1.getElementType();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("byte", "()D");
        boolean boolean19 = signature13.equals((java.lang.Object) signature18);
        java.lang.String str20 = signature13.getDescriptor();
        java.lang.String str21 = signature13.getName();
        org.mockito.asm.Type type22 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type22.getElementType();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        label1.info = type2;
        java.lang.String str25 = type2.toString();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(2, type2);
        java.lang.String str27 = type2.getDescriptor();
        java.lang.String str28 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type2.getInternalName();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L503185350", "Lorg.mockito.cglib.proxy.Enhancer;(CBBBD)B", "L479053486");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label0.info = type6;
        int int9 = type6.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type6.getElementType();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("L1958877584", "");
        boolean boolean18 = signature13.equals((java.lang.Object) "L1958877584");
        org.mockito.asm.Type type19 = signature13.getReturnType();
        java.lang.String str20 = type19.toString();
        int int21 = type19.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type19.getInternalName();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1416065911", "L664784328");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1622326596", "()B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type2);
        int int6 = type2.getSize();
        java.lang.String str7 = type2.toString();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type2.getInternalName();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type5, type6, type7, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        java.lang.String str16 = signature13.toString();
        org.mockito.asm.Type[] typeArray17 = signature13.getArgumentTypes();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type18.getElementType();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 9);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray8);
        java.lang.String str13 = type1.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type1, typeArray28);
        int int30 = type1.getSort();
        int int31 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type1.getInternalName();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray12 = new java.lang.String[] { "(CBBBD)F", "L380509309", "L823888128", "L1959654715", "L186908871", "L410114628" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 10, 128, "L1139929474", "L541511612", "L1451751593", strArray12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 9);
        int int4 = type0.getOpcode(110);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }
}


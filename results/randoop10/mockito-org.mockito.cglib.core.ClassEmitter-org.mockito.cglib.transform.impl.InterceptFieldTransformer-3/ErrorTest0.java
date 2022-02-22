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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        int int6 = type3.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(0, "hi!", type3, (java.lang.Object) str8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("boolean", true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("hi!", "Z", "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(7, (int) (short) 100, "hi!", "Z", "Z", strArray8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("boolean", "F", "boolean", (int) (byte) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Z", "", "", (int) (byte) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("boolean", "Z", "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("", "Z", "", 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        int int5 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(154, (int) (byte) -1, "F", "S", "(DIZZ)C", strArray10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "hi!", "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) '4', 1, "F", "(DIZZ)C", "Lorg.mockito.asm.ClassAdapter;", strArray10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "S", "hi!", "S", "Z", "S", "Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(8, 116, "boolean", "F", "hi!", strArray14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter0.visitField((int) (byte) -1, "Lorg.mockito.asm.ClassAdapter;", "Lorg/mockito/asm/ClassAdapter;", "F", (java.lang.Object) type6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int11 = type10.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 1, "", type5, (java.lang.Object) int11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "F", "(DIZZ)C", "Lorg/mockito/asm/ClassAdapter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(6, 126, "Z", "Lorg/mockito/asm/ClassAdapter;", "Lorg/mockito/asm/Type;", strArray12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "(C)D", "(DDZZ)Lorg/mockito/asm/ClassAdapter;", "org/mockito/asm/Type", "org/mockito/cglib/core/Signature", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 0, (int) ' ', "L103011084", "Lorg/mockito/asm/ClassAdapter;", "Z", strArray11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        int int14 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("S", "L1782750153", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getDescriptor();
        java.lang.String str10 = type7.toString();
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = type12.toString();
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type16.getOpcode(1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSort();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type20, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type16, typeArray34);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 10, (int) ' ', "", type7, typeArray34, "Lorg.mockito.asm.ClassAdapter;");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "org/mockito/cglib/core/Signature", "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field((int) (short) 0, "", type7, (java.lang.Object) 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org/mockito/cglib/core/Signature", "(DDZZ)S", "boolean", (int) (byte) -1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L793134035", "", "(C)D", 4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("F", true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Lorg/mockito/asm/ClassAdapter;", "L103011084", "Lorg/mockito/asm/Type;", (int) (byte) 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray18);
        java.lang.String str21 = signature20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean23 = signature20.equals((java.lang.Object) type22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type22.getElementType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(5, "(C)D", type6, (java.lang.Object) "L986491722");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type2.getInternalName();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getSuperType();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str8 = signature7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField(112, "(C)D", "(DCF)Lhi!;", "(C)D", (java.lang.Object) signature7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "(DIZZ)Z", "(DIZZ)C", "org/mockito/asm/Type", "(DDZZ)S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(112, (int) (byte) 100, "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/ClassAdapter;", "(DCF)Lhi!;", strArray13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L1246856285", false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1782750153", "L1782750153");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getSuperType();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(96, type7);
        int int11 = type7.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type4, type5, type7, type12 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("boolean", type3, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type0.getElementType();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "S", "L396320025" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, (int) 'a', "org/mockito/asm/Type", "org/mockito/asm/Type", "(DCF)Lhi!;", strArray10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray18);
        java.lang.String str21 = signature20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean23 = signature20.equals((java.lang.Object) type22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type22.getDimensions();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("I", "L396320025");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("", false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type3.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        int int11 = type8.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter0.visitField(7, "L734413371", "Lorg/mockito/asm/ClassAdapter;", "(DIZZ)I", (java.lang.Object) int11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L1539487718", "Z");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org/mockito/asm/Type" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit((int) (byte) 0, 2, "(DCF)Lhi!;", "L1782750153", "L1782750153", strArray11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(126);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type8, type9 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("F", type6, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("I", type1, typeArray12);
        int int15 = type1.getSort();
        java.lang.String str16 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type1.getInternalName();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("(DIZZ)F", false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getSuperType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", "C", "L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", 104);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getDescriptor();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "Z", "boolean(DIZZ)C", "(DDZZ)S", "org/mockito/asm/ClassAdapter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, (int) (byte) -1, "L946233021", "LL734413371;", "L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", strArray14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type8.getOpcode(1);
        java.lang.Class<?> wildcardClass11 = type8.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = type13.getElementType();
        java.lang.String str15 = type13.getClassName();
        int int16 = type13.getDimensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter0.visitField((int) (byte) 0, "(DDZZ)S", "Lorg.mockito.asm.ClassAdapter;", "S", (java.lang.Object) type13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSize();
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(96, type19);
        int int23 = type19.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type13, type16, type19, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type5, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L635492318", type1, typeArray26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSize();
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        java.lang.String str42 = type40.getClassName();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(96, type40);
        int int44 = type40.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type37, type38, type40, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("boolean", type36, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type30, typeArray47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = type1.getElementType();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type23 = local22.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type23.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("I", type1, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type1.getElementType();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(DIZZ)F", "L1851620781", "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L986491722", "L1700475493");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        boolean boolean27 = type0.equals((java.lang.Object) str26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type0.getElementType();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("float", "L635492318", "L103011084");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        java.lang.String str14 = type1.toString();
        int int16 = type1.getOpcode(0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type21, type22 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("F", type19, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type1.getElementType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L45041244", "L1782750153", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", 124);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("S");
        int int8 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("S");
        int int11 = type10.getSort();
        int int12 = type10.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) -1, "L734413371", type7, (java.lang.Object) type10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        int int24 = type1.getSort();
        java.lang.String str25 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type1.getElementType();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        boolean boolean27 = type0.equals((java.lang.Object) str26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        java.lang.String str33 = type29.toString();
        int int34 = type29.getSort();
        int int35 = type29.getSort();
        boolean boolean36 = type0.equals((java.lang.Object) int35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type0.getElementType();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L103011084", false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        int int12 = type8.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type5, type6, type8, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type4, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        int int19 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type1.getDimensions();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(4, 130, "(C)D", "(DDZZ)D", "org/mockito/cglib/core/Signature", strArray9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("I", type4, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int34 = type0.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type0.getDimensions();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        int int24 = type1.getSort();
        java.lang.String str25 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type1.getDimensions();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DIZZ)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int7 = type0.getOpcode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        int int25 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type0.getInternalName();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) 1.0f);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSize();
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(96, type19);
        int int23 = type19.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type13, type16, type19, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type5, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L635492318", type1, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type1.getDimensions();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        int int24 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L271690198", "L257829151", "L635492318", 6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(130, 126, "L257829151", "L396320025", "L1523158699", strArray10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("(DIZZ)C", false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int19 = type17.getOpcode(1);
        java.lang.Class<?> wildcardClass20 = type17.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type23 = type22.getElementType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("C", type22, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type0.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("L271690198", true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        int int18 = type15.getSort();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type5, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("S", type1, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = signature22.toString();
        org.mockito.asm.Type type25 = signature22.getReturnType();
        org.mockito.asm.Type[] typeArray26 = signature22.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(4, 8, "L986491722", type8, typeArray26, "(DIZZ)C");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L271690198", false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("", "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getClassType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("F");
        java.lang.String str3 = type2.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        int int12 = type8.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type5, type6, type8, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type4, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        int int19 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(DIZZ)Lorg/mockito/cglib/core/ClassEmitter;", "L217349127", "L1498488602", 96);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type7.getOpcode(126);
        boolean boolean10 = signature2.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type7.getDimensions();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", "(C)D");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray23);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 100, type5);
        org.mockito.asm.Type type26 = local25.getType();
        boolean boolean27 = signature2.equals((java.lang.Object) local25);
        org.mockito.asm.Type type28 = signature2.getReturnType();
        int int30 = type28.getOpcode(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type28.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter0.getAccess();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("I", type1, typeArray25);
        java.lang.String str29 = type1.getClassName();
        java.lang.String str30 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type1.getDimensions();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L151203943", "(DDZZ)Z", "L1473471101", (int) (byte) -1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1425094347", true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/ClassAdapter;");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int8 = type7.getSize();
        int int9 = type7.getSort();
        label4.info = type7;
        boolean boolean11 = type1.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type7.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L758134381", "org.mockito.asm.ClassAdapter");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        boolean boolean3 = type0.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        boolean boolean27 = type0.equals((java.lang.Object) str26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type0.getDimensions();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1523158699", "(DIZZ)C", "L1001341132");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("I", type4, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        java.lang.String str33 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type0.getDimensions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("org/mockito/cglib/core/ClassEmitter", true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.getStaticHook();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        java.lang.String str8 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type3.getElementType();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("(DDZZ)C", "L592924424", "S");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type8, type9 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("F", type6, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("I", type1, typeArray12);
        int int15 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("LS;", false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L935034265", "L246344312", "L1106807020");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        int int25 = type3.getOpcode(2);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(128, type3);
        java.lang.String str27 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type3.getElementType();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        java.lang.String str14 = type1.toString();
        int int16 = type1.getOpcode(0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type21, type22 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("F", type19, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        boolean boolean29 = type1.equals((java.lang.Object) "(DDZZ)F");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        int int36 = type35.getSize();
        int int37 = type35.getSort();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type34, type35 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("F", type32, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean42 = signature39.equals((java.lang.Object) "F");
        java.lang.String str43 = signature39.getDescriptor();
        java.lang.String str44 = signature39.getDescriptor();
        org.mockito.asm.Type[] typeArray45 = signature39.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray45);
        int int47 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = type1.getDimensions();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) 'a', type2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type8, typeArray24);
        java.lang.String str27 = signature26.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type29);
        boolean boolean33 = signature26.equals((java.lang.Object) 'a');
        org.mockito.asm.Type[] typeArray34 = signature26.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray34);
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(12, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = type2.getInternalName();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("", "L2068559526", "L2075600599");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        org.mockito.asm.Type type8 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(96, type9);
        int int13 = type9.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type6, type7, type9, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("boolean", type5, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type1, typeArray16);
        int int20 = type1.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getClassType();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getClassType();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1987166950", "LF;");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("L758134381", false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int7 = type5.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        int int22 = type19.getSort();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("S", type5, typeArray23);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray23);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type1.getInternalName();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type9, type12, type15, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type1, typeArray22);
        java.lang.String str24 = signature23.getName();
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("(DIZZ)C");
        boolean boolean27 = signature23.equals((java.lang.Object) "(DIZZ)C");
        org.mockito.asm.Type type28 = signature23.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type28.getElementType();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type23 = local22.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type23.getElementType();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "J", "Lhi!;", "(DDZZ)Lorg.mockito.asm.Type;", "D", "L577210016" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(19, (int) (short) -1, "L1219280055", "L1742959643", "L1663546944", strArray14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type0.getDimensions();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        java.lang.String str24 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getSuperType();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "L18897112", "double", "LL734413371;", "Lorg/mockito/cglib/core/Local;", "L1736172400" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(0, (int) '4', "(DIZZ)Lorg/mockito/asm/ClassAdapter;", "L1539487718", "L396320025", strArray15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter4.getAccess();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(DIZZ)C", "L2075600599");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.getStaticHook();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type1.getInternalName();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("int", "float", "L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", 32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("F", "short", "L1023784215");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        boolean boolean28 = type5.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type7.getInternalName();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type8, type9 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("F", type6, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("I", type1, typeArray12);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type8, typeArray24);
        java.lang.String str27 = signature26.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) 'a', type29);
        boolean boolean33 = signature26.equals((java.lang.Object) 'a');
        java.lang.String str34 = signature26.getName();
        java.lang.String str35 = signature26.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = signature26.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = type0.getDimensions();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type0.getDimensions();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L758339741", "L1851620781");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type1);
        int int7 = local6.getIndex();
        org.mockito.asm.Type type8 = local6.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        java.lang.String str23 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type2.getDimensions();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.mockito.asm.Type", "double", "L2146120252", "L843690976" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(157, (int) (byte) -1, "D", "L1040688836", "L370371683", strArray14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = type6.getSort();
        java.lang.String str8 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type6.getElementType();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        java.lang.String str6 = type1.getDescriptor();
        int int7 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        java.lang.String str16 = signature13.getName();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L(DIZZ)Z;", "L755563821", "[Lorg/mockito/asm/Type;", "(DDZZ)S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(155, 96, "(DCF)V", "L53393101", "L1024751741", strArray13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        int int4 = local2.getIndex();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        int int7 = local2.getIndex();
        org.mockito.asm.Type type8 = local2.getType();
        java.lang.String str9 = type8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type8.getDimensions();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        java.lang.String str16 = signature13.getName();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type17.getElementType();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L946233021", "L1708628491", "L718473745", (int) (short) 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type3.getOpcode(1);
        java.lang.Class<?> wildcardClass6 = type3.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = type8.getElementType();
        boolean boolean10 = type0.equals((java.lang.Object) type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type0.getDimensions();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", "(C)D");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray23);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 100, type5);
        org.mockito.asm.Type type26 = local25.getType();
        boolean boolean27 = signature2.equals((java.lang.Object) local25);
        org.mockito.asm.Type type28 = local25.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type28.getDimensions();
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
        classEmitter3.end_class();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(112, 128, "L45041244", "L1269572140", "L1708628491(DDZZ)Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", strArray8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        int int5 = type2.getSize();
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type2, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type0.getInternalName();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int6 = type1.getOpcode(104);
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        int int5 = type1.getSort();
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L416555378", "L734413371", "L249510113", 112);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("Lg/mockito/asm/Type;", false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("", "L1868085559", "(DDZZ)Lorg/mockito/asm/Type;", 130);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getClassType();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        int int18 = type15.getSort();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type5, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("S", type1, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        java.lang.String str29 = type27.getClassName();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(96, type27);
        int int31 = type27.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type24, type25, type27, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("boolean", type23, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = type1.getInternalName();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("boolean(DIZZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        int int5 = type0.getOpcode(158);
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getDescriptor();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str11 = signature10.toString();
        java.lang.Class<?> wildcardClass12 = signature10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        int int15 = type14.getDimensions();
        boolean boolean16 = type0.equals((java.lang.Object) int15);
        java.lang.String str17 = type0.getClassName();
        int int19 = type0.getOpcode(126);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1106807020", "L266175158", "(DDZZ)Lorg.mockito.asm.Type;");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type8, type9 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("F", type6, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("I", type1, typeArray12);
        int int15 = type1.getSort();
        java.lang.String str16 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        boolean boolean24 = type2.equals((java.lang.Object) "L1040688836");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type2.getDimensions();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(7, 5, "L45041244", "(C)F", "L2146120252", strArray8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type7 = local6.getType();
        java.lang.String str8 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type7.getElementType();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(96, type7);
        java.lang.String str11 = type7.toString();
        java.lang.String str12 = type7.getDescriptor();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(10, type7);
        boolean boolean14 = signature2.equals((java.lang.Object) type7);
        int int15 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type7.getElementType();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        java.lang.String str6 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L203279275", "D(DDZZ)Lorg/mockito/asm/Type;", "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(DIZZ)S");
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = type7.getElementType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type12, typeArray28);
        java.lang.String str31 = signature30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean33 = signature30.equals((java.lang.Object) type32);
        org.mockito.asm.Type[] typeArray34 = signature30.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class((int) (byte) -1, (int) '4', "L249510113", type9, typeArray34, "L217349127");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        int int14 = type11.getSort();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type1, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        int int18 = type17.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type17.getInternalName();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type7 = local6.getType();
        java.lang.String str8 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type7.getInternalName();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/ClassAdapter;");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int8 = type7.getSize();
        int int9 = type7.getSort();
        label4.info = type7;
        boolean boolean11 = type1.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type7.getDimensions();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        java.lang.String str23 = type2.getDescriptor();
        int int24 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type2.getDimensions();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSize();
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(96, type19);
        int int23 = type19.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type13, type16, type19, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type5, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L635492318", type1, typeArray26);
        int int30 = type1.getOpcode(2);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        java.lang.String str44 = type42.getClassName();
        int int45 = type42.getSort();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type35, type38, type40, type42 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type32, typeArray46);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = type1.getInternalName();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = (-1);
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 10.0f;
        label7.info = 10.0f;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        int int18 = type15.getSort();
        java.lang.Class<?> wildcardClass19 = type15.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int23 = type21.getOpcode(124);
        java.lang.String str24 = type21.toString();
        org.mockito.asm.Type type25 = type21.getElementType();
        label7.info = type21;
        java.lang.String str27 = label7.toString();
        java.lang.Object obj28 = label7.info;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter0.visitField(5, "", "F", "L330806604", obj28);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int7 = type5.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        int int22 = type19.getSort();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("S", type5, typeArray23);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray23);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type1);
        int int29 = type1.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type1.getInternalName();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("float", "I");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("I", type4, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        java.lang.String str26 = signature25.toString();
        org.mockito.asm.Type type27 = signature25.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int31 = type30.getDimensions();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((-1), type39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((-1), type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        java.lang.String str48 = type46.getClassName();
        int int49 = type46.getSort();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type39, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type36, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type34, typeArray50);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L1122543531", type30, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(60, 52, "L635492318", type27, typeArray50, "S");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("()Lorg/mockito/cglib/core/Signature;", "L886325400(DDZZ)Lorg/mockito/cglib/core/Signature;", "L793134035L396320025");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        org.mockito.asm.Type type8 = local4.getType();
        int int10 = type8.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type8.getElementType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type4.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("S", type4, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type0.getInternalName();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label1.info = 10.0f;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSort();
        label1.info = type4;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(19, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type4.getInternalName();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("I");
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int7 = type6.getDimensions();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        int int25 = type22.getSort();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type10, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L1122543531", type6, typeArray26);
        boolean boolean30 = type2.equals((java.lang.Object) type6);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        java.lang.String str34 = type32.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        java.lang.String str38 = type36.getClassName();
        int int39 = type36.getSize();
        int int40 = type36.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int43 = type42.getDimensions();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        int int45 = type44.getSize();
        int int46 = type44.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        java.lang.String str52 = type50.getClassName();
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(96, type50);
        int int54 = type50.getSort();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type42, type44, type47, type50, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("Z", type36, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("L635492318", type32, typeArray57);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str62 = type61.getClassName();
        java.lang.String str63 = type61.getClassName();
        int int64 = type61.getSize();
        int int65 = type61.getSize();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str72 = type71.getClassName();
        java.lang.String str73 = type71.getClassName();
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local(96, type71);
        int int75 = type71.getSort();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str77 = type76.getClassName();
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type68, type69, type71, type76 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("boolean", type67, typeArray78);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type61, typeArray78);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray78);
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("L946233021", type6, typeArray78);
        int int83 = type6.getSort();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        int int86 = type85.getSize();
        int int87 = type85.getSort();
        org.mockito.cglib.core.Local local88 = new org.mockito.cglib.core.Local(153, type85);
        boolean boolean89 = type6.equals((java.lang.Object) type85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type90 = type85.getElementType();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("(DDZZ)I", "L480329741", "D");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("C", type6, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        java.lang.String str27 = type25.getClassName();
        int int28 = type25.getSize();
        int int29 = type25.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int32 = type31.getDimensions();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        int int34 = type33.getSize();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        java.lang.String str41 = type39.getClassName();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(96, type39);
        int int43 = type39.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type31, type33, type36, type39, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Z", type25, typeArray46);
        java.lang.String str48 = type25.getDescriptor();
        boolean boolean49 = signature23.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type25.getDimensions();
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
        classEmitter0.visitInnerClass("L715923745", "L480329741", "D(DDZZ)Lorg/mockito/asm/Type;", 8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("", "L856513723", "L1761042414");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        int int25 = type0.getSize();
        java.lang.String str26 = type0.getDescriptor();
        java.lang.String str27 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type0.getInternalName();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("C", type6, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean28 = type6.equals((java.lang.Object) classAdapter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter27.visitInnerClass("L1658702219", "L1106807020", "Lorg.mockito.asm.ClassAdapter;", 4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type0.getInternalName();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        boolean boolean24 = type2.equals((java.lang.Object) "L1040688836");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type2.getInternalName();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("F");
        java.lang.String str3 = type2.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        int int25 = type3.getOpcode(2);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(128, type3);
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("(DIZZ)F");
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type3.getInternalName();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L505743587", "L1062286134", "L151203943(DDZZ)Z");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1639455717", false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "(DIZZ)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(108, 2, "(DDZZ)Lorg/mockito/asm/Type;", "LL734413371;", "L587345831", strArray10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(DIZZ)Z");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(153, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type2.getInternalName();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        int int5 = type0.getOpcode(158);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type7.getOpcode(126);
        boolean boolean10 = signature2.equals((java.lang.Object) type7);
        int int11 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type7.getDimensions();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type11, type12, type13 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("F", type10, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type[] typeArray19 = signature17.getArgumentTypes();
        java.lang.String str20 = signature17.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(97, "L1637388581", type7, (java.lang.Object) signature17);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        int int14 = type1.getSize();
        java.lang.String str15 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(9, type2);
        int int7 = type2.getOpcode(0);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(128, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type2.getElementType();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("(DCF)Lg/mockito/asm/ClassAdapter;", "L1708628491(DDZZ)Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", "L521065798", (int) (byte) 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        boolean boolean18 = signature13.equals((java.lang.Object) "L1501128527");
        org.mockito.asm.Type type19 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        int int12 = type8.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type5, type6, type8, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type4, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        int int19 = type1.getSort();
        int int20 = type1.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray38);
        java.lang.String str41 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type1.getDimensions();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type1);
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        org.mockito.asm.Type type8 = local4.getType();
        org.mockito.asm.Type type9 = local4.getType();
        java.lang.String str10 = type9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type9.getDimensions();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1432117682", "L1618044857");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("Lorg.mockito.asm.ClassAdapter;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        int int14 = type11.getSort();
        java.lang.String str15 = type11.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int19 = type17.getOpcode(1);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getClassName();
        int int34 = type31.getSort();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type21, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("S", type17, typeArray35);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("I", type11, typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1700475493", type9, typeArray35);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(153, "(DDZZ)F", type9, (java.lang.Object) type41);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type8);
        int int12 = local11.getIndex();
        org.mockito.asm.Type type13 = local11.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        int int16 = type14.getOpcode(1);
        java.lang.Class<?> wildcardClass17 = type14.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        boolean boolean20 = type13.equals((java.lang.Object) wildcardClass17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 100, "L811976471", type13, (java.lang.Object) "V");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "(DIZZ)Lorg/mockito/cglib/core/ClassEmitter;", "L45041244" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(157, (int) (short) 1, "L504272828", "LDCF)Lg/mockito/asm/ClassAdapter;", "L148612046", strArray12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int5 = type4.getDimensions();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type8, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1122543531", type4, typeArray24);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type1.getDimensions();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((-1), type2);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        int int6 = local3.getIndex();
        int int7 = local3.getIndex();
        org.mockito.asm.Type type8 = local3.getType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        int int26 = type23.getSort();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type11, typeArray27);
        java.lang.String str30 = signature29.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        java.lang.String str34 = type32.getClassName();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) 'a', type32);
        boolean boolean36 = signature29.equals((java.lang.Object) 'a');
        org.mockito.asm.Type[] typeArray37 = signature29.getArgumentTypes();
        java.lang.String str38 = signature29.getDescriptor();
        java.lang.String str39 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = signature29.getArgumentTypes();
        org.mockito.asm.Type[] typeArray41 = signature29.getArgumentTypes();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1247073659", type8, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = type8.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(96, type10);
        int int14 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type7, type8, type10, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", type6, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        int int21 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type1.getElementType();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type16.getDimensions();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        java.lang.String str10 = type6.toString();
        int int11 = type6.getSort();
        int int13 = type6.getOpcode(9);
        label0.info = type6;
        int int15 = type6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type6.getDimensions();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type0.getElementType();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        int int7 = type2.getSort();
        int int8 = type2.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L905102728");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        int int16 = type13.getSort();
        java.lang.String str17 = type13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type19.getOpcode(1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        int int36 = type33.getSort();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type23, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("S", type19, typeArray37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("I", type13, typeArray37);
        java.lang.String str41 = type13.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        java.lang.String str49 = type47.getClassName();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(96, type47);
        int int51 = type47.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type44, type45, type47, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("boolean", type43, typeArray54);
        org.mockito.asm.Type[] typeArray56 = signature55.getArgumentTypes();
        java.lang.String str57 = signature55.toString();
        org.mockito.asm.Type type58 = signature55.getReturnType();
        org.mockito.asm.Type[] typeArray59 = signature55.getArgumentTypes();
        boolean boolean60 = type13.equals((java.lang.Object) typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L843690976", type11, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("L1819024105", type2, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = type2.getInternalName();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter3.getSuperType();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("short", "(DIZZ)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        int int15 = type2.getSize();
        java.lang.String str16 = type2.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 1, type2);
        int int18 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type2.getInternalName();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type2.getElementType();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("org/mockito/cglib/core/Local", true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L186258654L986491722", "org/mockito/asm/Label");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("C", type6, typeArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean28 = type6.equals((java.lang.Object) classAdapter27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter27.visitEnd();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L955120619", "L186258654");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        int int6 = type1.getSort();
        int int8 = type1.getOpcode(9);
        int int10 = type1.getOpcode(4);
        java.lang.String str11 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type1.getElementType();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L500525226", "org.mockito.asm.Label");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        boolean boolean5 = type0.equals((java.lang.Object) (byte) 1);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        int int12 = type8.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type5, type6, type8, type13 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type4, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        int int19 = type1.getSort();
        int int20 = type1.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type1.getElementType();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type6, typeArray22);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1122543531", type2, typeArray22);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", "(C)D");
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getClassName();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(96, type31);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        java.lang.String str42 = type40.getClassName();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(96, type40);
        int int44 = type40.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type37, type38, type40, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("boolean", type36, typeArray47);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray49);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 100, type31);
        org.mockito.asm.Type type52 = local51.getType();
        boolean boolean53 = signature28.equals((java.lang.Object) local51);
        org.mockito.asm.Type type54 = signature28.getReturnType();
        java.lang.String str55 = type54.toString();
        boolean boolean56 = signature25.equals((java.lang.Object) type54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int57 = type54.getDimensions();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type12, type13, type15, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("boolean", type11, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type7, typeArray22);
        int int26 = type7.getOpcode(108);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        int int31 = type29.getOpcode(1);
        java.lang.Class<?> wildcardClass32 = type29.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type35 = type34.getElementType();
        java.lang.String str36 = type34.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(3, type34);
        java.lang.String str38 = type34.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((-1), type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        java.lang.String str55 = type53.getClassName();
        int int56 = type53.getSort();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type46, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type43, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type41, typeArray57);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("L1702139774", type34, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(0, "L1677648711", type7, (java.lang.Object) type34);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 1, type2);
        int int5 = type2.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        int int11 = type8.getSize();
        int int12 = type8.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(96, type18);
        int int22 = type18.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type15, type16, type18, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("boolean", type14, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type8, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray25);
        int int30 = type6.getOpcode(6);
        boolean boolean31 = type2.equals((java.lang.Object) type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type6.getInternalName();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        int int8 = local4.getIndex();
        org.mockito.asm.Type type9 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L2115930628", "L1501128527", "J");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(96, type9);
        int int13 = type9.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type6, type7, type9, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("boolean", type5, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type1, typeArray16);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        boolean boolean28 = type5.equals((java.lang.Object) type7);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((-1), type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        java.lang.String str45 = type43.getClassName();
        int int46 = type43.getSort();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type33, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type31, typeArray47);
        java.lang.String str50 = signature49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean52 = signature49.equals((java.lang.Object) type51);
        org.mockito.asm.Type[] typeArray53 = signature49.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = type5.getInternalName();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(126);
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(157, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type1);
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type3.getOpcode(1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        int int20 = type17.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("S", type3, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        int int25 = type1.getSize();
        int int26 = type1.getSize();
        java.lang.String str27 = type1.getDescriptor();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (byte) -1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type1.getElementType();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        int int25 = type3.getOpcode(2);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(128, type3);
        int int27 = local26.getIndex();
        org.mockito.asm.Type type28 = local26.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type28.getDimensions();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1661490737", "L1628488804", "V", 35);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(96, type4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray22);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 100, type4);
        int int26 = type4.getOpcode(2);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(128, type4);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(10, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type4.getInternalName();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        int int21 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "L250912790", "L2115930628", "L758339741", "L916347023", "(DDZZ)Lorg.mockito.asm.Type;", "(DIZZ)LL734413371;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(52, 170, "I", "L1501923494", "L1674309831", strArray16);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        int int6 = type2.getSort();
        java.lang.String str7 = type2.toString();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(106, type2);
        java.lang.String str9 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type2.getDimensions();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DIZZ)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label1.info = 10.0f;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSort();
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        java.lang.String str11 = type8.toString();
        java.lang.String str12 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        java.lang.String str29 = type27.getClassName();
        int int30 = type27.getSort();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type17, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray31);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("L399470263", type4, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type4.getInternalName();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        boolean boolean28 = type5.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type5.getDimensions();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSort();
        java.lang.String str25 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type0.getElementType();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        int int4 = local2.getIndex();
        int int5 = local2.getIndex();
        org.mockito.asm.Type type6 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        boolean boolean11 = type7.equals((java.lang.Object) 1.0f);
        java.lang.String str12 = type7.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type20, type21, type22 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("F", type19, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("I", type14, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L271690198", type7, typeArray25);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type1.getInternalName();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        org.mockito.asm.Type type8 = local4.getType();
        int int10 = type8.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type8.getInternalName();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type0.getElementType();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type4.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("S", type4, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.getDescriptor();
        int int28 = type0.getOpcode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type0.getInternalName();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int3 = type1.getOpcode((int) (byte) 1);
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(96, type10);
        int int14 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type7, type8, type10, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", type6, typeArray17);
        boolean boolean20 = signature18.equals((java.lang.Object) 96);
        org.mockito.asm.Type[] typeArray21 = signature18.getArgumentTypes();
        boolean boolean22 = type1.equals((java.lang.Object) signature18);
        java.lang.String str23 = signature18.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = signature18.getArgumentTypes();
        java.lang.String str25 = signature18.getDescriptor();
        java.lang.String str26 = signature18.getName();
        org.mockito.asm.Type type27 = signature18.getReturnType();
        java.lang.String str28 = type27.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type27.getInternalName();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type6 = local5.getType();
        java.lang.String str7 = type6.toString();
        java.lang.String str8 = type6.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray23);
        java.lang.String str25 = type6.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(8, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type6.getElementType();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        java.lang.String str24 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "L1414248002", "L90097579", "L1023784215(DDZZ)Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(19, 9, "g.mockito.cglib.core.ClassEmitter", "L857363514", "L1236064679", strArray10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1110941791", "g.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        java.lang.String str8 = type1.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("I");
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getClassName();
        int int34 = type31.getSort();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type21, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type19, typeArray35);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L1122543531", type15, typeArray35);
        boolean boolean39 = type11.equals((java.lang.Object) type15);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        java.lang.String str43 = type41.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        java.lang.String str47 = type45.getClassName();
        int int48 = type45.getSize();
        int int49 = type45.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int52 = type51.getDimensions();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        int int54 = type53.getSize();
        int int55 = type53.getSort();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str57 = type56.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        java.lang.String str61 = type59.getClassName();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(96, type59);
        int int63 = type59.getSort();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type51, type53, type56, type59, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("Z", type45, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("L635492318", type41, typeArray66);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str71 = type70.getClassName();
        java.lang.String str72 = type70.getClassName();
        int int73 = type70.getSize();
        int int74 = type70.getSize();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str81 = type80.getClassName();
        java.lang.String str82 = type80.getClassName();
        org.mockito.cglib.core.Local local83 = new org.mockito.cglib.core.Local(96, type80);
        int int84 = type80.getSort();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str86 = type85.getClassName();
        org.mockito.asm.Type[] typeArray87 = new org.mockito.asm.Type[] { type77, type78, type80, type85 };
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("boolean", type76, typeArray87);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type70, typeArray87);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray87);
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("L946233021", type15, typeArray87);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int93 = type1.getDimensions();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        java.lang.String str7 = type2.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type2);
        int int9 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type2.getElementType();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L840994637", "L131131455");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.toString();
        java.lang.String str17 = signature14.getName();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        java.lang.String str21 = type19.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type19.getElementType();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1651874615", "L1110941791", "L127739828");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type1);
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        int int4 = local2.getIndex();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        int int7 = local2.getIndex();
        org.mockito.asm.Type type8 = local2.getType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        int int12 = local11.getIndex();
        int int13 = local11.getIndex();
        int int14 = local11.getIndex();
        int int15 = local11.getIndex();
        org.mockito.asm.Type type16 = local11.getType();
        org.mockito.asm.Type type17 = local11.getType();
        java.lang.String str18 = type17.getClassName();
        boolean boolean19 = type8.equals((java.lang.Object) type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type8.getDimensions();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        int int5 = type0.getOpcode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        java.lang.String str8 = type7.toString();
        int int10 = type7.getOpcode(155);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type7.getDimensions();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray18);
        java.lang.String str21 = signature20.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type23);
        boolean boolean27 = signature20.equals((java.lang.Object) 'a');
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        int int31 = local30.getIndex();
        boolean boolean32 = signature20.equals((java.lang.Object) local30);
        int int33 = local30.getIndex();
        org.mockito.asm.Type type34 = local30.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type34.getElementType();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int7 = type5.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        int int22 = type19.getSort();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("S", type5, typeArray23);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray23);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(154, type1);
        java.lang.String str28 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type1.getElementType();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DDZZ)D");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        java.lang.String str16 = signature13.getName();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("byte", "L1053092139", "L26755881");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L399470263", "L331961466", "L1413468225");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.toString();
        java.lang.String str17 = signature14.getName();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type19.getDimensions();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        java.lang.String str8 = type1.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("I");
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getClassName();
        int int34 = type31.getSort();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type21, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type19, typeArray35);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L1122543531", type15, typeArray35);
        boolean boolean39 = type11.equals((java.lang.Object) type15);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        java.lang.String str43 = type41.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        java.lang.String str47 = type45.getClassName();
        int int48 = type45.getSize();
        int int49 = type45.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int52 = type51.getDimensions();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        int int54 = type53.getSize();
        int int55 = type53.getSort();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str57 = type56.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        java.lang.String str61 = type59.getClassName();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(96, type59);
        int int63 = type59.getSort();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type51, type53, type56, type59, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("Z", type45, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("L635492318", type41, typeArray66);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str71 = type70.getClassName();
        java.lang.String str72 = type70.getClassName();
        int int73 = type70.getSize();
        int int74 = type70.getSize();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str81 = type80.getClassName();
        java.lang.String str82 = type80.getClassName();
        org.mockito.cglib.core.Local local83 = new org.mockito.cglib.core.Local(96, type80);
        int int84 = type80.getSort();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str86 = type85.getClassName();
        org.mockito.asm.Type[] typeArray87 = new org.mockito.asm.Type[] { type77, type78, type80, type85 };
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("boolean", type76, typeArray87);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type70, typeArray87);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray87);
        org.mockito.cglib.core.Signature signature91 = new org.mockito.cglib.core.Signature("L946233021", type15, typeArray87);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray87);
        boolean boolean94 = type1.equals((java.lang.Object) "L734413371");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int95 = type1.getDimensions();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int7 = local4.getIndex();
        org.mockito.asm.Type type8 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSort();
        java.lang.String str8 = type4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("I", type4, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = type0.getDimensions();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L505143829", "L2132969821", "L1372998407");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        int int5 = type2.getSize();
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type2, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray19);
        int int24 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type0.getDimensions();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        int int5 = local4.getIndex();
        int int6 = local4.getIndex();
        int int7 = local4.getIndex();
        org.mockito.asm.Type type8 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int5 = type4.getDimensions();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type8, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1122543531", type4, typeArray24);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type1.getInternalName();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("float", "I");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getDimensions();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type7);
        org.mockito.asm.Type type10 = local9.getType();
        int int11 = local9.getIndex();
        org.mockito.asm.Type type12 = local9.getType();
        int int13 = local9.getIndex();
        org.mockito.asm.Type type14 = local9.getType();
        int int15 = local9.getIndex();
        org.mockito.asm.Type type16 = local9.getType();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(DIZZ)C");
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        int int21 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type4.getElementType();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L2014766397", "L17466049", "L1925236388", 132);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        int int4 = local2.getIndex();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        org.mockito.asm.Type type7 = local2.getType();
        org.mockito.asm.Type type8 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        java.lang.String str6 = type1.toString();
        int int7 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int6 = type5.getDimensions();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type9, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1122543531", type5, typeArray25);
        boolean boolean29 = type1.equals((java.lang.Object) type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type1.getDimensions();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 1, type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int29 = type28.getDimensions();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((-1), type37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((-1), type40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        java.lang.String str46 = type44.getClassName();
        int int47 = type44.getSort();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type37, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type34, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type32, typeArray48);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("L1122543531", type28, typeArray48);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray48);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L886325400", type7, typeArray48);
        org.mockito.asm.Type[] typeArray55 = org.mockito.asm.Type.getArgumentTypes("(DCF)Lhi!;");
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray55);
        java.lang.String str57 = type7.getInternalName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int61 = type60.getDimensions();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        java.lang.String str69 = type67.getClassName();
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local(96, type67);
        int int71 = type67.getSort();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str73 = type72.getClassName();
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type64, type65, type67, type72 };
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("boolean", type63, typeArray74);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray74);
        int int77 = type60.getSize();
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local((int) (short) -1, type60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(56, "L554804188", type7, (java.lang.Object) type60);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1661490737", "(DDZZ)C", "L31426388");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D(DDZZ)Lorg/mockito/asm/Type;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DDZZ)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        int int14 = type11.getSort();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type1, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = signature16.toString();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        org.mockito.asm.Type type20 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type20.getElementType();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter3.getSuperType();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        int int8 = type6.getOpcode(1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        int int23 = type20.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("S", type6, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type1.getDimensions();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type8.getOpcode(1);
        java.lang.Class<?> wildcardClass11 = type8.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = type13.getElementType();
        java.lang.String str15 = type14.getClassName();
        boolean boolean16 = type3.equals((java.lang.Object) str15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type3.getElementType();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "L245100849", "L870207415" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) 'a', 100, "C", "L222321012", "L1715482727", strArray12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type4.getOpcode(1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("S", type4, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.getClassName();
        int int28 = type0.getOpcode(161);
        int int29 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type0.getInternalName();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        boolean boolean28 = type5.equals((java.lang.Object) type7);
        int int30 = type7.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type7.getElementType();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local((-1), type1);
        int int3 = local2.getIndex();
        int int4 = local2.getIndex();
        int int5 = local2.getIndex();
        int int6 = local2.getIndex();
        org.mockito.asm.Type type7 = local2.getType();
        org.mockito.asm.Type type8 = local2.getType();
        java.lang.String str9 = type8.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        int int24 = type2.getOpcode(2);
        int int26 = type2.getOpcode(166);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type2.getElementType();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.toString();
        java.lang.String str17 = signature14.getName();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(124, type19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type19.getElementType();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type9, type12, type15, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type1, typeArray22);
        java.lang.String str24 = signature23.getName();
        java.lang.String str25 = signature23.getName();
        org.mockito.asm.Type type26 = signature23.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type26.getElementType();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "L784992545", "L2061364284" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(100, 134, "L1373512854", "L95446859", "L1749713423", strArray12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSize();
        int int13 = type9.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type23);
        int int27 = type23.getSort();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type15, type17, type20, type23, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type9, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("L635492318", type5, typeArray30);
        java.lang.String str33 = signature32.toString();
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L1539487718", "Lorg/mockito/asm/Type;");
        java.lang.String str37 = signature36.getDescriptor();
        java.lang.String str38 = signature36.getDescriptor();
        java.lang.String str39 = signature36.getName();
        boolean boolean40 = signature32.equals((java.lang.Object) str39);
        org.mockito.asm.Type type41 = signature32.getReturnType();
        boolean boolean42 = type0.equals((java.lang.Object) signature32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type0.getDimensions();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        java.lang.String str17 = type16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type16.getElementType();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        java.lang.String str7 = type2.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type2);
        org.mockito.asm.Type type9 = local8.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 10.0f;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        label2.info = type5;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(19, type5);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type5);
        org.mockito.asm.Type type11 = local10.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type11.getDimensions();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1702567406", "L1187958211", "L631107442");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1425094347", "floatI");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type9, type10 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("F", type7, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("I", type2, typeArray13);
        int int16 = type2.getSort();
        java.lang.String str17 = type2.toString();
        int int18 = type2.getSort();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(158, type2);
        int int21 = type2.getOpcode(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type2.getDimensions();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(153, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        int int8 = type6.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type6.getDimensions();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(68, 4, "L797189021", "(C)Lorg/mockito/asm/Type;", "L135232736", strArray11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1669656633", "L1014720740", "L396320025(C)Z", 56);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1782750153", "(DCF)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int5 = type3.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        int int24 = type1.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        int int27 = type25.getOpcode(1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        java.lang.String str33 = type29.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        int int37 = type35.getOpcode(1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((-1), type42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((-1), type45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        java.lang.String str51 = type49.getClassName();
        int int52 = type49.getSort();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type42, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("S", type35, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("I", type29, typeArray53);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray53);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type1.getDimensions();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) 'a', type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.asm.Type type7 = local4.getType();
        java.lang.String str8 = type7.toString();
        int int10 = type7.getOpcode(155);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type7.getElementType();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode(1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("C", type6, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        java.lang.String str27 = type25.getClassName();
        int int28 = type25.getSize();
        int int29 = type25.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int32 = type31.getDimensions();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        int int34 = type33.getSize();
        int int35 = type33.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        java.lang.String str41 = type39.getClassName();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(96, type39);
        int int43 = type39.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type31, type33, type36, type39, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Z", type25, typeArray46);
        java.lang.String str48 = type25.getDescriptor();
        boolean boolean49 = signature23.equals((java.lang.Object) type25);
        java.lang.String str50 = type25.getDescriptor();
        java.lang.String str51 = type25.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type25.getInternalName();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 10, type1);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type7.getOpcode(1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSort();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("S", type7, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("I", type1, typeArray25);
        java.lang.String str29 = type1.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(96, type35);
        int int39 = type35.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type32, type33, type35, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("boolean", type31, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        java.lang.String str45 = signature43.toString();
        org.mockito.asm.Type type46 = signature43.getReturnType();
        org.mockito.asm.Type[] typeArray47 = signature43.getArgumentTypes();
        boolean boolean48 = type1.equals((java.lang.Object) typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = type1.getDimensions();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        int int6 = type3.getSize();
        int int7 = type3.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type13);
        int int17 = type13.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type10, type11, type13, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type3, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray20);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(96, type7);
        java.lang.String str11 = type7.toString();
        java.lang.String str12 = type7.getDescriptor();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(10, type7);
        boolean boolean14 = signature2.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type7.getInternalName();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getSort();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type4, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray18);
        java.lang.String str21 = signature20.toString();
        boolean boolean23 = signature20.equals((java.lang.Object) 1L);
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray26);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type2.getSize();
        int int4 = type2.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(153, type2);
        int int6 = local5.getIndex();
        org.mockito.asm.Type type7 = local5.getType();
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        int int11 = type7.getOpcode(43);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type7.getDimensions();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type9, type10 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("F", type7, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("I", type2, typeArray13);
        int int16 = type2.getSort();
        boolean boolean18 = type2.equals((java.lang.Object) 97);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSort();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type20, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L1523158699", type2, typeArray36);
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = 10.0f;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSort();
        label38.info = type41;
        java.lang.String str45 = type41.getClassName();
        boolean boolean46 = type2.equals((java.lang.Object) type41);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int49 = type48.getSort();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        int int52 = type50.getOpcode(1);
        java.lang.Class<?> wildcardClass53 = type50.getClass();
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type type56 = type55.getElementType();
        boolean boolean57 = type48.equals((java.lang.Object) type56);
        java.lang.String str58 = type48.toString();
        boolean boolean59 = type41.equals((java.lang.Object) type48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = type41.getDimensions();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 1, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(96, type10);
        int int14 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type7, type8, type10, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", type6, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray17);
        int int20 = type3.getSort();
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1256113746", type3, typeArray22);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 1, type1);
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1973970348", "int", "L222321012", "org.mockito.asm.Type", "L862114382", "I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(101, 39, "L430781621", "L250912790", "L790455329", strArray15);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        int int14 = type11.getSort();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type1, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        int int18 = type17.getSize();
        java.lang.String str19 = type17.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type17.getDimensions();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("I");
        java.lang.String str3 = type2.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(16, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type2.getInternalName();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("S", type2, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        int int24 = type0.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        boolean boolean27 = type0.equals((java.lang.Object) str26);
        java.lang.String str28 = type0.getDescriptor();
        java.lang.String str29 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type0.getInternalName();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        int int7 = type2.getSort();
        int int8 = type2.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L905102728");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        int int16 = type13.getSort();
        java.lang.String str17 = type13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type19.getOpcode(1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        int int36 = type33.getSort();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type23, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("S", type19, typeArray37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("I", type13, typeArray37);
        java.lang.String str41 = type13.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        java.lang.String str49 = type47.getClassName();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(96, type47);
        int int51 = type47.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type44, type45, type47, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("boolean", type43, typeArray54);
        org.mockito.asm.Type[] typeArray56 = signature55.getArgumentTypes();
        java.lang.String str57 = signature55.toString();
        org.mockito.asm.Type type58 = signature55.getReturnType();
        org.mockito.asm.Type[] typeArray59 = signature55.getArgumentTypes();
        boolean boolean60 = type13.equals((java.lang.Object) typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L843690976", type11, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("L1819024105", type2, typeArray59);
        org.mockito.asm.Type type63 = signature62.getReturnType();
        int int65 = type63.getOpcode(114);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = type63.getInternalName();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(37, (int) ' ', "L1249661178", "F", "L(DIZZ)LL734413371;;", strArray11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean5 = type1.equals((java.lang.Object) 1.0f);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1987166950", type1, typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type1.getInternalName();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) 1.0f);
        java.lang.String str5 = type0.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(96, type18);
        int int22 = type18.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type15, type16, type18, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("boolean", type14, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type10, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSize();
        int int33 = type29.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int36 = type35.getDimensions();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        int int38 = type37.getSize();
        int int39 = type37.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        java.lang.String str45 = type43.getClassName();
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(96, type43);
        int int47 = type43.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type35, type37, type40, type43, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("Z", type29, typeArray50);
        java.lang.String str52 = signature51.getName();
        org.mockito.asm.Type[] typeArray53 = signature51.getArgumentTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("L186258654", type10, typeArray53);
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) '4', type10);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str57 = type56.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        int int61 = type59.getOpcode(1);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((-1), type66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local70 = new org.mockito.cglib.core.Local((-1), type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str72 = type71.getClassName();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str74 = type73.getClassName();
        java.lang.String str75 = type73.getClassName();
        int int76 = type73.getSort();
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type66, type69, type71, type73 };
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("", type63, typeArray77);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("S", type59, typeArray77);
        org.mockito.asm.Type type81 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type82 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type83 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str86 = type85.getClassName();
        java.lang.String str87 = type85.getClassName();
        org.mockito.cglib.core.Local local88 = new org.mockito.cglib.core.Local(96, type85);
        int int89 = type85.getSort();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str91 = type90.getClassName();
        org.mockito.asm.Type[] typeArray92 = new org.mockito.asm.Type[] { type82, type83, type85, type90 };
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("boolean", type81, typeArray92);
        java.lang.String str94 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray92);
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray92);
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("org/mockito/asm/ClassAdapter", type10, typeArray92);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = type0.getDimensions();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type7, type8, type9 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("F", type6, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("I", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        int int15 = type2.getSize();
        java.lang.String str16 = type2.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 1, type2);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (byte) 1, type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int44 = type43.getDimensions();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((-1), type52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((-1), type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        java.lang.String str61 = type59.getClassName();
        int int62 = type59.getSort();
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type49, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type47, typeArray63);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("L1122543531", type43, typeArray63);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray63);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("L886325400", type22, typeArray63);
        org.mockito.asm.Type[] typeArray70 = org.mockito.asm.Type.getArgumentTypes("(DCF)Lhi!;");
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray70);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = type18.getInternalName();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("D");
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type16, type17, type18 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("F", type15, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("I", type10, typeArray21);
        int int24 = type10.getSort();
        boolean boolean26 = type10.equals((java.lang.Object) 97);
        java.lang.String str27 = type10.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(96, type35);
        int int39 = type35.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type32, type33, type35, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("boolean", type31, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1484920123", type7, typeArray44);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type49 = type1.getElementType();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D(DDZZ)Lorg/mockito/asm/Type;");
        int int3 = type1.getOpcode(4);
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type1, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean23 = type1.equals((java.lang.Object) "S");
        int int24 = type1.getSort();
        java.lang.String str25 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type1.getInternalName();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        java.lang.String str8 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(96, type12);
        int int16 = type12.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type9, type10, type12, type17 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("boolean", type8, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        int int25 = type3.getOpcode(2);
        java.lang.String str26 = type3.getDescriptor();
        int int28 = type3.getOpcode(124);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(12, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type3.getDimensions();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int20 = type19.getSize();
        int int21 = type19.getSort();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type18, type19 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("F", type16, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("I", type11, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray22);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/ClassEmitter;", type1, typeArray22);
        java.lang.String str28 = type1.getDescriptor();
        java.lang.String str29 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type1.getElementType();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type2.getSize();
        int int4 = type2.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(153, type2);
        int int7 = type2.getOpcode(104);
        java.lang.String str8 = type2.getDescriptor();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(49, type2);
        int int10 = type2.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("L1092103913");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type15.getOpcode(1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type19, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("S", type15, typeArray33);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("L875239153", type13, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type2.getDimensions();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(96, type6);
        int int10 = type6.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type3, type4, type6, type11 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("boolean", type2, typeArray13);
        int int15 = type2.getSize();
        java.lang.String str16 = type2.getDescriptor();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 1, type2);
        org.mockito.asm.Type type18 = local17.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type18.getDimensions();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        java.lang.String str6 = type2.toString();
        int int7 = type2.getSort();
        int int8 = type2.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L905102728");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        int int16 = type13.getSort();
        java.lang.String str17 = type13.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type19.getOpcode(1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        int int36 = type33.getSort();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type23, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("S", type19, typeArray37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("I", type13, typeArray37);
        java.lang.String str41 = type13.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        java.lang.String str49 = type47.getClassName();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(96, type47);
        int int51 = type47.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type44, type45, type47, type52 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("boolean", type43, typeArray54);
        org.mockito.asm.Type[] typeArray56 = signature55.getArgumentTypes();
        java.lang.String str57 = signature55.toString();
        org.mockito.asm.Type type58 = signature55.getReturnType();
        org.mockito.asm.Type[] typeArray59 = signature55.getArgumentTypes();
        boolean boolean60 = type13.equals((java.lang.Object) typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L843690976", type11, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("L1819024105", type2, typeArray59);
        org.mockito.asm.Type type63 = signature62.getReturnType();
        int int65 = type63.getOpcode(114);
        int int66 = type63.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = type63.getInternalName();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type24.getElementType();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSort();
        label0.info = type3;
        java.lang.String str7 = type3.toString();
        java.lang.String str8 = type3.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type9.getOpcode(1);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = type14.getElementType();
        java.lang.String str16 = type14.getClassName();
        int int17 = type14.getDimensions();
        int int18 = type14.getDimensions();
        boolean boolean19 = type3.equals((java.lang.Object) int18);
        java.lang.String str20 = type3.getClassName();
        int int21 = type3.getSize();
        int int22 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type3.getDimensions();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(5, type1);
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "L350765929", "L84186893", "L1664522853", "(DCF)Lorg/mockito/asm/ClassAdapter;", "L91249785" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(12, 4, "L1001341132", "L(DIZZ)C;", "L1601727154", strArray14);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(96, type10);
        int int14 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type7, type8, type10, type15 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", type6, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        int int21 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(3, type1);
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.getStaticHook();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L1593518752", "L1212140705", "L1126408375" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(166, 128, "F", "L917610505", "long", strArray12);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1700475493(DDZZ)Lorg.mockito.asm.ClassAdapter;", "L718473745");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label1.info = 10.0f;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSort();
        label1.info = type4;
        boolean boolean8 = type0.equals((java.lang.Object) label1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        java.lang.String str8 = type6.getClassName();
        int int9 = type6.getSize();
        int int10 = type6.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int13 = type12.getDimensions();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(96, type20);
        int int24 = type20.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type12, type14, type17, type20, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type6, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("L635492318", type2, typeArray27);
        int int31 = type2.getOpcode(2);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(126, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type2.getElementType();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }
}


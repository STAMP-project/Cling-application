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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = fieldProviderTransformer0.getAccess();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = fieldProviderTransformer0.getSuperType();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "boolean", "C", "org/mockito/cglib/core/ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(0, (int) (byte) 100, "(ZZFJZ)C", "Z", "(ZZFJZ)C", strArray14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        java.lang.String str9 = type6.toString();
        java.lang.Object obj10 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.declare_field(0, "Z", type6, obj10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSort();
        int int13 = type10.getOpcode(100);
        int int14 = type10.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSort();
        int int21 = type18.getOpcode(100);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type15, type16, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(108, 4, "boolean", type4, typeArray22, "Z");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("Z", "boolean");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = fieldProviderTransformer0.visitAnnotation("(ZZFJZ)C", true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("Lorg/mockito/cglib/core/Local;", "C", "(ZZZZ)J", (int) (short) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = fieldProviderTransformer0.getClassType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.declare_field(108, "I", type5, (java.lang.Object) true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        java.lang.String str11 = type9.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        java.lang.String str18 = type15.toString();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type8, type9, type12, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(130, (int) (byte) 0, "I", type5, typeArray19, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(100);
        java.lang.String str7 = type3.getDescriptor();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field((int) (byte) 1, "", type3, (java.lang.Object) "J");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fieldProviderTransformer0.getAccess();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("C", "I");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = fieldProviderTransformer0.getStaticHook();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(155, "boolean", type5, (java.lang.Object) 9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        int int10 = type8.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = fieldProviderTransformer1.visitField(8, "(ZZZZ)J", "I", "J", (java.lang.Object) type8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("org/mockito/cglib/core/Signature", "org/mockito/cglib/core/ClassEmitter", "hi!", 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        boolean boolean13 = type8.equals((java.lang.Object) local12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSort();
        java.lang.String str19 = type17.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type17, type20, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.begin_class(0, 7, "L1750106643", type8, typeArray27, "(ZZZZ)J");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        java.lang.String str7 = type5.getDescriptor();
        boolean boolean8 = type4.equals((java.lang.Object) str7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(1, (int) '4', "(ZZZZ)J", type4, typeArray10, "LLorg/mockito/cglib/core/Signature;;");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("J");
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.begin_class((int) (byte) 10, 157, "I", type7, typeArray10, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("(ZZZZ)J");
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field((int) (short) 100, "org/mockito/cglib/core/ClassEmitter", type4, (java.lang.Object) typeArray6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "D", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean3 = type0.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.end_class();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitInnerClass("boolean", "B", "", 128);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type2.getInternalName();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(100);
        int int12 = type7.getOpcode(104);
        int int14 = type7.getOpcode(10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSort();
        int int23 = type20.getOpcode(100);
        int int24 = type20.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type17, type20, type25, type26, type28 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L1750106643", type7, typeArray32);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str38 = type37.toString();
        java.lang.String str39 = type37.toString();
        int int40 = type37.getSort();
        boolean boolean42 = type37.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(0, type37);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean48 = type45.equals((java.lang.Object) type47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSort();
        int int53 = type50.getOpcode(100);
        int int55 = type50.getOpcode(104);
        int int57 = type50.getOpcode(10);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str61 = type60.toString();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) (short) 0, type60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type63.getSort();
        int int66 = type63.getOpcode(100);
        int int67 = type63.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str70 = type69.toString();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int72 = type71.getSort();
        int int74 = type71.getOpcode(100);
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type60, type63, type68, type69, type71 };
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray75);
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("L1750106643", type50, typeArray75);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type45, typeArray75);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("B", type37, typeArray75);
        org.mockito.asm.Type[] typeArray80 = signature79.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class((int) (byte) 1, 10, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", type7, typeArray80, "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fieldProviderTransformer0.getAccess();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSort();
        boolean boolean5 = type0.equals((java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(0, 155, "Lorg/mockito/asm/Type;", type6, typeArray9, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitSource("L247801252", "Lorg/mockito/cglib/core/Local;");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean5 = type2.equals((java.lang.Object) "(ZZFJZ)C");
        label0.info = type2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(157, "Z", type6, (java.lang.Object) "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = fieldProviderTransformer1.getClassType();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray10 = new java.lang.String[] { "char", "(ZZZZ)Z", "Lorg/mockito/cglib/core/Signature;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) ' ', 155, "double", "", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", strArray10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray8 = new java.lang.String[] { "(ZZFJZ)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) ' ', 8, "(ZZZZ)J", "L1409237605", "(ZZFJZ)Z", strArray8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.end_class();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray12 = new java.lang.String[] { "org.mockito.cglib.core.ClassEmitter", "(ZZFJZ)J", "Lorg/mockito/cglib/core/Local;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(104, 8, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/Signature(ZZFJZ)B", "(ZZFJZ)C", strArray12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitOuterClass("byte", "Lorg/mockito/cglib/core/Signature;", "org/mockito/cglib/core/Local");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray11 = new java.lang.String[] { "(ZZZZ)J", "(ZZZZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) ' ', (int) (short) 10, "byte", "", "(ZZZZ)Z", strArray11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean3 = type0.equals((java.lang.Object) type2);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("L2102178846", true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        java.lang.String str20 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type1.getElementType();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitSource("(ZZZZ)J", "L1700624831");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter1.getAccess();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        int int3 = type1.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = fieldProviderTransformer0.getStaticHook();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(100);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(100);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type2, type5, type10, type11, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.String str19 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type0.getInternalName();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean7 = type4.equals((java.lang.Object) "(ZZFJZ)C");
        int int9 = type4.getOpcode(2);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(155, type4);
        org.mockito.asm.Type type11 = local10.getType();
        int int12 = type11.getSort();
        boolean boolean13 = signature2.equals((java.lang.Object) type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type11.getElementType();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZFJZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        int int7 = type1.getOpcode((int) '#');
        java.lang.String str8 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean7 = type4.equals((java.lang.Object) type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(100);
        int int14 = type9.getOpcode(104);
        int int16 = type9.getOpcode(10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int26 = type22.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSort();
        int int33 = type30.getOpcode(100);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type19, type22, type27, type28, type30 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L1750106643", type9, typeArray34);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type4, typeArray34);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type1, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = type1.getElementType();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("Lorg.mockito.asm.Type;", "(ZZFJZ)F", "boolean");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray9 = new java.lang.String[] { "char" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visit((int) ' ', 8, "org/mockito/cglib/core/ClassEmitter", "", "L1622913470", strArray9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int6 = type1.getOpcode(104);
        int int8 = type1.getOpcode(10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int18 = type14.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type14, type19, type20, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1750106643", type1, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type1.getDimensions();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitInnerClass("short", "L1611124633", "Lboolean;", 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("L1047950384", "org/mockito/asm/Type");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean7 = type4.equals((java.lang.Object) type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(100);
        int int14 = type9.getOpcode(104);
        int int16 = type9.getOpcode(10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int26 = type22.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSort();
        int int33 = type30.getOpcode(100);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type19, type22, type27, type28, type30 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L1750106643", type9, typeArray34);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type4, typeArray34);
        boolean boolean38 = type1.equals((java.lang.Object) "org/mockito/cglib/core/Signature");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type1.getDimensions();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("L481232898", true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitSource("", "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1595451715", "Lorg.mockito.cglib.core.Signature;", "L166414925", "L1393130543", "(ZZS)LB(ZZFJZ)J;", "D(ZZZZ)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(107, 2, "", "L236426519", "L2102178846", strArray15);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type7.getSize();
        java.lang.String str9 = type7.getDescriptor();
        int int10 = type7.getSort();
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.begin_class(100, 13, "L2141501698", type7, typeArray12, "L1282685630");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = fieldProviderTransformer0.getClassType();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("(ZZFJZ)J", "Lorg/mockito/asm/Type;", "B");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("(ZZS)Z", "", "L54790720", 153);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("hi!", "Lorg.mockito.cglib.core.Signature;");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        org.mockito.asm.Type type6 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(56, 158, "L313178346", "L527022196", "L2095027814", strArray16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = signature44.getDescriptor();
        org.mockito.asm.Type type47 = signature44.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type47.getElementType();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        int int6 = local3.getIndex();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("(ZZS)Lorg/mockito/asm/Type;", "D(ZZZZ)Z", "org/mockito/asm/Type", 104);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(3, (-1), "J", "Lorg/mockito/cglib/core/ClassEmitter;", "B(ZZFJZ)J", strArray12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getClassType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        int int6 = local3.getIndex();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = fieldProviderTransformer1.getStaticHook();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        label0.info = type5;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        label0.info = type7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type7.getElementType();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean3 = type0.equals((java.lang.Object) type2);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        boolean boolean6 = type1.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L178363472", "L2141501698", "L1051353898", 108);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Lorg/mockito/asm/Label;", "L527022196", "L741552012", "L264236492", "L247801252" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(56, 116, "(ZZFJZ)Z", "L953525568", "L527022196", strArray11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(126, type2);
        int int6 = type2.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        boolean boolean14 = type9.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean20 = type17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int27 = type22.getOpcode(104);
        int int29 = type22.getOpcode(10);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(100);
        int int39 = type35.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSort();
        int int46 = type43.getOpcode(100);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type40, type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1750106643", type22, typeArray47);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type17, typeArray47);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("B", type9, typeArray47);
        java.lang.String str52 = signature51.getDescriptor();
        org.mockito.asm.Type[] typeArray53 = signature51.getArgumentTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("L579744730", type2, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type2.getDimensions();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = fieldProviderTransformer0.getAccess();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(100, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        int int44 = type43.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type45 = type43.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", "(ZZS)LB(ZZFJZ)J;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(108, "org/mockito/cglib/core/ClassEmitter(ZZS)Z", type8, (java.lang.Object) "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getSuperType();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fieldProviderTransformer1.getAccess();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        int int3 = type1.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("", false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(104, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L622959517", "(ZZS)Lorg/mockito/asm/Type;", "L1051353898");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.getStaticHook();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray7 = new java.lang.String[] { "(ZZFJZ)Lorg/mockito/cglib/core/Signature;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(12, 154, "L1897076861", "LB(ZZFJZ)J;", "L741552012", strArray7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitEnd();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitSource("org.mockito.asm.Type", "L1750106643hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        boolean boolean6 = type1.equals((java.lang.Object) local5);
        org.mockito.asm.Type type7 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        int int43 = type21.getSort();
        int int44 = type21.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type21.getDimensions();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean7 = type4.equals((java.lang.Object) "(ZZFJZ)C");
        int int9 = type4.getOpcode(2);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(155, type4);
        org.mockito.asm.Type type11 = local10.getType();
        int int12 = type11.getSort();
        boolean boolean13 = signature2.equals((java.lang.Object) type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type11.getInternalName();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(100);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type12, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", type5, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1409237605", type5, typeArray24);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type0.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.end_class();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L869677676", "(ZZFJZ)LL1700624831;", "L1156263802", 120);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        java.lang.String str21 = type19.getDescriptor();
        boolean boolean22 = type18.equals((java.lang.Object) str21);
        int int23 = type18.getSort();
        java.lang.String str24 = type18.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        int int29 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSort();
        java.lang.String str35 = type33.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        java.lang.String str42 = type39.toString();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type32, type33, type36, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("D", type27, typeArray43);
        org.mockito.asm.Type type46 = signature45.getReturnType();
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.toString();
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int54 = type53.getSort();
        int int56 = type53.getOpcode(100);
        int int57 = type53.getSize();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str60 = type59.toString();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int62 = type61.getSort();
        int int64 = type61.getOpcode(100);
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type50, type53, type58, type59, type61 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray65);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("L1750106643", type46, typeArray65);
        org.mockito.asm.Type type68 = signature67.getReturnType();
        org.mockito.asm.Type type69 = signature67.getReturnType();
        java.lang.String str70 = signature67.toString();
        org.mockito.asm.Type[] typeArray71 = signature67.getArgumentTypes();
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("L1526141452", type18, typeArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.begin_class((int) '#', 107, "L1699623640", type18, typeArray74, "(ZZS)Z");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter9.visitAnnotation("L1556138490", true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(100);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type12, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", type5, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1409237605", type5, typeArray24);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type0.getDimensions();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter6.visitAnnotation("L1646386141L178363472", true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = local5.getIndex();
        org.mockito.asm.Type type8 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(116, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type7.getDimensions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(126, type2);
        int int6 = type2.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        boolean boolean14 = type9.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean20 = type17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int27 = type22.getOpcode(104);
        int int29 = type22.getOpcode(10);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(100);
        int int39 = type35.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSort();
        int int46 = type43.getOpcode(100);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type40, type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1750106643", type22, typeArray47);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type17, typeArray47);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("B", type9, typeArray47);
        java.lang.String str52 = signature51.getDescriptor();
        org.mockito.asm.Type[] typeArray53 = signature51.getArgumentTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("L579744730", type2, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = type2.getInternalName();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "(ZZFJZ)Z", "L1848860563" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(104, 156, "(ZZFJZ)F", "Z", "", strArray14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "L1504002157", "L2012295209", "L1605053548", "L166414925", "L341159242", "L1721562937" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(6, 1, "LD(ZZZZ)Z;", "L341159242", "L1409237605(ZZFJZ)Z", strArray16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "(ZZS)LB(ZZFJZ)J;", "L1504002157", 101);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(116, type7);
        int int9 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type7.getDimensions();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "S", "L1700624831", "L1393130543", "L1773924246" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(35, 7, "Lorg.mockito.cglib.core.Signature;", "L1409237605(ZZFJZ)Z", "L1393130543", strArray15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitEnd();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.getName();
        org.mockito.asm.Type type8 = signature5.getReturnType();
        java.lang.String str9 = type8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type8.getElementType();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitInnerClass("(ZZFJZ)F", "Lorg/mockito/cglib/core/Local;", "L1830056390", 5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L582276042", "", "I");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) "(ZZFJZ)Lorg.mockito.cglib.core.ClassEmitter;");
        java.lang.String str8 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type5.getInternalName();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter9.getAccess();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("(ZZFJZ)Z", "L341159242", "L472215659");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("L54790720", "L1622913470");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L347724281", "L166414925", "byte", "L1848860563" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (short) 100, 0, "(ZZFJZ)C", "org.mockito.cglib.core.ClassEmitter", "short", strArray12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean3 = type0.equals((java.lang.Object) "(ZZFJZ)C");
        int int5 = type0.getOpcode(2);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitSource("L519125275", "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("boolean", "L1331104111");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int6 = type1.getOpcode(104);
        int int8 = type1.getOpcode(10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int18 = type14.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type14, type19, type20, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1750106643", type1, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type1.getInternalName();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        int int43 = type21.getSort();
        int int44 = type21.getSize();
        int int45 = type21.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = type21.getDimensions();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        int int7 = type1.getOpcode((int) (short) 10);
        int int9 = type1.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visit((int) (short) 1, 128, "org/mockito/cglib/transform/impl/FieldProviderTransformer", "L132134061", "L286053463", strArray8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type1.getInternalName();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) "(ZZFJZ)Lorg.mockito.cglib.core.ClassEmitter;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type5.getDimensions();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1011435787", "L90281991", "Lorg/mockito/cglib/core/Signature;", "L286053463", "D" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(155, 97, "", "L527022196", "L1502684541", strArray15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        label0.info = classEmitter5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("(ZZFJZ)Lorg/mockito/cglib/core/ClassEmitter;", "L136141152", "L1876064407");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        java.lang.String str16 = type14.getDescriptor();
        java.lang.String str17 = type14.getClassName();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.getName();
        java.lang.String str23 = signature20.getName();
        java.lang.String str24 = signature20.getName();
        boolean boolean25 = type14.equals((java.lang.Object) str24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.toString();
        java.lang.String str30 = type28.toString();
        int int31 = type28.getSort();
        boolean boolean33 = type28.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean39 = type36.equals((java.lang.Object) type38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSort();
        int int44 = type41.getOpcode(100);
        int int46 = type41.getOpcode(104);
        int int48 = type41.getOpcode(10);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSort();
        int int57 = type54.getOpcode(100);
        int int58 = type54.getSize();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str61 = type60.toString();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSort();
        int int65 = type62.getOpcode(100);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type51, type54, type59, type60, type62 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("L1750106643", type41, typeArray66);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type36, typeArray66);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("B", type28, typeArray66);
        org.mockito.asm.Type[] typeArray71 = signature70.getArgumentTypes();
        java.lang.String str72 = signature70.getDescriptor();
        org.mockito.asm.Type[] typeArray73 = signature70.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.begin_class((int) '#', 156, "L1331104111", type14, typeArray73, "L481232898");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean47 = signature44.equals((java.lang.Object) "C");
        org.mockito.asm.Type type48 = signature44.getReturnType();
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSort();
        int int55 = type52.getOpcode(100);
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(124, type52);
        org.mockito.asm.Type type57 = local56.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type[] typeArray62 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type59, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("J", type57, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray62);
        int int67 = type48.getOpcode(112);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type68 = type48.getElementType();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1556138490", "(ZZFJZ)F", "L1556138490");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        label0.info = classEmitter5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("I", "L2073163127", "Z", (int) (byte) -1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        int int6 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        int int11 = type8.getOpcode(100);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(124, type8);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(116, type13);
        org.mockito.asm.Type type15 = local14.getType();
        int int16 = local14.getIndex();
        org.mockito.asm.Type type17 = local14.getType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type19, typeArray22);
        java.lang.String str24 = signature23.getName();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean29 = signature27.equals((java.lang.Object) 100.0f);
        java.lang.String str30 = signature27.getName();
        java.lang.String str31 = signature27.getDescriptor();
        boolean boolean32 = signature23.equals((java.lang.Object) signature27);
        java.lang.String str33 = signature23.getName();
        org.mockito.asm.Type[] typeArray34 = signature23.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class((int) '4', 107, "L1409237605(ZZFJZ)Z", type17, typeArray34, "L404074784");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        java.lang.String str20 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("L2139045873", "LL(ZZZZ)J;;", "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        int int7 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "L1511509336", "L1700624831", "L756317340", "L1575334251", "L2134732974", "L258443920" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) '#', 97, "(ZZFJZ)LL1700624831;", "org/mockito/cglib/core/Signature(ZZFJZ)B", "L417627768", strArray14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = type1.getSize();
        java.lang.String str5 = type1.toString();
        int int7 = type1.getOpcode(0);
        java.lang.String str8 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter1.getAccess();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(ZZZZ)J;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int11 = type6.getOpcode(104);
        int int13 = type6.getOpcode(10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int23 = type19.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type24, type25, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1750106643", type6, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type1, typeArray31);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type35.getInternalName();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        label0.info = classEmitter5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("(ZZFJZ)D", "Lboolean;");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean12 = signature10.equals((java.lang.Object) 100.0f);
        boolean boolean13 = type0.equals((java.lang.Object) 100.0f);
        int int14 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type0.getDimensions();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L1502684541", "org/mockito/cglib/transform/impl/FieldProviderTransformer", "L2049383775", (int) (short) 10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean3 = type0.equals((java.lang.Object) "(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int12 = type10.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        java.lang.String str18 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        java.lang.String str25 = type22.toString();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type16, type19, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("D", type10, typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        int int40 = type36.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSort();
        int int47 = type44.getOpcode(100);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type33, type36, type41, type42, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1750106643", type29, typeArray48);
        org.mockito.asm.Type type51 = signature50.getReturnType();
        org.mockito.asm.Type type52 = signature50.getReturnType();
        java.lang.String str53 = signature50.toString();
        org.mockito.asm.Type[] typeArray54 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1526141452", type1, typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type1.getElementType();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter9.visitAnnotation("S", true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        java.lang.String str47 = signature45.getDescriptor();
        org.mockito.asm.Type type48 = signature45.getReturnType();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSort();
        int int53 = type50.getOpcode(100);
        int int54 = type50.getSize();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        int int58 = type57.getSize();
        org.mockito.asm.Type[] typeArray60 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type57, typeArray60);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray60);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("char", type50, typeArray60);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("long", type48, typeArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = type48.getInternalName();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int11 = type6.getOpcode(104);
        int int13 = type6.getOpcode(10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int23 = type19.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type24, type25, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1750106643", type6, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type1, typeArray31);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        org.mockito.asm.Type type36 = signature34.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type36.getDimensions();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = local5.getIndex();
        int int8 = local5.getIndex();
        org.mockito.asm.Type type9 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L417627768", "(ZZFJZ)B");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        int int43 = type21.getSort();
        int int44 = type21.getSize();
        int int45 = type21.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type21.getElementType();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        label0.info = type5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        java.lang.String[] strArray19 = new java.lang.String[] { "byte", "L1700624831(ZZFJZ)Lg/mockito/cglib/core/Signature;", "L1448833791" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(154, 112, "Lorg/mockito/cglib/core/Local;", "L480303271", "L424937159Lorg/mockito/asm/Type;", strArray19);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("(ZZZZ)Z", "L236426519", "L741552012", 12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray17 = new java.lang.String[] { "(ZZFJZ)LL1700624831;", "org/mockito/asm/Type", "L1422404580", "L1622913470", "L1880321789", "L269740822" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(101, 9, "L(ZZZZ)J;", "L953525568", "(ZZFJZ)I", strArray17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean6 = signature4.equals((java.lang.Object) 100.0f);
        java.lang.String str7 = signature4.getName();
        java.lang.String str8 = signature4.getDescriptor();
        java.lang.String str9 = signature4.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        java.lang.String str22 = type19.toString();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type12, type13, type16, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray23);
        boolean boolean25 = signature4.equals((java.lang.Object) str24);
        boolean boolean26 = type0.equals((java.lang.Object) signature4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type0.getInternalName();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.getStaticHook();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type8 = local7.getType();
        java.lang.Class<?> wildcardClass9 = local7.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type14 = type13.getElementType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int20 = type16.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type23, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", type16, typeArray26);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        java.lang.String str31 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(13, 124, "int", type14, typeArray32, "L(ZZS)Lorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter4.visitAnnotation("char", false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        label0.info = classEmitter5;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        int int13 = type11.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSort();
        java.lang.String str19 = type17.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type17, type20, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type11, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (short) 0, type34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        int int41 = type37.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSort();
        int int48 = type45.getOpcode(100);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type34, type37, type42, type43, type45 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("L1750106643", type30, typeArray49);
        org.mockito.asm.Type type52 = signature51.getReturnType();
        org.mockito.asm.Type type53 = signature51.getReturnType();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSort();
        int int59 = type56.getOpcode(100);
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(124, type56);
        org.mockito.asm.Type type61 = local60.getType();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(116, type61);
        int int63 = local62.getIndex();
        org.mockito.asm.Type type64 = local62.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(160, "long", type53, (java.lang.Object) local62);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L2123077078", "L1011435787");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(155, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        int int5 = type0.getSort();
        int int7 = type0.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(116, type7);
        int int9 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitInnerClass("org/mockito/cglib/core/ClassEmitter(ZZS)Z", "L1852924281", "short", 54);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(100);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(100);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type2, type5, type10, type11, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.String str19 = type0.toString();
        int int20 = type0.getSort();
        int int21 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        boolean boolean7 = type2.equals((java.lang.Object) local6);
        int int8 = local6.getIndex();
        int int9 = local6.getIndex();
        org.mockito.asm.Type type10 = local6.getType();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type10.getInternalName();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str7 = signature6.getName();
        java.lang.String str8 = signature6.getName();
        java.lang.String str9 = signature6.getName();
        java.lang.String str10 = signature6.getName();
        boolean boolean11 = type0.equals((java.lang.Object) str10);
        int int13 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean9 = type6.equals((java.lang.Object) type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSort();
        int int14 = type11.getOpcode(100);
        int int16 = type11.getOpcode(104);
        int int18 = type11.getOpcode(10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSort();
        int int27 = type24.getOpcode(100);
        int int28 = type24.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(100);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type21, type24, type29, type30, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L1750106643", type11, typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type6, typeArray36);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1700624831", type1, typeArray36);
        org.mockito.asm.Type type41 = signature40.getReturnType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str45 = type44.toString();
        java.lang.String str46 = type44.toString();
        int int47 = type44.getSort();
        boolean boolean49 = type44.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(0, type44);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean55 = type52.equals((java.lang.Object) type54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int58 = type57.getSort();
        int int60 = type57.getOpcode(100);
        int int62 = type57.getOpcode(104);
        int int64 = type57.getOpcode(10);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type67);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int71 = type70.getSort();
        int int73 = type70.getOpcode(100);
        int int74 = type70.getSize();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str77 = type76.toString();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int79 = type78.getSort();
        int int81 = type78.getOpcode(100);
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type67, type70, type75, type76, type78 };
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray82);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("L1750106643", type57, typeArray82);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type52, typeArray82);
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("B", type44, typeArray82);
        java.lang.String str87 = signature86.getDescriptor();
        java.lang.String str88 = signature86.toString();
        java.lang.String str89 = signature86.toString();
        java.lang.String str90 = signature86.getName();
        java.lang.String str91 = signature86.getName();
        org.mockito.asm.Type[] typeArray92 = signature86.getArgumentTypes();
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray92);
        java.lang.String str94 = type41.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type95 = type41.getElementType();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1775458916", "char");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean48 = signature45.equals((java.lang.Object) "C");
        org.mockito.asm.Type type49 = signature45.getReturnType();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(124, type49);
        org.mockito.asm.Type type51 = local50.getType();
        java.lang.String str52 = type51.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = type51.getDimensions();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        int int43 = type21.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int44 = type21.getDimensions();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classEmitter11.visitAnnotation("L855552472", false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L1557733909", "(ZZFJZ)Lg/mockito/cglib/core/ClassEmitter;", "LL1700624831;", 2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1016281187", "L132134061");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean12 = type9.equals((java.lang.Object) "(ZZFJZ)C");
        label7.info = type9;
        java.lang.Object obj14 = label7.info;
        java.lang.String str15 = label7.toString();
        java.lang.Object obj16 = label7.info;
        java.lang.Object obj17 = label7.info;
        boolean boolean18 = type6.equals((java.lang.Object) label7);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(ZZS)D");
        boolean boolean21 = type6.equals((java.lang.Object) type20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type6.getInternalName();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "L327785971", "Lorg/mockito/asm/Type;", "L341159242", "L984124194", "L2057368604", "Lorg/mockito/cglib/core/Signature;Lorg/mockito/cglib/transform/impl/FieldProviderTransformer;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(113, 101, "L1821536648", "L812136796", "org.mockito.asm.Type", strArray16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("L341159242", "L943118629", "L1700624831(ZZS)Z");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = fieldProviderTransformer0.visitAnnotation("(ZZFJZ)J", false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = fieldProviderTransformer0.getStaticHook();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = classEmitter11.getSuperType();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.String str10 = label6.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        label6.info = type11;
        java.lang.String str13 = type11.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(126, "L630501130", type5, (java.lang.Object) str13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("L1721609055", true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(100);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(124, type3);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(116, type8);
        int int10 = type8.getSize();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(11, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type8.getElementType();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D(ZZZZ)Z");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = type1.getSize();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type0.getDimensions();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        org.mockito.asm.Type type5 = local3.getType();
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type8.getSize();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(126, type8);
        int int12 = local11.getIndex();
        boolean boolean13 = type5.equals((java.lang.Object) local11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type5.getElementType();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1733290921", "L729018543", "(ZZFJZ)F", "L1224342712" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(36, 96, "L288992328", "L1057211825", "L370428589", strArray15);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        org.mockito.asm.Type type5 = local4.getType();
        boolean boolean7 = type5.equals((java.lang.Object) "(ZZFJZ)Lorg.mockito.cglib.core.ClassEmitter;");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.toString();
        java.lang.String str12 = type10.toString();
        int int13 = type10.getSort();
        boolean boolean15 = type10.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean21 = type18.equals((java.lang.Object) type20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSort();
        int int26 = type23.getOpcode(100);
        int int28 = type23.getOpcode(104);
        int int30 = type23.getOpcode(10);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        int int40 = type36.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSort();
        int int47 = type44.getOpcode(100);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type33, type36, type41, type42, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1750106643", type23, typeArray48);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type18, typeArray48);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("B", type10, typeArray48);
        org.mockito.asm.Type[] typeArray53 = signature52.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray53);
        java.lang.String str55 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type5.getDimensions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(155, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        java.lang.String str21 = type18.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type12, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("D", type6, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) (short) 0, type29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(100);
        int int36 = type32.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(100);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type29, type32, type37, type38, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("L1750106643", type25, typeArray44);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L1611124633", type2, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type49 = type2.getElementType();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(100);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(124, type3);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(116, type8);
        int int10 = type8.getSize();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(11, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type8.getDimensions();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("boolean(ZZFJZ)Lorg/mockito/cglib/core/Signature;", false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        int int7 = type1.getSize();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int18 = type14.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type21, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("char", type14, typeArray24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type30, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L1409237605", type14, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray33);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray33);
        java.lang.String str39 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type1.getDimensions();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type20.getElementType();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "(ZZFJZ)LI;", "L2139045873", "L2134732974", "L1139804492", "(ZZFJZ)LB(ZZFJZ)J;", "L1700624831(ZZFJZ)Lg/mockito/cglib/core/Signature;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(100, 2, "L1156263802", "L2049383775", "L1721609055", strArray14);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitInnerClass("(ZZZZ)Z", "L953525568", "L1598314908", 5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("L1201055211", true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = type6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type6.getInternalName();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter8.getClassType();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        int int8 = type2.getOpcode((int) '#');
        java.lang.String str9 = type2.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(156, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type2.getElementType();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        label0.info = classEmitter5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter5.getAccess();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        boolean boolean6 = type1.equals((java.lang.Object) local5);
        int int7 = local5.getIndex();
        int int8 = local5.getIndex();
        org.mockito.asm.Type type9 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean9 = type6.equals((java.lang.Object) type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSort();
        int int14 = type11.getOpcode(100);
        int int16 = type11.getOpcode(104);
        int int18 = type11.getOpcode(10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSort();
        int int27 = type24.getOpcode(100);
        int int28 = type24.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(100);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type21, type24, type29, type30, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("L1750106643", type11, typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type6, typeArray36);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1700624831", type1, typeArray36);
        org.mockito.asm.Type type41 = signature40.getReturnType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str45 = type44.toString();
        java.lang.String str46 = type44.toString();
        int int47 = type44.getSort();
        boolean boolean49 = type44.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(0, type44);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean55 = type52.equals((java.lang.Object) type54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int58 = type57.getSort();
        int int60 = type57.getOpcode(100);
        int int62 = type57.getOpcode(104);
        int int64 = type57.getOpcode(10);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type67);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int71 = type70.getSort();
        int int73 = type70.getOpcode(100);
        int int74 = type70.getSize();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str77 = type76.toString();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int79 = type78.getSort();
        int int81 = type78.getOpcode(100);
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type67, type70, type75, type76, type78 };
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray82);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("L1750106643", type57, typeArray82);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type52, typeArray82);
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("B", type44, typeArray82);
        java.lang.String str87 = signature86.getDescriptor();
        java.lang.String str88 = signature86.toString();
        java.lang.String str89 = signature86.toString();
        java.lang.String str90 = signature86.getName();
        java.lang.String str91 = signature86.getName();
        org.mockito.asm.Type[] typeArray92 = signature86.getArgumentTypes();
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray92);
        java.lang.String str94 = type41.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str95 = type41.getInternalName();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int12 = type10.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        java.lang.String str18 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        java.lang.String str25 = type22.toString();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type16, type19, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("D", type10, typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        int int40 = type36.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSort();
        int int47 = type44.getOpcode(100);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type33, type36, type41, type42, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1750106643", type29, typeArray48);
        org.mockito.asm.Type type51 = signature50.getReturnType();
        org.mockito.asm.Type type52 = signature50.getReturnType();
        java.lang.String str53 = signature50.toString();
        org.mockito.asm.Type[] typeArray54 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1526141452", type1, typeArray54);
        org.mockito.asm.Type type56 = signature55.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = type56.getInternalName();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray14 = new java.lang.String[] { "(ZZFJZ)D" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visit(36, 153, "L1358051592", "(ZZFJZ)Lg/mockito/cglib/core/ClassEmitter;", "L1009337480", strArray14);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZS)B");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("L589766077", false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        int int6 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type9, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("char", type2, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type18, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1409237605", type2, typeArray21);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type25.getDimensions();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean48 = signature45.equals((java.lang.Object) "C");
        org.mockito.asm.Type type49 = signature45.getReturnType();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(124, type49);
        org.mockito.asm.Type type51 = local50.getType();
        java.lang.String str52 = type51.getClassName();
        int int54 = type51.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type51.getDimensions();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean47 = signature44.equals((java.lang.Object) "C");
        org.mockito.asm.Type type48 = signature44.getReturnType();
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSort();
        int int55 = type52.getOpcode(100);
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(124, type52);
        org.mockito.asm.Type type57 = local56.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type[] typeArray62 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type59, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("J", type57, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray62);
        int int67 = type48.getOpcode(120);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = type48.getInternalName();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(0, (int) 'a', "(ZZZZ)S", "L404074784", "L1003792964", strArray10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("Lorg/mockito/cglib/core/Signature;", "L1051353898");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray14 = new java.lang.String[] { "org/mockito/cglib/core/Signature(ZZFJZ)B", "L196666691" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(54, 104, "L1631748826", "L2123077078", "L692861107", strArray14);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("L139491627", "L1556138490");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(116, type7);
        org.mockito.asm.Type type9 = local8.getType();
        int int10 = local8.getIndex();
        org.mockito.asm.Type type11 = local8.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type11.getInternalName();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = local5.getIndex();
        org.mockito.asm.Type type8 = local5.getType();
        org.mockito.asm.Type type9 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type9.getInternalName();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int6 = type1.getOpcode(104);
        int int8 = type1.getOpcode(10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int18 = type14.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type14, type19, type20, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1750106643", type1, typeArray26);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        boolean boolean33 = signature28.equals((java.lang.Object) str32);
        java.lang.String str34 = signature28.getDescriptor();
        org.mockito.asm.Type type35 = signature28.getReturnType();
        org.mockito.asm.Type type36 = signature28.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type36.getElementType();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.toString();
        org.mockito.asm.Type[] typeArray8 = signature5.getArgumentTypes();
        java.lang.String str9 = signature5.toString();
        org.mockito.asm.Type type10 = signature5.getReturnType();
        int int11 = type10.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type10.getElementType();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("L1575334251", false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L2836203", "L2141863763", "org.mockito.cglib.core.ClassEmitter", 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray12 = new java.lang.String[] { "L474935364", "L54790720", "L136141152", "L247801252" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) (short) -1, 160, "L622959517", "L(ZZS)Lorg/mockito/cglib/core/ClassEmitter;;", "L1306892803", strArray12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("", "L1685659483", "L559359879");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("L240344533", "L589626353", "L345442636");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = fieldProviderTransformer0.visitAnnotation("L2057368604", true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter3.getAccess();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        int int5 = type0.getSort();
        int int6 = type0.getSize();
        int int7 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        int int7 = type1.getSize();
        int int8 = type1.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        int int13 = type11.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSort();
        java.lang.String str19 = type17.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        java.lang.String str26 = type23.toString();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type17, type20, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type11, typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (short) 0, type34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        int int41 = type37.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSort();
        int int48 = type45.getOpcode(100);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type34, type37, type42, type43, type45 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("L1750106643", type30, typeArray49);
        org.mockito.asm.Type type52 = signature51.getReturnType();
        org.mockito.asm.Type type53 = signature51.getReturnType();
        java.lang.String str54 = signature51.toString();
        org.mockito.asm.Type[] typeArray55 = signature51.getArgumentTypes();
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L269740822", type1, typeArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type57 = type1.getElementType();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        boolean boolean6 = type1.equals((java.lang.Object) local5);
        int int7 = local5.getIndex();
        org.mockito.asm.Type type8 = local5.getType();
        java.lang.String str9 = type8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "L952378401", "Lorg/mockito/cglib/core/Local;", "L136141152", "Lorg/mockito/cglib/core/ClassEmitter;L1700624831(ZZS)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(36, 18, "L1488042301", "Z", "(ZZZZ)Lorg/mockito/asm/Type;", strArray14);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "J");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = signature2.equals((java.lang.Object) type6);
        java.lang.String str8 = type6.getDescriptor();
        int int9 = type6.getSize();
        java.lang.String str10 = type6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type6.getInternalName();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1150149530", "L1874342524");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.getName();
        org.mockito.asm.Type type8 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter11.getAccess();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(155, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        java.lang.String str21 = type18.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type11, type12, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("D", type6, typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) (short) 0, type29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(100);
        int int36 = type32.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(100);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type29, type32, type37, type38, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("L1750106643", type25, typeArray44);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L1611124633", type2, typeArray47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean53 = type50.equals((java.lang.Object) type52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = type55.getSort();
        int int58 = type55.getOpcode(100);
        int int60 = type55.getOpcode(104);
        int int62 = type55.getOpcode(10);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str66 = type65.toString();
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) (short) 0, type65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int69 = type68.getSort();
        int int71 = type68.getOpcode(100);
        int int72 = type68.getSize();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str75 = type74.toString();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int77 = type76.getSort();
        int int79 = type76.getOpcode(100);
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type65, type68, type73, type74, type76 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray80);
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("L1750106643", type55, typeArray80);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type50, typeArray80);
        org.mockito.asm.Type type84 = signature83.getReturnType();
        java.lang.String str85 = signature83.getName();
        java.lang.String str86 = signature83.getName();
        org.mockito.asm.Type[] typeArray87 = signature83.getArgumentTypes();
        boolean boolean88 = type2.equals((java.lang.Object) typeArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type89 = type2.getElementType();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(116, type7);
        org.mockito.asm.Type type9 = local8.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type20.getElementType();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = fieldProviderTransformer0.getAccess();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1796205581", "L88821762");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        int int9 = type8.getSort();
        int int10 = type8.getSort();
        java.lang.String str11 = type8.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type8.getInternalName();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        java.lang.String[] strArray9 = new java.lang.String[] { "L1040622309", "org/mockito/asm/Label", "L2836203" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(116, (int) (short) 10, "L828075009", "L1064125464", "L1030334456", strArray9);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1809050228", "L1203438101");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        org.mockito.asm.Type type44 = signature42.getReturnType();
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        java.lang.String str48 = type46.getDescriptor();
        java.lang.String str49 = type46.getClassName();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str53 = signature52.getName();
        java.lang.String str54 = signature52.getName();
        java.lang.String str55 = signature52.getName();
        java.lang.String str56 = signature52.getName();
        boolean boolean57 = type46.equals((java.lang.Object) str56);
        boolean boolean58 = type44.equals((java.lang.Object) str56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type44.getInternalName();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int5 = type1.getSize();
        int int7 = type1.getOpcode((int) (short) 10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int19 = type14.getOpcode(104);
        int int21 = type14.getOpcode(10);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        int int31 = type27.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(100);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type24, type27, type32, type33, type35 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("L1750106643", type14, typeArray39);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type9, typeArray39);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L464454830", type1, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type1.getInternalName();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = local5.getIndex();
        org.mockito.asm.Type type8 = local5.getType();
        org.mockito.asm.Type type9 = local5.getType();
        org.mockito.asm.Type type10 = local5.getType();
        java.lang.String str11 = type10.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type10.getInternalName();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        java.lang.Class<?> wildcardClass5 = local3.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(100);
        int int14 = type9.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        boolean boolean19 = type9.equals((java.lang.Object) classEmitter18);
        boolean boolean20 = type7.equals((java.lang.Object) type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type9.getElementType();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = fieldProviderTransformer0.getStaticHook();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        org.mockito.asm.Type type10 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L1750106643hi!");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(100);
        int int14 = type9.getOpcode(104);
        int int15 = type9.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.toString();
        java.lang.String str18 = type16.toString();
        boolean boolean20 = type16.equals((java.lang.Object) 124);
        int int21 = type16.getSort();
        int int23 = type16.getOpcode(9);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSort();
        int int28 = type25.getOpcode(100);
        int int30 = type25.getOpcode(104);
        int int32 = type25.getOpcode(10);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSort();
        int int41 = type38.getOpcode(100);
        int int42 = type38.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSort();
        int int49 = type46.getOpcode(100);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type35, type38, type43, type44, type46 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("L1750106643", type25, typeArray50);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray50);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray50);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class((int) (byte) 100, 5, "(ZZS)J", type5, typeArray50, "L2052037118");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str7 = type2.getClassName();
        int int8 = type2.getSort();
        int int9 = type2.getSize();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(116, type2);
        java.lang.String str11 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type2.getInternalName();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type11 = local10.getType();
        java.lang.Class<?> wildcardClass12 = local10.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = type15.getElementType();
        boolean boolean17 = type0.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type0.getElementType();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        int int10 = type9.getSort();
        int int11 = type9.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(104, type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field((int) ' ', "L1139804492", type9, (java.lang.Object) type13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray16 = new java.lang.String[] { "L406656253", "(ZZZZ)LZZS)Lorg/mockito/cglib/core/ClassEmitter;", "L788435335", "L1897622246", "L317866167", "L1393130543" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '4', 13, "L1172213101", "org/mockito/cglib/core/Signature(ZZFJZ)B", "L937292222", strArray16);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L168560049", "org.mockito.cglib.core.ClassEmitter(ZZS)LB(ZZFJZ)J;", "Lorg.mockito.asm.Label;");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("LL(ZZZZ)J;;");
        int int11 = type9.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        int int14 = type13.getSize();
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.toString();
        java.lang.String str20 = type18.toString();
        int int21 = type18.getSort();
        boolean boolean23 = type18.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean29 = type26.equals((java.lang.Object) type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSort();
        int int34 = type31.getOpcode(100);
        int int36 = type31.getOpcode(104);
        int int38 = type31.getOpcode(10);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (short) 0, type41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSort();
        int int47 = type44.getOpcode(100);
        int int48 = type44.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str51 = type50.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSort();
        int int55 = type52.getOpcode(100);
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type41, type44, type49, type50, type52 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray56);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("L1750106643", type31, typeArray56);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type26, typeArray56);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("B", type18, typeArray56);
        org.mockito.asm.Type[] typeArray61 = signature60.getArgumentTypes();
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type13, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(100, 7, "(ZZS)D", type9, typeArray61, "L953525568");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        java.lang.String str45 = signature44.getDescriptor();
        java.lang.String str46 = signature44.toString();
        java.lang.String str47 = signature44.toString();
        org.mockito.asm.Type[] typeArray48 = signature44.getArgumentTypes();
        org.mockito.asm.Type type49 = signature44.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type49.getElementType();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "L1700624831(ZZFJZ)J", "L1306892803", "L1397088731", "L1750106643hi!L1611124633" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(54, 60, "Lorg.mockito.cglib.core.Signature;", "L83174855", "long", strArray15);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("", "L1056626601Lg/mockito/cglib/core/ClassEmitter;", "L589766077", 1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("L1695241605", "L1273990587", "L1750106643", 132);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(96, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("Lorg.mockito.asm.Label;", "L1770033671");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "L1397088731");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B(ZZFJZ)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean9 = signature2.equals((java.lang.Object) type8);
        java.lang.String str10 = type8.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type8.getElementType();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        int int6 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type9, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("char", type2, typeArray12);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (byte) 1, type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type17.getElementType();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        int int7 = local5.getIndex();
        org.mockito.asm.Type type8 = local5.getType();
        org.mockito.asm.Type type9 = local5.getType();
        int int10 = local5.getIndex();
        org.mockito.asm.Type type11 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type11.getElementType();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "J");
        java.lang.String str4 = signature3.toString();
        java.lang.String str5 = signature3.getDescriptor();
        java.lang.String str6 = signature3.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = signature3.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        int int10 = type7.getSize();
        java.lang.String str11 = type7.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(100);
        int int17 = type13.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type[] typeArray23 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type20, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray23);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("char", type13, typeArray23);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L521162943", type7, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type7.getDimensions();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        java.lang.String str16 = type13.toString();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type6, type7, type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("D", type1, typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type21.getInternalName();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        int int6 = type0.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.toString();
        java.lang.String str9 = type7.toString();
        boolean boolean11 = type7.equals((java.lang.Object) 124);
        int int12 = type7.getSort();
        int int14 = type7.getOpcode(9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = type0.getInternalName();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        org.mockito.asm.Type type44 = signature42.getReturnType();
        java.lang.String str45 = type44.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = type44.getDimensions();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        int int8 = type6.getOpcode(158);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(153, type6);
        org.mockito.asm.Type type10 = local9.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type10.getElementType();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(7, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L1113135147", "L1534184896", "L1700624831(ZZFJZ)Lg/mockito/cglib/core/Signature;", 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "L1076182119", "L754444086", "L1058157057", "L1805257916" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(0, 7, "L1058157057", "L1113135147", "L1221267572", strArray15);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "L1743626135", "L175296710", "L55159937", "L255335321", "LI;", "L1548188399" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(113, 120, "L2079966129", "L288992328", "L913716099", strArray16);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitEnd();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("(ZZS)Z", "L1331104111(ZZZZ)Z", "L370428589");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.end_class();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter11.getAccess();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1758083113", "Ldouble;", "short", "L711339210", "L754444086", "L58833018" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(54, 54, "L1273990587", "L952378401", "L269740822", strArray18);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter8.getStaticHook();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = fieldProviderTransformer1.getClassType();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getDescriptor();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("L1180708543", "org/mockito/cglib/core/Signature(ZZFJZ)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(18, "L817736255", type9, (java.lang.Object) "org/mockito/cglib/core/Signature(ZZFJZ)B");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.end_class();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getSuperType();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.end_class();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitSource("L523588336", "L1367420155");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean48 = signature45.equals((java.lang.Object) "C");
        org.mockito.asm.Type type49 = signature45.getReturnType();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(124, type49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = type49.getDimensions();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = fieldProviderTransformer1.getSuperType();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("char", type1, typeArray11);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type16.getElementType();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = fieldProviderTransformer0.visitAnnotation("L286972761", false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int11 = type6.getOpcode(104);
        int int13 = type6.getOpcode(10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int23 = type19.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type24, type25, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1750106643", type6, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type1, typeArray31);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        int int37 = type36.getSize();
        java.lang.String str38 = type36.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSort();
        int int44 = type41.getOpcode(100);
        int int45 = type41.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type[] typeArray51 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type48, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray51);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("char", type41, typeArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        int int58 = type57.getSize();
        org.mockito.asm.Type[] typeArray60 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type57, typeArray60);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray60);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("L1409237605", type41, typeArray60);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray60);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = type35.getInternalName();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getSuperType();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1237048996" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((int) (short) 1, 58, "L1363784122", "J(ZZFJZ)Z", "(ZZFJZ)LL(ZZZZ)J;", strArray12);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L2092485493", "L2049383775");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L1134801259", "C", "L1364290963");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("L489318315", true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("", "L578795900", "(ZZFJZ)D");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        java.lang.String str45 = signature44.toString();
        java.lang.String str46 = signature44.toString();
        java.lang.String str47 = signature44.getDescriptor();
        org.mockito.asm.Type type48 = signature44.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer50 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer51 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer50.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer51);
        java.lang.Class<?> wildcardClass53 = fieldProviderTransformer50.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("L1401939464", type54, typeArray56);
        boolean boolean58 = type48.equals((java.lang.Object) "L1401939464");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type48.getInternalName();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.end_class();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.getName();
        java.lang.String str8 = signature5.getName();
        org.mockito.asm.Type type9 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int4 = type0.getSort();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L1051353898", "double");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.end_class();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type21.getElementType();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int6 = type1.getOpcode(104);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        boolean boolean14 = type9.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean20 = type17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int27 = type22.getOpcode(104);
        int int29 = type22.getOpcode(10);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(100);
        int int39 = type35.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSort();
        int int46 = type43.getOpcode(100);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type40, type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1750106643", type22, typeArray47);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type17, typeArray47);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("B", type9, typeArray47);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean54 = signature51.equals((java.lang.Object) "C");
        org.mockito.asm.Type type55 = signature51.getReturnType();
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type59.getSort();
        int int62 = type59.getOpcode(100);
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(124, type59);
        org.mockito.asm.Type type64 = local63.getType();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.CHAR_TYPE;
        int int67 = type66.getSize();
        org.mockito.asm.Type[] typeArray69 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type66, typeArray69);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("J", type64, typeArray69);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray69);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("double", type1, typeArray69);
        org.mockito.asm.Type type74 = signature73.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str75 = type74.getInternalName();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("L2068401345");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSort();
        int int24 = type21.getOpcode(100);
        int int25 = type21.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray31 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type28, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("char", type21, typeArray31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type[] typeArray40 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type37, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1409237605", type21, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.begin_class((int) ' ', 168, "L1006597254", type18, typeArray40, "L1846716763");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        java.lang.String str5 = type3.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        java.lang.String str12 = type9.toString();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type2, type3, type6, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type0.getElementType();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean5 = type2.equals((java.lang.Object) "(ZZFJZ)C");
        label0.info = type2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type2.getDimensions();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(7, type1);
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean9 = type6.equals((java.lang.Object) type8);
        java.lang.String str10 = type6.toString();
        boolean boolean11 = type1.equals((java.lang.Object) type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type6.getElementType();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        int int9 = type8.getSort();
        int int10 = type8.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type8.getDimensions();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int10 = type6.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type3, type6, type11, type12, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        java.lang.String str20 = type1.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type1.getElementType();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.getDescriptor();
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean47 = signature44.equals((java.lang.Object) "C");
        org.mockito.asm.Type type48 = signature44.getReturnType();
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean53 = signature51.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass54 = signature51.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.String str59 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        boolean boolean60 = signature44.equals((java.lang.Object) wildcardClass54);
        java.lang.String str61 = signature44.getName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.toString();
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local((int) (short) 0, type63);
        java.lang.Class<?> wildcardClass66 = local65.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        java.lang.String str68 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        boolean boolean69 = signature44.equals((java.lang.Object) str68);
        org.mockito.asm.Type type70 = signature44.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type71 = type70.getElementType();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean7 = type4.equals((java.lang.Object) "(ZZFJZ)C");
        int int9 = type4.getOpcode(2);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(155, type4);
        org.mockito.asm.Type type11 = local10.getType();
        int int12 = type11.getSort();
        boolean boolean13 = signature2.equals((java.lang.Object) type11);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.Object obj17 = label14.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str23 = signature22.getName();
        boolean boolean25 = signature22.equals((java.lang.Object) (byte) 100);
        boolean boolean26 = type19.equals((java.lang.Object) (byte) 100);
        label14.info = boolean26;
        boolean boolean28 = type11.equals((java.lang.Object) boolean26);
        int int29 = type11.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type11.getElementType();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L1679452761", "B");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean3 = type0.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("", "L1419612585", "(ZZS)J", 15);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter13 = classEmitter11.getStaticHook();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str2 = type1.getInternalName();
        org.mockito.asm.Type type3 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("L781303720", "L828075009");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSort();
        boolean boolean8 = type3.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        int int23 = type16.getOpcode(10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1750106643", type16, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type11, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("B", type3, typeArray41);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean48 = signature45.equals((java.lang.Object) "C");
        org.mockito.asm.Type type49 = signature45.getReturnType();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local(124, type49);
        org.mockito.asm.Type type51 = local50.getType();
        java.lang.String str52 = type51.getClassName();
        int int54 = type51.getOpcode(1);
        int int55 = type51.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type51.getElementType();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSort();
        int int8 = type1.getSort();
        int int10 = type1.getOpcode(124);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.getStaticHook();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean3 = type0.equals((java.lang.Object) "(ZZFJZ)C");
        int int5 = type0.getOpcode(2);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type8, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("char", type1, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("(ZZZZ)J");
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        int int22 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSort();
        java.lang.String str28 = type26.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        java.lang.String str35 = type32.toString();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type25, type26, type29, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("D", type20, typeArray36);
        java.lang.String str39 = signature38.getName();
        org.mockito.asm.Type[] typeArray40 = signature38.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.begin_class(0, 153, "L175296710", type16, typeArray40, "L1724782819");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str7 = type6.toString();
        java.lang.String str8 = type6.toString();
        int int9 = type6.getSort();
        boolean boolean11 = type6.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type6);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean17 = type14.equals((java.lang.Object) type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int24 = type19.getOpcode(104);
        int int26 = type19.getOpcode(10);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) (short) 0, type29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(100);
        int int36 = type32.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(100);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type29, type32, type37, type38, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("L1750106643", type19, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type14, typeArray44);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("B", type6, typeArray44);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type1, typeArray49);
        org.mockito.asm.Type type51 = signature50.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type51.getElementType();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1757941828", "L347724281");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = classEmitter9.getAccess();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int11 = type6.getOpcode(104);
        int int13 = type6.getOpcode(10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int23 = type19.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type24, type25, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1750106643", type6, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type1, typeArray31);
        java.lang.String str35 = signature34.getName();
        java.lang.String str36 = signature34.getDescriptor();
        org.mockito.asm.Type type37 = signature34.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type38 = type37.getElementType();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("", "L139491627", "J(ZZFJZ)Z");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter9.getSuperType();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSort();
        int int9 = type6.getOpcode(100);
        int int11 = type6.getOpcode(104);
        int int13 = type6.getOpcode(10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        int int23 = type19.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type24, type25, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1750106643", type6, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type1, typeArray31);
        java.lang.String str35 = signature34.getName();
        org.mockito.asm.Type type36 = signature34.getReturnType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type38);
        int int41 = local40.getIndex();
        int int42 = local40.getIndex();
        java.lang.Class<?> wildcardClass43 = local40.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type45 = type44.getElementType();
        boolean boolean46 = type36.equals((java.lang.Object) type44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type36.getInternalName();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(155, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.toString();
        org.mockito.asm.Type[] typeArray8 = signature5.getArgumentTypes();
        java.lang.String str9 = signature5.toString();
        org.mockito.asm.Type type10 = signature5.getReturnType();
        java.lang.String str11 = type10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type10.getElementType();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        int int6 = type1.getOpcode(104);
        int int8 = type1.getOpcode(10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int18 = type14.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type11, type14, type19, type20, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1750106643", type1, typeArray26);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        boolean boolean33 = signature28.equals((java.lang.Object) str32);
        java.lang.String str34 = signature28.getDescriptor();
        org.mockito.asm.Type type35 = signature28.getReturnType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type type40 = local39.getType();
        java.lang.Class<?> wildcardClass41 = local39.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = type43.getElementType();
        boolean boolean46 = type35.equals((java.lang.Object) type45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type35.getElementType();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = signature44.getDescriptor();
        org.mockito.asm.Type type47 = signature44.getReturnType();
        org.mockito.asm.Type type48 = signature44.getReturnType();
        int int49 = type48.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type48.getElementType();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(100);
        int int9 = type5.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(100);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type2, type5, type10, type11, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.String str19 = type0.toString();
        int int20 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type0.getInternalName();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray9 = new java.lang.String[] { "L1567723954", "LL481232898;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(13, (int) 'a', "L113814799", "L1495558191", "int", strArray9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int12 = type10.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        java.lang.String str18 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        java.lang.String str25 = type22.toString();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type16, type19, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("D", type10, typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        int int40 = type36.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSort();
        int int47 = type44.getOpcode(100);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type33, type36, type41, type42, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1750106643", type29, typeArray48);
        org.mockito.asm.Type type51 = signature50.getReturnType();
        org.mockito.asm.Type type52 = signature50.getReturnType();
        java.lang.String str53 = signature50.toString();
        org.mockito.asm.Type[] typeArray54 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1526141452", type1, typeArray54);
        org.mockito.asm.Type type56 = signature55.getReturnType();
        org.mockito.asm.Type type57 = signature55.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = type57.getInternalName();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        int int6 = local3.getIndex();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        org.mockito.asm.Type type9 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.visitEnd();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        org.mockito.asm.Type type6 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        int int4 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        java.lang.String str17 = type14.toString();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type8, type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("D", type2, typeArray18);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type21, typeArray40);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        org.mockito.asm.Type type44 = signature42.getReturnType();
        java.lang.String str45 = signature42.toString();
        org.mockito.asm.Type[] typeArray46 = signature42.getArgumentTypes();
        org.mockito.asm.Type type47 = signature42.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type47.getInternalName();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(ZZFJZ)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type11 = local10.getType();
        java.lang.Class<?> wildcardClass12 = local10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        int int15 = type14.getDimensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.declare_field((int) '4', "L432659255", type6, (java.lang.Object) int15);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str3 = type2.toString();
        java.lang.String str4 = type2.toString();
        int int5 = type2.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int20 = type15.getOpcode(104);
        int int22 = type15.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int32 = type28.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type28, type33, type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("L1750106643", type15, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type10, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("B", type2, typeArray40);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean47 = signature44.equals((java.lang.Object) "C");
        org.mockito.asm.Type type48 = signature44.getReturnType();
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSort();
        int int55 = type52.getOpcode(100);
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(124, type52);
        org.mockito.asm.Type type57 = local56.getType();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type[] typeArray62 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type59, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("J", type57, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type66 = type48.getElementType();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean21 = type18.equals((java.lang.Object) "(ZZFJZ)C");
        int int23 = type18.getOpcode(2);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(155, type18);
        int int26 = type18.getOpcode((int) (byte) 10);
        java.lang.String str27 = type18.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        java.lang.Class<?> wildcardClass34 = type29.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (short) 0, type40);
        org.mockito.asm.Type type43 = local42.getType();
        java.lang.Class<?> wildcardClass44 = local42.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        int int50 = type48.getOpcode(56);
        java.lang.String str51 = type48.getClassName();
        int int52 = type48.getSort();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean57 = type54.equals((java.lang.Object) type56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type59.getSort();
        int int62 = type59.getOpcode(100);
        int int64 = type59.getOpcode(104);
        int int66 = type59.getOpcode(10);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str70 = type69.toString();
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((int) (short) 0, type69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int73 = type72.getSort();
        int int75 = type72.getOpcode(100);
        int int76 = type72.getSize();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str79 = type78.toString();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int81 = type80.getSort();
        int int83 = type80.getOpcode(100);
        org.mockito.asm.Type[] typeArray84 = new org.mockito.asm.Type[] { type69, type72, type77, type78, type80 };
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type67, typeArray84);
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("L1750106643", type59, typeArray84);
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type54, typeArray84);
        java.lang.String str88 = signature87.getName();
        java.lang.String str89 = signature87.getDescriptor();
        java.lang.String str90 = signature87.toString();
        org.mockito.asm.Type[] typeArray91 = signature87.getArgumentTypes();
        org.mockito.cglib.core.Signature signature92 = new org.mockito.cglib.core.Signature("L341159242", type48, typeArray91);
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("L1845154716", type37, typeArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.begin_class(155, 158, "L618796125", type18, typeArray91, "L1656806444L189054299");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(7, type1);
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean9 = type6.equals((java.lang.Object) type8);
        java.lang.String str10 = type6.toString();
        boolean boolean11 = type1.equals((java.lang.Object) type6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        java.lang.String str24 = type21.toString();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type14, type15, type18, type21 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray25);
        int int29 = type1.getOpcode(107);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type1.getInternalName();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray9 = new java.lang.String[] { "g/mockito/cglib/core/Local", "L1221267572" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(0, 108, "L1234341159", "(ZZS)D", "L1757941828", strArray9);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("L1455205572", true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        org.mockito.asm.Type type8 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        java.lang.String str7 = signature6.getName();
        java.lang.String str8 = signature6.getName();
        java.lang.String str9 = signature6.getName();
        org.mockito.asm.Type type10 = signature6.getReturnType();
        org.mockito.asm.Type type11 = signature6.getReturnType();
        int int12 = type11.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(16, type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type11.getInternalName();
    }
}


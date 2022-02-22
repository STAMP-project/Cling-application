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
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 100, "", type3, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("F", "F", "F");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("C", "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "(FF)B", "(FCFFB)B", "hi!", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(154, 112, "hi!", "hi!", "C", strArray11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "F", "F", "C", "C", "F", "(FCFFB)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) (byte) 0, (int) (byte) 10, "hi!", "hi!", "(FCFFB)B", strArray13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(0, 116, "(FCFFB)B", type4, typeArray17, "F");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!", "", "(FF)B", 8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(FF)B", "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("F", "(FCFFB)B");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor7 = classAdapter1.visitField((int) '#', "hi!", "C", "F", (java.lang.Object) 0.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("F", true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.end_class();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("", "(FCFFB)B");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(FCFFB)F", "(FCFFB)F");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(96, "(FCFFB)B", type4, (java.lang.Object) signature18);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = classEmitter15.getClassType();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(37, 104, "F", "(FCFFB)B", "(FCFFB)S", strArray7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visitEnd();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter18.getStaticHook();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("C", "(FF)B", "(FCFFB)F", 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type1.getInternalName();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray30 = new java.lang.String[] { "C", "(FCFFB)B", "F", "(FCFFB)F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visit(1, (int) ' ', "F", "hi!", "(FCFFB)F", strArray30);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitInnerClass("(FCFFB)S", "F", "(FCFFB)B", (-1));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type0.getInternalName();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type1.getDimensions();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visitSource("", "S");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("F", "(FF)B", "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("(FCFFB)C", "(FCFFB)S", "(FCFFB)S", (int) ' ');
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = classEmitter15.getSuperType();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(FCFFB)S", "", "", (int) (byte) -1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("S", "(FCFFB)C", "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(3, type2);
        org.mockito.asm.Type type17 = local16.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("", "F", "F", (int) '#');
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("", "(FCFFB)B", "C", (int) 'a');
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(3, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor23 = classAdapter1.visitField(3, "(FCFFB)B", "F", "(FF)B", (java.lang.Object) type8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("C", "C", "(FCFFB)C");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("float", "L373083987");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter1.getAccess();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classEmitter15.visitAnnotation("S", false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(FCFFB)S", "(FF)B", "L373083987");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("F", "(FF)B", "(FF)B");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(3, type24);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type45, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type42, typeArray51);
        org.mockito.asm.Type[] typeArray53 = signature52.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        java.lang.String str57 = type55.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean60 = type58.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        int int64 = type61.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type24, type39, type55, type58, type61 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(130, (int) (short) 10, "(FCFFB)S", type9, typeArray65, "(FF)B");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = classEmitter22.getAccess();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = classEmitter22.getSuperType();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter15.getStaticHook();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(153, "(FCFFB)S", type5, (java.lang.Object) 100.0f);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classEmitter21.visitAnnotation("(SCFFF)B", true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitInnerClass("(FF)B", "L373083987", "C", (int) '4');
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "F", "C", "(FCFFB)S", "", "C" };
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        java.lang.String str25 = signature24.getDescriptor();
        org.mockito.asm.Type[] typeArray26 = signature24.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray9, typeArray26);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitSource("(FCFFB)S", "(FCFFB)C");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visitEnd();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type59, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type56, typeArray65);
        int int68 = type56.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.declare_field((int) (short) 100, "hi!", type53, (java.lang.Object) type56);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = classEmitter46.getSuperType();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("(FCFFB)F", false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        java.lang.String str4 = type0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type24, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type19, typeArray30);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(3, type19);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        java.lang.String str52 = type50.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        int int59 = type56.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type19, type34, type50, type53, type56 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray60);
        boolean boolean62 = type0.equals((java.lang.Object) str61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = type0.getDimensions();
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        int int7 = type4.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type1, type4 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int13 = type10.getOpcode((int) '#');
        java.lang.String str14 = type10.toString();
        boolean boolean15 = type0.equals((java.lang.Object) str14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type0.getInternalName();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("(FCFFB)C", false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter25 = classEmitter22.getStaticHook();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type35, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type32, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type30, typeArray41);
        java.lang.String str44 = type30.toString();
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(158, type30);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = local45.getType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type53, type55, type56, type58, type60 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type52, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type50, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.begin_class(2, 0, "C", type47, typeArray61, "L373083987");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.end_class();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("(FCFFB)C", "L373083987", "L373083987", 157);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(FCFFB)B", "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("(FF)B", "(FCFFB)B");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitInnerClass("(FCFFB)C", "I", "(FCFFB)B", 158);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        int int26 = type25.getSort();
        boolean boolean28 = type25.equals((java.lang.Object) 1);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.begin_class(6, (int) (short) 1, "hi!", type25, typeArray39, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classEmitter21.visitAnnotation("(FCFFB)C", false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classEmitter15.visitAnnotation("F", false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(FCFFB)S", "(FCFFB)B", "F");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("(FCFFB)B", true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("(FCFFB)F", "(FCFFB)F", "L373083987", (int) (short) 10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "(FCFFB)S", "(FCFFB)F", "(FCFFB)B", "I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(96, 154, "S", "(FCFFB)B", "float", strArray15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "S");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("(FCFFB)C", "(FCFFB)C", "(FCFFB)F", (int) '4');
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getClassType();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("", "L373083987", "(FCFFB)B", 9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.end_class();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        int int7 = type4.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type1, type4 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int13 = type10.getOpcode((int) '#');
        java.lang.String str14 = type10.toString();
        boolean boolean15 = type0.equals((java.lang.Object) str14);
        java.lang.String str16 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type0.getElementType();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray27 = new java.lang.String[] { "byte", "hi!", "(FCFFB)S", "I", "", "(SCFFF)B" };
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter18, strArray27, typeArray40);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("S", "L373083987");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = classEmitter15.getSuperType();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.end_class();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = type2.toString();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(158, type2);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type19.getDimensions();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L373083987", "(FCFFB)F", "(FCFFB)F");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        int int14 = type1.getSort();
        boolean boolean16 = type1.equals((java.lang.Object) 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = classEmitter22.getAccess();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("float", "", "(FCFFB)F");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(10, type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter1.visitField(0, "L373083987", "S", "(FCFFB)B", (java.lang.Object) type9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray3 = new java.lang.String[] { "F" };
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(3, type18);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type36, typeArray45);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        java.lang.String str51 = type49.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        int int58 = type55.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type18, type33, type49, type52, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray3, typeArray59);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("S", "I", "byte");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("", "I", "C");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        boolean boolean32 = type29.equals((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter21.visitField((int) (byte) 100, "C", "C", "C", (java.lang.Object) type29);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.String[] strArray27 = new java.lang.String[] { "C", "" };
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type34, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type31, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type29, typeArray40);
        java.lang.String str43 = type29.toString();
        int int44 = type29.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type49, type51, type52, type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type48, typeArray57);
        org.mockito.asm.Type[] typeArray59 = signature58.getArgumentTypes();
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter21, strArray27, typeArray59);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = classEmitter15.getSuperType();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = type1.toString();
        int int16 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitOuterClass("I", "C", "(FF)B");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "C" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(124, 0, "(FF)B", "L1625180428", "(FCFFB)B", strArray10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.declare_field((int) (byte) -1, "(SCFFF)B", type28, (java.lang.Object) type30);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = classEmitter18.getAccess();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("L1625180428", "", "CF", 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("", false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("", true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        java.lang.String str41 = type27.toString();
        int int42 = type27.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type46, typeArray55);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor60 = classEmitter21.visitField(126, "L373083987", "I", "L373083987", (java.lang.Object) typeArray57);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type0.getElementType();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("(FF)B", "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        int int16 = type13.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type13 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(10, 104, "L1712303363", type8, typeArray17, "CF");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.Object obj26 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter21.visitField(130, "L562166258", "CF", "(FF)B", obj26);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        int int14 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("CF", "(SCFFF)B");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.end_class();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("F", "hi!", "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("", "L562166258");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("I", "S");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(153, (-1), "S", type9, typeArray38, "I");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("(SCFFF)B", "CF");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter22.getStaticHook();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visitInnerClass("byte", "I", "L1625180428", 37);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("float", "byte");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L562166258", "S");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray28 = new java.lang.String[] { "(FCFFB)C", "(SCFFF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visit((int) (short) -1, (int) (byte) -1, "I", "", "(FCFFB)C", strArray28);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = classEmitter22.getAccess();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type48, type50, type51, type53, type55 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type47, typeArray56);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type45, typeArray56);
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(3, type45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.declare_field(3, "(FCFFB)S", type42, (java.lang.Object) 3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        java.lang.String[] strArray34 = new java.lang.String[] { "I", "L1625180428", "byte", "L562166258", "Lorg/mockito/cglib/core/ClassEmitter;", "(SCFFF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visit(156, 0, "L1625180428", "Lorg/mockito/cglib/core/ClassEmitter;", "(FCFFB)S", strArray34);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        int int8 = type7.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(3, type11);
        int int26 = local25.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 1, "L373083987", type7, (java.lang.Object) int26);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitSource("float", "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("org/mockito/cglib/core/ClassEmitter", "hi!");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("(FCFFB)C", "F");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "(FF)B", "L373083987", "L1712303363", "(FCFFB)F", "org/mockito/cglib/core/ClassEmitter", "L1625180428" };
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 0L;
        java.lang.Object obj18 = new java.lang.Object();
        label15.info = obj18;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type21, typeArray32);
        label15.info = typeArray32;
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type13, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray11, typeArray32);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("byte", false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(10, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "C", "Lorg/mockito/cglib/core/ClassEmitter;", "(FCFFB)C", "char", "F", "(FF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit((int) (byte) 10, 9, "(FCFFB)F", "(FCFFB)F", "float", strArray16);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitEnd();
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        int int14 = type1.getSort();
        boolean boolean16 = type1.equals((java.lang.Object) 1.0d);
        int int17 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type1.getElementType();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitEnd();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("J", "(FCFFB)S");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = classEmitter21.getAccess();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type61 = classEmitter17.getClassType();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("L562166258", "byte");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter8.visitAnnotation("L373083987", false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L373083987", "(FCFFB)C", "(SCFFF)B", (int) (short) 10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.end_class();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type44, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type41, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type39, typeArray50);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter30.begin_class(124, 100, "double", type34, typeArray50, "(FCFFB)S");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("byte", "(FCFFB)C");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("double", "J", "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter0.getClassType();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitEnd();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        int int56 = type53.getOpcode((int) '#');
        int int57 = type53.getSize();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters61 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("C", "(FCFFB)B", "float");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.declare_field(154, "F", type53, (java.lang.Object) "(FCFFB)B");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitInnerClass("L1625180428", "(FCFFB)S", "", 154);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("hi!", "char", "L1625180428", (int) (short) 1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = classEmitter18.getClassType();
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("(FF)B", "F", "byte");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classEmitter22.visitAnnotation("CF", false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.getStaticHook();
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1625180428", "L2095563894", "(FCFFB)S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(156, 7, "L1712303363", "C", "org/mockito/cglib/core/ClassEmitter", strArray13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(FCFFB)C", true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        int int32 = type29.getOpcode((int) '#');
        java.lang.String str33 = type29.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type53, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type50, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type48, typeArray59);
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(3, type48);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str64 = type63.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str68 = type67.getDescriptor();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str71 = type70.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type67, type69, type70, type72, type74 };
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("", type66, typeArray75);
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray77);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str80 = type79.getDescriptor();
        java.lang.String str81 = type79.getDescriptor();
        org.mockito.asm.Type type82 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean84 = type82.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str86 = type85.getDescriptor();
        int int88 = type85.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] { type48, type63, type79, type82, type85 };
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray89);
        boolean boolean91 = type29.equals((java.lang.Object) str90);
        org.mockito.cglib.core.Signature signature94 = new org.mockito.cglib.core.Signature("S", "(FCFFB)B");
        org.mockito.asm.Type[] typeArray95 = signature94.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.begin_class((int) (short) 10, 153, "L2095563894", type29, typeArray95, "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitOuterClass("char", "byte", "(FF)B");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "(SCFFF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(100, 9, "byte", "L1625180428", "(FCFFB)S", strArray12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter3.visitAnnotation("J", true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitOuterClass("(FCFFB)C", "C", "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        java.lang.String[] strArray63 = new java.lang.String[] { "B", "L373083987" };
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str69 = type68.getDescriptor();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.getDescriptor();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str74 = type73.getDescriptor();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray76 = new org.mockito.asm.Type[] { type68, type70, type71, type73, type75 };
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("", type67, typeArray76);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("", type65, typeArray76);
        java.lang.String str79 = type65.toString();
        int int80 = type65.getSize();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str82 = type81.toString();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str86 = type85.getDescriptor();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type88 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str89 = type88.getDescriptor();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str91 = type90.getDescriptor();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray93 = new org.mockito.asm.Type[] { type85, type87, type88, type90, type92 };
        org.mockito.cglib.core.Signature signature94 = new org.mockito.cglib.core.Signature("", type84, typeArray93);
        org.mockito.asm.Type[] typeArray95 = signature94.getArgumentTypes();
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type81, typeArray95);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.EmitUtils.add_properties(classEmitter17, strArray63, typeArray95);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1712303363", "Lorg/mockito/cglib/core/ClassEmitter;", "CF", (int) '#');
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type35, typeArray46);
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(3, type35);
        org.mockito.asm.Type type50 = local49.getType();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type52, typeArray63);
        java.lang.String str66 = type52.toString();
        int int67 = type52.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type72, type74, type75, type77, type79 };
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type71, typeArray80);
        org.mockito.asm.Type[] typeArray82 = signature81.getArgumentTypes();
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.begin_class(4, (int) (short) 100, "double", type50, typeArray82, "char");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        java.lang.String[] strArray58 = new java.lang.String[] { "float", "(FCFFB)S", "float", "(FCFFB)F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter41.visit(155, 158, "L1281328698", "org/mockito/cglib/core/ClassEmitter", "L562166258", strArray58);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classEmitter15.visitAnnotation("byte", false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type24, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type22, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 1, 112, "I", type4, typeArray33, "L2095563894");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = classEmitter24.getAccess();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitOuterClass("hi!", "L373083987", "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitInnerClass("F", "B", "L562166258", 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("S", "L1712303363");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitInnerClass("J", "L1281328698", "float", 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("L1281328698", "L1281328698");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getSuperType();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode((int) '#');
        int int5 = type1.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(112, type1);
        java.lang.String str7 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "L223061573" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 100, (int) '#', "L1733337266", "LL373083987;", "L223061573", strArray9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        java.lang.String str24 = type10.toString();
        int int25 = type10.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) (short) 0, 10, "L562166258", type8, typeArray40, "LL373083987;");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.Object obj6 = new java.lang.Object();
        label3.info = obj6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        label3.info = typeArray20;
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type1, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("L562166258", type8, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(124, "F", type6, (java.lang.Object) signature26);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getSuperType();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitOuterClass("S", "F", "LS;");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type0.getDimensions();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        int int41 = type29.getOpcode((int) (short) -1);
        int int42 = type29.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor43 = classEmitter22.visitField(156, "L223061573", "J", "hi!", (java.lang.Object) int42);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) '#');
        java.lang.String str4 = type0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type24, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type19, typeArray30);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(3, type19);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        java.lang.String str52 = type50.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        int int59 = type56.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type19, type34, type50, type53, type56 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray60);
        boolean boolean62 = type0.equals((java.lang.Object) str61);
        java.lang.String str63 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type64 = type0.getElementType();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("byte", "B", "(FCFFB)C");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitEnd();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(8, "", type8, (java.lang.Object) "(SCFFF)B");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        java.lang.String[] strArray32 = new java.lang.String[] { "(SCFFF)B", "(FCFFB)F", "Lorg/mockito/cglib/core/ClassEmitter;", "F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visit(9, 116, "LS;", "(FF)B", "S", strArray32);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitInnerClass("L22988295", "(FCFFB)C", "F", (int) (byte) 1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = signature14.getDescriptor();
        java.lang.String str16 = signature14.getName();
        org.mockito.asm.Type type17 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField(5, "L223061573", "LL373083987;", "L1281328698", (java.lang.Object) "(FF)B");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type36, typeArray45);
        int int48 = type36.getOpcode((int) (short) -1);
        boolean boolean50 = type36.equals((java.lang.Object) "J");
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type52, typeArray63);
        java.lang.String str66 = type52.toString();
        int int67 = type52.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type72, type74, type75, type77, type79 };
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type71, typeArray80);
        org.mockito.asm.Type[] typeArray82 = signature81.getArgumentTypes();
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.begin_class(104, (int) (short) -1, "(FCFFB)C", type36, typeArray82, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean13 = type7.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitOuterClass("Lorg/mockito/cglib/core/ClassEmitter;", "double", "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.end_class();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("float", "float", "byte", 5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        java.lang.String str15 = type1.toString();
        int int16 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("L223061573", "I", "L373083987");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("float", false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("B", "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitEnd();
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("I", true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor60 = classEmitter46.visitField((int) (byte) 0, "(FF)B", "S", "L2095563894", (java.lang.Object) "L22988295");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitOuterClass("C", "org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1733337266", "B", "LS;");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = classEmitter17.getSuperType();
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode((int) '#');
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type9, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type7, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type1, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type1.getElementType();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        boolean boolean15 = type1.equals((java.lang.Object) "J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = type2.toString();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(158, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type2.getDimensions();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classAdapter23.visitAnnotation("(FCFFB)S", false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("I", false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("org/mockito/cglib/core/ClassEmitter", "(FCFFB)F", "(FCFFB)C", 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("C", true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitOuterClass("", "L664573880", "CF");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = classEmitter15.getSuperType();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classEmitter15.visitAnnotation("double", false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        java.lang.String str13 = signature11.getDescriptor();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        int int16 = type14.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type14.getDimensions();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter8.getSuperType();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("L562166258", "CF");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        int int35 = type32.getOpcode((int) '#');
        java.lang.String str36 = type32.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type38, typeArray47);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str60 = type59.getDescriptor();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type54, type56, type57, type59, type61 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("", type53, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type51, typeArray62);
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(3, type51);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str67 = type66.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str71 = type70.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str74 = type73.getDescriptor();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type70, type72, type73, type75, type77 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("", type69, typeArray78);
        org.mockito.asm.Type[] typeArray80 = signature79.getArgumentTypes();
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray80);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str83 = type82.getDescriptor();
        java.lang.String str84 = type82.getDescriptor();
        org.mockito.asm.Type type85 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean87 = type85.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type88 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str89 = type88.getDescriptor();
        int int91 = type88.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray92 = new org.mockito.asm.Type[] { type51, type66, type82, type85, type88 };
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray92);
        boolean boolean94 = type32.equals((java.lang.Object) str93);
        java.lang.String str95 = type32.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor96 = classEmitter15.visitField(10, "char", "LL373083987;", "(FF)B", (java.lang.Object) str95);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitEnd();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        int int7 = type4.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type1, type4 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        int int13 = type10.getOpcode((int) '#');
        java.lang.String str14 = type10.toString();
        boolean boolean15 = type0.equals((java.lang.Object) str14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        boolean boolean18 = type0.equals((java.lang.Object) "(SCFFF)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        java.lang.String str37 = signature35.getDescriptor();
        org.mockito.asm.Type type38 = signature35.getReturnType();
        int int40 = type38.getOpcode(6);
        int int42 = type38.getOpcode(154);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        int int45 = type44.getSort();
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        label46.info = 0L;
        java.lang.Object obj49 = new java.lang.Object();
        label46.info = obj49;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type52, typeArray63);
        label46.info = typeArray63;
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type44, typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.begin_class(0, 106, "L1171780420", type38, typeArray63, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = classEmitter21.getClassType();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("B", "S(FCFFB)B");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("LS;", "C", "org/mockito/asm/Type", 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L562166258", "L1281328698", "double", 5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "L1712303363");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = classEmitter30.getAccess();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitInnerClass("(FCFFB)J", "", "(FF)B", 156);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        int int13 = type1.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L22988295", "Lorg/mockito/cglib/core/ClassEmitter;", "B");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("(FCFFB)S", "L373083987");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type0.getElementType();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("byte", "S(FCFFB)B", "LL373083987;");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        java.lang.String str35 = type33.getDescriptor();
        int int36 = type33.getSize();
        org.mockito.asm.Type[] typeArray38 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.begin_class((int) '#', (int) (byte) 0, "byte", type33, typeArray38, "byte");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.end_class();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter46.visitInnerClass("L1496216980", "(FCFFB)J", "L562166258", (int) (byte) -1);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getClassType();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classAdapter32.visitAnnotation("S(FCFFB)B", false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitInnerClass("L1281328698", "LL373083987;", "L373083987", (int) (byte) 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visitInnerClass("L2095563894", "hi!", "L1171780420", (int) (byte) 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("S", "J");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "S");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitOuterClass("(FF)B", "(FCFFB)S", "char");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        java.lang.String str19 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type0.getInternalName();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1733337266", "I", "L(FF)B;", "LL373083987;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(130, 96, "(FCFFB)J", "L1733337266", "L1281328698", strArray15);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("(SCFFF)B", "L562166258");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classEmitter26.visitAnnotation("(SCFFF)B", false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter22.getStaticHook();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visitInnerClass("S(FCFFB)B", "L1712303363", "L223061573", 8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("char", "L373083987", "hi!", 4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("L150467656", "(FCFFB)C");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("(FF)B", "(FCFFB)F", "LS;");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        java.lang.String[] strArray57 = new java.lang.String[] { "L975948501", "org/mockito/asm/Type", "(SCFFF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter41.visit(116, 2, "L1508318732", "L1733337266", "(FCFFB)B", strArray57);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor36 = classEmitter17.visitField((int) (short) -1, "L1733337266", "LL373083987;", "L2095563894", (java.lang.Object) 156);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("char", "L223061573");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitEnd();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.end_class();
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter30 = classEmitter26.getStaticHook();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        boolean boolean33 = type0.equals((java.lang.Object) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitEnd();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitInnerClass("(FCFFB)B", "L(FF)B;", "LS;", (int) 'a');
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter4.getAccess();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter58.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type63 = classEmitter58.getClassType();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classEmitter21.visitAnnotation("(FCFFB)B", false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("", "Lorg/mockito/cglib/core/ClassEmitter;", "L373083987");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitOuterClass("LS;", "byte", "J");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter0.getAccess();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter30.visitSource("(SCFFF)Lorg/mockito/cglib/core/ClassEmitter;", "char");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter47.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter57);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitOuterClass("", "float", "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("I", "B", "(FCFFB)S", 153);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("L664573880", "(SCFFF)B", "S");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitSource("(FCFFB)B", "double");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("J", "(FCFFB)C", "I", 37);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(FCFFB)F", "(FF)B");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("L975948501", "L373083987", "F", 108);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        int int42 = type39.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type36, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor45 = classEmitter30.visitField(124, "LS;", "(SCFFF)Lorg/mockito/cglib/core/ClassEmitter;", "L22988295", (java.lang.Object) type35);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1281328698", "L1496216980");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("C", "C", "L975948501", (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type9, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type7, typeArray18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        boolean boolean23 = type7.equals((java.lang.Object) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type35, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type32, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type30, typeArray41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        boolean boolean46 = type30.equals((java.lang.Object) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        int int14 = type2.getOpcode((int) (short) -1);
        int int15 = type2.getSort();
        boolean boolean17 = type2.equals((java.lang.Object) 1.0d);
        int int18 = type2.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type20, typeArray31);
        java.lang.String str34 = type20.toString();
        int int35 = type20.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type40, type42, type43, type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type39, typeArray48);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray50);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("S", type2, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = type2.getInternalName();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitEnd();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = classEmitter30.getSuperType();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter30.visitSource("L1625180428", "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = classEmitter15.getSuperType();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitInnerClass("L22988295", "L1171780420", "(SCFFF)B", 155);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getReturnType("C");
        int int55 = type54.getSort();
        java.lang.String str56 = type54.getClassName();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str65 = type64.getDescriptor();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str67 = type66.getDescriptor();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type61, type63, type64, type66, type68 };
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type60, typeArray69);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("", type58, typeArray69);
        java.lang.String str72 = signature71.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.declare_field(106, "byte", type54, (java.lang.Object) signature71);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitSource("double", "char");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitInnerClass("LL373083987;", "org/mockito/cglib/core/ClassEmitter", "L1625180428", 157);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitOuterClass("(SCFFF)Lorg/mockito/cglib/core/ClassEmitter;", "LS;", "hi!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        boolean boolean40 = type24.equals((java.lang.Object) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitSource("L1644759323", "L1644759323");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = classEmitter19.getClassType();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter41.visitOuterClass("L433669736", "", "F");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classEmitter22.visitAnnotation("L2095563894", false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classEmitter15.visitAnnotation("(FCFFB)F", false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = classEmitter22.getAccess();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str36 = signature35.toString();
        java.lang.String str37 = signature35.getDescriptor();
        java.lang.String str38 = signature35.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor39 = classEmitter26.visitField((int) (byte) 10, "org/mockito/asm/Type", "C", "F", (java.lang.Object) str38);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitOuterClass("hi!", "L(FF)B;", "(FCFFB)Z");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L2095563894", "LS;", "(FCFFB)C", 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("(FF)B", "L373083987");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("LS;", "L2095563894", "L562166258", 52);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter0.getAccess();
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 10L);
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type5.equals((java.lang.Object) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean25 = type0.equals((java.lang.Object) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.end_class();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter25.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitSource("I", "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(10, type13);
        int int15 = local14.getIndex();
        org.mockito.asm.Type type16 = local14.getType();
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type40, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type38, typeArray49);
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local(3, type38);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str54 = type53.toString();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type59, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type56, typeArray65);
        org.mockito.asm.Type[] typeArray67 = signature66.getArgumentTypes();
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str70 = type69.getDescriptor();
        java.lang.String str71 = type69.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean74 = type72.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        int int78 = type75.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type38, type53, type69, type72, type75 };
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray79);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("I", type23, typeArray79);
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("L1281328698", type19, typeArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.begin_class((int) (byte) 10, (-1), "(FCFFB)B", type16, typeArray79, "L1712303363");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = signature40.getDescriptor();
        org.mockito.asm.Type type43 = signature40.getReturnType();
        int int45 = type43.getOpcode(6);
        org.mockito.asm.Type[] typeArray47 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.begin_class(153, 6, "C", type43, typeArray47, "F");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter28.visitSource("short", "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classAdapter53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter53.visitSource("L(FF)B;", "S");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("", false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter18.visitField((int) '4', "B", "(SCFFF)Lorg/mockito/cglib/core/ClassEmitter;", "(SCFFF)B", (java.lang.Object) 'a');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(5, (int) (short) -1, "J", type29, typeArray33, "L22988295");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("L(FF)B;", "B", "L1508318732", 7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitInnerClass("(FCFFB)S", "byte", "L664573880", (int) (short) 100);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(FCFFB)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L(FF)B;", "(FF)B", "L22988295");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter23.visitInnerClass("L223061573", "hi!", "S", 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("L373083987");
        java.lang.String str16 = type15.getDescriptor();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type24, typeArray33);
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("char", type22, typeArray35);
        boolean boolean37 = type15.equals((java.lang.Object) typeArray35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type44, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type41, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type39, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class((int) (short) -1, 52, "org/mockito/cglib/core/ClassEmitter", type15, typeArray50, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("L1644759323", "L1508318732", "org/mockito/asm/Type");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter58.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter58.visitEnd();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 0L;
        java.lang.Object obj5 = new java.lang.Object();
        label2.info = obj5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        label2.info = typeArray19;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type24, typeArray35);
        java.lang.String str38 = type24.toString();
        int int39 = type24.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type44, type46, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type43, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray54);
        label2.info = str56;
        java.lang.Object obj58 = label2.info;
        java.lang.Object obj59 = label2.info;
        boolean boolean60 = type0.equals((java.lang.Object) label2);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str66 = type65.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str69 = type68.getDescriptor();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str71 = type70.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type65, type67, type68, type70, type72 };
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("", type64, typeArray73);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("", type62, typeArray73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter76.getClassInfo();
        boolean boolean78 = type62.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter80 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo85 = classEmitter84.getClassInfo();
        classEmitter83.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.asm.ClassAdapter classAdapter87 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter83);
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter83);
        label2.info = classEmitter83;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type91 = classEmitter83.getClassType();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type14, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type12, typeArray23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        boolean boolean28 = type12.equals((java.lang.Object) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter26.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter36);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type47, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type44, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type42, typeArray53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter56.getClassInfo();
        boolean boolean58 = type42.equals((java.lang.Object) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter56.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.asm.ClassAdapter classAdapter67 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter66);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classAdapter67);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classAdapter67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor70 = classEmitter0.visitField(2, "L664573880", "LS;", "L1752781006", (java.lang.Object) classAdapter67);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        int int33 = type31.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.asm.Type[] typeArray65 = signature64.getArgumentTypes();
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray65);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.declare_field(156, "L(FF)B;", type31, (java.lang.Object) str68);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("I");
        int int31 = type30.getSort();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label32.info = 0L;
        java.lang.Object obj35 = new java.lang.Object();
        label32.info = obj35;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type40, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type38, typeArray49);
        label32.info = typeArray49;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.begin_class(126, 0, "LL373083987;", type30, typeArray49, "L975948501");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("(FCFFB)C", false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("(FCFFB)Lorg/mockito/cglib/core/Signature;", "LS;", "(FCFFB)C", (int) (byte) 1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(SCFFF)B", "L1171780420", "(FCFFB)B", 8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("(FCFFB)Lorg/mockito/cglib/core/Signature;", false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter30.visitEnd();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type1.getDimensions();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        int int3 = type1.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.end_class();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("byte", true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.visitEnd();
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter1.getAccess();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classAdapter9.visitAnnotation("J", false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type5, type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type1, typeArray10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type16, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type14, typeArray25);
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(3, type14);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type35, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type32, typeArray41);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        java.lang.String str47 = type45.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean50 = type48.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        int int54 = type51.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type14, type29, type45, type48, type51 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray55);
        java.lang.String str57 = type1.getClassName();
        org.mockito.asm.Type[] typeArray59 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)C");
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = type1.getInternalName();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L433669736", "L547582272");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("S", "L223061573", "F", (int) (byte) -1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 0L;
        java.lang.Object obj19 = new java.lang.Object();
        label16.info = obj19;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type24, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type22, typeArray33);
        label16.info = typeArray33;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type40, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type38, typeArray49);
        java.lang.String str52 = type38.toString();
        int int53 = type38.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str55 = type54.toString();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type58, type60, type61, type63, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type57, typeArray66);
        org.mockito.asm.Type[] typeArray68 = signature67.getArgumentTypes();
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray68);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray68);
        label16.info = str70;
        boolean boolean72 = type15.equals((java.lang.Object) label16);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str81 = type80.getDescriptor();
        org.mockito.asm.Type type82 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str83 = type82.getDescriptor();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type77, type79, type80, type82, type84 };
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("", type76, typeArray85);
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("", type74, typeArray85);
        java.lang.String str88 = signature87.getDescriptor();
        org.mockito.asm.Type[] typeArray89 = signature87.getArgumentTypes();
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str91 = type15.getInternalName();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitOuterClass("LS;", "(FF)B", "char");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1496216980", true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.end_class();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)F");
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type1, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("L137419711", "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label1.info = 0L;
        java.lang.Object obj4 = new java.lang.Object();
        label1.info = obj4;
        java.lang.Object obj6 = label1.info;
        boolean boolean7 = type0.equals(obj6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter32.visitOuterClass("L2093356516", "L223061573", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = classEmitter8.getAccess();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("Lorg/mockito/asm/Type;", "(FCFFB)B");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitOuterClass("F", "L(FF)B;", "");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("L2093356516", "L562166258");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitInnerClass("double", "S(FCFFB)B", "Lorg/mockito/cglib/core/ClassEmitter;", 124);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("I", "J", "char", 4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitOuterClass("L975948501", "L2095563894", "L150467656");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitInnerClass("org/mockito/cglib/core/ClassEmitter", "(SCFFF)B", "F", 52);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        java.lang.Object obj5 = label0.info;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        label0.info = typeArray16;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.String str21 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        label0.info = classEmitter22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter22.getStaticHook();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(FCFFB)C");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(10, type2);
        java.lang.String str4 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type2.getElementType();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.String[] strArray37 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "I", "L1049714881", "L547582272", "L2112694640" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visit(154, 2, "L1752781006", "L753038850", "(FCFFB)J", strArray37);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = classEmitter15.getClassType();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getSuperType();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("LS;", "F", "L975948501", 132);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter26.visitEnd();
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter0.visitAnnotation("", false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter41.visitEnd();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = classEmitter22.getAccess();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitEnd();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("L373083987", "L1496216980", "L753038850");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 10L);
        int int37 = type34.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type44, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type41, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type39, typeArray50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        boolean boolean55 = type39.equals((java.lang.Object) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter61.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        boolean boolean67 = type34.equals((java.lang.Object) classEmitter60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter17.declare_field((int) (short) 0, "double", type32, (java.lang.Object) type34);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type0.getDimensions();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.Class<?> wildcardClass10 = classEmitter6.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(100, type13);
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type24, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type19, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(36, (int) 'a', "(FCFFB)F", type13, typeArray30, "L137419711");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitSource("L223061573", "L562166258");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean13 = type7.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("L433669736", "B", "L664573880", 37);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitEnd();
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        boolean boolean49 = type33.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter53.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter58.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type63 = classEmitter58.getSuperType();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter32.visitOuterClass("L1712303363", "L22988295", "L224759702");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type27.equals((java.lang.Object) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter41.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = classEmitter41.getAccess();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("(FCFFB)S", "Lorg/mockito/cglib/core/Signature;", "L2095563894");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class<?> wildcardClass4 = classEmitter0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean13 = type7.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = classEmitter12.getAccess();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("L(FF)B;", "L2112694640");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L1171780420", false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(FCFFB)F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classAdapter6.visitAnnotation("Lorg/mockito/cglib/core/ClassEmitter;", false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitInnerClass("L547582272", "Lorg/mockito/cglib/core/ClassEmitter;", "L1752781006", 0);
    }
}


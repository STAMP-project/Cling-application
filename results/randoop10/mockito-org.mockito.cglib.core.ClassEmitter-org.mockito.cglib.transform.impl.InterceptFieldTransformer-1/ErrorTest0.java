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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(10, 1, "hi!", "hi!", "hi!", strArray11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("hi!", "hi!", "hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
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
        classEmitter0.end_class();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(FFLjava/lang/Object;)I", "", "(FFLjava/lang/Object;)I", (int) (short) 10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("(FFLjava/lang/Object;)I", true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray8 = new java.lang.String[] { "(FFLjava/lang/Object;)I", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(1, (int) (byte) 100, "", "hi!", "hi!", strArray8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 10, (int) (short) -1, "hi!", "(FFLjava/lang/Object;)I", "hi!", strArray6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("hi!", "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("hi!", "Ljava/lang/Object;", "Ljava/lang/Object;", (int) (short) 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("", "(C)C", "(FFLjava/lang/Object;)I");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("(C)C", "Ljava/lang/Object;", "hi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (short) 10, "Ljava/lang/Object;", type4, (java.lang.Object) 158);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(FFLjava/lang/Object;)I", "", "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Ljava/lang/Object;", "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Ljava/lang/Object;", "(FFLjava/lang/Object;)I", "(C)C", 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("", "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "(C)C", "I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) 'a', 8, "Ljava/lang/Object;", "hi!", "hi!", strArray9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitOuterClass("float", "(C)C", "Ljava/lang/Object;");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type1.getInternalName();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray9 = new java.lang.String[] { "(FFLjava/lang/Object;)I", "(ILjava/lang/Object;IF)C", "(FFLjava/lang/Object;)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 100, 9, "java/lang/Object", "", "float", strArray9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitEnd();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "C", "(ILjava/lang/Object;IF)B", "hi!", "C" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 100, 158, "float", "(C)C", "", strArray12);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(ILjava/lang/Object;IF)D", "(ILjava/lang/Object;IF)B", "C");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(C)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (byte) 10, "(ILjava/lang/Object;IF)B", "I", "C", (java.lang.Object) type8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "C", "(C)C");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type2, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type2, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitEnd();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "(ILjava/lang/Object;IF)C", "(FFLjava/lang/Object;)I", "(FFLjava/lang/Object;)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) -1, 100, "float", "(ILjava/lang/Object;IF)D", "(ILjava/lang/Object;IF)C", strArray12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Ljava/lang/Object;", "(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) (short) -1, (int) (byte) 1, "ILjava/lang/Object", "ILjava/lang/Object", "(FFLjava/lang/Object;)I", strArray7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        int int13 = type9.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter3.visitField((int) '#', "", "(FFLjava/lang/Object;)I", "(C)C", (java.lang.Object) type9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(ILjava/lang/Object;IF)C", "Ljava/lang/Object;", "float(ILjava/lang/Object;IF)I");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)B", "F", (int) (short) 100);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitOuterClass("hi!", "(ILjava/lang/Object;IF)D", "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitOuterClass("F", "java/lang/Object", "(C)C");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getClassType();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitOuterClass("float", "(ILjava/lang/Object;IF)B", "C");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitEnd();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "float", "int" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(96, 116, "C", "", "LILjava/lang/Object;", strArray12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("java/lang/Object", "C");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("C", "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(ILjava/lang/Object;IF)J", "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("int", "Ljava/lang/Object;");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("ILjava/lang/Object", "Ljava/lang/Object;", "hi!(ILjava/lang/Object;IF)B", 96);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "float(ILjava/lang/Object;IF)I", "V", "Ljava/lang/Object;", "Ljava/lang/Object;", "", "(FFLjava/lang/Object;)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit(104, 99, "C", "hi!", "(ILjava/lang/Object;IF)D", strArray14);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter0.getSuperType();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type2, type3, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str9 = type1.getClassName();
        java.lang.String str10 = type1.toString();
        boolean boolean11 = type0.equals((java.lang.Object) str10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)D", "(FFLjava/lang/Object;)I");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "V", "B", "Lorg/mockito/asm/Type;", "Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, 100, "I", "(ILjava/lang/Object;IF)B", "C", strArray13);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("java/lang/Object", "hi!(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(128, (int) 'a', "float", "(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)C", strArray10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("Lorg/mockito/asm/Type;", "hi!(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(3, "int", type7, (java.lang.Object) 158);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "F", "Lorg/mockito/asm/Type;", "Ljava/lang/Object;", "float", "F", "float" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(104, (int) '4', "I", "(C)C", "java/lang/Object", strArray16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(C)C", "float(ILjava/lang/Object;IF)I", "(ILjava/lang/Object;IF)D", (int) '4');
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ILjava/lang/Object;IF)C", "int", "C", 158);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitSource("(FFLjava/lang/Object;)I", "ILjava/lang/Object");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)C");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type21.getElementType();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("(ILjava/lang/Object;IF)D", true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField(126, "LILjava/lang/Object;", "(ILjava/lang/Object;IF)J", "Ljava/lang/Object;", (java.lang.Object) type7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
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
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("B", "F", "(ILjava/lang/Object;IF)J");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "float(ILjava/lang/Object;IF)I", "I", "(ILjava/lang/Object;IF)C", "ILjava/lang/Object", "(ILjava/lang/Object;IF)D", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(126, 4, "(ILjava/lang/Object;IF)J", "float", "F", strArray14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.getName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        java.lang.String str39 = signature38.getDescriptor();
        java.lang.String str40 = signature38.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = signature38.getArgumentTypes();
        org.mockito.asm.Type type42 = signature38.getReturnType();
        boolean boolean43 = signature17.equals((java.lang.Object) signature38);
        org.mockito.asm.Type type44 = signature38.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type44.getInternalName();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("(FFLjava/lang/Object;)I", true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("V", true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("(ILjava/lang/Object;IF)D", true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("V", "(ILjava/lang/Object;IF)I");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getSuperType();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter0.visitField(158, "float", "Lorg/mockito/asm/Type;", "", (java.lang.Object) classEmitter13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int9 = type8.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("float", type11, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(3, (-1), "float", type8, typeArray26, "B");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type2, type3, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str9 = type1.getClassName();
        java.lang.String str10 = type1.toString();
        boolean boolean11 = type0.equals((java.lang.Object) str10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("", "char", "I");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField((int) (byte) 1, "(ILjava/lang/Object;IF)B", "Lorg/mockito/asm/Type;", "", (java.lang.Object) type5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "int", "java/lang/Object");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        int int7 = type3.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type12, type13, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("float", type1, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type1.getInternalName();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Ljava/lang/Object;");
        int int8 = type7.getSort();
        java.lang.String str9 = type7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 100, 108, "(ILjava/lang/Object;IF)J", type7, typeArray25, "(ILjava/lang/Object;IF)D");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Ljava/lang/Object;", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("", true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("float", "ILjava/lang/Object", "byte");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((-1), "Lorg/mockito/asm/Type;", "F", "(ILjava/lang/Object;IF)I", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("float", type11, typeArray26);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray36);
        int int38 = type34.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type40, type43, type44, type46 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray47);
        java.lang.String str50 = signature49.getDescriptor();
        java.lang.String str51 = signature49.getDescriptor();
        java.lang.String str52 = signature49.toString();
        org.mockito.asm.Type[] typeArray53 = signature49.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(4, (int) (short) -1, "(ILjava/lang/Object;IF)D", type8, typeArray53, "(ILjava/lang/Object;IF)D");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(0, (int) (byte) 0, "void", "java/lang/Object", "(ILjava/lang/Object;IF)C", strArray10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter0.visitField(6, "hi!(ILjava/lang/Object;IF)B", "ILjava/lang/Object", "(FFLjava/lang/Object;)I", (java.lang.Object) typeArray11);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray9);
        int int11 = type7.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type13, type16, type17, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        java.lang.String str23 = signature22.getDescriptor();
        java.lang.String str24 = signature22.getDescriptor();
        org.mockito.asm.Type[] typeArray25 = signature22.getArgumentTypes();
        org.mockito.asm.Type type26 = signature22.getReturnType();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean28 = signature22.equals((java.lang.Object) type27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray34);
        int int36 = type32.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type38, type41, type42, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray45);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("float", type30, typeArray45);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) (byte) 10, "char", type27, (java.lang.Object) typeArray49);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("char", "(ILjava/lang/Object;IF)D", "F");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getClassType();
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter5.visitField(157, "LILjava/lang/Object;", "hi!(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)I", (java.lang.Object) classEmitter10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        int int12 = type8.getSize();
        java.lang.String str13 = type8.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("float", type15, typeArray30);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class((int) (short) 10, 132, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", type8, typeArray34, "(ILjava/lang/Object;IF)C");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter0.visitField(5, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "I", "F", (java.lang.Object) type9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("ILjava/lang/Object", "C", "(ILjava/lang/Object;IF)J", (int) '#');
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("F", "(C)C");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("float", "C", "void");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "(ILjava/lang/Object;IF)B", "void");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("(ILjava/lang/Object;IF)B", "(FFLjava/lang/Object;)I", "long");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter5.visitField(160, "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)D", "(ILjava/lang/Object;IF)I", (java.lang.Object) "hi!(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitEnd();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(FFLjava/lang/Object;)I", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter5.getAccess();
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("ILjava/lang/Object", "ILjava.lang.Object");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "java/lang/Object", "(ILjava/lang/Object;IF)C", "int" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((int) (short) 100, 132, "", "float", "(C)C", strArray16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!(ILjava/lang/Object;IF)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter3.getAccess();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "B", "(C)C", "Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(160, 158, "hi!(ILjava/lang/Object;IF)B", "B", "I", strArray12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("void", false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        int int12 = type8.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (short) 100, "hi!", "ILjava/lang/Object", "long", (java.lang.Object) str8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray9);
        int int11 = type7.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type13, type16, type17, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray20);
        java.lang.String str23 = signature22.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter0.visitField(132, "LILjava/lang/Object;", "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", (java.lang.Object) signature22);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitOuterClass("float(ILjava/lang/Object;IF)I", "hi!", "ILjava.lang.Object");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor30 = classEmitter6.visitField((int) (short) 100, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "ILjava/lang/Object", "(FFLjava/lang/Object;)I", (java.lang.Object) str29);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("(ILjava/lang/Object;IF)D", false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("Lorg/mockito/asm/Type;", "org/mockito/cglib/core/Signature", "float(ILjava/lang/Object;IF)I", (int) (byte) 100);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "byte" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(153, 126, "(ILjava/lang/Object;IF)C", "Lorg/mockito/asm/Type;", "V", strArray8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("org/mockito/asm/Type", "(ILjava/lang/Object;IF)B", "LILjava/lang/Object;");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("long", "hi!");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("I", true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("float", "(FFLjava/lang/Object;)I", "ILjava.lang.Object", 124);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("org/mockito/asm/Type", "V(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ILjava/lang/Object;IF)Ljava/lang/Object;", "B", "V", 161);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitOuterClass("(ILjava/lang/Object;IF)Ljava/lang/Object;", "org/mockito/asm/Type", "C");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 10, 157, "Lorg/mockito/asm/Type;", type10, typeArray26, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "byte", "float(ILjava/lang/Object;IF)I", "I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(156, 100, "F", "Lorg/mockito/asm/Type;", "float(ILjava/lang/Object;IF)I", strArray14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("int", false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("hi!", true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        int int18 = type14.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type20, type23, type24, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        java.lang.String str30 = signature29.getDescriptor();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        boolean boolean32 = type11.equals((java.lang.Object) type31);
        java.lang.String str33 = type11.getInternalName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray38);
        int int40 = type36.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str47 = type46.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type42, type45, type46, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray49);
        java.lang.String str52 = signature51.getDescriptor();
        java.lang.String str53 = signature51.getDescriptor();
        java.lang.String str54 = signature51.getName();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray59);
        int int61 = type57.getSize();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type63, type66, type67, type69 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("hi!", type56, typeArray70);
        java.lang.String str73 = signature72.getDescriptor();
        java.lang.String str74 = signature72.getDescriptor();
        org.mockito.asm.Type[] typeArray75 = signature72.getArgumentTypes();
        org.mockito.asm.Type type76 = signature72.getReturnType();
        boolean boolean77 = signature51.equals((java.lang.Object) signature72);
        org.mockito.asm.Type type78 = signature72.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) '4', "I", type11, (java.lang.Object) type78);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("", true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getClassType();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("(FFLjava/lang/Object;)I", true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("LILjava/lang/Object;", true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("(ILjava/lang/Object;IF)D", false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray15 = new java.lang.String[] { "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "(FFLjava/lang/Object;)I", "float(ILjava/lang/Object;IF)I", "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "ILjava.lang.Object" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (short) 100, 155, "org/mockito/cglib/core/Signature", "long", "(ILjava/lang/Object;IF)Ljava/lang/Object;", strArray15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter35.visitOuterClass("(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)J", "(ILjava/lang/Object;IF)D");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("org/mockito/asm/Type", "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("(C)C", false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int11 = type10.getSize();
        int int12 = type10.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int16 = type15.getSize();
        int int17 = type15.getSort();
        int int18 = type15.getDimensions();
        int int20 = type15.getOpcode(156);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        java.lang.String str39 = signature38.getDescriptor();
        java.lang.String str40 = signature38.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = signature38.getArgumentTypes();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type15, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (byte) 1, 7, "long", type10, typeArray41, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) (short) 10, 126, "(ILjava/lang/Object;IF)Ljava/lang/Object;", "hi!(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", strArray11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        java.lang.String[] strArray33 = new java.lang.String[] { "(ILjava/lang/Object;IF)Ljava/lang/Object;", "Lorg/mockito/cglib/core/Signature;", "(ILjava/lang/Object;IF)B", "float", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visit((int) (byte) 1, 0, "(ILjava/lang/Object;IF)B", "hi!(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)Ljava/lang/Object;", strArray33);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str30 = type29.getInternalName();
        int int31 = type29.getDimensions();
        java.lang.String str32 = type29.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter23.visitField((int) (byte) 10, "I", "I", "void", (java.lang.Object) str32);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitInnerClass("ILjava.lang.Object", "", "hi!", 12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("java.lang.Object", "byte", "V", 12);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("I", "(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = classEmitter23.getAccess();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type[] typeArray25 = signature17.getArgumentTypes();
        org.mockito.asm.Type type26 = signature17.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type26.getInternalName();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("(ILjava/lang/Object;IF)J", "java.lang.Object", "(FFLjava.lang.Object;)I");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Lorg/mockito/asm/Type;", "org/mockito/asm/Type");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        int int13 = type9.getSize();
        java.lang.String str14 = type9.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        int int17 = type16.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field((int) (byte) 1, "LILjava/lang/Object;", type9, (java.lang.Object) type16);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter4.getStaticHook();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str43 = type42.getInternalName();
        int int44 = type42.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray49);
        int int51 = type47.getSize();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str58 = type57.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type53, type56, type57, type59 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray60);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("hi!", type46, typeArray60);
        java.lang.String str63 = signature62.getDescriptor();
        java.lang.String str64 = signature62.getDescriptor();
        java.lang.String str65 = signature62.getName();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type69 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray70);
        int int72 = type68.getSize();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str79 = type78.toString();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type74, type77, type78, type80 };
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("hi!", type67, typeArray81);
        java.lang.String str84 = signature83.getDescriptor();
        java.lang.String str85 = signature83.getDescriptor();
        org.mockito.asm.Type[] typeArray86 = signature83.getArgumentTypes();
        org.mockito.asm.Type type87 = signature83.getReturnType();
        boolean boolean88 = signature62.equals((java.lang.Object) signature83);
        boolean boolean89 = type42.equals((java.lang.Object) boolean88);
        java.lang.String str90 = type42.getDescriptor();
        java.lang.Object obj91 = new java.lang.Object();
        java.lang.Class<?> wildcardClass92 = obj91.getClass();
        org.mockito.asm.Type type93 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass92);
        java.lang.String str94 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass92);
        java.lang.String str95 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass92);
        org.mockito.asm.Type type96 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.declare_field(0, "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", type42, (java.lang.Object) type96);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter4.getAccess();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = classEmitter23.getClassType();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "V", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)D" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(128, 4, "(ILjava/lang/Object;IF)I", "org/mockito/asm/Type", "Lorg/mockito/cglib/core/Signature;", strArray14);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int11 = type10.getSize();
        int int13 = type10.getOpcode(8);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        int int20 = type16.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type22, type25, type26, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray29);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.getDescriptor();
        java.lang.String str34 = signature31.toString();
        org.mockito.asm.Type[] typeArray35 = signature31.getArgumentTypes();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.asm.Type.getArgumentTypes("float(ILjava/lang/Object;IF)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(126, 2, "", type10, typeArray38, "float");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter4.visitAnnotation("(ILjava/lang/Object;IF)D", false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("ILjava.lang.Object", "void", "hi!(ILjava/lang/Object;IF)B", 130);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("(ILjava/lang/Object;IF)J", "float", "int", 158);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classEmitter5.visitAnnotation("long", false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitSource("LILjava/lang/Object;", "float");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type2, type3, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str9 = type1.getClassName();
        java.lang.String str10 = type1.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str29 = signature28.getDescriptor();
        java.lang.String str30 = signature28.getDescriptor();
        java.lang.String str31 = signature28.toString();
        org.mockito.asm.Type[] typeArray32 = signature28.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray37);
        int int39 = type35.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type41, type44, type45, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray53);
        int int55 = type51.getSize();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type57, type60, type61, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray64);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int68 = type1.getDimensions();
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter0.visitAnnotation("void", true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("", "(ILjava/lang/Object;IF)D", "float", 128);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str29 = signature28.getName();
        org.mockito.asm.Type type30 = signature28.getReturnType();
        java.lang.String str31 = type30.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor32 = classEmitter5.visitField(126, "B", "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)D", (java.lang.Object) str31);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("V", true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 155, "L(FFLjava/lang/Object;)I;", "Lorg/mockito/cglib/core/Signature;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", strArray7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        int int18 = type14.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type20, type23, type24, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray27);
        java.lang.String str30 = signature29.getDescriptor();
        java.lang.String str31 = signature29.getDescriptor();
        java.lang.String str32 = signature29.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter0.visitField((int) (byte) 100, "(ILjava/lang/Object;IF)I", "(ILjava/lang/Object;IF)LILjava/lang/Object;", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", (java.lang.Object) signature29);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getSuperType();
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.end_class();
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str7 = type6.getInternalName();
        java.lang.String str8 = type6.getDescriptor();
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("float(ILjava/lang/Object;IF)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("(ILjava/lang/Object;IF)C", type6, typeArray10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        int int8 = type4.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type13, type14, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "(ILjava/lang/Object;IF)C", "V", "java/lang/Object", "java.lang.Object", "(ILjava/lang/Object;IF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(0, (int) (short) -1, "F", "Ljava/lang/Object;", "F", strArray16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(116, 158, "B", "B", "ILjava/lang/Object", strArray10);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("ILjava.lang.Object", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("hi!(ILjava/lang/Object;IF)B", true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        int int9 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str28 = signature27.getDescriptor();
        java.lang.String str29 = signature27.getDescriptor();
        java.lang.String str30 = signature27.toString();
        java.lang.String str31 = signature27.toString();
        org.mockito.asm.Type type32 = signature27.getReturnType();
        java.lang.String str33 = signature27.getDescriptor();
        org.mockito.asm.Type[] typeArray34 = signature27.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(0, 96, "ILjava.lang.Object", type8, typeArray34, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getClassType();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("ILjava/lang/Object", "C", "(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitOuterClass("", "(ILjava/lang/Object;IF)LILjava/lang/Object;", "(ILjava/lang/Object;IF)LILjava/lang/Object;");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("", "long", "", 116);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        int int16 = type14.getOpcode(1);
        java.lang.String str17 = type14.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor18 = classAdapter4.visitField(5, "", "I", "byte", (java.lang.Object) str17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter4.visitAnnotation("", true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        int int21 = type20.getSort();
        boolean boolean22 = type17.equals((java.lang.Object) type20);
        int int23 = type20.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter5.visitField((int) ' ', "(C)C", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(FFLjava.lang.Object;)I", (java.lang.Object) type20);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("(FFLjava.lang.Object;)I", "LILjava/lang/Object;", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        int int13 = type10.getDimensions();
        int int15 = type10.getOpcode(156);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type18, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray27);
        int int29 = type25.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type31, type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray43);
        int int45 = type41.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type47, type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray54);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 10, 99, "(ILjava/lang/Object;IF)B", type10, typeArray54, "long");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "(ILjava/lang/Object;IF)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(116, 12, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "", "Lorg/mockito/cglib/core/Signature;", strArray12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("ILjava/lang/Object");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitSource("boolean", "(ILjava/lang/Object;IF)C");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L(FFLjava/lang/Object;)I;", "ILjava/lang/Object", "float(ILjava/lang/Object;IF)I");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter6.visitAnnotation("Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str12 = type11.getInternalName();
        int int13 = type11.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        int int20 = type16.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type22, type25, type26, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray29);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.getDescriptor();
        java.lang.String str34 = signature31.getName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray39);
        int int41 = type37.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type43, type46, type47, type49 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray50);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray50);
        java.lang.String str53 = signature52.getDescriptor();
        java.lang.String str54 = signature52.getDescriptor();
        org.mockito.asm.Type[] typeArray55 = signature52.getArgumentTypes();
        org.mockito.asm.Type type56 = signature52.getReturnType();
        boolean boolean57 = signature31.equals((java.lang.Object) signature52);
        boolean boolean58 = type11.equals((java.lang.Object) boolean57);
        java.lang.String str59 = type11.getDescriptor();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str62 = type61.getDescriptor();
        org.mockito.asm.Type type63 = type61.getElementType();
        java.lang.String str64 = type61.getInternalName();
        org.mockito.asm.Type type65 = type61.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(100, "float", type11, (java.lang.Object) type65);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitInnerClass("hi!", "hi!", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", 132);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type7, type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type0.getElementType();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        java.lang.String str20 = type19.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type19.getInternalName();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter4.getClassType();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        java.lang.String[] strArray31 = new java.lang.String[] { "(ILjava/lang/Object;IF)LF;", "L(FFLjava/lang/Object;)I;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visit((int) (short) -1, 12, "(ILjava/lang/Object;IF)I", "Lbyte;", "", strArray31);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter11.visitSource("Lorg/mockito/asm/Type;", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type2, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.toString();
        java.lang.String str10 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("(ILjava/lang/Object;IF)B", "(FFLjava.lang.Object;)I", "Lorg/mockito/asm/Type;", 161);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        int int8 = type4.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type13, type14, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray41);
        int int43 = type39.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type45, type48, type49, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray52);
        int int56 = type22.getOpcode(96);
        boolean boolean57 = signature19.equals((java.lang.Object) int56);
        boolean boolean58 = type0.equals((java.lang.Object) boolean57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type0.getInternalName();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter23.visitOuterClass("(FFLjava/lang/Object;)I", "Lorg/mockito/asm/Type;", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type2, type3, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.String str9 = type1.getClassName();
        java.lang.String str10 = type1.toString();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        java.lang.String str33 = signature32.getDescriptor();
        org.mockito.asm.Type type34 = signature32.getReturnType();
        boolean boolean35 = type14.equals((java.lang.Object) type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray43);
        int int45 = type41.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type47, type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("float", type39, typeArray54);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray58);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("LILjava/lang/Object;", type1, typeArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type62 = type1.getElementType();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = classAdapter13.visitAnnotation("hi!(ILjava/lang/Object;IF)B", true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("int", false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter6.getStaticHook();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = classAdapter13.visitAnnotation("charV(ILjava/lang/Object;IF)Ljava/lang/Object;", true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type14, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        java.lang.String str20 = type12.getClassName();
        java.lang.String str21 = type12.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray26);
        int int28 = type24.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type30, type33, type34, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray37);
        java.lang.String str40 = signature39.getDescriptor();
        java.lang.String str41 = signature39.getDescriptor();
        java.lang.String str42 = signature39.toString();
        org.mockito.asm.Type[] typeArray43 = signature39.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray48);
        int int50 = type46.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str57 = type56.toString();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type52, type55, type56, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray64);
        int int66 = type62.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str73 = type72.toString();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type68, type71, type72, type74 };
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray75);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray75);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(130, (int) (short) 100, "(ILjava/lang/Object;IF)D", type10, typeArray75, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitInnerClass("", "void", "(FFLjava/lang/Object;)I", 116);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("Lorg/mockito/cglib/core/Signature;", "(C)C", "java/lang/Object");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("java/lang/Object", "", "float", 157);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        int int4 = type3.getSort();
        boolean boolean5 = type0.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitInnerClass("V(ILjava/lang/Object;IF)Ljava/lang/Object;", "Lbyte;", "(ILjava/lang/Object;IF)I", 100);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        java.lang.String str18 = type13.toString();
        int int20 = type13.getOpcode((int) (short) 100);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(5, "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", type13, (java.lang.Object) type22);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("ILjava/lang/Object");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (byte) 10, "", "I", "C", (java.lang.Object) "ILjava/lang/Object");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("ILjava.lang.Object", "Lbyte;", "Lbyte;", (int) (byte) 10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("(ILjava/lang/Object;IF)Ljava/lang/Object;", false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        java.lang.String[] strArray16 = new java.lang.String[] { "Lbyte;", "(ILjava/lang/Object;IF)Z", "(ILjava/lang/Object;IF)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visit(0, 54, "(C)C", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", "float(ILjava/lang/Object;IF)I", strArray16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = classEmitter29.getClassType();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        java.lang.String str30 = type29.getClassName();
        int int31 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int35 = type34.getSize();
        int int36 = type34.getSort();
        int int37 = type34.getDimensions();
        int int39 = type34.getOpcode(156);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray44);
        int int46 = type42.getSize();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type48, type51, type52, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray55);
        java.lang.String str58 = signature57.getDescriptor();
        java.lang.String str59 = signature57.getDescriptor();
        org.mockito.asm.Type[] typeArray60 = signature57.getArgumentTypes();
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type34, typeArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(158, 54, "C", type29, typeArray60, "(ILjava/lang/Object;IF)LF;");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getSuperType();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        int int22 = type18.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type27, type28, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor34 = classEmitter5.visitField(100, "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)B", "float(ILjava/lang/Object;IF)I", (java.lang.Object) typeArray31);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "int", "V", 103);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("", false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        int int20 = type16.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type22, type25, type26, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.declare_field(0, "void", type13, (java.lang.Object) str31);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = classEmitter5.getSuperType();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "java/lang/Object", "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(130, (int) (short) -1, "", "I", "org/mockito/cglib/core/Signature", strArray13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray13);
        int int15 = type11.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type17, type20, type21, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("float", type9, typeArray24);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        int int31 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type0.getDimensions();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("ILjava/lang/Object");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("ILjava/lang/Object");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int17 = type16.getSize();
        int int19 = type16.getOpcode(8);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray24);
        int int26 = type22.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type28, type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray35);
        java.lang.String str38 = signature37.getDescriptor();
        java.lang.String str39 = signature37.getDescriptor();
        java.lang.String str40 = signature37.toString();
        org.mockito.asm.Type[] typeArray41 = signature37.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("char", type14, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type11, typeArray41);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        int int50 = type48.getOpcode(128);
        int int51 = type48.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field(9, "hi!", type11, (java.lang.Object) type48);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "Ljava/lang/Object;", "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "Ljava/lang/Object;", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visit(9, (int) (byte) 10, "org/mockito/cglib/core/Signature", "L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", "Lorg/mockito/asm/Type;", strArray26);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("ILjava/lang/Object");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("ILjava/lang/Object");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int18 = type17.getSize();
        int int20 = type17.getOpcode(8);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        java.lang.String str39 = signature38.getDescriptor();
        java.lang.String str40 = signature38.getDescriptor();
        java.lang.String str41 = signature38.toString();
        org.mockito.asm.Type[] typeArray42 = signature38.getArgumentTypes();
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("char", type15, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type12, typeArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor46 = classEmitter4.visitField(0, "char", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) typeArray42);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = type10.getElementType();
        java.lang.String str13 = type10.getInternalName();
        org.mockito.asm.Type type14 = type10.getElementType();
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getInternalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter4.visitField(126, "hi!", "Lbyte;", "boolean", (java.lang.Object) str16);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "Ljava/lang/Object;", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", 8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L(ILjava/lang/Object;IF)D;", "hi!(ILjava/lang/Object;IF)B", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", 157);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "void");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray24);
        int int26 = type22.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type28, type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray35);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("float", type20, typeArray35);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(12, (int) (short) 0, "g.mockito.cglib.core.ClassEmitter", type16, typeArray39, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("long", "I", "(ILjava/lang/Object;IF)LILjava/lang/Object;");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("ILjava/lang/Object");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        int int17 = type16.getSize();
        int int19 = type16.getOpcode(8);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray24);
        int int26 = type22.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type28, type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray35);
        java.lang.String str38 = signature37.getDescriptor();
        java.lang.String str39 = signature37.getDescriptor();
        java.lang.String str40 = signature37.toString();
        org.mockito.asm.Type[] typeArray41 = signature37.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("char", type14, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor44 = classEmitter5.visitField(158, "(ILjava/lang/Object;IF)LF;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", (java.lang.Object) signature43);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("Ljava/lang/Object;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("float", type11, typeArray26);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        int int37 = type33.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type39, type42, type43, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        java.lang.String str49 = signature48.getDescriptor();
        java.lang.String str50 = signature48.getDescriptor();
        java.lang.String str51 = signature48.toString();
        org.mockito.asm.Type[] typeArray52 = signature48.getArgumentTypes();
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray52);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.String str56 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass55);
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass55);
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        java.lang.String str59 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass55);
        java.lang.String str60 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass55);
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(4, "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", type9, (java.lang.Object) type62);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getClassType();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classEmitter29.visitAnnotation("L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("g.mockito.cglib.core.ClassEmitter", false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("(ILjava/lang/Object;IF)Z", true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "java/lang/Object", "Ljava/lang/Object;", 124);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor41 = classEmitter29.visitField(140, "Lorg/mockito/asm/Type;", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "", (java.lang.Object) str40);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("Lbyte;", "V(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Ljava/lang/Object;");
        int int9 = type8.getSort();
        java.lang.String str10 = type8.toString();
        org.mockito.asm.Type type11 = type8.getElementType();
        int int12 = type8.getSort();
        int int14 = type8.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray30);
        java.lang.String str33 = signature32.getDescriptor();
        java.lang.String str34 = signature32.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = signature32.getArgumentTypes();
        org.mockito.asm.Type type36 = signature32.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(5, "java.lang.Object", type8, (java.lang.Object) type36);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray32);
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type36, type39, type40, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray43);
        java.lang.String str46 = signature45.getDescriptor();
        java.lang.String str47 = signature45.getDescriptor();
        org.mockito.asm.Type[] typeArray48 = signature45.getArgumentTypes();
        org.mockito.asm.Type type49 = signature45.getReturnType();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean51 = signature45.equals((java.lang.Object) type50);
        java.lang.String str52 = signature45.getName();
        org.mockito.asm.Type[] typeArray53 = signature45.getArgumentTypes();
        org.mockito.asm.Type type54 = signature45.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor55 = classEmitter23.visitField((int) (short) 0, "D", "Lorg/mockito/cglib/core/Signature;", "Lorg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) type54);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        int int18 = type14.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type20, type23, type24, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("float", type12, typeArray27);
        java.lang.String str31 = signature30.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor32 = classEmitter0.visitField(0, "ILjava.lang.Object", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", (java.lang.Object) str31);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter5.getSuperType();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter0.getSuperType();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter5.getAccess();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("int", "F");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "F", "(ILjava.lang.Object;IF)Ljava.lang.Object;", "Lbyte;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(5, (int) 'a', "(FFLjava/lang/Object;)I", "(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", strArray13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        int int22 = type18.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type27, type28, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray31);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray40);
        int int42 = type38.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type44, type47, type48, type50 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("float", type36, typeArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(0, 0, "ILjava.lang.Object", type10, typeArray51, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitSource("org/mockito/asm/ClassAdapter", "V");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("(ILjava/lang/Object;IF)J", "L(ILjava/lang/Object;IF)D;", "long");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ILjava/lang/Object;IF)D", "LILjava/lang/Object;", "V(ILjava/lang/Object;IF)Ljava/lang/Object;", 2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter23.visitOuterClass("L(ILjava/lang/Object;IF)D;", "org/mockito/asm/ClassAdapter", "ILjava.lang.Object");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!(ILjava/lang/Object;IF)B", "java.lang.Object", "(ILjava/lang/Object;IF)B", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "(ILjava/lang/Object;IF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(35, (int) '4', "C", "(ILjava/lang/Object;IF)D", "Lorg/mockito/cglib/core/ClassEmitter;", strArray16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "Lbyte;", "(ILjava/lang/Object;IF)Z", "org/mockito/cglib/core/Signature", "(ILjava/lang/Object;IF)I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((int) '4', 0, "org/mockito/asm/Type", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "Ljava/lang/Object;", strArray16);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("B", "long", "(C)C");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("I", "F", "(ILjava.lang.Object;IF)Ljava.lang.Object;", 35);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L(FFLjava/lang/Object;)I;", "org/mockito/cglib/core/Signature", "", 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getClassType();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(FFLjava.lang.Object;)I", "org.mockito.asm.Type", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter0.visitAnnotation("(ILjava/lang/Object;IF)I", true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("B", "org.mockito.asm.Type", "(ILjava/lang/Object;IF)C", 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "Ljava/lang/Object;", "I" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(96, 1, "Ljava/lang/Object;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "hi!(ILjava/lang/Object;IF)B", strArray12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter12.getSuperType();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("boolean", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "Ljava/lang/Object;");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitOuterClass("hi!", "(FFLjava/lang/Object;)I", "(FFLjava.lang.Object;)I");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("", "org.mockito.asm.Type", "(FFLjava.lang.Object;)I");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter13.visitOuterClass("(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "g.mockito.cglib.core.ClassEmitter", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.toString();
        java.lang.String str21 = signature17.toString();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray23 = signature17.getArgumentTypes();
        org.mockito.asm.Type type24 = signature17.getReturnType();
        java.lang.String str25 = signature17.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter38.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean42 = signature17.equals((java.lang.Object) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitOuterClass("F", "I", "(ILjava.lang.Object;IF)Ljava.lang.Object;");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("(FFLjava.lang.Object;)I", "(FFLjava/lang/Object;)I", "(ILjava/lang/Object;IF)Ljava/lang/Object;");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter4.visitAnnotation("", true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter0.getAccess();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter7.getStaticHook();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("LILjava/lang/Object;", "java/lang/Object", "Lorg/mockito/asm/Type;", 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        java.lang.String[] strArray39 = new java.lang.String[] { "Lorg/mockito/cglib/core/Signature;", "float(ILjava/lang/Object;IF)I", "hi!(ILjava/lang/Object;IF)B" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visit(96, 16, "(ILjava/lang/Object;IF)LF;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "boolean", strArray39);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("org.mockito.asm.Type", false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter23.visitEnd();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "B", "long", "Lbyte;", "Ljava/lang/Object;", "ILjava/lang/Object" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(124, 7, "L(ILjava/lang/Object;IF)D;", "org/mockito/cglib/core/Signature", "g.mockito.cglib.core.ClassEmitter", strArray17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "B", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getClassName();
        int int31 = type28.getOpcode(3);
        java.lang.String str32 = type28.toString();
        java.lang.String str33 = type28.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor34 = classEmitter23.visitField(1, "ILjava/lang/Object", "(ILjava/lang/Object;IF)LILjava/lang/Object;", "D", (java.lang.Object) str33);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "L(FFLjava/lang/Object;)I;", "B", "ILjava.lang.Object", "org.mockito.asm.Type", "g.mockito.cglib.core.ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, (int) '#', "org.mockito.asm.Type(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "java.lang.Object", "", strArray11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("char", false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("Lorg/mockito/cglib/core/Signature;", "C");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
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
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray18 = new java.lang.String[] { "int", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "char", "g.mockito.cglib.core.ClassEmitter", "(ILjava/lang/Object;IF)Z", "ILjava.lang.Object" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(160, 104, "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", "Ljava/lang/Object;", "(FFLjava/lang/Object;)I", strArray18);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.getName();
        java.lang.String str21 = signature17.getName();
        java.lang.String str22 = signature17.getDescriptor();
        org.mockito.asm.Type type23 = signature17.getReturnType();
        java.lang.String str24 = type23.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type23.getInternalName();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor31 = classEmitter4.visitField(153, "Lorg/mockito/asm/Type;", "L(ILjava/lang/Object;IF)D;", "(FFLjava.lang.Object;)I", (java.lang.Object) "(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = classEmitter4.getAccess();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", "(ILjava/lang/Object;IF)I", "(ILjava/lang/Object;IF)D", "java.lang.Object", "(ILjava/lang/Object;IF)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(103, 132, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;", "(ILjava/lang/Object;IF)J", "ILjava.lang.Object", strArray11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type11, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str17 = type9.getClassName();
        java.lang.String str18 = type9.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray23);
        int int25 = type21.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type27, type30, type31, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str37 = signature36.getDescriptor();
        java.lang.String str38 = signature36.getDescriptor();
        java.lang.String str39 = signature36.toString();
        org.mockito.asm.Type[] typeArray40 = signature36.getArgumentTypes();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str43 = type42.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field((int) (byte) -1, "I", type9, (java.lang.Object) type42);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getSuperType();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter4.visitAnnotation("hi!", false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)J");
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = type8.getInternalName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)I");
        org.mockito.asm.Type type13 = type12.getElementType();
        int int14 = type13.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(130, "long", type8, (java.lang.Object) type13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray13);
        int int15 = type11.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type17, type20, type21, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("float", type9, typeArray24);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray28);
        boolean boolean32 = type0.equals((java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type0.getElementType();
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classEmitter23.visitAnnotation("(ILjava/lang/Object;IF)B", false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray31);
        int int33 = type29.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type35, type38, type39, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray42);
        java.lang.String str45 = signature44.getDescriptor();
        java.lang.String str46 = signature44.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean49 = signature44.equals((java.lang.Object) classAdapter48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor50 = classAdapter21.visitField((-1), "B", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "", (java.lang.Object) classAdapter48);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getClassType();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter0.getSuperType();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("org/mockito/asm/Type", "hi!(ILjava/lang/Object;IF)B", "LILjava/lang/Object;");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("V(ILjava/lang/Object;IF)Ljava/lang/Object;", "", "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) 1);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = classEmitter4.getAccess();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", "long");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor44 = classEmitter29.visitField((int) (byte) 1, "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", "ILjava/lang/Object", "(ILjava/lang/Object;IF)LILjava/lang/Object;", (java.lang.Object) "(C)C");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("ILjava.lang.Object", "(ILjava.lang.Object;IF)Ljava.lang.Object;", "(ILjava/lang/Object;IF)Z");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(ILjava/lang/Object;IF)LILjava/lang/Object;", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", "LILjava/lang/Object;");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("hi!", "V");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray22 = new java.lang.String[] { "charV(ILjava/lang/Object;IF)Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visit(124, (int) ' ', "java/lang/Object", "float", "B", strArray22);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter5.getSuperType();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("float", false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray12 = new java.lang.String[] { "org/mockito/cglib/core/Signature" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(161, 140, "(ILjava/lang/Object;IF)LF;", "(ILjava/lang/Object;IF)I", "int", strArray12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((-1), 12, "", "java.lang.Object", "", strArray13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getClassName();
        int int10 = type8.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter3.visitField(124, "org/mockito/asm/ClassAdapter", "ILjava.lang.Object", "java.lang.Object", (java.lang.Object) type8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Lbyte;");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        java.lang.String str29 = signature28.getDescriptor();
        java.lang.String str30 = signature28.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = signature28.getArgumentTypes();
        java.lang.String str32 = signature28.toString();
        org.mockito.asm.Type[] typeArray33 = signature28.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(153, 157, "(ILjava/lang/Object;IF)B", type10, typeArray33, "(ILjava/lang/Object;IF)LF;");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter4.getStaticHook();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.end_class();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("(FFLjava.lang.Object;)I", "org/mockito/asm/Type", "org/mockito/asm/Type");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter0.getAccess();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = classEmitter10.getAccess();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter25.visitSource("C", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(ILjava/lang/Object;IF)D");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.begin_class(156, 35, "", type20, typeArray36, "(ILjava/lang/Object;IF)Z");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter6.visitField(0, "(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)Lva/lang/Object;", (java.lang.Object) "(FFLjava.lang.Object;)I");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor20 = classAdapter4.visitField(54, "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "long", (java.lang.Object) classEmitter14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        int int12 = type8.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter0.visitField(103, "(ILjava/lang/Object;IF)I", "(ILjava/lang/Object;IF)Z", "org/mockito/asm/Type", (java.lang.Object) type8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter25 = classEmitter13.getStaticHook();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("g.mockito.cglib.core.ClassEmitter", "ILjava/lang/Object", "(ILjava/lang/Object;IF)Lva/lang/Object;", 154);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = type11.getElementType();
        java.lang.String str13 = type11.getInternalName();
        boolean boolean15 = type11.equals((java.lang.Object) "int");
        java.lang.Class<?> wildcardClass16 = type11.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter3.visitField((int) (byte) 1, "(ILjava/lang/Object;IF)LILjava/lang/Object;", "(ILjava/lang/Object;IF)C", "(ILjava/lang/Object;IF)Z", (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classEmitter35.visitAnnotation("Lorg/mockito/asm/Type;", false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter0.getStaticHook();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org/mockito/asm/Type", "(ILjava/lang/Object;IF)LF;", "Lorg/mockito/cglib/core/ClassEmitter;", "(ILjava/lang/Object;IF)Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(140, 160, "Lorg/mockito/cglib/core/Signature;", "g.mockito.cglib.core.ClassEmitter", "org/mockito/asm/Type", strArray14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '4', (int) (byte) 1, "org/mockito/asm/Type", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "(ILjava/lang/Object;IF)B", strArray10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "float(ILjava/lang/Object;IF)I", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "int" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) (short) 10, (-1), "org.mockito.asm.Type(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", "L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", strArray16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str22 = type21.getInternalName();
        int int23 = type21.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray28);
        int int30 = type26.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type32, type35, type36, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray39);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type21, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.begin_class(128, 160, "Lbyte;", type18, typeArray39, "char");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("Ljava/lang/Object;");
        int int10 = type9.getSort();
        java.lang.String str11 = type9.toString();
        org.mockito.asm.Type type12 = type9.getElementType();
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter3.visitField(7, "(ILjava/lang/Object;IF)J", "C", "g.mockito.cglib.core.ClassEmitter", (java.lang.Object) wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = type30.getElementType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray37);
        int int39 = type35.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type41, type44, type45, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("float", type33, typeArray48);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        java.lang.String str53 = signature51.getDescriptor();
        org.mockito.asm.Type[] typeArray54 = signature51.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(158, 116, "L(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;", type31, typeArray54, "(FFLjava/lang/Object;)I");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(6, 3, "(C)C", "byte", "(ILjava/lang/Object;IF)LILjava/lang/Object;", strArray9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type1.getElementType();
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter5.getClassType();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitSource("Lbyte;", "float(ILjava/lang/Object;IF)I");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray32);
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type36, type39, type40, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor46 = classAdapter21.visitField(54, "charV(ILjava/lang/Object;IF)Ljava/lang/Object;", "(ILjava/lang/Object;IF)Z", "Lorg/mockito/asm/Type;", (java.lang.Object) "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.toString();
        java.lang.String str21 = signature17.toString();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray23 = signature17.getArgumentTypes();
        org.mockito.asm.Type type24 = signature17.getReturnType();
        java.lang.String str25 = signature17.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter26.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter38.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        boolean boolean42 = signature17.equals((java.lang.Object) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = classEmitter31.getClassType();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter4.getClassType();
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("V", "L(FFLjava/lang/Object;)I;", "(ILjava/lang/Object;IF)LF;");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("LILjava/lang/Object;");
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ILjava.lang.Object;IF)Ljava.lang.Object;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(7, "char", type8, (java.lang.Object) "(ILjava.lang.Object;IF)Ljava.lang.Object;");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("(FFLjava/lang/Object;)I", false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "F", "java/lang/Object", "ILjava.lang.Object", "void", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(6, (int) '4', "(FFLjava.lang.Object;)I", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "byte", strArray17);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray22 = new java.lang.String[] { "(ILjava/lang/Object;IF)B", "hi!(ILjava/lang/Object;IF)B", "Lorg/mockito/asm/ClassAdapter;", "(ILjava/lang/Object;IF)Ljava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visit(153, 9, "V", "(ILjava/lang/Object;IF)I", "L(ILjava/lang/Object;IF)D;", strArray22);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        java.lang.String[] strArray49 = new java.lang.String[] { "float(ILjava/lang/Object;IF)I", "float", "org.mockito.asm.Type", "byte" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visit(10, 103, "boolean", "(FFLjava/lang/Object;)I", "org.mockito.asm.Type", strArray49);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("java/lang/Object", "boolean", "(ILjava/lang/Object;IF)I");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray26);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor30 = classEmitter5.visitField(140, "F", "(ILjava/lang/Object;IF)Lva/lang/Object;", "java/lang/Object", (java.lang.Object) signature28);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        int int22 = type18.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type27, type28, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray31);
        java.lang.String str34 = signature33.getName();
        org.mockito.asm.Type type35 = signature33.getReturnType();
        java.lang.String str36 = type35.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor37 = classEmitter4.visitField(124, "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(ILjava/lang/Object;IF)Z", "(ILjava/lang/Object;IF)Lva/lang/Object;", (java.lang.Object) type35);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean22 = signature17.equals((java.lang.Object) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        java.lang.String[] strArray35 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "int", "L(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(ILjava/lang/Object;IF)Ljava/lang/Object;", "void" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter23.visit(104, 160, "org.mockito.asm.Type(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "LILjava/lang/Object;", "", strArray35);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter4.getStaticHook();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter25.visitEnd();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "Lbyte;", "hi!", "long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visit(16, (-1), "B", "D", "V", strArray15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        int int7 = type3.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type12, type13, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("float", type1, typeArray16);
        java.lang.String str20 = type1.getDescriptor();
        int int22 = type1.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type1.getInternalName();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("(ILjava/lang/Object;IF)C", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter0.getSuperType();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter11.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classEmitter11.visitAnnotation("L(FFLjava/lang/Object;)I;", true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(ILjava/lang/Object;IF)I", "int", "(ILjava.lang.Object;IF)Ljava.lang.Object;", (int) (byte) 10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        java.lang.String[] strArray48 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "D", "(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/Signature" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter29.visit((int) (short) 0, (int) (short) 1, "Lorg/mockito/asm/ClassAdapter;", "g.mockito.cglib.core.ClassEmitter", "long", strArray48);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] { type1 };
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.getDescriptor();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean9 = type0.equals((java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter11.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("LILjava/lang/Object;", "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.getDescriptor();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = type22.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type22.getElementType();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter0.getClassType();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type46 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray47);
        int int49 = type45.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type51, type54, type55, type57 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray58);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("float", type43, typeArray58);
        java.lang.String str62 = signature61.getDescriptor();
        java.lang.String str63 = signature61.getName();
        org.mockito.asm.Type type64 = signature61.getReturnType();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        boolean boolean67 = type64.equals((java.lang.Object) type66);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str71 = type70.getInternalName();
        int int72 = type70.getSort();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type76 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type75, typeArray77);
        int int79 = type75.getSize();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass83);
        org.mockito.asm.Type type85 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str86 = type85.toString();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray88 = new org.mockito.asm.Type[] { type81, type84, type85, type87 };
        java.lang.String str89 = org.mockito.asm.Type.getMethodDescriptor(type75, typeArray88);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray88);
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray88);
        org.mockito.cglib.core.Signature signature92 = new org.mockito.cglib.core.Signature("", type70, typeArray88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter35.begin_class(7, (int) (byte) 0, "", type66, typeArray88, "(C)C");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter6.getStaticHook();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.getName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        int int27 = type23.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type32, type33, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray36);
        java.lang.String str39 = signature38.getDescriptor();
        java.lang.String str40 = signature38.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = signature38.getArgumentTypes();
        org.mockito.asm.Type type42 = signature38.getReturnType();
        boolean boolean43 = signature17.equals((java.lang.Object) signature38);
        org.mockito.asm.Type type44 = signature38.getReturnType();
        java.lang.String str45 = signature38.toString();
        org.mockito.asm.Type type46 = signature38.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type46.getDimensions();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("int", "org.mockito.asm.Type(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;", "(FFLjava/lang/Object;)I");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter4.visitAnnotation("hi!(ILjava/lang/Object;IF)B", true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray32);
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type36, type39, type40, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray43);
        java.lang.String str46 = signature45.getDescriptor();
        java.lang.String str47 = signature45.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        boolean boolean52 = signature45.equals((java.lang.Object) classEmitter48);
        boolean boolean54 = signature45.equals((java.lang.Object) 104);
        org.mockito.asm.Type[] typeArray55 = signature45.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(157, (int) (byte) -1, "(ILjava/lang/Object;IF)Lva/lang/Object;", type11, typeArray55, "F");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        int int7 = type3.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type12, type13, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("float", type1, typeArray16);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type type22 = signature19.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        boolean boolean25 = type22.equals((java.lang.Object) type24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type22.getElementType();
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(ILjava/lang/Object;IF)LILjava/lang/Object;", "(ILjava/lang/Object;IF)LF;");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("long(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "(C)C", "(ILjava/lang/Object;IF)LF;", 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "LILjava/lang/Object;", "java.lang.Object", "(ILjava/lang/Object;IF)LF;", "(ILjava/lang/Object;IF)Z", "(ILjava/lang/Object;IF)F" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '4', (int) (short) 0, "char", "java.lang.Object", "java/lang/Object", strArray16);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        java.lang.String str24 = signature17.getName();
        org.mockito.asm.Type[] typeArray25 = signature17.getArgumentTypes();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray32);
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type36, type39, type40, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        java.lang.String str46 = type26.toString();
        boolean boolean47 = signature17.equals((java.lang.Object) type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type26.getElementType();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type7, type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray30);
        int int34 = type0.getOpcode(96);
        java.lang.String str35 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type0.getInternalName();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = classEmitter5.getAccess();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str14 = signature13.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter4.visitField(5, "org/mockito/asm/Type", "(ILjava/lang/Object;IF)C", "int", (java.lang.Object) str14);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "ILjava/lang/Object", "LFFLjava/lang/Object;", "g.mockito.cglib.core.ClassEmitter", "C", "(ILjava/lang/Object;IF)I", "L(ILjava/lang/Object;IF)D;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(8, 124, "V", "(ILjava/lang/Object;IF)C", "java.lang.Object", strArray17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter11.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter11.getClassType();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("ILjava.lang.Object", true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type7, type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        int int21 = type17.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type23, type26, type27, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.end_class();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        org.mockito.asm.Type type20 = signature17.getReturnType();
        int int22 = type20.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type20.getDimensions();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray13 = new java.lang.String[] { "(ILjava/lang/Object;IF)LILjava/lang/Object;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit((int) ' ', (int) ' ', "Lorg/mockito/asm/Type;", "Lbyte;", "", strArray13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(140, 7, "Lorg/mockito/cglib/core/ClassEmitter;", "java/lang/Object", "", strArray11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter39.visitEnd();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        java.lang.String str19 = type0.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = type21.getElementType();
        java.lang.String str24 = type21.getInternalName();
        org.mockito.asm.Type type25 = type21.getElementType();
        boolean boolean26 = type0.equals((java.lang.Object) type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type0.getInternalName();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("J", true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        java.lang.String str20 = signature17.getDescriptor();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type21.getDimensions();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter35.visitOuterClass("(ILjava/lang/Object;IF)Ljava/lang/Object;", "char", "J");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray7);
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type11, type14, type15, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("float", type3, typeArray18);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        int int24 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
    }
}


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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Short", "L;");
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
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(3, "short", "Short", "java.lang", (java.lang.Object) label7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("Short", "Short", "short", 7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(0, "()V", "V", "", (java.lang.Object) (byte) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field((int) '#', "L$3B", type4, (java.lang.Object) type6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(32, "Short", type5, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (byte) 0, 4, "L;", "hi!", "L;", strArray10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("Short");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(100, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(52, "double", type5, (java.lang.Object) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(100, type4);
        int int6 = local5.getIndex();
        org.mockito.asm.Type type7 = local5.getType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(100, "L$3B", type7, (java.lang.Object) boolean12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) ' ', 153, "()V", "hi!", "()V", strArray8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("hi!", "short", "void", 100);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("Short", "L<init>()V;", "Int");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("D", "L;");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("V", "L$3B", "Int");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("Int", "java.lang", "", 3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L;", "V", "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("void", "V");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) '4', type6);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(112, "D", type6, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("<init>", false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1011045012", "void", "[Lorg/mockito/asm/Type;", (int) (byte) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getSuperType();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L<init>()V;", "double", "(V)S", 9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("(L;)Z", "Lorg/mockito/cglib/core/Signature;", "(L;)Z", 32);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("hi!", "I");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter1.getClassType();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) '4', type9);
        int int12 = local11.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter0.visitField((int) (byte) 10, "<init>", "(L;)Z", "[Lorg/mockito/asm/Type;", (java.lang.Object) local11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1011045012", "<init>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1092810277", "L1799275916", "L<init>()V;", "void" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, (int) '4', "", "L1092810277", "<init>()V", strArray12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("byte", "(L;D)Lt;");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("", "java.lang", "L$3B", 9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(56, "LL;;", "LL;;", "", (java.lang.Object) "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("byte", "short", "L179248870");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(L;)D", "L;", "<init>()V", 4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L205843408", "org/mockito/cglib/core/Signature", "byte");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("int", "S");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/cglib/core/Signature", "()V");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1011045012", false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("<init>()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter1.getAccess();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("(L;)D", "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("Short", "Void", "", 5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Short");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("byte", true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (short) 10, 8, "hi!", "Lint;", "Int", strArray10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("L115210646", false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("int", false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter1.getAccess();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("D", "Short");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        boolean boolean11 = type0.equals((java.lang.Object) signature10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Hi!", "L1202418377");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("", "L680990058", "boolean", 116);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        boolean boolean11 = type0.equals((java.lang.Object) signature10);
        int int12 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L179248870", "L1325724854");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("java.lang", "(V)S");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        java.lang.String str6 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(100, type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        boolean boolean15 = type4.equals((java.lang.Object) signature14);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(10, "short(Ljava/lang/V;LV;)Lva/lang;", type4, (java.lang.Object) boolean20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("org.mockito.cglib.core", "L1565509129", "L205843408", 156);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        boolean boolean15 = type8.equals((java.lang.Object) strArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(153, 130, "Ljava/lang/Short;", "", "L1092810277", strArray14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(0, (-1), "", type5, typeArray9, "int");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("V");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("int", type15, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray12);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(100, type26);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type31);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(9, type31);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isPrimitive(type40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type40);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type44);
        org.mockito.asm.Type type46 = type44.getElementType();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isPrimitive(type50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type50);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(13, 96, "L1202418377", type7, typeArray36, "L1325724854");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.toString();
        java.lang.String str5 = signature2.getName();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L<init>()V;", "[Lorg/mockito/asm/Type;", "L2029575687");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L<init>()V;", "<init>");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        int int12 = type9.getSort();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) -1, type9);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(14, 7, "double", type14, typeArray16, "(L;Lint;)V");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        label5.info = ' ';
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        java.lang.String str13 = type11.getClassName();
        label5.info = type11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(132, "<init>()V", type11, (java.lang.Object) "L897927500");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L723084290", "(L;)S", "L115210646", 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        org.mockito.asm.Type type9 = type7.getElementType();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField(32, "(Ljava/lang/L;LV;)L;", "LV;", "Ljava/lang/Short;", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter1.getAccess();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L2029575687", "L;", "Ljava/lang/Short;");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("L1325724854");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter4.visitField(14, "L245395834", "B", "L1587696640", (java.lang.Object) type10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        int int12 = type10.getOpcode((int) ' ');
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("int", type10, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean19 = signature16.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        boolean boolean28 = signature16.equals((java.lang.Object) strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(42, 5, "java$2Elang", "L;(Ljava/lang/L;LV;)L;", "(L;)L;", strArray26);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter1.visitField(12, "L1852500780", "(Ljava/lang/L;LV;)L;", "L1813600832", (java.lang.Object) type11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(157, (int) (byte) -1, "<init>", "Short", "L477062747", strArray12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("int", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray8);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(100, type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray30);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type22, typeArray31);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.fromInternalName("IL1202418377");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(11, "L2021451540", type22, (java.lang.Object) "IL1202418377");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("short", true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        java.lang.String str12 = type10.getClassName();
        java.lang.String str13 = type10.getDescriptor();
        int int14 = type10.getSort();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.Class<?> wildcardClass19 = typeArray18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        java.lang.Class<?> wildcardClass33 = typeArray32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = typeArray42.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass19, wildcardClass26, wildcardClass33, wildcardClass43 };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray54 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("short", type53, typeArray55);
        int int57 = type53.getSort();
        java.lang.String str58 = type53.toString();
        java.lang.String str59 = type53.toString();
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        int int65 = type63.getOpcode((int) ' ');
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("int", type63, typeArray68);
        org.mockito.asm.Type[] typeArray70 = signature69.getArgumentTypes();
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getBoxedType(type72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type72);
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray76);
        java.lang.Class[] classArray78 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.getTypes(classArray78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray77, typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray70, typeArray79);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray61, typeArray70);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("java.lang", type10, typeArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor84 = classEmitter1.visitField(0, "L1813600832", "LZ;", "Int", (java.lang.Object) signature83);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("(L;Lint;)V", "org.mockito.cglib.core");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        java.lang.String str11 = type9.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(100, type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        boolean boolean20 = type9.equals((java.lang.Object) signature19);
        int int21 = type9.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter1.visitField(10, "L40020120", "(L;)I", "L1325724854", (java.lang.Object) int21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type2.getDimensions();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(158, type12);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        int int26 = type24.getOpcode((int) ' ');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("int", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray21);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(100, type35);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(35, 9, "L652322048", type12, typeArray33, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("org/mockito/cglib/core/Signature", true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("[Lorg/mockito/asm/Type;", "L1403562481", "L1331900336");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L2021451540", "Java$2Elang");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.getTypes(classArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type1.getDimensions();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter1.getAccess();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("(L;)S", "L690312719", "(L;Lint;L;D)Ljava/lang/Short;");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray3);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("short", type2, typeArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        java.lang.String str11 = type6.getClassName();
        java.lang.String str12 = type6.toString();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "L774406697", "double", 56);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L130113989", "java$2Elang", "java/lang/Short");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("(L;)I", true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1943638160", "Short", "L1403562481");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        int int14 = type11.getSize();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("LV;", type11, typeArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(10, 6, "L897927500", "L869032533", "org/mockito/cglib/core/Signature", strArray18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        java.lang.String str21 = type17.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type17.getInternalName();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        label0.info = type3;
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        boolean boolean7 = type1.equals((java.lang.Object) type6);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type6.getDimensions();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1092810277()LShort;", "", "L135388364", 116);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("LL;;", "<init>(S)V", "L321013184");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1813600832");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("Java$2Elang", false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        java.lang.Class<?> wildcardClass25 = typeArray24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        java.lang.Class<?> wildcardClass35 = typeArray34.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass11, wildcardClass18, wildcardClass25, wildcardClass35 };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 10, (int) ' ', "LL$3B$3B", "Int", "va.lang", strArray44);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        int int15 = type12.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type12.getDimensions();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(0, 158, "org/mockito/cglib/core/Signature", "L677830104", "byte(D)S", strArray11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit(0, 0, "short(Ljava/lang/V;LV;)Lva/lang;", "L1109657447", "L484864404", strArray10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("(L;)Z", false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(10, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type4.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray9);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(100, type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(9, type28);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type41);
        org.mockito.asm.Type type43 = type41.getElementType();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isPrimitive(type47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray49);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        java.lang.Class[] classArray57 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray56);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray51, typeArray52);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(100, type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("", "V");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter5.getClassType();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("L245395834", false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("L652322048", "L1034014722");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L1011045012", true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("java", false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type11);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        boolean boolean18 = type11.equals((java.lang.Object) strArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) ' ', 8, "L1340227649", "()D", "L380461644", strArray17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("(L;)V", false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("V", "L2029575687(L;Lint;L;D)D");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L2061722705", "L1621336944");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type12 = type11.getElementType();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(126, 9, "L1092810277$28$29LShort$3B", "L1325724854org$2Emockito$2Ecglib$2Ecore$2ESignature", "L1621336944", strArray24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter1.getClassType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("", "L141422918", "L1768459599", 56);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "L327601669", "byte");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1843692054", "L1331900336", "L1092810277$28$29LShort$3B", 13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        boolean boolean19 = type12.equals((java.lang.Object) strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(4, (int) 'a', "(Ljava/lang/Short;)D", "L1790172907", "L1799275916", strArray18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter1.getAccess();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("java$2Elang", "L1075909975");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("LV;", "L1331900336", "L;(Ljava/lang/L;LV;)L;", 158);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type7 = local6.getType();
        org.mockito.asm.Type type8 = local6.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("L1913235182", "L1619152913");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter5.getClassType();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L324597640", true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(110, 157, "(Ljava/lang/L;)L;", "L2017536669", "", strArray18);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter7.getAccess();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("L1092810277");
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        label7.info = wildcardClass13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(56, "org/mockito/cglib/core/Signature", type6, (java.lang.Object) wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (byte) 0, (int) ' ', "L512232699", "L1658110417", "void", strArray9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("int");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitInnerClass("L141422918", "L1092810277$28$29LShort$3B", "L1904036022", 130);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean22 = signature19.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        boolean boolean31 = signature19.equals((java.lang.Object) strArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(128, 110, "L40020120", "L154119407", "L690312719", strArray29);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1109657447", "(L;)V", "org/mockito/cglib/core/Signature", 129);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter1.getStaticHook();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1904036022", "L97952760");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(158, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type4.getDimensions();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray16);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type23.getDimensions();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String str11 = signature10.getDescriptor();
        java.lang.String str12 = signature10.getDescriptor();
        java.lang.String str13 = signature10.getName();
        org.mockito.asm.Type[] typeArray14 = signature10.getArgumentTypes();
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 100, 114, "L538117023", "L$3B", "(L;)D", strArray15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        int int6 = type1.getOpcode(0);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("", false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(42, (-1), "L130113989", "java.lang.Short", "org.mockito.cglib.core", strArray11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("L;", false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type12.getDimensions();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type7.getElementType();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L717854448", "L1768459599");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type3.getInternalName();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("L324597640", true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("LShort;", "()I", "L1461338839", 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray10);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(100, type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type29);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(9, type29);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Object obj37 = label35.info;
        java.lang.String str38 = label35.toString();
        label35.info = ' ';
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type41);
        java.lang.String str43 = type41.getClassName();
        label35.info = type41;
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type41);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str49 = type48.toString();
        java.lang.String str50 = type48.toString();
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("L;", type48, typeArray56);
        java.lang.String str58 = signature57.getName();
        java.lang.String str59 = signature57.toString();
        java.lang.String str60 = signature57.toString();
        org.mockito.asm.Type type61 = signature57.getReturnType();
        boolean boolean62 = org.mockito.cglib.core.TypeUtils.isArray(type61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(100, type67);
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type67);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type65, type67 };
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray73 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray70, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(1, 14, "Java$2Elang", type61, typeArray74, "L195506085");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        int int6 = type3.getSort();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("L1046722468", false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L1843692054", "L2139225706");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("<init>(D)V", "L965538451", "L1384125117", (int) (byte) 100);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        java.lang.String str9 = signature8.getDescriptor();
        java.lang.String str10 = signature8.getDescriptor();
        java.lang.String str11 = signature8.getName();
        org.mockito.asm.Type type12 = signature8.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("Short");
        boolean boolean15 = signature8.equals((java.lang.Object) type14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.String str19 = signature18.getDescriptor();
        java.lang.String str20 = signature18.toString();
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        boolean boolean23 = signature18.equals((java.lang.Object) "java.lang");
        java.lang.String str24 = signature18.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(106, "L1799275916", type14, (java.lang.Object) signature18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("<init>$28$29V", false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("L1619152913", false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("L60328210", false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("<init>()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("short", type9, typeArray11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("short", type15, typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type20);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        boolean boolean27 = type20.equals((java.lang.Object) strArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) (byte) 1, 158, "L1813600832", "L1166177411", "L1768459599", strArray30);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1109657447", "<init>(D)V", "L321013184");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = type8.getClassName();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type17);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.String str26 = signature25.getDescriptor();
        java.lang.String str27 = signature25.toString();
        org.mockito.asm.Type[] typeArray28 = signature25.getArgumentTypes();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) 154);
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type29);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(112, 12, "(L;Lint;)V", type8, typeArray28, "Short");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        int int10 = type8.getOpcode((int) ' ');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("int", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(110, 56, "L(L;", "L652322048", "(L;Lint;)V", strArray27);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type10 = type9.getElementType();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(35, 19, "L965538451", "Int", "L484864404", strArray22);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visitOuterClass("", "int(L;)I", "(L;)V");
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
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.Class<?> wildcardClass23 = typeArray22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.Class<?> wildcardClass29 = typeArray28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass23, wildcardClass29 };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray32);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter8.visit(136, 11, "L1325724854", "L$243B", "L1658110417", strArray34);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("int", type15, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean24 = signature21.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        boolean boolean33 = signature21.equals((java.lang.Object) strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit((int) (byte) -1, 52, "L115210646", "Ljava/lang/L179248870;", "L715803435", strArray31);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitOuterClass("(L;)S", "L()B;", "L1677923165");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L484864404", "", "L1413211577", 37);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("Java$2Elang", "hi!", "java/lang/Short");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getClassType();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("(Ljava/lang/L;)Lt;", true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("<init>(L;)V", "L1264057188", "L758895678");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(100, type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        java.lang.String str5 = type2.toString();
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(5, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type2.getInternalName();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L965538451", "L1457561325");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        java.lang.String str6 = type3.toString();
        java.lang.String str7 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getSuperType();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("L2029575687", false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("<init>(D)V", "L600964006");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        int int23 = type17.getOpcode(1);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type17.getDimensions();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int3 = type1.getSort();
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.toString();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(155, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 154);
        int int3 = type0.getSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray12);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        int int23 = type21.getOpcode((int) ' ');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray18);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(100, type32);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type32);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type37);
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(9, type37);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        int int43 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray35);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("L179248870");
        org.mockito.asm.Type type46 = type45.getElementType();
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type45);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type45);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = typeArray3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.Class<?> wildcardClass11 = signature9.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass4, wildcardClass11, wildcardClass18, wildcardClass28 };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        java.lang.String str41 = type36.getClassName();
        int int42 = type36.getSort();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type36);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        int int47 = type45.getOpcode((int) ' ');
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (byte) 0, type45);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("", false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("int");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray11);
        int int13 = type8.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(0, "$5BLorg$2Fmockito$2Fasm$2FType$3B", type7, (java.lang.Object) int13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(0, 14, "L1799275916", "", "()L;", strArray19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("void", "Z");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray9 = new java.lang.String[] { "L627419700", "<init>$28$29V", "L2061722705" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, (int) (short) 1, "L1851530498", "Org/mockito/cglib/core/ClassEmitter", "(Ljava/lang/L;Ljava/lang/hi!;)LL;;", strArray9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(112, 126, "L1565509129", "L774406697", "L1408510127", strArray15);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type4.getDimensions();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter7.getSuperType();
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
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter6.getSuperType();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Short(Ljava/lang/V;LV;)Lva/lang;", "L1654273308");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("L323493458", true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type12.getElementType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.getStaticHook();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L790389219", "L1433292747", "<init>(L;)V", 2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L428148456", "S");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        int int23 = type17.getOpcode(1);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type17.getDimensions();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
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
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter6.visitAnnotation("(Ljava/lang/L2017536669;)V", false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("java/lang/String", "", "L1631635156", (int) (short) 10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getPackageName(type12);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        label22.info = type25;
        boolean boolean29 = signature20.equals((java.lang.Object) label22);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        label22.info = strArray42;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) 100, 102, "(L;)I", "L2012537812", "L1843692054", strArray42);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("<init>(Ljava/lang/L1799275916;)V", true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitInnerClass("L1684076542", "L1213742046", "L692754600", 6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("(Ljava/lang/L;)L;", true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L324597640", "L1631635156", "(VL;)V", (int) (byte) -1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        int int20 = type16.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type16.getElementType();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = classEmitter0.visitAnnotation("L676114776", true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("int", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray8);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        int int28 = type22.getOpcode(1);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        boolean boolean30 = type1.equals((java.lang.Object) type22);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        int int34 = type32.getOpcode((int) ' ');
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type32, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray46, typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray48);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("L915517561", type22, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int52 = type22.getDimensions();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(11, type8);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        int int13 = type8.getSize();
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) '4', type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) -1, type18);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type27);
        int int30 = type27.getSort();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type38);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray45);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        java.lang.Class[] classArray50 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray46, typeArray47);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L652322048", type23, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) 'a', 129, "L1867433910", type8, typeArray53, "L2061722705");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1587696640", "L494006198", "L1438273522", 104);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L600964006", "L2029575687", "L88758928");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("short", type9, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        java.lang.String str18 = type13.getClassName();
        java.lang.String str19 = type13.toString();
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(114, type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(158, "L1658110417", type13, (java.lang.Object) "L1111712985");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 154);
        int int5 = type2.getSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray8);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        int int26 = type24.getOpcode((int) ' ');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("int", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray31);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter3.getClassType();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L758895678", "(L;Lint;L;D)Ljava/lang/Short;", "L677830104");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(100, type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        int int11 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        int int20 = type18.getOpcode((int) ' ');
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("int", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray15);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(100, type29);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type34);
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(9, type34);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type34);
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.Object obj42 = label40.info;
        java.lang.String str43 = label40.toString();
        label40.info = ' ';
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        java.lang.String str48 = type46.getClassName();
        label40.info = type46;
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type46);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray51);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(158, type12);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type type19 = local17.getType();
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("short", type22, typeArray24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("short", type28, typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(100, type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(128, (int) (short) 1, "L2061722705", type19, typeArray44, "L851034773");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("$28L$3B$29Z", "");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getSuperType();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str6 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L88758928", "L644610379", "L2061722705", (int) (byte) 100);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L9361988", "L1325724854");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Short");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '#', type2);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("Z", "L()B;", "Lorg/mockito/cglib/core/LocalVariablesSorter;");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("(L;)L;", "L699742145");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.getStaticHook();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(1, 118, "<init>(L;S)V", "()I", "L522739800", strArray11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray14);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray16);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(1, type8);
        java.lang.String str10 = type8.getInternalName();
        java.lang.String str11 = type8.getClassName();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("L724993684");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(14, "$28$29B", type8, (java.lang.Object) type14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        int int11 = type9.getSize();
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(11, type14);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        int int19 = type14.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        int int28 = type26.getOpcode((int) ' ');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("int", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getBoxedType(type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type35);
        int int38 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray33);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray33);
        boolean boolean40 = type14.equals((java.lang.Object) typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class(42, 153, "L558849985", type9, typeArray23, "L965538451");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type3.getInternalName();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter1.getAccess();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("", false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitSource("void", "java.lang.Short");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        java.lang.String str8 = type6.getClassName();
        java.lang.String str9 = type6.getDescriptor();
        int int10 = type6.getSort();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(96, type15);
        boolean boolean17 = type6.equals((java.lang.Object) 96);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        int int26 = type24.getOpcode((int) ' ');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("int", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray21);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(8, "L597018881", type6, (java.lang.Object) typeArray33);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        boolean boolean7 = type1.equals((java.lang.Object) type6);
        java.lang.String str8 = type6.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        boolean boolean12 = type6.equals((java.lang.Object) type10);
        int int13 = type6.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type6.getInternalName();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1034763014", "I");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("L744372826", "L768140174", "L723084290");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1432155076", "L512232699");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("Java/lang/Short", false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.end_class();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        int int5 = type3.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type4);
        int int6 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type4.getInternalName();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType("Short");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '#', type3);
        java.lang.String str5 = type3.getClassName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(96, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type3.getInternalName();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int5 = type1.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type1.getElementType();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray22);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter3.visitField(100, "L1582722236", "[Lorg.mockito.asm.Type;", "L546515263", (java.lang.Object) typeArray26);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) (short) 10, 120, "L1718368899", "L725236413", "L1936742457", strArray12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        java.lang.Class<?> wildcardClass14 = typeArray13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.Class<?> wildcardClass21 = signature19.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        java.lang.Class<?> wildcardClass38 = typeArray37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass14, wildcardClass21, wildcardClass28, wildcardClass38 };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(16, 40, "Lorg/mockito/cglib/core/Signature;", "L1638592048", "L1226068386", strArray46);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(0, 14, "L1325724854org$2Emockito$2Ecglib$2Ecore$2ESignature", "java.lang.L1325724854", "L$3B", strArray13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(100, type10);
        int int12 = type10.getSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray18);
        java.lang.String str20 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String str24 = signature23.getDescriptor();
        java.lang.String str25 = signature23.toString();
        org.mockito.asm.Type[] typeArray26 = signature23.getArgumentTypes();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) 154);
        java.lang.String str30 = type27.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(56, 56, "L1433292747", type10, typeArray31, "L1105968370");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1384125117", "L315113280", "L969830988", 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("short", type11, typeArray13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type17, typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        boolean boolean29 = type22.equals((java.lang.Object) strArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(118, 106, "(L;)B", "", "", strArray32);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getClassType();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1213742046", "L522739800", "L1903601117", 124);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        label0.info = ' ';
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        java.lang.String str8 = type6.getClassName();
        label0.info = type6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type6.getInternalName();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L265575629", "L1718368899", "", 124);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type9);
        java.lang.String str11 = type9.getClassName();
        java.lang.String str12 = type9.getDescriptor();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(156, type9);
        org.mockito.asm.Type type14 = local13.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter0.visitField(15, "L1490842960", "LL1492574633;", "<init>(L;Lint;L;D)V", (java.lang.Object) local13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitOuterClass("LL9361988;", "java.lang", "");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("short", true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        int int15 = type12.getSort();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("L205843408", type12, typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 11, "[Lorg.mockito.asm.Type;", "L1619152913", "L918576025", strArray19);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getClassType();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("L1654273308", "L437104541");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("Java$2Elang", "L837995436", "()LL2061722705;");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 40, "L790389219(L;)LL<init>()V;", "L1867433910", "<init>$28S$29V", strArray14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("LL179248870;", "()I", "", (int) (short) 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter5.getAccess();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) '4', 7, "L2021451540", "L1109657447", "L$3B(L;)LV;", strArray13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type15);
        int int18 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray13);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        int int6 = type3.getSort();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type3.getDimensions();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        int int22 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter5.visitField(133, "L1774861680", "(Ljava/lang/L1111712985;)L<init>()V;", "L9361988", (java.lang.Object) typeArray20);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type35);
        org.mockito.asm.Type type37 = type35.getElementType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray43);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray46);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        java.lang.Class[] classArray51 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.getTypes(classArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray46, typeArray50);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        int int8 = type6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type6.getDimensions();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int5 = type1.getOpcode((int) (short) -1);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type13);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray22);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type42.getElementType();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(100, type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        boolean boolean11 = type0.equals((java.lang.Object) signature10);
        int int12 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.String str12 = signature11.getDescriptor();
        java.lang.String str13 = signature11.toString();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        boolean boolean16 = signature11.equals((java.lang.Object) "java.lang");
        java.lang.String str17 = signature11.getName();
        org.mockito.asm.Type[] typeArray18 = signature11.getArgumentTypes();
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor20 = classEmitter1.visitField(42, "L1408510127", "(Ljava/lang/L;)L;", "va", (java.lang.Object) typeArray18);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(11, type1);
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("L23070008", "()LL417177808;", "L180288185", 154);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        java.lang.String str8 = type6.getClassName();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray5, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Short");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getClassName();
        int int5 = type1.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        label19.info = type22;
        boolean boolean26 = signature17.equals((java.lang.Object) label19);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type33);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        label19.info = strArray39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) (byte) 100, 5, "boolean", "L1295514633", "L867840515", strArray39);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("L1386266315", "(Ljava/lang/L1328785442;)V", "<init>(D)V", (int) (byte) 1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L1658110417", "()Ljava/lang/Short;", "L1264057188", 8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(100, type15);
        int int17 = type15.getSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type27 = type26.getElementType();
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("L897927500", type13, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type32);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getPackageName(type33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray40);
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type42);
        int int44 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type43);
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isArray(type43);
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) '4', 16, "(L;D)Z", type8, typeArray29, "L1325724854");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        java.lang.Class<?> wildcardClass15 = typeArray14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass9, wildcardClass15 };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(100, type22);
        int int24 = type22.getSize();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type22);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L723084290", "java.lang");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(1, type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str14 = type12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter0.visitField(110, "L1241135525", "L1092810277()LShort;", "L306758391", (java.lang.Object) type12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "L1507755639", 154);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("int", type15, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray12);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(6, (int) (short) 100, "()L()B;", "L154159469", "L1331900336", strArray26);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        java.lang.String str6 = type3.getDescriptor();
        java.lang.String str7 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type3.getDimensions();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L627419700", "<init>$28$29V", "L2061722705" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(136, 52, "L746726514", "L1786680090", "L154159469", strArray12);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        int int23 = type17.getOpcode(1);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        int int25 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type17.getDimensions();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "L790389219(L;)LL<init>()V;", "()L()B;");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray12);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        java.lang.Class<?> wildcardClass24 = typeArray23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        java.lang.Class<?> wildcardClass31 = signature29.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        java.lang.Class<?> wildcardClass38 = typeArray37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        java.lang.Class<?> wildcardClass48 = typeArray47.getClass();
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.lang.Class[] classArray54 = new java.lang.Class[] { wildcardClass24, wildcardClass31, wildcardClass38, wildcardClass48 };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.getTypes(classArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("short", type58, typeArray60);
        int int62 = type58.getSort();
        java.lang.String str63 = type58.toString();
        java.lang.String str64 = type58.toString();
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type58);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type58);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        int int70 = type68.getOpcode((int) ' ');
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray72);
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("int", type68, typeArray73);
        org.mockito.asm.Type[] typeArray75 = signature74.getArgumentTypes();
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type78 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray75, type77);
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray81);
        java.lang.Class[] classArray83 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.getTypes(classArray83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray82, typeArray84);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.add(typeArray75, typeArray84);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray66, typeArray75);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray75);
        java.lang.String[] strArray89 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(1, 19, "L963322244", "L65507988", "L1851530498", strArray89);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(156, type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        int int10 = local7.getIndex();
        org.mockito.asm.Type type11 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type11.getInternalName();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        label0.info = type3;
        int int7 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("L$28$29B;", "(L;D)V");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.getName();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("Short");
        boolean boolean9 = signature2.equals((java.lang.Object) type8);
        org.mockito.asm.Type type10 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type10.getDimensions();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type2);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(156, type6);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type9.getDimensions();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter6.visitAnnotation("L918576025", false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = type3.getClassName();
        java.lang.String str5 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L897927500(L;Ljava/lang;)L<init>()V;", "L1507755639");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(40, (int) (byte) 10, "L2028315100", "LZ;", "(Ljava.lang.L", strArray14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getSuperType();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (short) 100, (int) (byte) -1, "L632150955", "L154159469", "L546515263", strArray15);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitSource("L538197086", "L1526846577");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L214836377", "(Ljava/lang/L;LV;)L;", "(L;VL;)Ljava/lang;");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("L<init>()V;");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        int int21 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L790389219", type10, typeArray20);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        int int32 = type30.getOpcode((int) ' ');
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("int", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray27);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(100, type41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.String str46 = signature45.toString();
        org.mockito.asm.Type type47 = signature45.getReturnType();
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getPackageName(type47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class[] classArray52 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray53);
        java.lang.String[] strArray55 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.getPackageName(type60);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.cglib.core.Signature signature64 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.Class[] classArray65 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.getTypes(classArray65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray62, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type60, typeArray67);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray67, typeArray70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getReturnType("Short");
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type73);
        int int75 = type74.getSize();
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type74);
        int int77 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray76);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.Local", type47, typeArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(102, 132, "L1492773278", type10, typeArray78, "java.lang");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        java.lang.Object obj8 = label0.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        int int11 = type9.getSort();
        label0.info = type9;
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(100, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("(L;)L;");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        label0.info = typeArray23;
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        java.lang.Object obj29 = label26.info;
        java.lang.Object obj30 = label26.info;
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        label26.info = typeArray36;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter1.getStaticHook();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(11, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray20);
        int int22 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visit(32, 110, "(L;D)Lt;", "L$3B$28Ljava$2Flang$2FL$3BLV$3B$29L$3B", "L1272091859", strArray23);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 1, type6);
        org.mockito.asm.Type type9 = local8.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode((int) ' ');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("int", type12, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("V");
        boolean boolean21 = signature18.equals((java.lang.Object) "V");
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        boolean boolean30 = signature18.equals((java.lang.Object) strArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(46, 104, "Short(Ljava/lang/V;LV;)Lva/lang;", "java.lang.L1325724854", "L1521129122", strArray28);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getClassType();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1768459599", "L1023538842", "L1813500953", 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 0, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        int int6 = type3.getSort();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type3.getInternalName();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter2.getAccess();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L129800516", "L1582038557", "L715803435", 140);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("()Ljava/lang;", "$28$29D", "L2012537812");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type16);
        int int19 = type16.getSort();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L205843408", type16, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (short) 10, 20, "L1634866529", "L644610379", "", strArray23);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L1264057188");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(0, 133, "", "L4202090", "(V)S", strArray14);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("L1231475351", true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        int int23 = type17.getOpcode(1);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type32);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray39);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray41);
        java.lang.Class[] classArray44 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray41);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        int int3 = local2.getIndex();
        org.mockito.asm.Type type4 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("", "(Ljava/lang/L97952760;)V", "L1910611786");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (byte) -1, type3);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        int int15 = type12.getSort();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isPrimitive(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray30);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray32);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L652322048", type8, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type8.getDimensions();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter0.getSuperType();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type8.equals((java.lang.Object) type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray17);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, 60, "L1092810277()LShort;", "L1786680090", "L1549740077", strArray20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int5 = type1.getOpcode((int) (short) -1);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type13);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray20);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray22);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray33);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type1.getDimensions();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1284978028", "L1994649221", "L1462953201");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(154, 153, "L250027111", "L640808231", "L78869648", strArray17);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.getStaticHook();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("<init>(L;Lint;L;D)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(158, type4);
        org.mockito.asm.Type type10 = local9.getType();
        org.mockito.asm.Type type11 = local9.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type11.getInternalName();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type1.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        boolean boolean9 = type1.equals((java.lang.Object) type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type5.getDimensions();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean13 = type10.equals((java.lang.Object) type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        int int15 = type10.getDimensions();
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray21);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getBoxedType(type28);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getPackageName(type29);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(42, "L1818809981", type10, (java.lang.Object) type33);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("I", "L1202418377");
        java.lang.String str16 = signature15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        boolean boolean24 = type17.equals((java.lang.Object) strArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        boolean boolean26 = signature15.equals((java.lang.Object) strArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(40, 123, "LL9361988;", "(L;)Lvoid;", "org/mockito/cglib/core/ClassEmitter", strArray23);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(15, 40, "(Ljava/lang/L;LV;)L;", "L232444404", "<init>", strArray10);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        java.lang.String str3 = label1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        label1.info = type4;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(63, type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(126, 10, "L1790172907", "L1293550562", "L428148456", strArray13);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.String str31 = label28.toString();
        label28.info = ' ';
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        java.lang.String str36 = type34.getClassName();
        label28.info = type34;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type34);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("L1619152913");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.fromInternalName("(Ljava/lang/L;LV;)L;");
        int int44 = type43.getSort();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L/lang;", "int", "L509410304", (int) (short) 1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter1.getSuperType();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("LL9361988;", false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        java.lang.String str12 = type7.getClassName();
        java.lang.String str13 = type7.toString();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(10, type7);
        int int15 = local14.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter1.visitField(114, "L179248870", "Java$2Elang$2EVoid", "L417177808", (java.lang.Object) int15);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = typeArray3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.Class<?> wildcardClass11 = signature9.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        java.lang.Class<?> wildcardClass18 = typeArray17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass4, wildcardClass11, wildcardClass18, wildcardClass28 };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        int int44 = type42.getOpcode((int) ' ');
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("int", type42, typeArray47);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getBoxedType(type51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type51);
        int int54 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray49);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray49);
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray57);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(100, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(20, "L766198343", type7, (java.lang.Object) "double");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        boolean boolean19 = type12.equals((java.lang.Object) strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(108, 123, "L5279803", "L1946632372", "", strArray18);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 1, type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type6.getInternalName();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("int", true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(100, type5);
        int int7 = type5.getSize();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        org.mockito.asm.Type type17 = type16.getElementType();
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        boolean boolean21 = type3.equals((java.lang.Object) typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type3.getInternalName();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(0, 46, "L915360214", "L1340227649", "L417177808", strArray11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        label19.info = type22;
        boolean boolean26 = signature17.equals((java.lang.Object) label19);
        org.mockito.asm.Type type27 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.String str31 = signature30.getDescriptor();
        java.lang.String str32 = signature30.toString();
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("java.lang");
        boolean boolean35 = signature30.equals((java.lang.Object) "java.lang");
        org.mockito.asm.Type[] typeArray36 = signature30.getArgumentTypes();
        java.lang.String str37 = signature30.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(0, "L92930219", type27, (java.lang.Object) str37);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 1, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type20);
        int int22 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(141, 35, "()LL;;", type12, typeArray17, "(Ljava/lang/L;)L;");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        int int12 = type10.getOpcode((int) ' ');
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("int", type10, typeArray15);
        java.lang.String str17 = signature16.getDescriptor();
        java.lang.String str18 = signature16.toString();
        org.mockito.asm.Type[] typeArray19 = signature16.getArgumentTypes();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("L181410580");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(24, 137, "L1346586718", "L191333706", "L1977705448", strArray23);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type22);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.String str31 = label28.toString();
        label28.info = ' ';
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        java.lang.String str36 = type34.getClassName();
        label28.info = type34;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type34);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("L1619152913");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("()Ljava/lang/Short;", "L1878100946", "byte");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L247835741", "L2035081690");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type4);
        int int7 = type4.getSort();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("L205843408", type4, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type11.getDimensions();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L676114776");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("void");
        int int14 = type12.getOpcode((int) ' ');
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        org.mockito.asm.Type type18 = type17.getElementType();
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        boolean boolean20 = type12.equals((java.lang.Object) str19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isPrimitive(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.begin_class(32, 0, "Java/lang/Short", type12, typeArray36, "");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1279599901", "L695167510", "L1191730876");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray18);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray18);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(5, 63, "L63122622", "L790389219(L;)LL<init>()V;", "L869032533", strArray21);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        int int8 = type6.getOpcode((int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("int", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray2, typeArray3);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(100, type17);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type17);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L105818412", "L63489857", "(L;)Lvoid;");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("<init>(L;VL;)V", false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("int", type15, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type24);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray22);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("()B");
        int int32 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) (short) 0, 155, "va.lang", type7, typeArray28, "int(Ljava/lang/L;)L;");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1226068386", "L472678920", "L676114776");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L40020120", "L1591809677");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = type4.getClassName();
        java.lang.String str6 = type4.getClassName();
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("short(Ljava/lang/V;LV;)Lva/lang;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("L1582722236", type4, typeArray9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitSource("L1768459599", "L1789282035");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L269601237", true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("java/lang/L800577766", false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("void");
        int int3 = type1.getOpcode((int) ' ');
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int6 = type1.getOpcode((int) 'a');
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("<init>()V");
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(1, type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field((int) 'a', "L907870190", type13, (java.lang.Object) "L469849135");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter1.visitAnnotation("L466301128", true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L581075256", "<init>(L;S)V", "Ljava/lang/(L;");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("(Ljava/lang/L1619152913;L(L;D)Lt;;)LL382355325;", true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L1725537215", "L524207824", "L658648001");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }
}

